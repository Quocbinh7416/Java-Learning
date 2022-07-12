public class Java52Example {
    public static void main(String[] args) {
        String s1 = "BQN";
        String s2 = "handsome";

        // concat
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        System.out.println("s3: "+ s3);
        System.out.println("s4: "+ s4);
        System.out.println("-------------");

        // replaceAll
        String rs1 = "ABCxyz";
        String rs2 = "XYZdef";
        String rs3 = rs1.replaceAll("xyz", "XYZ");
        System.out.println(rs1);
        System.out.println(rs3);
        System.out.println("-------------");

        // toLowerCase, toUpperCase
        String toLowerCase = rs1.toLowerCase();
        String toUpperCase = rs2.toLowerCase();
        System.out.println(toLowerCase);
        System.out.println(toUpperCase);
        System.out.println("-------------");

        // trim: delete blank 2 ends
        String trimEx = "  12312xxas dadad  ";
        String trim = trimEx.trim();
        System.out.println(trim);
        System.out.println("-------------");

        // subString: return a sub string
        String sourceString = "dragon ball z";
        String subString1 = sourceString.substring(2);
        String subString2 = sourceString.substring(2, 8);
        System.out.println(subString1);
        System.out.println(subString2);
    }
}
