public class stock {

    int stock=10;



    void refill(int k){
        stock +=k;
    }

    void take(){
        stock -=1;
    }

    void empty(){
        stock =0;
    }

    int available(){
        return stock;
    }

    boolean checkStock(){
        if(stock>0)
            return true;
        else
            return false;
    }
}
