public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){}

    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
