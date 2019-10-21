class MaxMinRec {

    int max(int arr[], int i, int max) {
        if (i < arr.length) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            max = max(arr, i + 1, max);
        }
        return max;
    }

    int min(int arr[], int i, int min) {
        if (i < arr.length) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            min = min(arr, i + 1, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 34, 6, 8, 9, 2 };
        MaxMinRec m = new MaxMinRec();
        System.out.println(m.max(arr, 0, 0));
        int max = Integer.MAX_VALUE;
        System.out.println(m.min(arr, 0, max));
    }
}