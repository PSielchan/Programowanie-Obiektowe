package agh.ics.oop;

import java.util.ArrayList;
import agh.ics.oop.model.MoveDirection;

public class OptionsParser {
    public static ArrayList<MoveDirection> parse(String[] args) {
        ArrayList<MoveDirection> tablica = new ArrayList<MoveDirection>();
        for (int i=0;i<args.length;i++){
            switch (args[i]){
                case "f":
                    tablica.add(MoveDirection.FORWARD);
                    break;
                case "b":
                    tablica.add(MoveDirection.BACKWARD);
                    break;
                case "r":
                    tablica.add(MoveDirection.RIGHT);
                    break;
                case "l":
                    tablica.add(MoveDirection.LEFT);
                    break;
                default:
            }
        }
        return tablica;
    }
}
