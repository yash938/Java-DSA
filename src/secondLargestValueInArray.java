public class secondLargestValueInArray {
    public static void main(String[] args) {
        int arr[] = {2,4,3,2};
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i] > max){
                max = arr[i];
            }
           else if(arr[i]>s_max ){
                s_max = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(s_max);


    }
}
