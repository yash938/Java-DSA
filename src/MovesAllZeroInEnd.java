import java.util.Arrays;

public class MovesAllZeroInEnd {
    public static void main(String[] args) {

        int arr[] = {0,2,0,2,2,4};

        int i=0;
        int j=1;

        while(j<arr.length){
            if(arr[i]==0 && arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
                j++;
            }else if(arr[i]==0 && arr[j] == 0){
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
