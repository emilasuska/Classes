public class runner {
    public static void main(String[] args) {
        car car = new car(2015, "Tesla", 0, "3");
        car.setMake("Tesla");
        car.setMiles(1000);
        car.setModel("X");
        car.setYear(2018);
        System.out.println(car.toString());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());
        System.out.println(rectangle.isSquare());
        System.out.println(rectangle.toString());
    }
}