public class Main
{
    static int numb = 2;
    static double duo = 1.5;
    final static String alphabet = "true";
    static boolean truth = true;
    public static void main(String[] args) {
        duo = duo*numb;
        numb = numb + 1;
        System.out.println("Are " + truth + " and " + alphabet + " the same?");
        System.out.println("What about " + duo + " and " + numb + ".0?");
    }

}