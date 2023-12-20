import agh.ics.oop.model.Animal;
import agh.ics.oop.model.Grass;
import agh.ics.oop.model.Vector2d;
import org.junit.jupiter.api.Test;

public class GrassTest {
    @Test
    public void GrassTest(){
        Grass grass = new Grass(new Vector2d(2,2));
        System.out.println(grass.toString());
        assert grass.isAt(new Vector2d(2,2)) && !grass.isAnimal();
    }
}
