public class findMinInArray
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int num = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < num){
                num = arr[i];
            }
        }
        System.out.println("Minimum element of an array is "+num);
    }
}
