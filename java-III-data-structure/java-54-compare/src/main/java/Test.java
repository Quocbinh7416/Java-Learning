public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(200, "Tran Van Thanh", "Class A", 7.5);
        Student student2 = new Student(1, "Nguyen Thi Thanh Hoa", "Class D", 8.5);
        Student student3 = new Student(4, "Nguyen Van An", "Class D", 8.5);

        System.out.println(student1.compareTo(student2));
        System.out.println(student1.compareTo(student3));
        System.out.println(student2.compareTo(student3));
    }
}
