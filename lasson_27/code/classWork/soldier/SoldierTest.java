package classWork.soldier;

//- John, 182, 82.3, 91
//- Peter, 175, 77.1, 75
//- Robin, 162, 55.1, 91
//- Mary, 159, 55.1, 91
//- Ann", 162, 55, 88

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Robin", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88)

        };
    }// end of method

    @Test
    void testNativeSorting(){
        System.out.println("-----Print as is-------");
        printArray(soldiers);
        Arrays.sort(soldiers);
        System.out.println("-----Print after native sorting---");
        printArray(soldiers);
    }

    @Test
    void testSortingByName(){
        Comparator<Soldier> comparatorByName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return - o1.getName().compareTo(o2.getName());// reverse sorting
            }
        };
        System.out.println("-----Print as is-------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorByName);
        System.out.println("-----Print after  sorting by name---");
        printArray(soldiers);

    }

    @Test
    void testSortingByWeight(){
        System.out.println("-----Print as is-------");
        printArray(soldiers);
        Arrays.sort(soldiers, (w1, w2) -> Double.compare(w1.getWeight(), w2.getWeight()));
        System.out.println("-----Print after  sorting by weight---");
        printArray(soldiers);

    }

    @Test
    void testByNameAndHeight(){
        Comparator<Soldier> comparatorNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res != 0 ? res: Integer.compare(o1.getHeight(), o2.getHeight());
            }
        };
        System.out.println("-----Print as is-------");
        printArray(soldiers);
        Arrays.sort(soldiers, (o1, o2) -> Integer.compare(o1.getHeight(), o2.getHeight()));
        System.out.println("-----Print after  sorting by Name and Height---");
        printArray(soldiers);
    }

    @Test
    void testSortSoldiersByProfile(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = -(s1.getProfile() - s2.getProfile()); // sort by Profile
            return res !=0 ? res : Integer.compare(s1.getHeight(), s2.getHeight());
        });
        printArray(soldiers);
    }

    @Test
    void testBinarySearch(){
        System.out.println("-----Print as is-------");
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> (s1.getProfile() - s2.getProfile()));
        System.out.println("-----Print after sorting by Profile-------");
        printArray(soldiers);

        Soldier pattern = new Soldier(null, 0, 0, 91);

        int index = Arrays.binarySearch(soldiers, pattern,  (s1, s2) -> (s1.getProfile() - s2.getProfile()));
        System.out.println("Index = " + index);

    }

    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }


}// end of class