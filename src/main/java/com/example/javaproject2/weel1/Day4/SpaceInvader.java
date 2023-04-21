package com.example.javaproject2.weel1.Day4;

public class SpaceInvader {
    int location;
    private void moveLeft() {
        location = location - 1;
        System.out.printf("moveLeft: %d \n", location);
    }

    private void moveright() {
        location = location + 1;
        System.out.printf("moveRight: %d \n", location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();
        si.moveright();
        si.moveright();
        si.moveright();
        si.moveright();

    }
}
