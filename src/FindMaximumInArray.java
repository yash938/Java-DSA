public class FindMaximumInArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        int num = arr[0];
        for(int i =1;i<arr.length;i++){
          if(arr[i] > num){
              num = arr[i];
          }
        }

        System.out.println("the maximum element of an array is "+num);
    }
}
