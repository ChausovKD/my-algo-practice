package easy.eliuds_eggs;

// Link: https://exercism.org/tracks/java/exercises/eliuds-eggs

public class EliudsEggs {

    public int eggCount(int number) { // second solution
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number >>= 1;
        }
        return count;
    }

//    public int eggCount(int number) { // first solution
//        int bitCount = 0;
//        for (int i = (int) Math.sqrt(number); number > 0; i--) {
//            int currentPowerOfTwo = (int) Math.pow(2, i);
//            if (currentPowerOfTwo == number) {
//                bitCount++;
//                break;
//            }
//            else if (currentPowerOfTwo < number) {
//                bitCount++;
//                number -= currentPowerOfTwo;
//            }
//        }
//        return bitCount;
//
////        return (int) Integer.toBinaryString(number).chars().filter(c -> c == '1').count();
//    }


}
