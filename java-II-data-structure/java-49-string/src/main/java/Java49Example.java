import java.util.Scanner;

public class Java49Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String s = sc.nextLine();
        System.out.println("------------------");

        // length()
        int length = s.length();
        System.out.println(length);
        System.out.println("------------------");

        // charAt()
        for(int i=0; i< length; i++){
            System.out.println("Line " + i + ": " + s.charAt(i));
        }
        System.out.println("------------------");

        // getChar()
        char[] arrayChar = new char[10];
        s.getChars(2, 4, arrayChar , 0);
        for(int i = 0; i < arrayChar.length; i++){
            System.out.println("Char at" + i + ": "+ arrayChar[i]);
        }
        System.out.println("------------------");

        // getBytes()
        byte[] arrayBytes = s.getBytes();
        for(byte b: arrayBytes){
            System.out.println(b);
        }
    }
}
