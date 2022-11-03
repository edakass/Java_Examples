package com.company;

class  Lion extends Cats{
    @Override
    public void eat() {
        super.eat();
        System.out.println("The Lion eats meat");
    }
}
class Tiger extends Cats{

    @Override
    public void eat() {
        super.eat();
        System.out.println("The tiger eats meat");
    }
}
public class Cats extends Animals{

    public void catVoice(){
        System.out.println("Miyavv ! ");
    }

    @Override
    public void getDosage() {
        super.getDosage();
        System.out.println("About the information Cats dosage");
    }

}
