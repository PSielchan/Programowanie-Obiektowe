package agh.ics.oop;

import agh.ics.oop.model.MoveDirection;

public class OptionsParser {
    public static MoveDirection[] main(String[] args) {
        MoveDirection[] tablica = new MoveDirection[args.length];

        for (int i=0;i<args.length;i++){
            switch (args[i]){
                case "f":
                    tablica[i]=MoveDirection.FORWARD;
                    break;
                case "b":
                    tablica[i]=MoveDirection.BACKWARD;
                    break;
                case "r":
                    tablica[i]=MoveDirection.RIGHT;
                    break;
                case "l":
                    tablica[i]=MoveDirection.LEFT;
                    break;
                default:
            }
        }
        return tablica;
    }
}
