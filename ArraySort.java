import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] a = new int[]{5,3,4,2,1};

        Arrays.sort(a);

        System.out.println("given Array in Ascending Order is :");

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
