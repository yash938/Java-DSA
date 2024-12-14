public class Duplicate {

    public static void main(String[] args) {

        int arr[] = {10,10,2,2,3,4,5,6,7,9,11};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
