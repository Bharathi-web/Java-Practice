package Practice;
public class RemoveDuplicateinArray {

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 4, 3, 5, 1};

        int n = a.length;
        int[] temp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[k++] = a[i];
            }
        }

        // Print result
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}



