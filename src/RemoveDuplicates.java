public class RemoveDuplicates {

    public RemoveDuplicates()
    {

    }

    public int removeduplicates(int a[] , int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        // sort unique elements

        int[] temp = new int[n];
        int j=0;

        for(int i=0;i<n-1;i++)
        {
            if(a[i] != a[i+1])
            {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n-1];

        //change original array
        for(int i=0 ; i<j ;i++)
        {
            a[i] = temp[i];
        }

        return j;
    }
}
