public class timercheck {
	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i < 14; i++) {
				System.out.println("A " + i);
			}
		}
	});
	Thread t2 = new Thread(new Runnable() {
		@Override
		public void run() {
			synchronized (this) {
				for (int i = 0; i < 14; i++) {
					System.out.println("B " + i);
				}
			}
			notify();
		}
	});

	public void run() {

		t1.start();

		t2.start();

	}
}