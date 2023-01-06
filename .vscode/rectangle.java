public class rectangle {

    void area(int l, int b) {
        int area = l * b;
        System.out.println("Your area of rectangle is: " + area);
    }

    void perimeter(int l, int b) {
        int perimeter = 2 * (l + b);
        System.out.println("Your perimeter i:s " + perimeter);
    }

    public static void main(String[] args) {
        rectangle objRectangle = new rectangle();
        objRectangle.area(6, 4);
        objRectangle.perimeter(6, 4);
    }
}
