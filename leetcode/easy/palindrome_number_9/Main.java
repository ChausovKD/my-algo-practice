package easy.palindrome_number_9;

public class Main {

    public static boolean isPalindrome(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

//    public static boolean isPalindrome(int x) {
//        if (x < 0 || (x != 0 && x % 10 == 0)) {
//            return false;
//        }
//        int rev = 0;
//        while (x > rev) {
//            rev = rev*10 + x%10;
//            x = x/10;
//        }
//        return (x==rev || x==rev/10);
//    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
