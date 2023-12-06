package agh.ics.oop.model;

public class Animal {
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
        return ("("+ Position.getX()+","+ Position.getY()+")"+"  "+Orientation);
    }

    public boolean isAt(Vector2d position){
        return Position.equals(position);
    }
}