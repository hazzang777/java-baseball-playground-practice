package me.hardy.baseball;

public class ValidationUtil {

    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;

    public static boolean checkOneToNine(int i) {
        return i >= MIN_NO && i <= MAX_NO;
    }
}
