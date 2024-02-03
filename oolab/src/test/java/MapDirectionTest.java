import agh.ics.oop.model.MapDirection;
import org.junit.jupiter.api.Test;

public class MapDirectionTest {
    @Test
    public void next(){
        System.out.println(MapDirection.WEST.next());
        System.out.println(MapDirection.EAST.next());
        System.out.println(MapDirection.NORTH.next());
        System.out.println(MapDirection.SOUTH.next());
    }
    @Test
    public void previous(){
        System.out.println(MapDirection.WEST.previous());
        System.out.println(MapDirection.EAST.previous());
        System.out.println(MapDirection.NORTH.previous());
        System.out.println(MapDirection.SOUTH.previous());
    }


}
