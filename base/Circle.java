    package base;
/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (황훈태 2018315009) 
 * @version (2019-09-10)
 */
public class Circle
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

}
