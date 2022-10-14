package StudentGradingSystem;

class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print() {
        System.out.println("İsim\t:" + this.name);
        System.out.println("Bölümü\t:" + this.branch);
        System.out.println("Tel No\t:" + this.mpno);
    }
}
