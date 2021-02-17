package main.robotsimiulation;

public class Robot {
    private char direction;
    private String name;
    private Board myBoard;

    public Robot(String name) {
        this.name = name ;
        this.myBoard = new Board();
        this.direction = 'N';

    }

    public String getName() {
        return name;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        if(checkForDirection(direction))
        this.direction = direction;
    }

    public void place(int x, int y , char direction){
        if(myBoard.checkForBoundaries(x , 'x') )
             myBoard.setX(x);
        if(myBoard.checkForBoundaries(x ,'y'))
             myBoard.setY(y);
        if(checkForDirection(direction))
            this.direction = direction;

    }

    public void move(){
        switch (direction){
            case 'N':
            case 'n':
            myBoard.increment('y');
                if(!myBoard.checkForBoundaries(myBoard.getY() , 'y'))
                myBoard.decrement('y');
                break;
            case 'W':
            case 'w':
            myBoard.decrement('x');
                if(!myBoard.checkForBoundaries(myBoard.getX() , 'x'))
                myBoard.increment('x');
                break;
            case 'S':
            case 's':
            myBoard.decrement('y');
                if(!myBoard.checkForBoundaries(myBoard.getY() , 'y'))
                 myBoard.increment('y');
                break;
            case 'E':
            case 'e':
            myBoard.increment('x');
                if(!myBoard.checkForBoundaries(myBoard.getX() , 'x'))
                myBoard.decrement('x');
                break;
        }

    }

    public void left(){
        switch (direction){
            case 'N':
            case 'n':
                direction = 'W';
                break;
            case 'W':
            case 'w':
                direction = 'S';
                break;
            case 'S':
            case 's':
                direction = 'E';
                break;
            case 'E':
            case 'e':
                direction = 'N';
                break;
        }

    }

    public void right(){
        switch (direction){
            case 'N':
            case 'n':
                direction = 'E';
                break;
            case 'W':
            case 'w':
                direction = 'N';
                break;
            case 'S':
            case 's':
                direction = 'W';
                break;
            case 'E':
            case 'e':
                direction = 'S';
                break;
        }

    }

    public void report(String robotName){
        //robotName
        System.out.println(">>>>>>>>>>>>>>>>>>");
//        System.out.printf( robotName + " is in X :%d , Y : %d , direction : %s %n",
//                myBoard.getX(),myBoard.getY(),direction);
        System.out.printf( robotName + " is in( %d , %d , %s) %n",
                myBoard.getX(),myBoard.getY(),direction);

        System.out.println(">>>>>>>>>>>>>>>>>>");
    }

    public boolean checkForDirection(char direction){
        boolean result = false;
        if( direction == 'n'||direction == 'N' ||direction == 'w'||direction == 'W' ||
            direction == 'e'||direction == 'E' ||direction == 's'||direction == 'S' )
            result =true;
        if(result == false) {
            System.out.println("wrong input,direction was set to  default(North) or its last value automatically");
            this.direction = 'N';
        }
        return result;
    }


}
