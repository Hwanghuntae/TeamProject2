package main;
import base.*;
/**
 * main함수에서 2개의 Circle갹체를 만들고 두 서클객체의 중심부가 같은지 확인하는 클래스
 * 
 * @author (2018315039 이윤재 2018315009 황훈태 2018315025 신동준) 
 * @version (20190911)
 */
public class MyApp
{
    public static void main(String[] args) {
        Circle c1 = new Circle(2,3,5); // 중심 (2,3)에 반지름 5인 원
        Circle c2 = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인 원
        System.out.println("원 1 : " + c1.toString());
        System.out.println("원 2 : " + c2);
        if(c1.equals(c2))               // c1 객체와 c2객체의 x, y가 같으면
            System.out.println("같은 원"); // 같은원이라는 문장을 출력
        else                            // 서로 다르며 
            System.out.println("서로 다른 원");  // 서로 다른 원이라는 문장을 출력한다.
    }
}