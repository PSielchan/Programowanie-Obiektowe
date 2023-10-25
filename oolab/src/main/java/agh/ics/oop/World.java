package agh.ics.oop;

public class World {
    static void run(String[] napisy){
        System.out.println("zwierzak idzie do przodu");
        int i=0;
        while (!napisy[i].isEmpty()) {
            System.out.println(napisy[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("system wystartował");
        run(args);
        System.out.println("system zakończył działanie");
    }
}
