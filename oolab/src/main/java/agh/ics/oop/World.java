package agh.ics.oop;

import agh.ics.oop.model.MoveDirection;

public class World {
    static void run(MoveDirection[] napisy){
        for (int i = 0; i < napisy.length; i++) {
            switch (napisy[i]){
                case FORWARD:
                    System.out.println("Zwierzak idzie do przodu");
                    break;
                case BACKWARD:
                    System.out.println("Zwierzak idzie do tyłu");
                    break;
                case RIGHT:
                    System.out.println("Zwierzak skręca w prawo");
                    break;
                case LEFT:
                    System.out.println("Zwierzak skręca w lewo");
                    break;
                default:
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Start");
        run(OptionsParser.main(args));
        System.out.println("Stop");
    }
}
