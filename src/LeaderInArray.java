public class LeaderInArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};

        // Last element ko leader maan lo
        int leader = arr[arr.length - 1];
        System.out.print(leader + " "); // print the first leader

        // Right se left traverse karo
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= leader) {
                leader = arr[i]; // Agar current element leader ke barabar ya bada hai to update karo
                System.out.print(leader + " "); // Print the leader
            }
        }
    }
}
