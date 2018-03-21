public class BeerHouse{
    private int counter = 0;
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public synchronized void in() {
        this.counter++;
        System.out.println("Entered value = " + this.counter);
        if(this.counter==100) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
    }

    public synchronized void out() {
        if(this.counter>0){
            System.out.println("Eliminated value = " + this.counter);
            this.counter--;
            if (this.counter == 99) {
                notifyAll();
            }
            if(this.counter==0){
                this.enabled = false;
            }
        }
    }

}
