import agh.ics.oop.model.Animal;
import agh.ics.oop.model.Vector2d;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    public void AnimalTest(){
        Animal animal = new Animal(new Vector2d(2,2));
        System.out.println(animal.toString());
        assert animal.isAt(new Vector2d(2,2));
    }
}
