public class Java51Example {
    public static void main(String[] args) {
        String s1 = "Hello everyone, Hello lady and gentleman, Hello World";
        String s2 = "Hello";
        String s3 = "Hello 123";
        char c1 = 'o';
        // indexOf: left to right
        // lastIndexOf: right to left

        // indexOf(char c)
        System.out.println( s1.indexOf(c1));
        System.out.println( s1.indexOf(c1, 10));
        System.out.println("----------------");
        // indexOf(String str) index or -1
        System.out.println( s1.indexOf(s2));
        System.out.println( s1.indexOf(s3));
        System.out.println("----------------");
        // indexOf(String str, fromIndex) i
        System.out.println( s1.indexOf(s2, 2));
        System.out.println("----------------");

        // lastIndexOf()
        System.out.println( s1.lastIndexOf(s2));
        System.out.println( s2.lastIndexOf(c1));

        // fileName.doc.class.xls
    }
}
