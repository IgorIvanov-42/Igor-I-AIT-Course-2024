// Имеются оценки абитуриента из его аттестата.
//Найдите средний балл абитуриента.

package classWork;

public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {1, 6, 1, 4, 3, 1, 2, 3, 3, 2, 5, 2};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }
        System.out.println("Sum= " + sum);
        double averageMark = (double) sum / marks.length;
        System.out.println("Average mark = " + averageMark);



    }
}
