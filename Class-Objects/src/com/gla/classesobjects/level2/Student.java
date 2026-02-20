class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String n, int r, double m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    String grade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    void display() {
        System.out.println(name + " " + rollNumber + " " + grade());
    }

    public static void main(String[] args) {
        Student s = new Student("Abhay", 1, 82);
        s.display();
    }
}
