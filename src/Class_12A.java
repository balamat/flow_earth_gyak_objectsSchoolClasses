import java.util.ArrayList;
import java.util.List;

public class Class_12A extends Grade_12th {

    public static int numberOfStudents_12A = 0;
    public static List<Class_12A> listStudClass_12A = new ArrayList<>();

    public Class_12A() {
        numberOfStudents_12A++;
        listStudClass_12A.add(this);
    }

    public Class_12A(String name) {
        super(name);
        numberOfStudents_12A++;
        listStudClass_12A.add(this);
    }

    public Class_12A(int mathMark, int hungarianMark, int historyMark, int englishMark, int choosenSubjectMark) {
        super(mathMark, hungarianMark, historyMark, englishMark, choosenSubjectMark);
        numberOfStudents_12A++;
        listStudClass_12A.add(this);
    }

    public Class_12A(String name, int mathMark, int hungarianMark, int historyMark, int englishMark, int choosenSubjectMark) {
        super(name, mathMark, hungarianMark, historyMark, englishMark, choosenSubjectMark);
        numberOfStudents_12A++;
        listStudClass_12A.add(this);
    }

}
