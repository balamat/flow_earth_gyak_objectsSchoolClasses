public class Class_12B extends Grade_12th{
    public static int numberOfStudents_12B = 0;
    public Class_12B() {
    numberOfStudents_12B++;
    }

    public Class_12B(String name) {
        super(name);
        numberOfStudents_12B++;
    }

    public Class_12B(int mathMark, int hungarianMark, int historyMark, int englishMark, int choosenSubjectMark) {
        super(mathMark, hungarianMark, historyMark, englishMark, choosenSubjectMark);
        numberOfStudents_12B++;
    }

    public Class_12B(String name, int mathMark, int hungarianMark, int historyMark, int englishMark, int choosenSubjectMark) {
        super(name, mathMark, hungarianMark, historyMark, englishMark, choosenSubjectMark);
        numberOfStudents_12B++;
    }


}
