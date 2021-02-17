package main.robotsimiulation;

public class Board {
    private int x ;
    private int y;

    public Board(){
        this.x = 0 ;
        this.y = 0 ;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void increment(char input){
        if(input == 'x') {
            x++;
            setX(x);
        }
        if(input == 'y') {
            y++;
            setY(y);
        }

    }

    public void decrement(char input){
        if(input == 'x') {
            x--;
            setX(x);
        }
        if(input == 'y') {
            y--;
            setY(y);
        }

    }

    public boolean checkForBoundaries(int inputValue , char inputChar){
        boolean result = false;
        if(inputValue >= 0 && inputValue <= 4 )
            result = true;
        if(result == false)
            System.out.printf("wrong input,%s was set to default(Zero) or its last value automatically %n",inputChar);
        return result;
    }
}
