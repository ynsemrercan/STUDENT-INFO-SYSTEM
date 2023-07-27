
public class Main {

    public static void main(String[] args) {

        Teacher t1= new Teacher("Müslüm Arkan","TRH","0543");
        Teacher t2= new Teacher("Asım Kaygusuz","FZK","0543");
        Teacher t3= new Teacher("Salih Mamiş","BIO","0543");

        Course tarih=new Course("Tarih","101","TRH",90);
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK",90);
        fizik.addTeacher(t2);

        Course biyo=new Course("Biyoloji","103","BIO",90);
        biyo.addTeacher(t3);



        Student s1 = new Student("Yunus Emre","0215028032","4",tarih,fizik,biyo,90);
        s1.addBulkExamNote(60,60,60);
        s1.isPass();


    }
}