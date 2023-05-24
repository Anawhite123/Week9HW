
//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//        Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//        and if else)


import java.util.HashSet;

public class Q6java {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);


        // Show which numbers are between 1 and 10 are in the set
        for (int i =0; i<=10; i++){//use of for loop
            if(number.contains(i)) {//use of number.contains
                System.out.println(i + "was found in set");
            }else {
                System.out.println(i + "was not found in set");//use of if else loop.
            }


        }


    }
}
