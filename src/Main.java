import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner mytime = new Scanner(System.in);

        byte myhour = mytime.nextByte(); byte mymin = mytime.nextByte();
        if (0 < myhour && myhour <= 23 &&  mymin <45 ) {
            System.out.println((myhour - 1) + " " + ((mymin - 45) + 60));
        }
        else if (0 < myhour && myhour <= 23 && 45<= mymin && mymin <= 59) {
            System.out.println((myhour - 1) + " " + (mymin - 45));
        }

        else if (myhour == 0 && mymin <45 ) {
            System.out.println((myhour + 23) + " " + ((mymin - 45) + 60));
        }
        else if (myhour == 0 && 45<= mymin && mymin <= 59) {
            System.out.println((myhour + 23) + " " + (mymin - 45));
        }
        
}
}

