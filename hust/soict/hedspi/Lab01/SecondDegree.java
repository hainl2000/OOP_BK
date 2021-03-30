package hust.soict.hedspi.Lab01;

public class SecondDegree {
    //ax^2+bx+c=0
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String resolve()
    {
        String result;
        int delta = b*b-4*a*c;
        if(delta == 0)
        {
            if(a== 0 & b==0 & c == 0)
            {
                result = "Phuong trinh vo so nghiem";
            }
            else {
                double i = (-b) / (2 * a);
                result = "Phuong trinh co nghiem kep la : " + Double.toString(i);
            }
        }
        else if(delta > 0)
        {
            double i1 = (-b+Math.sqrt(delta))/(2*a);
            double i2 = (-b-Math.sqrt(delta))/(2*a);
            result = "Phuong trinh co 2 nghiem phan biet la : " + Double.toString(i1) +" " + Double.toString(i2);
        }
        else
        {
            result = "Phuong trinh vo nghiem";
        }
        return result;
    }
}
