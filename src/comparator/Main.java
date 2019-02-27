package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alexwwww", "Barrie", 34, new Salary(35000));
        Teacher teacher2 = new Teacher("Onion", "Angela", 38, new Salary(50000));
        Teacher teacher3 = new Teacher("Rice", "Carrey", 56, new Salary(85000));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        teacherList.sort(Comparator.comparing(Teacher::getFirstName));
        System.out.println(teacherList);

        //if(o1.getLastName().length() < o2.getLastName().length()) {
        //                return -1;
        //            } else if (o1.getLastName().length() > o2.getLastName().length()) {
        //                return 1;
        //            } else return 0;

        teacherList.sort(Comparator.comparingInt((ToIntFunction<Teacher>) teacher -> teacher.getLastName().length()).reversed());
        System.out.println(teacherList);
    }
}
