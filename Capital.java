package pruebas;

import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        
        
        up textConverter = new up();
        Scanner myObj = new Scanner(System.in);  
        
        System.out.println("Enter word");

        
        String txt = myObj.nextLine();
        myObj.close(); 

        
        String upperCaseText = textConverter.upper(txt);

       
        System.out.println("Text: " + upperCaseText);
    }
}

