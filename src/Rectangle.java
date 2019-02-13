public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double lengthL) {
        this.length = lengthL;
    }

    public void setWidth(double widthW) {
        this.width = widthW;
    }

    public double getArea(){
        return length * width;
    }

    public double getDiagonal(){
        double squaredLength = length * length;
        double squaredWidth = width * width;
        double diagonal = Math.sqrt(squaredLength  + squaredWidth );
        return diagonal;
    }

    public boolean isSquare(){
        if(width == length) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
