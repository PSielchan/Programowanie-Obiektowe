package agh.ics.oop.model;

public class Animal implements WorldElement {
    public MapDirection Orientation;
    public Vector2d Position;

    public Animal(){
        Orientation=MapDirection.NORTH;
        Position = new Vector2d(2,2);
    }
    public Animal(Vector2d start){
        Orientation=MapDirection.NORTH;
        Position =start;
    }

    public String toString() {
        return (""+Orientation);
    }

    public boolean isAt(Vector2d position){
        return Position.equals(position);
    }

    @Override
    public boolean isAnimal() {
        return true;
    }
}