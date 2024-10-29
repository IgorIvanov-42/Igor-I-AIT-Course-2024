package homeWork.week;

import classWork.month.Month;

public enum WeekDay {
    MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thursday"), FRI("Friday"), SAT("Saturday"), SUN("Sunday") ;

    private String name;

    WeekDay(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public WeekDay plusWeekDay (WeekDay weekDay, int quantity){
        int n = weekDay.ordinal();
        int index = n + quantity;
        WeekDay[] weekDays = WeekDay.values();
        int res = index % weekDays.length;

        return weekDays[res];
    }
}// end of class
