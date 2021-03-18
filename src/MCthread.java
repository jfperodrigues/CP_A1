public class MCthread implements Runnable{

    public int it;
    public int in;
    public int thread;
    public Aula1 mc;

    public  MCthread(int it, int thread){
        this.it = it;
        this.in = 0;
        this.thread = thread;
        this.mc = new Aula1();
    }

    public void run() {
        // compute primes larger than minPrime
        mc.run(it/thread);
    }

    public int getIn(){
        return mc.getIn();
    }

    public void start() {
        run();
    }
}
