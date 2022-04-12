package ComparableVsComparator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

    static List<Laptop> lstObjLaptop;

    static List<User> lstObjUser;

    static {
        // creating list of Laptop Objects
        lstObjLaptop = Arrays.asList(
                new Laptop("Dell", 8, 512, "AMD"),
                new Laptop("HP", 4, 1024, "Intel"),
                new Laptop("Acer", 12, 512, "AMD"));

        // creating list of User Objects
        lstObjUser = Arrays.asList(
                new User("john", "botham", 22, LocalDate.of(2000, 6, 5), 450),
                new User("james", "bond", 27, LocalDate.of(1995, 7, 6), 481),
                new User("chirs", "morries", 32, LocalDate.of(1990, 8, 7), 490),
                new User("david", "miller", 42, LocalDate.of(1980, 9, 8), 300));
    }

    public static void main(String[] args) {

        // Comparable
        // byUsingComparable();

        // Comparator
        byUsingComparator();

    }

    public static void byUsingComparable() {
        /*
         * Ways to sort a List object
         * 1.by using Collections.sort()
         * 2.by using streams api
         */

        // way 1
        Collections.sort(lstObjLaptop);

        lstObjLaptop.stream().forEach(System.out::println);

        System.out.println("----------------------------------------");

        // way 2
        lstObjLaptop.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------------------------");
    }

    public static void byUsingComparator() {

        // User class havn't implements any interface now we gonna sort User Object by
        // CibilScore(assume CibilScore out of 500) or age

        // creating Anonymous class for Comparator Interface
        Comparator<User> comparatorUserTotalMark = new Comparator<User>() {

            @Override
            public int compare(User obj1, User obj2) {
                return obj1.getCibilScore() > obj2.getCibilScore() ? 1 : -1;
            }
        };

        System.out.println("---------Sorting Based on CibilScore---------------");
        lstObjUser.stream().sorted(comparatorUserTotalMark).forEach(System.out::println);

        // Sorting by User Age bu using lamda expression
        Comparator<User> comparatorBylamda = (obj1, obj2) -> obj1.getAge() > obj2.getAge() ? 1 : -1;

        System.out.println("---------Sorting Based on User age---------------");
        lstObjUser.stream().sorted(comparatorBylamda).forEach(System.out::println);

    }

}
