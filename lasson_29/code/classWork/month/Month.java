package classWork.month;
//Задайте Enum Month, определите месяца, их
// наименования и количество в них дней.
//Реализуйте метод, позволяющий прибавлять месяца к
// выбранному, получая правильный месяц.
//Пример: AUG + 6 month = FEB
//Проверьте работу метода в приложении.

public enum Month {

    JAN("January", 31), FEB("February", 28), MAR("March", 31), APR("April", 30), MAY("May", 31), JUN("June", 30), JUL("July", 31), AUG("August", 31), SEP("September", 30), OKT("October", 31), NOV("November", 30), DEC("December", 31);

    ;

    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Month{");
        sb.append("name='").append(name).append('\'');
        sb.append(", days=").append(days);
        sb.append('}');
        return sb.toString();
    }

    public Month plusMonth(Month month, int quantity){
        int n = month.ordinal();
        int index = n + quantity;
        Month[] months = Month.values();
        int res = index % months.length;

        return months[res];
    }
}// end of class
