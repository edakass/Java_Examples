package com.company;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int writtenExam;

   /* Course(String name,String code,String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note=0; //varsayılan değer olarak sıfır girdik

    }*/
   Course(String name,String code,String prefix){
       this.name=name;
       this.code=code;
       this.prefix=prefix;

       int note=0; //varsayılan değer olarak sıfır girdik
       int writtenExam=0;

   }

   void  addTeacher(Teacher teacher){
       if(teacher.branch.equals(this.prefix)){
           this.teacher=teacher;
          // printTeacher();
       }else {
           System.out.println("Ogretmen ve Ders Bolumleri uyusmuyor..");
       }


   }

    void printTeacher(){
       this.teacher.print();

    }
}
