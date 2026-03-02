package org.example;

public class StringProcessor {
    public static String multiply(String str, int n) {
        if (str == null) throw new IllegalArgumentException("can't be null");
        if (n < 0) throw new IllegalArgumentException("n < 0");
        if (n == 0) return "";

        StringBuilder copeStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            copeStr.append(str);
        }

        return copeStr.toString();
    }

    public static int contains(String str1, String str2) {
        if (str1 == null || str2 == null || str2.isEmpty()) throw new IllegalArgumentException("can't be empty");
        if (str1.length() < str2.length()) throw new IllegalArgumentException("length error");

        int res = 0;

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str2.equals(str1.subSequence(i, str2.length() + i).toString())) {
                res++;
            }
        }

        return res;
    }

    public static String newString(String str) {
        if (str == null) throw new IllegalArgumentException("can't be null");
        if (str.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        for (char q : str.toCharArray()) {
            switch (q) {
                case '1':
                    result.append("один");
                    break;
                case '2':
                    result.append("два");
                    break;
                case '3':
                    result.append("три");
                    break;
                default:
                    result.append(q);
            }
        }

        return result.toString();
    }

    public static void redactStringBuilder(StringBuilder wholeStr) {
        if (wholeStr == null || wholeStr.length() < 2) return;

        int size = wholeStr.length();

        for (int i = 1; i < size; i++) {
            if (i >= wholeStr.length()) return;
            wholeStr.deleteCharAt(i);
        }
    }
}





