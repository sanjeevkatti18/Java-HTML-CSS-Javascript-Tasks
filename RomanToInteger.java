public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int intValue = 0;
        int i = 0;

        while (i < s.length()) {
            if (i + 1 < s.length() && isSubtractive(s.substring(i, i + 2))) {
                int value = getValue(s.substring(i, i + 2));
                intValue += value;
                i += 2;
            } else {
                int value = getValue(s.substring(i, i + 1));
                intValue += value;
                i++;
            }
        }

        return intValue;
    }

    public static boolean isSubtractive(String s) {
        return s.equals("CM") || s.equals("CD") || s.equals("XC") || s.equals("XL") || s.equals("IX") || s.equals("IV");
    }

    public static int getValue(String s) {
        switch (s) {
            case "M":
                return 1000;
            case "D":
                return 500;
            case "C":
                return 100;
            case "L":
                return 50;
            case "X":
                return 10;
            case "V":
                return 5;
            case "I":
                return 1;
            case "CM":
                return 900;
            case "CD":
                return 400;
            case "XC":
                return 90;
            case "XL":
                return 40;
            case "IX":
                return 9;
            case "IV":
                return 4;
            default:
                return 0;
        }
    }
}
