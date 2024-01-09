public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Polinom-Sayilari-Bulma-------------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("-----------Mukemmel-Sayiyi-Bulma-------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("-----------Sayilari-Kelimelere-Dök------------");
        System.out.println(numberToWords(121));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num) {
        int reversedNumber = reverseNumber(num);
        return num == reversedNumber;
    }
    public static int reverseNumber(int num) {
        String originalStr = Integer.toString(Math.abs(num));
        String reversedStr = new StringBuilder(originalStr).reverse().toString();

        int reversedNumber = Integer.parseInt(reversedStr);
        if (num < 0) {
            reversedNumber *= -1;
        }
        return reversedNumber;
    }
    public static boolean isPerfectNumber(int num){

        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
              sum +=i;
            }
        }

        return num == sum;
    }
    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            result.insert(0, ones[digit] + " ");
            number /= 10;
        }
        return result.toString().trim();
    }
}
