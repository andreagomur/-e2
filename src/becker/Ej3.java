package becker;

import becker.robots.*;

public class Ej3 {

    public static void main(String[] args) {
        City RJ = new City();
        Robot baco = new Robot(RJ, 1, 0, Direction.EAST, 5);

        int x = 6;
        int y = 6;
        for (int i = 1; i <= y; i = i + 1) {
            for (int j = 1; j <= x; j = j + 1) {
                Thing t2 = new Thing(RJ, j, i);
            }
        }

        /*
      baco.move();
      baco.move();
      baco.pickThing();
      baco.move();
      baco.turnLeft();	// start turning right as three turn lefts
      baco.turnLeft();
      baco.turnLeft();	// finished turning right
      baco.move();
     // ;
      baco.move();
         */
        System.out.println(baco.countThingsInBackpack());
    }
}
