package agh.ics.oop.model;

public class Animal {
    public MapDirection Orientation;
    public Vector2d Polozenie;

    public Animal(){
        Orientation=MapDirection.NORTH;
        Polozenie = new Vector2d(2,2);
    }
    public Animal(Vector2d vpocz){
        Orientation=MapDirection.NORTH;
        Polozenie=vpocz;
    }

    public String toString() {
        return ("("+Polozenie.getX()+","+Polozenie.getY()+")"+"  "+Orientation);
    }

    public boolean isAt(Vector2d position){
        return Polozenie.equals(position);
    }

    public void move(MoveDirection direction){
        switch (direction){
            case LEFT -> Orientation.previous();
            case RIGHT -> Orientation.next();
            case FORWARD -> {switch (Orientation){
                case NORTH -> {
                    if (Polozenie.getY()<4){Polozenie.add(new Vector2d(0,1));}
                }
                case SOUTH -> {
                    if (Polozenie.getY()>=0){Polozenie.add(new Vector2d(0,-1));}
                }
                case EAST -> {
                    if (Polozenie.getX()<4){Polozenie.add(new Vector2d(1,0));}
                }
                case WEST -> {
                    if (Polozenie.getX()>=0){Polozenie.add(new Vector2d(-1,0));}
                }
            }}
            case BACKWARD -> {switch (Orientation){
                case SOUTH -> {
                    if (Polozenie.getY()<4){Polozenie.add(new Vector2d(0,1));}
                }
                case NORTH -> {
                    if (Polozenie.getY()>=0){Polozenie.add(new Vector2d(0,-1));}
                }
                case WEST -> {
                    if (Polozenie.getX()<4){Polozenie.add(new Vector2d(1,0));}
                }
                case EAST -> {
                    if (Polozenie.getX()>=0){Polozenie.add(new Vector2d(-1,0));}
                }
            }}
        }
    }
}