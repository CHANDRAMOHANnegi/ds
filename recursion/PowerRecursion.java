class PowerRecursion {

    int power(int a, int b) {

        if (b == 0) {
            return 1;
        }
        int rec = power(a, (b / 2));
        rec *= rec;
        if (b % 2 != 0) {
            rec = rec * a;
        }
        return rec;
    }

    public static void main(String[] args) {

        PowerRecursion p = new PowerRecursion();
        System.out.println(p.power(10, 5));
    }
}