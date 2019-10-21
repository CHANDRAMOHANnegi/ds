class LostShoePair {

    int lostPairRec(int arr[],int i) {

        
        int lost = lostPairRec(arr,i+1);
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9 };

        LostShoePair l = new LostShoePair();
        System.out.println(l.lostPairRec(arr,0));
    }
}