class BasicRecursion {

    void incDec(int n) {

        if (n > 0) {
            // System.out.println(n);
            incDec(n - 1);
            System.out.println(n);
        }
        
    }

    void incDec() {
        incDec(6);
    }

    public static void main(String[] args) {
        BasicRecursion b = new BasicRecursion();
        b.incDec();
    }

}