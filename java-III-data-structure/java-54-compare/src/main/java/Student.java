public class Student implements Comparable<Student> {
    private int id;
    private String fullName;
    private String className;
    private Double grade;

    public Student(int id, String fullName, String className, Double grade) {
        this.id = id;
        this.fullName = fullName;
        this.className = className;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getFullName() {
        String s = this.fullName.trim();
        if(s.contains(" ")) {
            int index = s.lastIndexOf(" ");
            return s.substring(index + 1);
        } else {
            return s;
        }
    }

    @Override
    public int compareTo(Student o) {
        // <0 or >0 or =0
        // id
//        return this.id - o.id;

        // name
//        String thisName = this.getFullName();
//        String oName = o.getFullName();
//        return thisName.compareTo(oName);

        // grade
        return this.grade - o.grade == 0 ? 0 : (this.grade - o.grade >= 0 ? 1 : -1);
    }
}
