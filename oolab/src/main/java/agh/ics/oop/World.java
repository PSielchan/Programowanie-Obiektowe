package agh.ics.oop;
import java.util.ArrayList;

import agh.ics.oop.model.*;

public class World {

    public static void main(String[] args) {
        ArrayList<MoveDirection> directions = OptionsParser.parse(args);
        ArrayList<Vector2d> positions = new ArrayList<>();
        positions.add(new Vector2d(0,0));
        positions.add(new Vector2d(2,0));
        WorldMap mapa = new GrassField(10);
        Simulation simulation = new Simulation(positions, directions, mapa);
        System.out.println(mapa.toString());
        simulation.run();
        System.out.println(mapa.getElements());
    }
}
