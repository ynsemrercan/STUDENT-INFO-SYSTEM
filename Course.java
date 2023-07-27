public class Course {

    Teacher teacher;

    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;


    Course(String name,String code,String prefix,int sozluNotu){

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;



    }

    void addTeacher(Teacher teacher){

        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }
        else{

            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor ! ");
        }


    }void printTeacher(){

        this.teacher.print();

    }










}
