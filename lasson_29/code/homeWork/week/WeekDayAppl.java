package homeWork.week;

public class WeekDayAppl {
    public static void main(String[] args) {

        WeekDay w = WeekDay.MON;
        System.out.println("Start day " + w);

        int x = 10;

        w = w.plusWeekDay(w, x);
        System.out.println("After " + x + " Day: " + w);




    }// end of main
}// end of class
