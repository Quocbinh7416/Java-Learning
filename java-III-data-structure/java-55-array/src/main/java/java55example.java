import java.util.Arrays;

public class java55example {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 7, 8, 4, 9, 10};
        int[] b = new int[15];

        // search + sort
        // binary search need a sorted array
        int result1 = Arrays.binarySearch(a, 4);
        int result2 = Arrays.binarySearch(a, -2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println("-------------------------");

        System.out.println("before " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sort " + Arrays.toString(a));
        int result3 = Arrays.binarySearch(a, 4);
        int result4 = Arrays.binarySearch(a, -20);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("-------------------------");

        // fill
        Arrays.fill(b, 5);
        System.out.println("array b " + Arrays.toString(b));

        StringBuilder sql = new StringBuilder();

        sql.append(1);

    }

    public static int[] reverseArr(int[] x){
        return null;
    }
}
