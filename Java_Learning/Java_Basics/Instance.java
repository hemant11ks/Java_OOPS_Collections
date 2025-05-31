class Number {

  int engNum;
  int mathNum;
  int scienceNum;

}

class Instance {

    public static void main(String[] args) {
        
        Number obj1 = new Number();
        obj1.engNum = 10;
        obj1.mathNum = 20;
        obj1.scienceNum = 30;

        Number obj2 = new Number();
        obj2.engNum = 40;
        obj2.mathNum = 50;
        obj2.scienceNum = 60;
        
        System.out.println("Student One");
        System.out.println("English Score: " + obj1.engNum);
        System.out.println("Math Score: " + obj1.mathNum);
        System.out.println("Science Score: " + obj1.scienceNum);

        System.out.println("---------------------------------------");

        System.out.println("Student Two");
        System.out.println("English Score: " + obj2.engNum);
        System.out.println("Math Score: " + obj2.mathNum);
        System.out.println("Science Score: " + obj2.scienceNum);

    }

}
