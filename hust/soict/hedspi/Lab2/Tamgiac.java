package hust.soict.hedspi.Lab2;

public class Tamgiac {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Tamgiac(int n)
    {
        this.n = n;
    }

    public void showTamGiac()
    {
        for (int i=1;i<=this.n;i++)
        {
            for (int j=1;j<=this.n-i;j++)
                System.out.print(" ");
            for (int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
