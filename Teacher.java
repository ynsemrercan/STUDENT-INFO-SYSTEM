public class Teacher{



    String name;
    String mpNo;
    String branch;

    Teacher(String name,String branch,String mpNo){

        this.name=name;
        this.branch=branch;
        this.mpNo=mpNo;


    }

    void print(){

        System.out.println("Adı: "+this.name);
        System.out.println("Bölümü: "+this.branch);
        System.out.println("Telefon No: "+this.mpNo);




    }





}
