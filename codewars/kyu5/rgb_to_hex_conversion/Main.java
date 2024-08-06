package kyu5.rgb_to_hex_conversion;

/*
  Task: RGB To Hex Conversion (5 kyu)
  URL: https://www.codewars.com/kata/513e08acc600c94f01000001

  Description: The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a
  hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that
  range must be rounded to the closest valid value. Your answer should always be 6 characters long, the shorthand with 3
  will not work here.

  255, 255, 255 --> "FFFFFF"
  255, 255, 300 --> "FFFFFF"
  0, 0, 0       --> "000000"
  148, 0, 211   --> "9400D3"
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(1, 2, 3));
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(254, 253, 252));
        System.out.println(rgb(-20, 275, 125));
    }

    public static String rgb(int r, int g, int b) {
        if (r > 255) r = 255;
        else if (r < 0) r = 0;
        if (g > 255) g = 255;
        else if (g < 0) g = 0;
        if (b > 255) b = 255;
        else if (b < 0) b = 0;
        return String.format("%02X%02X%02X", r, g, b);
    }
}
