package week_4;
class tc{
    public static void main(String[] args) {
        int [] numbers = {2, -9, 3, 56 ,-45, 43, 45, -56, 20};
        int sum = 0;
        Double average; 
        for ( int number : numbers) {
            sum += number;
        }
        int arrayLength = numbers.length;
        average = ((double)sum / (double)arrayLength);
        System.out.println("Sum = "+ sum);
        System.out.println("Average =");
        System.out.printf("%.2f" , sum);
    }
}
