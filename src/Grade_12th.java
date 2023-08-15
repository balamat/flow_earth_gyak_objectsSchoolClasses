import java.util.concurrent.ThreadLocalRandom;

public class Grade_12th {
    private String name;
    private int mathMark;
    private int hungarianMark;
    private int historyMark;
    private int englishMark;
    private int chosenSubjectMark;
    private double avgMark;
    private int avgPlaceOutOtClass;

    private String teacherName;

    public Grade_12th() {

    }

    public Grade_12th(String name) {
        this.name = name;
        this.gradeSetter();
    }

    public Grade_12th(String name, int mathMark, int hungarianMark, int historyMark, int englishMark, int choosenSubjectMark, String teacherName) {
        this.name = name;
        this.mathMark = mathMark;
        this.hungarianMark = hungarianMark;
        this.historyMark = historyMark;
        this.englishMark = englishMark;
        this.chosenSubjectMark = choosenSubjectMark;
        this.teacherName = teacherName;
    }

    public Grade_12th(String name, int mathMark, int hungarianMark, int historyMark, int englishMark, int choosenSubjectMark) {
        this.name = name;
        this.mathMark = mathMark;
        this.hungarianMark = hungarianMark;
        this.historyMark = historyMark;
        this.englishMark = englishMark;
        this.chosenSubjectMark = choosenSubjectMark;
    }

    public Grade_12th(int mathMark, int hungarianMark, int historyMark, int englishMark, int choosenSubjectMark) {
        this.mathMark = mathMark;
        this.hungarianMark = hungarianMark;
        this.historyMark = historyMark;
        this.englishMark = englishMark;
        this.chosenSubjectMark = choosenSubjectMark;
    }

    public String getName() {
        return name;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getHungarianMark() {
        return hungarianMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public int getChosenSubjectMark() {
        return chosenSubjectMark;
    }

    public double getAvgMark() {
        return avgMark = (mathMark + hungarianMark + historyMark + englishMark + chosenSubjectMark) / (double) 5;
    }

    public int getAvgPlaceOutOtClass() {
        return avgPlaceOutOtClass;
    }

    public String getTeacherName() {
        return teacherName;
    }

    /* unmodified setters---------------------------------------------*/

    public Grade_12th setName(String name) {
        this.name = name;
        return this;
    }

    public Grade_12th setAvgMark() {
        this.avgMark = (this.mathMark + this.hungarianMark + this.historyMark + this.englishMark + this.chosenSubjectMark) / (double) 5;
        return this;
    }

    public Grade_12th setAvgPlaceOutOtClass(int avgPlaceOutOtClass) {
        this.avgPlaceOutOtClass = avgPlaceOutOtClass;
        return this;
    }

    public Grade_12th setTeacherName(String teacherName) {
        this.teacherName = teacherName;
        return this;
    }


    public Grade_12th setMathMark() {
        this.mathMark = createGrade();
        return this;
    }

    public Grade_12th setHungarianMark() {
        this.hungarianMark = createGrade();
        return this;
    }

    public Grade_12th setHistoryMark() {
        this.historyMark = createGrade();
        return this;
    }

    public Grade_12th setEnglishMark() {
        this.englishMark = createGrade();
        return this;
    }

    public Grade_12th setChosenSubjectMark() {
        this.chosenSubjectMark = createGrade();
        return this;
    }

    public Object gradeSetter() {
        this.mathMark = createGrade();
        this.hungarianMark = createGrade();
        this.historyMark = createGrade();
        this.englishMark = createGrade();
        this.chosenSubjectMark = createGrade();
        this.avgMark = getAvgMark();
        return this;
    }


    public int createGrade() {
        int grade = ThreadLocalRandom.current().nextInt(1, 6);
        return grade;
    }


    /* end of setters ----------------------------------------------*/
    /* random mark setters---------------------------------------------*/
    //    }
//        return this;
//        this.englishMark = englishMark;
//    public Grade_12th setEnglishMark(int englishMark) {
//
//    }
//        return this;
//        this.historyMark = historyMark;
//    public Grade_12th setHistoryMark(int historyMark) {
//
//    }
//        return this;
//        this.hungarianMark = hungarianMark;
//    public Grade_12th setHungarianMark(int hungarianMark) {
//
//    }
//        return this;
//        this.mathMark = mathMark;
//    public Grade_12th setMathMark(int mathMark) {
//    }
//        return this;
//        this.chosenSubjectMark = chosenSubjectMark;
//    public Grade_12th setChosenSubjectMark(int chosenSubjectMark) {
    /* predefined mark setters---------------------------------------------*/

    //Cast -függvény - átiratkozás egy másik osztályba
    public static Object castStudent(Object object) {
        if (object instanceof Class_12A) {
            Class_12A.numberOfStudents_12A--;
            Class_12B.numberOfStudents_12B++;

            Object returnObject = (Class_12B) object;
//            Object modObject = (Grade_12th) object;     //?????????????
//            Object returnObject = (Class_12B) modObject;
            return (Class_12B) returnObject;
        } else if (object instanceof Class_12B) {
            Class_12B.numberOfStudents_12B--;
            Class_12A.numberOfStudents_12A++;

            Object returnObject = (Class_12A) object;
//            Object modObject = (Grade_12th) object;     //?????????????
//            Object returnObject = (Class_12A) modObject;
            return (Class_12A) returnObject;
        } else {
            return object;
        }
    }

    @Override
    public String toString() {
        return "név: " + name + "\n" +
                "jegyek (matematika, magyar, történelem, angol, választott): " +
                mathMark + ", " + hungarianMark + ", " + historyMark + ", " + englishMark + ", " + chosenSubjectMark
                + "\n" + "Az átlaga: " + avgMark + "\n";
    }


}
