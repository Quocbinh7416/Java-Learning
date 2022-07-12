public class Java50Example {
    public static void main(String[] args) {
        String s1 = "BQN big";
        String s2 = "BQN BIG";
        String s3 = "BQN big";

        // equal()
        System.out.println("s1 equal s2: " + s1.equals(s2));
        System.out.println("s1 equal s3: " + s1.equals(s3));
        System.out.println("-----------------------------");

        // equalsIgnoreCase(()
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
        System.out.println("-----------------------------");

        // compareTo => compare => ( negative < , 0 = , positive >)
        String name1 = "Nguyễn Văn A";
        String name2 = "Nguyễn Văn B";
        String name3 = "Nguyễn Văn";
        String name4 = "Nguyễn Văn a";
        System.out.println("name 1 compare with name 2: " + name1.compareTo(name2));
        System.out.println("name 1 compare with name 3: " + name1.compareTo(name3));
        System.out.println("name 1 compare with name 4: " + name1.compareTo(name4));
        System.out.println("-----------------------------");
        // compareToIgnoreCase => compare => ( negative < , 0 = , positive >)

        /*
        1st - regionMatches()
        regionMatches(int toffset, String other, int ooffset, int len)
        Params:
            toffset – the starting offset of the subregion in this string.
            other – the string argument.
            ooffset – the starting offset of the subregion in the string argument.
            len – the number of characters to compare.
        Returns:
            true if the specified subregion of this string exactly matches the specified subregion of the string argument;
            false otherwise.
         */

        String rm1 = "He is Nguyễn Văn An";
        String rm2 = "Nguyễn";
        boolean isMatch = rm1.regionMatches(5, rm2, 0, 7);
        System.out.println(isMatch);

        // startWith(), endWith()
        String phoneNumber = "037456789";
        System.out.println(phoneNumber.startsWith("037"));
        System.out.println(phoneNumber.startsWith("034"));

        String fileName = "I love you.JPG";
        String fileName2 = "Hoc Java.PDF";

        if (fileName.endsWith(".JPG")) {
            System.out.println("File 1 là hình ảnh!");
        }else if (fileName.endsWith(".PDF")) {
            System.out.println("File 1 là file PDF!");
        }

        if (fileName2.endsWith(".JPG")) {
            System.out.println("File 2 là hình ảnh!");
        }else if (fileName2.endsWith(".PDF")) {
            System.out.println("File 2 là file PDF!");
        }
    }
}
