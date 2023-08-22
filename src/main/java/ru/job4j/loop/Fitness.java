package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik >= ivan) {
            ivan = ivan * 3;
            nik = nik * 2;
            if (ivan > nik) {
                month++;
            } else if (ivan < nik) {
                month++;
            }
        }
        return month;
    }
}
