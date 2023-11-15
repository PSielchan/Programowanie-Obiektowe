package agh.ics.oop;
import java.util.ArrayList;

import agh.ics.oop.model.Animal;
import agh.ics.oop.model.Vector2d;
import agh.ics.oop.model.MoveDirection;
public class Simulation {
    ArrayList<Animal> animal = new ArrayList<>();
    ArrayList<MoveDirection> directions;
    public Simulation(ArrayList<Vector2d> vector,ArrayList<MoveDirection> direction){
        for (Vector2d vector2d : vector) {
            animal.add(new Animal(vector2d));
        }
        directions=direction;
    }
    public void run(){
        for (int i=0; i<directions.size();i++){
            animal.get(i % animal.size()).move(directions.get(i));
            System.out.println("Zwierzę " + i % animal.size() + " " + animal.get(i % animal.size()).toString());

        }
    }
}
