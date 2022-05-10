package app.review.dstp.svc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"app.review.dstp.svc.chicken_svc"})


public class chicken_svc {
	
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.println("i = "+i);
		}
	}

	public Object getChickenList(String area) {
		
		return null;
	}
}

