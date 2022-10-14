package StudentGradingSystem;

class Course {
    Teacher teach;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teach) {
        if (teach.branch.equals(this.prefix)) {
            this.teach = teach;
            printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacherInfo() {
        this.teach.print();
    }
}
