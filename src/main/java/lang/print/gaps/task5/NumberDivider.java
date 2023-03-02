package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        double d = toBeDivided/5;
        System.out.println(d);
          }

    public static void main(String[] args) {
        NumberDivider numberDivider = new NumberDivider();
         numberDivider.divide(20);

    }
}
