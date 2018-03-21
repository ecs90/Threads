public class BeerProductor extends Thread{
    private BeerHouse beer;

    public BeerProductor(BeerHouse beer){
        this.beer = beer;
    }

    public void run(){
        while (this.beer.isEnabled()){
            this.beer.in();

        }
    }

}
