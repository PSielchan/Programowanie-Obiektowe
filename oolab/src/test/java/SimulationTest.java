import agh.ics.oop.OptionsParser;
import agh.ics.oop.Simulation;
import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.model.RectangularMap;
import agh.ics.oop.model.Vector2d;
import agh.ics.oop.model.WorldMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SimulationTest {
    @Test
    public void Orientation(){
        String[] args= new String[]{"r", "r", "r", "r", "l", "l", "l", "l"};
        ArrayList<MoveDirection> directions = OptionsParser.parse(args);
        ArrayList<Vector2d> positions = new ArrayList<Vector2d>();
        positions.add(new Vector2d(2,2));
        WorldMap mapa = new RectangularMap(4,4);
        Simulation simulation = new Simulation(positions, directions, mapa);
        simulation.run();
    }
    @Test
    public void Position(){
        String[] args= new String[]{"f","f","r","f","f","l","l","f","f","f","f"};
        ArrayList<MoveDirection> directions = OptionsParser.parse(args);
        ArrayList<Vector2d> positions = new ArrayList<Vector2d>();
        positions.add(new Vector2d(2,2));
        WorldMap mapa = new RectangularMap(4,4);
        Simulation simulation = new Simulation(positions, directions,mapa);
        simulation.run();
    }
    @Test
    public void Borders(){
        String[] args= new String[]{"f","f","f","f","f","l","f","f","f","f","f","l","f","f","f","f","f","l","f","f","f","f","f",};
        ArrayList<MoveDirection> directions = OptionsParser.parse(args);
        ArrayList<Vector2d> positions = new ArrayList<Vector2d>();
        positions.add(new Vector2d(2,2));
        WorldMap mapa = new RectangularMap(4,4);
        Simulation simulation = new Simulation(positions, directions,mapa);
        simulation.run();
    }
}
