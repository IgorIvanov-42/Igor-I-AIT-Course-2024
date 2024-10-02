// Соберите данные о дневных температурах
// в вашем городе и за прошлую неделю в массив.
// Выведите температуру, которая была во вторник,
// а затем в четверг. Найдите среднюю температуру за прошлую неделю.

package houmWork;

public class Hw_01 {
    public static void main(String[] args) {
        int[] temper = {23, 19, 18, 20, 17, 14, 15};
        int sum = 0;
        for (int i = 0; i < temper.length; i++) {
            sum = sum + temper[i];
        }
        System.out.println("Temperature on Tuesday: " + temper[1]);
        System.out.println("Temperature on Thursday: " + temper[3]);
        double averageTemperature = (double) sum / temper.length;
        System.out.println("Average temperature for the week: " + averageTemperature);

    }// end of main
}// end of class
