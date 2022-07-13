import java.util.Arrays;

public class Java53Example {
    public static void main(String[] args) {
        // primitives
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        int[] secondArray = {2, 2, 2};
        int[] thirdArray = new int[]{3, 2, 1};

        // array copy reference
        firstArray[0] = 100;
        System.out.println(Arrays.toString(firstArray)); // value same with copyArray
        System.out.println(Arrays.toString(firstArray));
        System.out.println("----------------------------");

        // array copy with clone
        int[] copyArray2 = secondArray.clone();
        copyArray2[1] = 50;
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(copyArray2));
        System.out.println("----------------------------");

        // array copy with System.arraycopy
        int[] copyArray3 = new int[thirdArray.length];
        int[] copyArray4 = new int[4];
        System.arraycopy(thirdArray, 0, copyArray3, 0, thirdArray.length);
        System.arraycopy(thirdArray, 0, copyArray4, 1, 2);
        copyArray3[2] = 99;
        copyArray4[3] = 99;
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(copyArray3));
        System.out.println(Arrays.toString(copyArray4));
    }
}
