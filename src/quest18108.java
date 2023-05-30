import java.util.Scanner;

public class quest18108 {
    public static void main(String[] args) {
        // 백준 18108
        // 입력: 불기연도를 서기연도로 변경 = 서기연도 + 543 = y
        // 출력: 불기연도를 서기연도로 변환
        // 입력: 불기연도
        // 출력: 서기연도

        Scanner myObj = new Scanner(System.in);
        int y = 0;
        // (1000 <= y <= 3000);
        y = myObj.nextInt();
        int x = 543;
        System.out.print(y - x);
    }
    // return 0 ;
}
