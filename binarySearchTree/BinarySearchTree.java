class PrePostIn {
    int printPrePostIn(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int ans = 0;
        System.out.println("pre:  " + n);
        ans += printPrePostIn(n - 1);
        System.out.println("in:  " + n);
        ans += printPrePostIn(n - 2);
        System.out.println("post:  " + n);
        return ans + 3;
    }

    public static void main(String[] args) {
        PrePostIn p = new PrePostIn();
        p.printPrePostIn(5);
    }
}