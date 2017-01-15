package cis232.a1;

public class A1232TMarSquare extends Shape {

    public A1232TMarSquare (double s) {
        side = s;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Square with Side: " + side;
    }

    public boolean equals( Object rhs )
    {
        if( ! ( rhs instanceof A1232TMarSquare ) )
            return false;
        A1232TMarSquare tMar = ( A1232TMarSquare ) rhs;
        return tMar.side == side;
    }


    private double side;
}
