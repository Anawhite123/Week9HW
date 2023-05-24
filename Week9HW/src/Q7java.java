

//Create a HashMap object called people that will store String keys and Integer
//        values: And use for each loop to iterate the value from Map.
//IMP Notes
//Using HashMap makes sense only when unique keys are available for the data we want to store.
// We should use it when searching for items based on a key and quick access time is an important requirement.
// We should avoid using HashMap when it is important to maintain the same order of items in a collection.
//Arrays can have duplicate values, while HashMap cannot have duplicated keys (but they can have identical values.)
// The Array has a key (index) that is always a number from 0 to max value,
// while in a HashMap, you have control of the key, and it can be whatever you want: number, string, or symbol.

import java.util.HashMap;
import java.util.Map;

public class Q7java {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();//used
        people.put("Indian =",1);
        people.put("American =",2);
        people.put("British =",3);
        people.put("Australian =",4);

        // Iterating HashMap through for loop
       for (Map.Entry<String,Integer> set:
           people.entrySet()){
           System.out.println(set.getKey()+ set.getValue());
       }

        }



        }





