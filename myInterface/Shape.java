package myInterface;
/**
 *   인터페이스 Shape - 여기에 인터페이스 설명을 작성하십시오.
 * 
 * @author (2018315039 이윤재 2018315009 황훈태 2018315025 신동준) 
 * @version (20190911)
 */

public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
