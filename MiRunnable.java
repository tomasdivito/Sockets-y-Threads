
public class MiRunnable implements Runnable {
	
	public void run() {
		for(int i = 0; i < 10; i++)
			System.out.println(i + " - " + Thread.currentThread().getName());
		System.out.println("Hilo finalizado");

	}

	public static void main(String[] args) {
		new Thread(new MiRunnable(), "Julio").start();
		new Thread(new MiRunnable(), "Lucas").start();
	}

}
