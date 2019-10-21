class CountRec {

    int[] counter(int arr[], int idx, int count, int data) {

        if (arr.length == idx) {
            int baseArray[] = new int[count];
            return baseArray;
        }
        if (arr[idx] == data) {
            count++;
        }
        int countRec[] = counter(arr, idx + 1, count, data);
        if (arr[idx] == data) {
            countRec[count - 1] = idx;
        }
        return countRec;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 10, 34, 6, 8, 10, 9, 2, 10, 35 };
        CountRec m = new CountRec();
        int count[] = m.counter(arr, 0, 0, 10);
        for (int i : count) {
            System.out.println(i);
        }
    }
}