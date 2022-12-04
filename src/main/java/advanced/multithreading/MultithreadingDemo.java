package advanced.multithreading;

public class MultithreadingDemo {
    public static void main(String[] args) {
        Runnable task = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("pozdrawiam z osobnego wątku!");
                }
            }
        };

        Thread worker = new Thread(task);
        worker.start();
        for (int i = 0; i < 10_000; i++) {
            System.out.println("MAIN");
        }

    }
}
