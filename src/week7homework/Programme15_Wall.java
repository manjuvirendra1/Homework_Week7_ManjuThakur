package week7homework;

/**
 *15.Wall Area
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * * Method named getWidth without any parameters, it needs to return the value of width field.
 * * Method named getHeight without any parameters, it needs to return the value of height field.
 * * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 * * Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * * Method named getArea without any parameters, it needs to return the area of the wall.
 */

public class Programme15_Wall {
    double width;
    double height;

    public Programme15_Wall() {//constructor with no args}
    }

    public Programme15_Wall(double width, double height) {//second constructor with 2 args
        this.height = height;
        this.width = width;

        if (width < 0) {
            this.width = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getWidth() { //instance method 1 with no params
        return width;
    }

    public double getHeight() {//instance method 2 with no params
        return height;
    }

    public void setWidth(double width) {//instance method 3 with no return type
        if (width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {//instance method 4 with no return type
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {//instance method 5 with no params
        return (this.height * this.width);
    }

    public static void main(String [] args) {
        Programme15_Wall wall = new Programme15_Wall(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width =" + wall.getWidth());
        System.out.println("height =" + wall.getHeight());
        System.out.println("area = " + wall.getArea());

    }
}