package classWork.string_method;

public class StringAppl {
    public static void main(String[] args) {

      String str1 = "Hello,";
      char[] chars = { 32, 'W', 'o', 'r', 'l', 'd', '!'}; //32 - код пробела
      String str2 = new String(chars); // str2 это обьект класса String, сделанный конструктором( тоже метод)
        // new - обращение к конструктору класса

        System.out.println(str1);
        System.out.println(str2);

        // concat - обьеденяем, складываем обьекты типа String
        String str = str1 + str2;
        System.out.println(str);

        System.out.println(str1.concat(str2)); // конкатенация с помощью метода

        // length of String
        int l = str.length();
        System.out.println(l);

        // first symbol
        char ch = str.charAt(0);
      System.out.println("First symbol: " + ch);

      // last symbol
      ch = str.charAt(str.length() - 1);
      System.out.println("Last symbol " + ch);

      // print str with spaces
      for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i) + " ");

      }
      System.out.println();

      // check equals
      String str3 = " worLD!";
      boolean checker = str3.equals(str2);
      checker = str3.equalsIgnoreCase(str2);
      System.out.println(checker);

      System.out.println("--------------------------------");
      // symbol in position
      System.out.println(str);
      int index = str.indexOf("W");
      System.out.println(index);
      int index1 = str.lastIndexOf("d");
      System.out.println(index1);
      index = str.indexOf("o");
      index1 = str.lastIndexOf("o");
      System.out.println(index + ", " + index1);

      System.out.println("-----------------SUBSTRING---------------");
      System.out.println(str.substring(7));
      System.out.println(str.substring(7, 10));

      System.out.println("---------------REPLACE-------------------");
      System.out.println(str.replace("o", "o-o-o"));

      System.out.println("-----------------SPLIT--------------------");
      String str4 = "I love string in Java";
      String[] words = str4.split(" ");
      int w = words.length;
      System.out.println("Numbers of words in sentence: " + w);


      // number of letters
      String[] letters = str4.split("");
      int let = letters.length;
      System.out.println("Numbers of words in sentence: " + let);




    }// end of main
}// end of class
