import java.util.Scanner;

public class Main{
    public static int returnIndexOfRepeatingElement(String text, String text2){
        if (text == null || text2 == null){
            return -5;
        }else if(text.length() == 0){
            return -3;
        } else{
            int index = text.indexOf(text2);
            return index;
        }
    }
    public static String[] makeTextIntoArray(String text) {
        String[] words = text.split("[ ,.,,]");
        return words;
    }
    public static String makeArrayIntoText(String[] info){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < info.length; i++) {
            builder.append(info[i]);
            builder.append("\n");
        }
        return builder.toString();
    }
    public static void printGlasses (int n){
        //Първи ред
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
        System.out.println();
        System.out.print('*');
        for (int i = 0; i < n*2-2; i++) {
            System.out.print('/');
        }
        System.out.print('*');
        for (int i = 0; i < n; i++) {
            System.out.print('/');
        }
        System.out.print('*');
        for (int i = 0; i < n*2-2; i++) {
            System.out.print('/');
        }
        System.out.print('*');
        System.out.println();
        for (int i = 0; i < n-3; i++) {
            System.out.print('*');
            for (int j = 0; j < n*2-2; j++) {
                System.out.print('/');
            }
            System.out.print('*');
            for (int j = 0; j < n; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int j = 0; j < n*2-2; j++) {
                System.out.print('/');
            }
            System.out.print('*');
        }
        if (n-3 != 0){
            System.out.println();
        }

        //Последен ред
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
        for (int i = 0; i < n*2; i++) {
            System.out.print('*');
        }
    }
    public static void main(String[] args) {
        //ex1
//        String text = "This is text. Look at that text. Text text.";
//        String text2 = "text";
//        System.out.println(returnIndexOfRepeatingElement(text,text2));
        //б излиза грешка
        //в
//        String[] text = new String[1];
//        String text2 = "text";
//        System.out.println(returnIndexOfRepeatingElement(text[0],text2));
        //г
//        String text = "";
//        String text2 = "text";
//        System.out.println(returnIndexOfRepeatingElement(text,text2));

        //ex2
//        String text = "This is text. Look at that text. Text text.";
//        String[] words = makeTextIntoArray(text);
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i]);
//        }

        //ex3
//        String[] info = {"Иван Иванов","България","София","Ул. Незабравка 12","1000"};
//        String result = makeArrayIntoText(info);
//        System.out.println(result);

        //ex4
//        System.out.println("Въведете n:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printGlasses(n);
    }
}