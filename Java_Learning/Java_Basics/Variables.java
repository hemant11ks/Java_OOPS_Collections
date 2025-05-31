public class Variables {

    public void studentAge(){

        int age = 0;
        age = age + 5;
        System.out.println("Student: " + age);
    }

    public static void main(String[] args) {

        Variables obj1 = new Variables();
        obj1.studentAge();
        // Unable to access variables
        // System.out.println("Student: " + age);
    }


    
}
