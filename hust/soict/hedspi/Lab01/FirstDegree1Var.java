package hust.soict.hedspi.Lab01;

public class FirstDegree1Var {
        private int a;
        private int b;

        public void setA(int a) {
            this.a = a;
        }
        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

//        public void show()
//        {
//            System.out.println(this.a+" " +this.b);
//        }
        public String resolve()
        {
            String result ;
            if(a==0 & b==0) {
                result = "Phuong trinh vo so nghiem";
            }
            else if(a == 0 & b != 0)
            {
                result = "Phuong trinh vo nghiem";
            }
            else {
                double i = this.b/this.a;
                result = "Phuong trinh co nghiem la " + Double.toString(i);
            }
            return result;
        }
}
