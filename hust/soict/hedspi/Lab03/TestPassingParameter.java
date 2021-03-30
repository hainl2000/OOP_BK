package hust.soict.hedspi.Lab03;

public class TestPassingParameter {
    public static void main(String[] args)
    {
        DigitalVideoDisc jungleDVD= new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cindrellaDVD= new DigitalVideoDisc("Cindrella");

        swap(jungleDVD,cindrellaDVD);
        System.out.println(jungleDVD.getTitle());

        changeTitle(jungleDVD,cindrellaDVD.getTitle());
        System.out.println(jungleDVD.getTitle());

    }

    public static void swap(Object a, Object b)
    {
        Object temp = a;
        a=b;
        b= temp;
    }

    public static void changeTitle(DigitalVideoDisc a, String title)
    {
        String oldTitle =  a.getTitle();
        a.setTitle(title);
        a = new DigitalVideoDisc(oldTitle);
    }
}
