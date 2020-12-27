
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmailValidator {

/*
    Project objective:

    As a developer, write a program to search a string entered by a user from the array of strings.



    Background of the problem statement:

    You have an array of email IDs of employees. As a programmer, write a program to search the email ID entered by a user.



    You must use the following:

    Eclipse/IntelliJ: An IDE to code the application
    Java: A programming language
    Git: To connect and push files from the local system to GitHub
    GitHub: To store the application code and track its versions
    Core Java concepts: Methods, collections, and strings


    Following requirements should be met:

    The versions of the code should be tracked on GitHub repositories
    The code should be able to search the required string from the array of strings

 */

/*
  NOTE:  I have done the program with both Array and ArrayList in order to demonstrate that I know the Collections interface

  I have also made it so that you can search for an email id OR a full email address and get a match.
 */


    public static void main(String[] args){
//        // ArrayList is a collection
//        List<String> emailList = new ArrayList<>();
//        List<String> emailSubStrList = new ArrayList<>();
//
//        emailList.add("bob@bezanga.com");
//        emailList.add("sally@zimmers.com");
//        emailList.add("peter@pinkelton.com");
//        emailList.add("bobby.drop@table.com");
//        emailList.add("rudolph@rednose.com");
//        emailList.add("bob@ross.com");
//        emailList.add("ubiga@altman.com");
//        emailList.add("tony@ross.com");
//        emailList.add("aaron@rodgers.com");
//        emailList.add("yolo@once.com");
//        emailList.add("big@show.com");
//        emailList.add("doug@dimmadome.com");
//        // fill emailSubStrList with email ids
//        for(String elem: emailList)
//            emailSubStrList.add(elem.substring(0, elem.indexOf('@')));
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Email addresses in current List: " + emailList);
//        System.out.println("\nEnter an email address OR email id to check if there is an associated email address in " +
//               "the Array.");
//        System.out.println("Note: email addresses and ids are case sensitive!");
//        System.out.println("\nProvide an email to search for: ");
//
//        String searchStr = scanner.nextLine();
//        //check to see if there is a match with the full email string OR the email ids
//        if(emailList.contains(searchStr.toLowerCase()) || emailSubStrList.contains(searchStr.toLowerCase()))
//            System.out.println("\""+searchStr + "\" is in the ArrayList of emails!");
//        else
//            System.out.println("\""+searchStr + "\" does not exist in the ArrayList of emails.");


        String[] emailList = new String[5];

        emailList[0] = "yolo@once.com";
        emailList[1] = "big@show.com";
        emailList[2] = "doug@dimmadome.com";
        emailList[3] = "tony@ross.com";
        emailList[4] = "rudolph@rednose.com";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Email addresses in current Array: " + Arrays.toString(emailList));

        System.out.println("\nEnter an email address OR email id to check if there is an associated email address in "+
                "the Array.");
        System.out.println("Note: email addresses and ids are case sensitive!");

        String searchStr = scanner.nextLine();

        System.out.println(checkIfEmailExists(searchStr, emailList));


    }

    // Method is only used for the Array implementation
    private static String checkIfEmailExists(String searchStr, String[] emailList){
        for (String s : emailList) {
            if (s.toLowerCase().equals(searchStr.toLowerCase()) ||
                    searchStr.toLowerCase().equals(s.substring(0, s.indexOf('@')).toLowerCase()))
                return "\n\"" + searchStr + "\"" + " exists in the Array!\n" + "Matched email: " + s;
        }
        return "\""+searchStr+"\""+" does not exist in the Array.";
    }


}