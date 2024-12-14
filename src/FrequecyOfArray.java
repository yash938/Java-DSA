import java.util.Arrays;

public class FrequecyOfArray {

    public static void main(String[] args) {

        int inputArray[] = {1,2,3,4,4,5,6,6,6};
        arrays.run(inputArray);

    }
}

class arrays{
    public static void run(int arr[]){
            int current  = arr[0];
            int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == current){
                count ++;
            }else{
                System.out.println(current + " --> " +count);
                current = arr[i];
                count = 1;
            }
        }

        System.out.println(current + " --> " +count);
    }
}


