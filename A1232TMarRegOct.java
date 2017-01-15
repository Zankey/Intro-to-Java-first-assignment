package cis232.a1;

import static java.lang.Math.sqrt;

public class A1232TMarRegOct extends Shape{

    public A1232TMarRegOct(double s) {
        side = s;
    }

    public double area() {
        return 2 * (1 + sqrt(2)) * side * side;
    }

    public double perimeter() {
        return 8 * side;
    }

    public String toString() {
        return "Regular Octagon with Side: " + side;
    }

    public boolean equals( Object rhs )
    {
        if( ! ( rhs instanceof A1232TMarRegOct ) )
            return false;
        A1232TMarRegOct tMar = ( A1232TMarRegOct ) rhs;
        return tMar.side == side;
    }

    private double side;
}