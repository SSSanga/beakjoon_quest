import java.util.Scanner;

public class quest2753 {
    public static void main(String[] args) {
        try {
            // 연도가 주어졌을 때, 윤년이면 1, 아니면 0 출력
            // 윤년의 조건 = 4의 배수이고 100의 배수가 아니거나 400의 배수임.
            //4의 배수, 400의 배수면 나머지는 0, 100의 배수가 아니면 나머지 존재. 
            //나머지는 % 
            // ex) 2012년는 4의 배수, 100의 배수가 아님 = 윤년
            // ex) 1900년은 100의 배수이지만 400의 배수가 아님. = 윤년 아님
            // ex) 2000년은 400의 배수임 = 윤년
            // 첫째줄에 연도가 주어지면 연도는 1 < = year <= 4000 자연수;

            Scanner numbers = new Scanner(System.in);
            int years = numbers.nextInt();
            int thisyear = 0;
            boolean thisture=true;
            // boolean thisyear = 
            // boolean을 이용하여 true false를 얘기하는 방법을 알아보자.
            // YES / NO, ON / OFF, TRUE / FALSE
            // int thisyear = years/4 && != years/100||years/400; boolean에 일단 이 조건을 단다.

            if (thisture) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
        }
    }

    // return 0 ;
}
