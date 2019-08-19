package EndGlav;

/* Сила тяжести на Луне составляет около 17% земной. Напишите программу,
которая вычислила бы ваш вес на Луне. */

public class P1_9 {
    public static void main(String[] args) {
        double moi_ves = 105;
        double sil_tazh = moi_ves * 0.17;
        System.out.println("Мой вес на Луне: " + sil_tazh + " кг");
    }
}
