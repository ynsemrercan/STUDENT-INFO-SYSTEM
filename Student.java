import javax.lang.model.element.NestingKind;

public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3,int sozluNotu){

        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;

        this.avarage=0.0;
        this.isPass=false;

    }
    void addBulkExamNote(int note1 ,int note2 , int note3 ){

        if (note1>=0 && note1<=100) {

            this.c1.note=note1;

        }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;

        }
    }
    void printNote(){

        System.out.println(this.c1.name + "Notu:\t"+this.c1.note);
        System.out.println(this.c2.name + "Notu:\t"+this.c2.note);
        System.out.println(this.c3.name + "Notu:\t"+this.c3.note);
        System.out.println("Ortalamanız: "+this.avarage);

    }
    void isPass(){

        this.avarage=( (this.c1.note*0.80+this.c1.sozluNotu*0.20)+ (this.c2.note*0.80+this.c2.sozluNotu*0.20) + (this.c3.note*0.80+this.c3.sozluNotu*0.20) ) / 3.0;

        if(this.avarage>55){

            System.out.println("Tebrikler Sınıfı Geçtiniz ");
            this.isPass=true;
        }else {

            System.out.println("Maalesef Sınıfta Kaldınız ");
            this.isPass=false;
        }
        printNote();
    }

}
