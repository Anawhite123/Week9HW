
//    Declare global variables of your name, Add all your group names in list, using
//for each loop iterate and print ONLY your name.


public class Q11java {

    String x[] ={"kruti","Shweta","nimit","anish"};// global variable

    public static void main(String[] args) {
        Q11java a = new Q11java();
        for (String y : a.x) {
            if(y.equalsIgnoreCase("kruti"))
            System.out.println(y);

        }
    }
}
