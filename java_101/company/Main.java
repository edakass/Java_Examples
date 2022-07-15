package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher t1=new Teacher("Mahmut","TRH","55");
        Teacher t2=new Teacher("Eda","FZK","00");
        Teacher t3=new Teacher("Seda","BIO","111");

       /* Course tarih=new Course("Tarih","101","TRH",t1);
        tarih.printTeacherInfo();*/

         Course tarih=new Course("Tarih","101","TRH");
         tarih.addTeacher(t1);

         Course fizik=new Course("Fizik","102","FZK");
         fizik.addTeacher(t2);

         Course biyoloji=new Course("Biyoloji","101","BIO");
         biyoloji.addTeacher(t3);

         Student s1=new Student("Limon","123","4",tarih,fizik,biyoloji);
         s1.addBulkExamNote(100,200,50);
         //s1.printNote();
        s1.isPass();

        Student s2=new Student("Mavi","4","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();

    }
}
