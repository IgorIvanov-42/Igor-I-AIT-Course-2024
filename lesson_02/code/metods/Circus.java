package metods;

public class Circus {
    public static void main(String[] args) {
        lightOn();
        entertainer();
        lightOff();





    }
    public static void lightOn(){
        System.out.println("Lights ONNN!!");

    }
    public static void  lightOff(){
        System.out.println("Ligh OFF");
    }
    public static void entertainer(){
        jogger();
        cloun();
        singer();
    }

    public static void jogger(){
        System.out.println("I am jogging...");
    }
    public static void cloun(){
        System.out.println("I am jokking");
    }
    public static void singer(){
        System.out.println("I am singe");
    }




}
