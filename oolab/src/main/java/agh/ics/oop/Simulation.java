package agh.ics.oop;
import java.util.ArrayList;

import agh.ics.oop.model.*;

public class Simulation {
    ArrayList<Animal> animal = new ArrayList<>();
    ArrayList<MoveDirection> directions;
    WorldMap map;
    public Simulation(ArrayList<Vector2d> vector, ArrayList<MoveDirection> direction, WorldMap map){
        this.map=map;
        for (Vector2d vector2d : vector) {
            if (map.canMoveTo(vector2d)) {
                animal.add(new Animal(vector2d));
            } else {
                System.out.println("Źle wpisane pozycje początkowe");
            }
        }
        for(Animal zwierze : animal){
            if(!this.map.place(zwierze)){
                System.out.println("Źle wpisane pozycje początkowe");
            }
        }
        directions=direction;
    }
    public void run(){
        for (int i=0; i<directions.size();i++){
            map.move(animal.get(i % animal.size()),directions.get(i));
            System.out.println("Zwierzę " + i % animal.size() + " " + animal.get(i % animal.size()).toString());
        }
    }
}
