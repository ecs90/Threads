public class BeerConsumer extends Thread {
    private BeerHouse beer;

    public BeerConsumer(BeerHouse beer){
        this.beer = beer;
    }

    public void run(){
        while(this.beer.isEnabled()){
            this.beer.out();
        }
    }

}
