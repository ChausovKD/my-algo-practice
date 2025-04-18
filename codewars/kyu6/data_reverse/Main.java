package kyu6.data_reverse;

/*
    Task: Data Reverse (6 kyu)
    URL: https://www.codewars.com/kata/569d488d61b812a0f7000015/java

    Description: A stream of data is received and needs to be reversed. Each segment is 8 bits long, meaning the order
    of these segments needs to be reversed, for example:
    11111111  00000000  00001111  10101010
     (byte1)   (byte2)   (byte3)   (byte4)
    should become:
    10101010  00001111  00000000  11111111
     (byte4)   (byte3)   (byte2)   (byte1)
    The total number of bits will always be a multiple of 8.
    The data is given in an array as such:
    [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]

    Input: {0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0}
    Output: {1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1}

    Input: {1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1}
    Output: {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}
*/

import java.util.Arrays;

public class Main {

    public static int[] dataReverse(int[] data) {
        int[] dataRev = new int[data.length];
        for(int numberArr = 0, i = 0; i < data.length; i++) {
            if(i % 8 == 0){
                numberArr++;
            }
            dataRev[((8*numberArr)-(i%8))-1] = data[data.length-i-1];
        }
        return dataRev;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dataReverse(new int[]{0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0})));
        System.out.println(Arrays.toString(dataReverse(new int[]{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,
                1,1,1,1,1})));
    }
}
