package ClassesHomework;

public class StudentMethod {
    double averageMark(Student st){
        double avgMark = (st.mathGrade + st.economicGrade + st.foreignLanguageGrade) / 3;
        System.out.println(avgMark);
        return avgMark;
    }
}
