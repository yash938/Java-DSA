import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,4,5};
        int arr2[] = {2,3,4};
        int num1= arr1.length;
        int num2 = arr2.length;

        int c = num1 + num2;
        int arr3[] = new int[c];

        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[num1+i] = arr2[i];
        }

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));

    }
}
