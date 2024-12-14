import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = {2,2,3};
        int candidate = findCandidate(arr);
        if (isMajority(arr, candidate)) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }

    }

    public static int  findCandidate(int arr[]){
        int count=0;
        int value = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] == value){
                count++;
            }else{
                count--; // Decrement count if different
                if (count == 0) {
                    value= arr[i]; // Update candidate
                    count = 1; // Reset count for new candidate
                }
            }
        }
        return value;
    }


    public static boolean isMajority(int[] arr,int value) {
        int count = 0;

        for (int num : arr) {
            if (num == value) {
                count++;
            }

        }
        return count > arr.length / 2;
    }
}
