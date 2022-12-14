package week_4;

public class change {
    public static void main(String[] args) {
        System.out.println("Change 50p 20p 10p 5p 2p 1p");
        int fifty, twenty, ten, five, two, one;
        for (int i = 0; i <= 99; i++) {
            int amount = i;
            fifty = amount / 50;
            amount = amount % 50;
            twenty = amount / 20;
            amount = amount % 20;
            ten = amount / 10;
            amount = amount % 10;
            five = amount / 5;
            amount = amount % 5;
            two = amount / 2;
            amount = amount % 2;
            one = amount;

            System.out.printf("%d %10d %2d %2d %2d %3d %3d \n", i, fifty, twenty, ten, five, two, one);
        }

    }
}
