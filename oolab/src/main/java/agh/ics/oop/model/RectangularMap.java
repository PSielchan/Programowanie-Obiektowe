package agh.ics.oop.model;
import java.util.*;

public class RectangularMap extends AbstractWorldMap {
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
            return !Element.containsKey(position);
        }
    }
}
