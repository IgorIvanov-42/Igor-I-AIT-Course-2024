package classWork.regex_validator;

public class Validator {
    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str){
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str){
        // TODO Homework checkDateFormatEU
        return false;
    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str){
        // TODO Homework checkDateFormatUS
        return false;
    }

    // PhoneNumber
    public static boolean checkPhoneNumber(String str){
        // TODO Homework checkPhoneNumber
        return false;
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str){
        // TODO Homework checkLessEquals255
        return false;
    }
}
