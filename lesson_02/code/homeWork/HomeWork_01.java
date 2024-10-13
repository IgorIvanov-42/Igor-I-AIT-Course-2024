package homeWork;

public class HomeWork_01 {
    public static void main(String[] args) {
        hauptmetodStart();
        anderemetodStart();
        hauptmetodStop();
    }// end of main

    public static void hauptmetodStart() {
        System.out.println("Hauptmetod Start");
        System.out.println("Metod1 on");
    }

    public static void hauptmetodStop() {
        System.out.println("Hauptmetod Stop");
    }
    public static void anderemetodStart() {
        on1();
        on2();
        on3();
    }
            public static void on1(){
                System.out.println("Metod1 Start");
                System.out.println("Metod2 on");
                System.out.println("Metod1 Stop");
            }
            public static void on2(){
                System.out.println("Metod2 Start");
                System.out.println("Metod3 on");
                System.out.println("Metod2 Stop");
            }
            public static void on3(){
                System.out.println("Metod3 Start");
                System.out.println("Metod3 Stop");
            }
}// end of class











