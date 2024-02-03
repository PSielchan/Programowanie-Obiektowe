package agh.ics.oop.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GrassField extends AbstractWorldMap{
    Map<Vector2d, WorldElement> Grass = new HashMap<>();
    ArrayList<WorldElement> grasslist = new ArrayList<WorldElement>();
    public GrassField(int grass){
        int i =0;
        while(i<grass){
            Vector2d vector = new Vector2d((int) (Math.random()*Math.sqrt(grass*10)), (int) (Math.random()*Math.sqrt(grass*10)));
            if(canMoveTo(vector)){
                i+=1;
                grasslist.add(new Grass(vector));
                Grass.put(vector, grasslist.get(i - 1));
                if (vector.getY()>height){
                    height=vector.getY();
                }
                if (vector.getX()>width){
                    width=vector.getX();
                }
            }
        }
    }
    @Override
    public boolean canMoveTo(Vector2d position) {
        if(!Element.containsKey(position)){
            return true;
        }
        else {
            return !objectAt(position).isAnimal();
        }
    }

    @Override
    public String toString(){
        String napis = "";
        for (int i = height; i >= 0; i--){
            for(int j=0;j<width+1;j++){
                WorldElement a=Element.get(new Vector2d(j,i));
                WorldElement b=Grass.get(new Vector2d(j,i));
                if(a==null && b==null){
                    napis=napis+"0 \t \t";
                }
                else{
                    if(a==null){
                        napis = napis + b.toString() + " \t \t";
                    }
                    else {
                        napis = napis + a.toString() + "  ";
                    }
                }
            }
            napis=napis+"\n";
        }
        return napis;
    }
    @Override
    public ArrayList<WorldElement> getElements(){
        ArrayList<WorldElement> odp =new ArrayList<WorldElement>();
        odp.addAll(animallist);
        odp.addAll(grasslist);
        return odp;
    }
}
