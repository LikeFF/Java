package TrainingObjectInParametr;

public class MainClass {
    public static void main(String[] args) {
        StudentClass eugene = new StudentClass();
        StudentClass alex = new StudentClass();
        StudentClass jimmy = new StudentClass();

        eugene.math = 8;
        eugene.chemistry = 2;
        eugene.pe = 10;

        alex.math = 7;
        alex.chemistry = 5;
        alex.pe = 5;

        jimmy.math = 6;
        jimmy.chemistry = 3;
        jimmy.pe = 7;


        MarkMethod obj = new MarkMethod();

        obj.marksSum(eugene);
        obj.marksSum(alex);
        obj.marksSum(jimmy);



    }
}

