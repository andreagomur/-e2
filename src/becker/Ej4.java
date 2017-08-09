/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

import becker.robots.*;

public class Ej4 {

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
        int inicio = 1;
        int anchoi = 3;

        int ancho = 0;
        int alto = 5;
        int esp = 3;
        for (int j = 0; j < esp; j = j + 1) {
            ancho = ancho + anchoi;

            for (int i = inicio; i <= ancho; i = i + 1) {
                Wall w1 = new Wall(RJ, 1, i, Direction.NORTH);
            }
            for (int i = 1; i <= alto; i = i + 1) {
                Wall w1 = new Wall(RJ, i, inicio, Direction.WEST);

            }
            Wall w1 = new Wall(RJ, alto, ancho, Direction.SOUTH);
            Wall w2 = new Wall(RJ, alto, inicio, Direction.SOUTH);
            inicio = ancho + 1;
        }
        for (int j = 1; j <= alto; j = j + 1) {

            Wall w1 = new Wall(RJ, j, ancho, Direction.EAST);
        }
        int cero[][] = new int[3][5];
        cero[1][1] = 1;
        cero[1][2] = 1;
        cero[1][3] = 1;
        cero[1][4] = 1;
        cero[1][5] = 1;
        cero[2][1] = 0;
        cero[2][2] = 0;
        cero[2][3] = 0;
        cero[2][4] = 1;
        cero[2][5] = 1;
        cero[3][1] = 1;
        cero[3][2] = 1;
        cero[3][3] = 1;
        cero[3][4] = 1;
        cero[3][5] = 1;

        for (int j = 1; j <= 5; j = j + 1) {
            for (int i = 1; i <= 3; i = i + 1) {
                int cosa = cero[i][j];
                if (cero[i][j] == 1) {
                    Thing t1 = new Thing(RJ, i, j);

                }

                /**
                 *
                 * @author Andrea
                 */
            }
        }
                            Thing t1 = new Thing(RJ, 2, 2);

        System.out.println(baco.countThingsInBackpack());
    }
}
