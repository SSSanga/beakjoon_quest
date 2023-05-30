import java.util.Scanner;

public class quest10430 {
    public static void main(String[] args) {
        // 백준 10430
        // 입력: 첫줄_A,B,C
        // 출력: 1_(A+B)%C
        // 2_((A%C)+(B%C))%C
        // 3. (AXB)%C
        // 4.((A%C)X(B%C))%C

        Scanner myObj = new Scanner(System.in);
        int A = 2; int B = 2; int C = 2;
        
        A = myObj.nextInt();
        B = myObj.nextInt();
        C = myObj.nextInt();

        System.out.println ((A+B)%C);
        System.out.println (((A%C)+(B%C))%C);
        System.out.println ((A*B)%C);
        System.out.println (((A%C)*(B%C))%C);
    }
    // return 0 ;
}
