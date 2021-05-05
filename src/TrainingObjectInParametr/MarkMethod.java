package TrainingObjectInParametr;

public class MarkMethod {

    int marksSum(StudentClass st){
        int result = st.math + st.chemistry + st.pe;
        System.out.println(result);
        return result;
    }
}
