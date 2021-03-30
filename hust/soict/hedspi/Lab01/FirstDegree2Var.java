package hust.soict.hedspi.Lab01;

public class FirstDegree2Var {
    private int a11;
    private int a12;
    private int a21;
    private int a22;
    private int b1;
    private int b2;

    public int getA11() {
        return a11;
    }

    public void setA11(int a11) {
        this.a11 = a11;
    }

    public int getA12() {
        return a12;
    }

    public void setA12(int a12) {
        this.a12 = a12;
    }

    public int getA21() {
        return a21;
    }

    public void setA21(int a21) {
        this.a21 = a21;
    }

    public int getA22() {
        return a22;
    }

    public void setA22(int a22) {
        this.a22 = a22;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public String resolve()
    {
        String result;
        int d = this.a11*this.a22-this.a21*this.a12;
        int d1 = this.b1*this.a22-this.b2*this.a12;
        int d2 = this.a11*this.b2-this.a21*this.b1;
        if(d != 0)
        {
            double i1 = d1/d;
            double i2 = d2/d;
            result = "Phuong trinh co duy nhat 1 cap nghiem la: " + "(" +Double.toString(i1) + " " + Double.toString(i2) +")";
        }
        else if(d == 0 & d1 == 0 & d2 == 0)
        {

            result = "Vo so nghiem";
        }
        else
            result = "Vo nghiem";

        return result;
    }
}
