public class MergeSorted {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 0, 0, 0};
        int[] B = {2, 4, 6};
        MergeSorted(A, 4, B, 3);
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

    public static void MergeSorted(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }

        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
}
//Time Complexity : O(n) (Linear)
//Space Complexity : O(1) (Constant)
