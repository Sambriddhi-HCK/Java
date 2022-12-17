package week_4.ww4;

public class reversing {
    public static int[] Reverse(int a[]){
        int reverse[] = new int[a.length];
        int j = 0;
        for(int i = a.length-1; i>=0;i--){
        reverse[j]= a[i];
        j++;
        }
        return reverse;
        }
        
        public static void main(String[] args){
        int num[] = {2,434,5,3,53,5,4};
        int[] reversal = Reverse(num);
        for(int element: reversal){
        System.out.println(element);
        }
    }
}
