public class ChangeVar {
    public static int[] changeVars(int var1, int var2) {
        System.out.println("До:");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        var1^=var2;
        var2^=var1;
        var1^=var2;
        System.out.println("После:");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        return new int[] {var1, var2};

    }
    public static void main(String[] args) {
        changeVars(5, 3);
    }
}

