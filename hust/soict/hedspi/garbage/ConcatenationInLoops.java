package hust.soict.hedspi.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
//        Random r = new Random(123);
//        long start = System.currentTimeMillis();
//        String s = "";
//        for (int i=0;i<65536;i++)
//        {
//            s+=r.nextInt(2);
//        }
//        System.out.println(System.currentTimeMillis()-start);
//
//        r = new Random(123);
//        start = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//        for (int i=0;i<65536;i++)
//        {
//            sb.append(r.nextInt(2));
//        }
//        s = sb.toString();
//        System.out.println(System.currentTimeMillis()-start);

        long start1 = System.currentTimeMillis();
        GarbageCreator.garBageCreators(1200);
        System.out.println("Thời gian chạy với String này là : " + (System.currentTimeMillis() - start1) + "ms");
        long start2 = System.currentTimeMillis();
        NoGarbage.noGarBage(12000);
        System.out.println("Thời gian chạy với Stringbuffer này là : " + (System.currentTimeMillis() - start2) + "ms");

    }
}
