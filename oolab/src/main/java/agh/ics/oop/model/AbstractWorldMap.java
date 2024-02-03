package agh.ics.oop.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractWorldMap implements WorldMap{
    int width=0;
    int height=0;
    Map<Vector2d, WorldElement> Element = new HashMap<>();
    ArrayList<WorldElement> animallist = new ArrayList<WorldElement>();
    @Override
    public boolean place(Animal animal) {
        if(canMoveTo(animal.Position)){
            Animal.quantity+=1;
            animallist.add(animal);
            Element.put(animal.Position,animal);
            if (animal.Position.getY()>height){
                height=animal.Position.getY();
            }
            if (animal.Position.getX()>width){
                width=animal.Position.getX();
            }
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void move(Animal animal, MoveDirection direction){
        Element.remove(animal.Position);
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
        Element.put(animal.Position,animal);
        if (animal.Position.getY()>height){
            height=animal.Position.getY();
        }
        if (animal.Position.getX()>width){
            width=animal.Position.getX();
        }
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        return Element.containsKey(position);
    }

    public WorldElement objectAt(Vector2d position) {
        return Element.get(position);
    }

    public String toString(){
        String napis = "";
        for (int i = height; i >= 0; i--){
            for(int j=0;j<width+1;j++){
                WorldElement a=Element.get(new Vector2d(j,i));
                if(a==null){
                    napis=napis+"0 \t \t";
                }
                else{
                    napis=napis + a.toString() + "  ";
                    if(!a.isAnimal())napis=napis+"\t \t";
                }
            }
            napis=napis+"\n";
        }
        return napis;
    }
    public ArrayList<WorldElement> getElements(){
        return animallist;
    }
}
