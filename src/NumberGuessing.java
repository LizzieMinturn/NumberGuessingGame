import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args){

        //declare
        int pickedNumber;
        int enteredNumber;
        Scanner keyboard;

        //initialize
        keyboard = new Scanner(System.in);


        pickedNumber = (int)(Math.random()*100);
        System.out.println("enter a number between 0 and 100");
        enteredNumber = keyboard.nextInt();
        System.out.println(pickedNumber);

        if(enteredNumber>pickedNumber){
            System.out.println("Too high");
        }
        else if(enteredNumber<pickedNumber){
            System.out.println("Too low");
        }
        else if(enteredNumber==pickedNumber){
            System.out.println("Correct!");
        }

    }
}
