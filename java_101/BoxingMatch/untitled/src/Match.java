public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        if(isFirstAttack()){
            this.f1 = f1;
            this.f2 = f2;
        }else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void  run(){
        if (isCheck()){
            // while kullanıyoruz çünkü ne kadar döneceğini bilmiyoruz
            while (this.f1.health > 0 && this.f2.health > 0 ){
                System.out.println("=====YENI ROUND=====");
                //foe rakibim aslında
                // ilk f1 vuracağı için
                this.f2.health = this.f1.hit(f2);
                if(isWin()){
                    break;
                }
                //break;
                //System.out.println(f2.health);
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " sağlık : " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0 ){
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0 ){
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }
        return false;
    }

    boolean isFirstAttack(){
        double randomChance = Math.random() * 100;
        if(randomChance <= 50){
            return true;
        }
        return false;
    }

}
