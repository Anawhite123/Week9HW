
//Write a Java program to create a new array list, add some colours(string) and
//        printout the collection using for each loop.


import java.util.ArrayList;

public class Q3java {
    public static void main(String[] args) {
        String colour[]=   { "red","yellow","pink","purple","blue"};//Way to declare array

        ArrayList<String> colour1 = new ArrayList<>();//way to declare arraylist

        colour1.add("   red,");//0 index
        colour1.add("  yellow,");// 1 index
        colour1.add("  pink,");//2 index
        colour1.add("  purple,");//3 index
        colour1.add("  blue");//4 index

        for (String k:colour1){// use of for each loop(use String variable :arraylist)
            System.out.print(k);
        }
    }
    }

