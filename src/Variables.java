public class Variables {
    public static void main(String[] args) {
        String s = "Some text";
        s = "New text";
        System.out.println(s);
        boolean isInputValid = false;
        char hj = 'a';
        //Integer
        int myInt = 20;
        long myLong = 100;
        System.out.println(myLong);
        //float, double
        float f = 5.2f;
        double d = 5.22;
        System.out.println(d);
        System.out.println(f);

        if (2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3) {
            hj = 'b';
        }
        System.out.println(hj);
    }
}
