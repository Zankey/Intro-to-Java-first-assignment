package cis232.a1;

import static java.lang.Math.sqrt;

public class A1232TMarRegHex extends Shape{

    public A1232TMarRegHex(double s) {
        side = s;
    }

    public double area() {
        return ((3 * sqrt(3)) / 2 ) * ( side * side );
    }

    public double perimeter() {
        return 6 * side;
    }

    public String toString() {
        return "Regular Hexagon with Side: " + side;
    }

    public boolean equals( Object rhs )
    {
        if( ! ( rhs instanceof A1232TMarRegHex ) )
            return false;
        A1232TMarRegHex tMar = ( A1232TMarRegHex ) rhs;
        return tMar.side == side;
    }


    private double side;
}
