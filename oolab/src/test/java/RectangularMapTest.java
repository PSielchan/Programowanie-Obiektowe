import agh.ics.oop.OptionsParser;
import agh.ics.oop.Simulation;
import agh.ics.oop.model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class RectangularMapTest {
    @Test
    public void mapTest(){
        ArrayList<MoveDirection> directions = OptionsParser.parse(new String[]{"f","f","f","f"});
        ArrayList<Vector2d> positions = new ArrayList<>();
        positions.add(new Vector2d(0,0));
        positions.add(new Vector2d(2,0));
        WorldMap mapa = new RectangularMap(4, 4);
        Simulation simulation = new Simulation(positions, directions, mapa);
        System.out.println(mapa.toString());
        simulation.run();
        assert mapa.isOccupied(new Vector2d(0, 2))&&mapa.isOccupied(new Vector2d(2, 2));
    }
    @Test
    public void placement_border_Test(){
        ArrayList<MoveDirection> directions = OptionsParser.parse(new String[]{"f","f","f","f"});
        ArrayList<Vector2d> positions = new ArrayList<>();
        positions.add(new Vector2d(2,0));
        positions.add(new Vector2d(2,0));
        WorldMap mapa = new RectangularMap(4, 4);
        Simulation simulation = new Simulation(positions, directions, mapa);
        System.out.println(mapa.toString());
        simulation.run();
        assert mapa.isOccupied(new Vector2d(2, 3));
    }
    @Test
    public void turning_collision_Test(){
        ArrayList<MoveDirection> directions = OptionsParser.parse(new String[]{"r","f","f","l","f","f","f","f","f","f"});
        ArrayList<Vector2d> positions = new ArrayList<>();
        positions.add(new Vector2d(0,1));
        positions.add(new Vector2d(4,0));
        WorldMap mapa = new RectangularMap(5, 5);
        Simulation simulation = new Simulation(positions, directions, mapa);
        System.out.println(mapa.toString());
        simulation.run();
        assert mapa.isOccupied(new Vector2d(2, 1))&&mapa.isOccupied(new Vector2d(3, 1));
    }


}

