package agh.ics.oop;
import java.util.ArrayList;
import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.model.RectangularMap;
import agh.ics.oop.model.Vector2d;
import agh.ics.oop.model.WorldMap;

public class World {

    public static void main(String[] args) {
        ArrayList<MoveDirection> directions = OptionsParser.parse(args);
        ArrayList<Vector2d> positions = new ArrayList<>();
        positions.add(new Vector2d(0,0));
        positions.add(new Vector2d(2,0));
        WorldMap mapa = new RectangularMap(4, 4);
        Simulation simulation = new Simulation(positions, directions, mapa);
        System.out.println(mapa.toString());
        simulation.run();
    }
}
