import agh.ics.oop.model.Vector2d;
import org.junit.jupiter.api.Test;

public class Vector2dTest {
    Vector2d wektor = new Vector2d(1,2);
    Vector2d wektor2 = new Vector2d(-2,1);
    @Test
    public void equals(){
        System.out.println(wektor.equals(wektor2));
        System.out.println(wektor.equals(wektor));
    }
    @Test
    public void ToString(){
        System.out.println(wektor.toString());
        System.out.println(wektor2.toString());
    }
    @Test
    public void procedes(){
        System.out.println(wektor.precedes(wektor2));
        System.out.println(wektor2.precedes(wektor));
    }
    @Test
    public void follows(){
        System.out.println(wektor.follows(wektor2));
        System.out.println(wektor2.follows(wektor));
    }
    @Test
    public void upperRight(){
        System.out.println(wektor.upperRight(wektor2));
    }
    @Test
    public void lowerLeft(){
        System.out.println(wektor.lowerLeft(wektor2));
    }
    @Test
    public void add(){
        System.out.println(wektor.add(wektor2));
    }
    @Test
    public void subtract(){
        System.out.println(wektor.subtract(wektor2));
        System.out.println(wektor2.subtract(wektor));
    }
    @Test
    public void oposite(){
        System.out.println(wektor.opposite());
        System.out.println(wektor2.opposite());
    }
}
