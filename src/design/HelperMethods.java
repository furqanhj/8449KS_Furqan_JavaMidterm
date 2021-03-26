package design;

public class HelperMethods {

    public static boolean isLeapYear(int year) {
        boolean flag = false;

        if (year < 1 || year > 9999) {
            return flag;

        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            flag = true;
            return flag;
        }
        return flag;
    }
    public static boolean validateString(String string) {

        boolean flag = false;
        string = string.toLowerCase();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }

}
