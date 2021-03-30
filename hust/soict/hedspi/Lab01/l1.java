package hust.soict.hedspi.Lab01;

import java.io.IOException;

public class l1 {
    public static void main(String[] args) throws IOException {
        FirstDegree1Var eq = new FirstDegree1Var();
        eq.setA(0);
        eq.setB(10);
        System.out.println(eq.resolve());

//        FirstDegree2Var eq1 = new FirstDegree2Var();
//        eq1.setA11(1);
//        eq1.setA12(2);
//        eq1.setA21(3);
//        eq1.setA22(4);
//        eq1.setB1(5);
//        eq1.setB2(6);

//        SecondDegree eq2 = new SecondDegree();
//        eq2.setA(0);
//        eq2.setB(0);
//        eq2.setC(0);
//        System.out.println(eq2.resolve());


    }
}
