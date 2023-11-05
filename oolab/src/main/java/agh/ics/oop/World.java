package agh.ics.oop;

public class World {
    static void run(String[] napisy){
        for (int i = 0; i < napisy.length; i++) {
            switch (napisy[i]){
                case "f":
                    System.out.println("zwierzak idzie do przodu");
                    break;
                case "b":
                    System.out.println("zwierzak idzie do tyłu");
                    break;
                case "r":
                    System.out.println("zwierzak skręca w prawo");
                    break;
                case "l":
                    System.out.println("zwierzak idzie w lewo");
                    break;
                default:
            }
            //System.out.print(napisy[i]);
            //if(i< napisy.length-1){
            //    System.out.print(",");
            //}
        }
        //System.out.println();

    }
    public static void main(String[] args) {
        System.out.println("system wystartował");
        run(args);
        System.out.println("system zakończył działanie");
    }
}
