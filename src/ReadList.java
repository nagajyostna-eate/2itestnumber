import java.util.Scanner;

public class ReadList {

    public ReadList()
    {

    }

    public int[] readlist() {

        int[] a=new int[9];
        for(int j=0;j<9;j++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter numbers...");
            a[j]=sc.nextInt();

       }

        return a;
    }
}
