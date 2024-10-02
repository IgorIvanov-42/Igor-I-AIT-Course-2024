package homeWork;

public class Hwork01 {
    public static int[] copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        int lengthToCopy = Math.min(array.length, newLength);

        for (int i = 0; i < lengthToCopy; i++) {
            newArray[i] = array[i];

        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int[] newArray = copyOfArray(array, 4);
        for (int i : newArray) {
            System.out.print(i + " ");

        }
    }
}

