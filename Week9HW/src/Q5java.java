

//Write a Java program to test an array list is empty or not. Define array list with
//        underground tube names


import java.util.ArrayList;

public class Q5java {
    public static void main(String[] args) {

        String tubename[] = {"Bakerloo", "Jubilee", "Northern", "  ", "waterloo"};   //declare array
        String tube[]= {};

        ArrayList<String> tubname1 = new ArrayList<>();//declare arraylist
        ArrayList<String>tube1 = new ArrayList<>();//declare empty arraylist
        //add value
        tubname1.add("Bakerloo");
        tubname1.add("jubilee");
        tubname1.add("Northern");
        tubname1.add(" ");
        tubname1.add("waterloo");
        if (tube1.isEmpty()) {
            System.out.println("Arraylist is empty");
        }else{
            System.out.println("arraylist is not empty");
        }


    }


}
