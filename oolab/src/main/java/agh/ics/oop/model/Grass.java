package agh.ics.oop.model;

public class Grass implements WorldElement {
    Vector2d position;
    public Grass(Vector2d pos){
        position = pos;
    }

    public Vector2d getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "*";
    }

    @Override
    public boolean isAt(Vector2d position) {
        return position==this.position;
    }

    @Override
    public boolean isAnimal() {
        return false;
    }
}
