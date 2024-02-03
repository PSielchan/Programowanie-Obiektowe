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

    public void move(MoveDirection direction){
        switch (direction){
            case LEFT -> Orientation=Orientation.previous();
            case RIGHT -> Orientation=Orientation.next();
            case FORWARD -> {switch (Orientation){
                case NORTH -> {
                    if (Position.getY()<4){
                        Position=Position.add(new Vector2d(0,1));}
                }
                case SOUTH -> {
                    if (Position.getY()>0){
                        Position=Position.add(new Vector2d(0,-1));}
                }
                case EAST -> {
                    if (Position.getX()<4){
                        Position=Position.add(new Vector2d(1,0));}
                }
                case WEST -> {
                    if (Position.getX()>0){
                        Position=Position.add(new Vector2d(-1,0));}
                }
            }}
            case BACKWARD -> {switch (Orientation){
                case SOUTH -> {
                    if (Position.getY()<4){
                        Position=Position.add(new Vector2d(0,1));}
                }
                case NORTH -> {
                    if (Position.getY()>0){
                        Position=Position.add(new Vector2d(0,-1));}
                }
                case WEST -> {
                    if (Position.getX()<4){
                        Position=Position.add(new Vector2d(1,0));}
                }
                case EAST -> {
                    if (Position.getX()>0){
                        Position=Position.add(new Vector2d(-1,0));}
                }
            }}
        }
    }
}