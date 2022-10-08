public class Main {
    public static void main(String[] args) {

        //int a[] = { 1, 1 , 2, 2, 2 , 3 , 10 , 6};


        //int n = a.length;

         ReadList rl = new ReadList();

         int[] a = rl.readlist();

         int n = a.length;


        RemoveDuplicates rd = new RemoveDuplicates();

        n = rd.removeduplicates(a , n);

        for(int i = 0 ; i< n ; i++)
        {
            System.out.println(a[i] + " ");
        }
    }


}
