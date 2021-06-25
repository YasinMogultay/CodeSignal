public class HackerRank {
    public static void main(String[] args) {
        try{
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x+b+d);
        }catch(NumberFormatException e){
            System.out.println("bad number");
        }

    }

    public static boolean stringComparator(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i] && a.length == b.length) {
                return true;
            }
        }
        return true;
    }


}