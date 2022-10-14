package StudentGradingSystem;

public class StudentGradingSystem {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("A teacher", "TRH", "000");
        Teacher t2 = new Teacher("B teacher", "FZK", "111");
        Teacher t3 = new Teacher("C teacher", "BIO", "222");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1); // branch ile prefix eşit olmaz ise ekrana yazdırmaz.// tarih.printTeacherInfo();

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("nur", "1", "4", tarih, fizik, biyoloji);

        s1.addBulkExamNote(100, 50, 50);
        s1.isPass();

        Student s2 = new Student("ayse", "2", "3", tarih, fizik, biyoloji);
        s2.addBulkExamNote(60, 80, 90);
        s2.isPass();


    }


}
