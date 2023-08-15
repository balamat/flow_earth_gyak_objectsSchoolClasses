import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Class_12A stud01 = new Class_12A("Kovács Béla");
        Class_12A stud02 = new Class_12A("Kovács Sára");
        Class_12A stud03 = new Class_12A("Akár Miklós");
        Class_12A stud04 = new Class_12A("Nemaza Nevem");
        Class_12A stud05 = new Class_12A("Jó Áron");
        Class_12A stud06 = new Class_12A("Érték Elek");
        Class_12A stud07 = new Class_12A("Mondjadaj Egyed");
        Class_12A stud08 = new Class_12A("Villamos Vilmos");
        Class_12A stud09 = new Class_12A("Kátrány Kázmér");
        Class_12A stud10 = new Class_12A("Rómeó Júlia");

        Class_12B stud11 = new Class_12B("Wayne Rooney");
        Class_12B stud12 = new Class_12B("Cristiano Ronaldo");
        Class_12B stud13 = new Class_12B("David Beckham");
        Class_12B stud14 = new Class_12B("Paul Scholes");
        Class_12B stud15 = new Class_12B("Ryan Giggs");

        /* A névvel megadós paraméteres konstruktor legenerálja a jegyeket is, erre így nincs szükség */
//        stud01.gradeSetter();
//        stud02.gradeSetter();
//        stud03.gradeSetter();
//        stud04.gradeSetter();
//        stud05.gradeSetter();
//        stud06.gradeSetter();
//        stud07.gradeSetter();
//        stud08.gradeSetter();
//        stud09.gradeSetter();
//        stud10.gradeSetter();

        /* Comparator----------------------------------------------------- */

        Comparator<Class_12A> byGrades = Comparator.comparing(Class_12A::getAvgMark);

        Collections.sort(Class_12A.listStudClass_12A, byGrades);

//        Collections.sort(gradeRank_12A, Collections.reverseOrder());
//        System.out.println(gradeRank_12A);

        /* Comparator----------------------------------------------------- */

        System.out.println(Class_12A.listStudClass_12A);

//        List<Double> gradeRank_12A = new ArrayList<>();
//        gradeRank_12A.add(stud01.getAvgMark());
//        gradeRank_12A.add(stud02.getAvgMark());
//        gradeRank_12A.add(stud03.getAvgMark());
//        gradeRank_12A.add(stud04.getAvgMark());
//        gradeRank_12A.add(stud05.getAvgMark());
//        gradeRank_12A.add(stud06.getAvgMark());
//        gradeRank_12A.add(stud07.getAvgMark());
//        gradeRank_12A.add(stud08.getAvgMark());
//        gradeRank_12A.add(stud09.getAvgMark());
//        gradeRank_12A.add(stud10.getAvgMark());

        //Osztályátlag
        double sum = 0;
        for (int i = 0; i < Class_12A.listStudClass_12A.size(); i++) {
            sum += Class_12A.listStudClass_12A.get(i).getAvgMark();
        }
        System.out.println("Az osztályátlag: " + sum / Class_12A.listStudClass_12A.size());


        System.out.println();
        System.out.println("A 12A osztály létszáma: " + Class_12A.numberOfStudents_12A + " fő");
        System.out.println("A 12B osztály létszáma: " + Class_12B.numberOfStudents_12B + " fő");

        /* --------------------Kérdés: a Castolás----------------------------------- */

//        Grade_12th.castStudent(stud01);
//        System.out.println(stud01.getName() + " átiratkozik a " + stud01.getClass() + " osztályba, így ezután:");
//        System.out.println("Az 12A oszály létszáma: " + Class_12A.numberOfStudents_12A + " fő");
//        System.out.println("A 12B oszály létszáma: " + Class_12B.numberOfStudents_12B + " fő");

    }


}