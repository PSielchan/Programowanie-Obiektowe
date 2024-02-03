package agh.ics.oop.model;
import java.util.*;

public class RectangularMap implements WorldMap {
    int width;
    int height;
    Map<Vector2d, Animal> animals = new HashMap<>();
    public RectangularMap(int width,int height){
        this.width=width;
        this.height=height;
    }

    @Override
    public boolean canMoveTo(Vector2d position) {
        if(position.getX()>width-1||position.getX()<0||position.getY()<0||position.getY()>height-1){
            return false;
        }
        else {
            return !animals.containsKey(position);
        }
    }

    @Override
    public boolean place(Animal animal) {
        if(canMoveTo(animal.Position)){
            animals.put(animal.Position,animal);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void move(Animal animal, MoveDirection direction){
        animals.remove(animal.Position);
        switch (direction){
            case LEFT -> animal.Orientation=animal.Orientation.previous();
            case RIGHT -> animal.Orientation=animal.Orientation.next();
            case FORWARD -> {switch (animal.Orientation){
                case NORTH -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(0,1)))){
                        animal.Position=animal.Position.add(new Vector2d(0,1));}
                }
                case SOUTH -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(0,-1)))){
                        animal.Position=animal.Position.add(new Vector2d(0,-1));}
                }
                case EAST -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(1,0)))){
                        animal.Position=animal.Position.add(new Vector2d(1,0));}
                }
                case WEST -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(-1,0)))){
                        animal.Position=animal.Position.add(new Vector2d(-1,0));}
                }
            }}
            case BACKWARD -> {switch (animal.Orientation){
                case SOUTH -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(0,1)))){
                        animal.Position=animal.Position.add(new Vector2d(0,1));}
                }
                case NORTH -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(0,-1)))){
                        animal.Position=animal.Position.add(new Vector2d(0,-1));}
                }
                case WEST -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(1,0)))){
                        animal.Position=animal.Position.add(new Vector2d(1,0));}
                }
                case EAST -> {
                    if (canMoveTo(animal.Position.add(new Vector2d(-1,0)))){
                        animal.Position=animal.Position.add(new Vector2d(-1,0));}
                }
            }}
        }
        animals.put(animal.Position,animal);
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        return animals.containsKey(position);
    }

    @Override
    public Animal objectAt(Vector2d position) {
        return animals.get(position);
    }

    public String toString(){
        String napis = "";
        for (int i = height - 1; i >= 0; i--){
            for(int j=0;j<width;j++){
                Animal a=animals.get(new Vector2d(j,i));
                if(a==null){
                    napis=napis+"0 \t \t";
                }
                else{
                    napis=napis+a.Orientation + "  ";
                }
            }
            napis=napis+"\n";
        }
        return napis;
    }
}
