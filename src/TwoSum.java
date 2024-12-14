public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,5,7,10};
        int num = 9;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == num){
                    System.out.println("Indices: " + i + ", " + j);
                }
            }
        }
    }
}
