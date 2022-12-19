package week_4;
public class num {
    public static void main(String[] args) {
        int rows=5; int n=0;
            for ( int i=1; i <= rows; ++i, n=0 ) {
            for (int space = 1; space <=rows -i; ++space){
                System.out.print(" ");
            }
            while (n != 2 * i - 1){
                System.out.print(i);
                ++n;
            }
                System.out.println();
        }
    }
}
