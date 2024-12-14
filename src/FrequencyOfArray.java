public class FrequencyOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        int res[] = new int[6];

        for(int i=0;i<arr.length;i++){
            res[arr[i]] = res[arr[i]] +1;

        }

        for(int i=0;i<res.length;i++){
            System.out.println(i +" --> "+res[i]);
        }
    }
}
