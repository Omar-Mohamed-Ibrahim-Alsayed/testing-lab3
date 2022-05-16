import java.util.Scanner;

public class coffee {

    coins c = new coins();
    stock k = new stock();

    public void coffee(){
    }

    public void coffee(int s){
        k.refill(s);
    }

    void despence(int x){
        while(x>0 && k.checkStock()){
            System.out.println("coffee");
            c.addCoin();
            k.take();
            x--;
        }
        if (x!=0)
            System.out.println("machine empty");

    }



    void status(){
        System.out.println("there are "+k.checkStock()+" coffees in stock\n"+"there are "+c.checkCoins()+" coins\n");
    }

    public static void main(String args[]){

    }


}
