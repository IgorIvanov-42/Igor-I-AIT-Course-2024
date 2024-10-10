package classWork.stringNumbers_tdd;

public class StringWithNumbers {

    private String string;

    public StringWithNumbers(String string){
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }



    public int sumOfNumbersInString(String string){
        int sum = 0;
        String[] numbers = string.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);

        }
        return sum;

    }



}// end of class
