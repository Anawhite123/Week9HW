

//Write a Java program to iterate through all elements in an array list using
//        Iterator.
//IMP notes
// iterator means Arraylist and Hashnset or hasmap or hasnext
//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
// It is called an "iterator" because "iterating" is the technical term for looping.
//To use an Iterator, you must import it from the java.util package.
//iteration means repetition
import java.util.ArrayList;
import java.util.Iterator;

public class Q4java {
    public static void main(String[] args) {


        String subjects[] = {"maths", "english", "science", "automation"};
        ArrayList<String> sub1 = new ArrayList<>();//way to declare arraylist
        //add value
        sub1.add("maths"); // 0 index
        sub1.add("english");// 1 index
        sub1.add("science");// 2 index
        sub1.add("automation");// 3 index



        Iterator<String> i = sub1.iterator();// iterating the list using Iterator
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.print(",");

        }
    }
}
