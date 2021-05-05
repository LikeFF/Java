package Lesson16_String;

import java.util.Locale;

public class Test3 {
    public static void main(String[] args) {

        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало. Два важных правила запомни для начала: Ты" +
                    "лучше голодать, чем что попало есть, И лучше одному, чем вместе с кем попало.";

        String s2 = s1.toUpperCase();
        System.out.println(s2);

        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 == c2){
                System.out.println();
                System.out.print(c1);

            }
            else {
                System.out.print(c1);
            }


        }



    }


}
