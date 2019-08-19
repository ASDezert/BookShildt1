package EndGlav;

/* Видоизмените программу, созданную в упражнении 1.2, таким образом,
чтобы она выводила таблицу перевода дюймов в метры. Выведите значения
длины до 12 футов через каждый дюйм. После каждых 12 дюймов выведите
пустую строку. (Один метр приблизительно равен 39,37 дюйма.) */

public class P1_10 {
    public static void main(String args[]) {
        double duim, metr;
        int counter;

        counter = 0;
        for(duim = 1; duim <= 144; duim++) {
            metr = duim * 0.0254;
            System.out.println(duim + " дюймам соответствует " + metr + " метра.");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
