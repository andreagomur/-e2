package becker;

import becker.robots.*;

public class Ej3 {
   
    public static void GiraDerecha(Robot robot) {
              robot.turnLeft();
              robot.turnLeft();
              robot.turnLeft();
    }
    public static void Cambiasentido(Robot robot) {
              robot.turnLeft();
              robot.turnLeft();
    }

    public static void main(String[] args) {
        City RJ = new City();
        Robot baco = new Robot(RJ, 1, 0, Direction.EAST, 5);

        int x = 6;
        int y = 5;
        for (int i = 1; i <= y; i = i + 1) {
            for (int j = 1; j <= x; j = j + 1) {
                Thing t1 = new Thing(RJ, j, i);
            }
        }
                 for (int l = 1; l <=x; l = l + 1) {
         for (int i = 1; i <=2; i = i + 1) {
            for (int j = 1; j <= y; j = j + 1) {
            baco.move();
            baco.pickThing();
            }
            GiraDerecha (baco);
                       }
            y = y-1;
                 }
             GiraDerecha (baco);
         System.out.println(baco.countThingsInBackpack());
        }
    }
