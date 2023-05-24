
//Write the program that tell you which line pass through particular stations.
//        Just use Zone 1 stations name. (Challenge)
//key = "station"
//value = number of passed street

//imp notes
//used hashmap as it contain unique value
// central line:The Central line is a London Underground line that runs through
//              central London, from Epping, Essex, in the north-east to Ealing Broadway and West Ruislip in west London.
//Jubilee line:The Jubilee line is a London Underground line that
// runs between Stratford in east London and Stanmore in the suburban north-west, via the Docklands, South Bank and West End
//Northernline//The Northern line is a London Underground line that runs from North London to South London.

import java.util.HashMap;
import java.util.Scanner;

public class Q8java {
    public static void main(String[] args) {
        HashMap<String,String>Zone1 = new HashMap<>();
        Zone1.put("Boundstreet","central line/jublee line");
        Zone1.put("OxfordCircus", "Victoia Line/Central Line/ Balerloo Line");
        Zone1.put("Greenpark", "piccadaily line/jublee Line/Victoria Line");
        Zone1.put("piccadailyCircus","Piccadaily Line/Bakerloo line");
        Scanner z = new Scanner(System.in);
        System.out.println("Enter Station name");
        String station = z.next();// store value in station variable in console
        for(String k : Zone1.keySet()){   //we can see key
            if(station.equalsIgnoreCase(k)){
                System.out.println(Zone1.get(k));
            }



    }}}

