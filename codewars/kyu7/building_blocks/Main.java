package kyu7.building_blocks;

import static org.junit.Assert.assertEquals;

/*
    Task: Building blocks (7 kyu)
    URL: https://www.codewars.com/kata/55b75fcf67e558d3750000a3

    Description: Write a class Block that creates a block. The constructor should take an array as an argument, this
    will contain 3 integers of the form [width, length, height] from which the Block should be created. No error
    checking is needed. Define these methods:
    - `getWidth()` return the width of the `Block`;
    - `getLength()` return the length of the `Block`;
    - `getHeight()` return the height of the `Block`;
    - `getVolume()` return the volume of the `Block`;
    - `getSurfaceArea()` return the surface area of the `Block`.
*/

public class Main {
    public static void main(String[] args) {
        Block b = new Block(new int[]{2, 2, 2});
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(2,b.getHeight());
        assertEquals(8,b.getVolume());
        assertEquals(24,b.getSurfaceArea());
    }

}

class Block {
    private int width;
    private int length;
    private int height;

    public Block(int ... dimensions) {
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * height * width;
    }
}