package main;
import MyInterface.*;
import base.*;
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args) {
        Circle c1 = new Circle(2,3,5); // 중심 (2,3)에 반지름 5인 원
        Circle c2 = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인 원
        System.out.println("원 1 : " + c1.toString());
        System.out.println("원 2 : " + c2);
        if(c1.equals(c2)) 
            System.out.println("같은 원");
        else 
            System.out.println("서로 다른 원");
    }
}