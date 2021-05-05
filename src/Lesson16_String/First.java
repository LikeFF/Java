package Lesson16_String;

public class First {
    String q = "as";
    //   public static void main(String[] args) {
//        String s1 = new String( "qwe");
//        String s2 = "qwe";
//        System.out.println(s1 == s2);
//        System.out.println(s1);
//        System.out.println(s2);


        // Подсчитать сколько объектов тут будет создано:

    public static void main(String[] args) {
        String s1 = new String("Privet");
        String s2 = "Privet";  //ЭТА СТРОКА ТОЖЕ СОЗДАЕТ НОВЫЙ ОБЪЕКТ.
        System.out.println(s1 == s2);
        System.out.println("Privet");
        System.out.println("poka");
        System.out.println("poka" == "privet");
        String autumn = new String("Privet");

    }
}

