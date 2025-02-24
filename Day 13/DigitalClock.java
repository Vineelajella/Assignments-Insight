package Threads;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends Thread{
	boolean flag=true;
	@Override
	public void run() {
		while(flag) {
			SimpleDateFormat timeformat =new SimpleDateFormat("HH:mm:ss");
			Date date=new Date();
			String timestring=timeformat.format(date);
			System.out.println("digital Clock "+timestring);
			try {
				Thread.sleep(500);
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("digital clock has stopped");
	}
	public void stop1() {
		flag=false;
		
	}
	public static void main(String[] args) throws InterruptedException {
		DigitalClock d=new DigitalClock();
		d.start();
		Thread.sleep(1000);
		d.stop1();
		

	}

}
