package base;
import MyInterface.Shape;
/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (2018315039 이윤재 2018315009 황훈태 2018315025 신동준) 
 * @version (20190911)
 */
public class Circle implements Shape
{
    private int x, y, radius;       //int형 데이터타입의 x, y, radius 변수 선언
    public Circle(int x, int y, int radius) {   //x,y,radius매개변수를 받는 생성자
        this.x = x;                 //속성 초기화
        this.y = y;                 //속성 초기화
        this.radius = radius;       //속성 초기화
    }
    
    public boolean equals(Object obj)   //equals()메소드 오버라이딩
    {     
        Circle c = (Circle)obj;
        if(this.x == c.x && this.y == c.y){ //매개변수로 받은 객체를 비교한다.
            return true;                    //x, y 값이 같으면 true 반환한다.
        }
        else{
            return false;                   //x, y 값이 서로 다르면 false를 반환한다.
        }
    }   
    
    public void draw(){          //Shape 인터페이스의 추상메소드 오버라이딩
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
    
    public double getArea(){     //Shape 인터페이스의 추상메소드 오버라이딩
        return PI * this.radius * this.radius;
    }
    
}
