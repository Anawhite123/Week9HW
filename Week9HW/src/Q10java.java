

//10. Write program and add all group members names in to array and iterates
//        through for each loop and print your name.

import java.util.ArrayList;

public class Q10java {
    public static void main(String[] args) {
        String groupmembers [] = {"kruti", "Shweta","nimit","anish"};// declare array

        ArrayList<String>group1 = new ArrayList<>();// declare arraylist

        group1.add("kruti"); //adding value
        group1.add("Shweta");
        group1.add("nimit");
        group1.add("anish");

        for (String i :group1){
            if(i.equalsIgnoreCase("kruti")){
                System.out.println(i);
            }
        }

        }
    }





