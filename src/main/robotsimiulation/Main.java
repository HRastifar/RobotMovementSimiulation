package main.robotsimiulation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Robot myrobot ;
        String robotName ;
        int value_Of_X  ;
        int value_Of_Y  ;
        char stopFlag = 'y';
        char direction ;

        Scanner input = new Scanner(System.in);
        System.out.print("Pick a name for your robot :");
        robotName = input.next();

        myrobot =  new Robot(robotName);

        //The first command is a place command which is out of my while loop
        System.out.printf(" %s is listening for your commands ,here is a list of your available command :  %n" +
                "1.place (X,Y,Direction) %n" ,myrobot.getName());
        System.out.println("please enter x (a number between 0 to 4) :" );
        value_Of_X = input.nextInt();
        System.out.println("please enter y (a number between 0 to 4):" );
        value_Of_Y = input.nextInt();
        System.out.println("please enter Direction (S,N,W,E) :" );
        direction = input.next().charAt(0);
        myrobot.place(value_Of_X,value_Of_Y,direction);

        System.out.println("-------------------------------------");

     // I created a while loop to operate the rest of the commands continuously
        while(stopFlag == 'y')
        {
        System.out.printf(" %s is listening for your commands ,here is a list of your available command :  %n" +
                "1.place (X,Y,Direction) %n" +
                "2.move %n" +
                "3.left %n" +
                "4.right %n"+
                "5.report %n" +
                "6.exit %n" +
                "only enter the number of your choise  %n"  , myrobot.getName());
        switch (input.nextInt()){
            case 1:
                System.out.println("please enter x (a number between 0 to 4):" );
                value_Of_X = input.nextInt();
                System.out.println("please enter y (a number between 0 to 4):" );
                value_Of_Y = input.nextInt();
                System.out.println("please enter Direction (S,N,W,E) :" );
                direction = input.next().charAt(0);
                myrobot.place(value_Of_X,value_Of_Y,direction);
                break;
            case 2 :
                myrobot.move();
                break;
            case 3 :
                myrobot.left();
                break;
            case 4 :
                myrobot.right();
                break;
            case 5 :
                myrobot.report(robotName);
                break;
            case 6 :
                stopFlag = 'N';
                break;
            default:
                System.out.println("invalid number of choise");
                break;
        }
       }
        System.out.printf("%s Says GoodBye",  myrobot.getName());
 }
 }
