package classWork.compare_string;

// равенство строк - как понять?

public class CompareStringAppl {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        boolean checker = (x == y);
        System.out.println(checker);

        String str1 = "Europe";
        String str2 = "Europe";

        System.out.println("--------------------------------------");

        checker = (str1 == str2);
        System.out.println(checker);

        System.out.println("--------------------------------------");

        String str3 = new String("Europe");
        checker = (str1 == str3);
        System.out.println(checker);

        System.out.println("----------------------------------");

        checker = str1.equals(str3);
        System.out.println(checker);



    }// end of main
}//end of class
