package agh.ics.oop.model;

public class Animal implements WorldElement {
    public int number;
    public static int quantity=0;
    public MapDirection Orientation;
    public Vector2d Position;

    public Animal(){
        Orientation=MapDirection.NORTH;
        Position = new Vector2d(2,2);
        number=quantity;
    }
    public Animal(Vector2d start){
        Orientation=MapDirection.NORTH;
        Position =start;
        number=quantity;
    }

    public String toString() {
        return ("Anim "+number);
    }

    public boolean isAt(Vector2d position){
        return Position.equals(position);
    }

    @Override
    public boolean isAnimal() {
        return true;
    }
}