class Static {

    static double rating;
    public static String name = "Hemant";


}

public class accessStatic {
    
    public static void main(String args[]){
        Static.rating = 5;
        System.out.println(Static.name + " your Rating is " + Static.rating);

    }
}

/*
Each object will have its own copy of instance variable whereas
We can only have one copy of a static variable per class irrespective of how many objects we create.
*/