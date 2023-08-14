package ru.job4j.converver;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuros = 2;
        float outEuros = Converter.rubleToEuro(in);
        boolean passedEuros = expectedEuros == outEuros;
        System.out.println("140 rubles are 2 dollars. Test result : " + passedEuros);
        float expectedDollars = 2.3333333F;
        float outDollars = Converter.rubleToDollar(in);
        boolean passedDollars = expectedDollars == outDollars;
        System.out.println("140 rubles are 2.3333333 euros. Test result : " + passedDollars);
    }
}
