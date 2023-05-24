
//Write program and add all group names in to array and iterates through for
//        each loop.


import java.util.ArrayList;

public class Q9java {
    public static void main(String[] args) {
        String groupnames [] = {"java","postman","selenium"};// declare array
        ArrayList<String>name1 = new ArrayList<>();// way to declare arraylist

        //add value to list
        name1.add("java");//0 index
        name1.add("postman");//1 index
        name1.add("selenium");//2 index


        //iterate the value through for each loop
        for (String h :name1){
            System.out.print(h);
            System.out.print(", ");
        }

    }
}
