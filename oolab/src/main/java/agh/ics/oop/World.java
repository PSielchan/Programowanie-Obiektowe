package agh.ics.oop;
import java.util.ArrayList;
import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.model.Vector2d;

public class World {

    public static void main(String[] args) {
        ArrayList<MoveDirection> directions = OptionsParser.main(args);
        ArrayList<Vector2d> positions = new ArrayList<>();
        positions.add(new Vector2d(2,2));
        positions.add(new Vector2d(3,4));
        Simulation simulation = new Simulation(positions, directions);
        simulation.run();
    }

    //do wykonania zadania nadają się oba typy list ponieważ
    //rzadko dodajemy i usuwamy elementy a listy przeglądamy
    //od początku do końca więc nie potrzebujemy dostawać się
    //do poszczególnych komórek.
    //Prawdopodobnie implementacja na listach dwukierunkowych
    //jest jednak łatwiejsza (i krótsza)
}
