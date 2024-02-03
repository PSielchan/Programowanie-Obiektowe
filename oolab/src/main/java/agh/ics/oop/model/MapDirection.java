package agh.ics.oop.model;

import agh.ics.oop.model.Vector2d;
public enum MapDirection {
    NORTH, EAST, SOUTH, WEST;
    public String toString() {
        return switch (this) {
            case NORTH ->  "Północ";
            case SOUTH ->  "Południe";
            case WEST ->  "Zachód";
            case EAST ->  "Wschód";
        };
    }

    public MapDirection next() {
        return MapDirection.values()[(this.ordinal() + 1) % values().length];
    }

    public MapDirection previous() {
        return MapDirection.values()[(this.ordinal() + (values().length) - 1) % values().length];
    }

    public Vector2d toUnitVector() {
        return switch (this) {
            case NORTH ->  new Vector2d(0,1);
            case EAST ->  new Vector2d(1,0);
            case SOUTH ->  new Vector2d(0,-1);
            case WEST ->  new Vector2d(-1,0);
        };
    }
}
