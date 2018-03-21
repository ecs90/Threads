public class Main {

    public static void main(String[] args) {
        BeerHouse beer = new BeerHouse();
        BeerProductor beerP = new BeerProductor(beer);
        BeerConsumer beerC = new BeerConsumer(beer);

        beerP.start();
        beerC.start();
    }
}
