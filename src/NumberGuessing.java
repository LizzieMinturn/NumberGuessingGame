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

        boolean value = true;
        int number = 0;
        while(value){
            System.out.println("Too high");
            if (enteredNumber>-1){
                value = false;
            }
        }
        while(value){
            System.out.println("Too low");
            if (enteredNumber<-1){
                value = false;
            }
        }
        while(value){
            System.out.println("Correct!");
            if (enteredNumber==-1){
                value = false;
            }
        }

    }
}
