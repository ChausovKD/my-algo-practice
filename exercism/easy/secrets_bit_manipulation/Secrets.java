package easy.secrets_bit_manipulation;

public class Secrets {

    public static int shiftBack(int value, int amount) { // shift back the bits
        return value >>> amount;
    }

    public static int setBits(int value, int mask) { // set some bits
        return value | mask;
    }

    public static int flipBits(int value, int mask) { // flip specific bits
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) { // clear specific bits
        return value & ~mask;
    }
}
