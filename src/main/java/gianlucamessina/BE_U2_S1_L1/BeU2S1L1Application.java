package gianlucamessina.BE_U2_S1_L1;

import gianlucamessina.BE_U2_S1_L1.entities.Menu;
import gianlucamessina.BE_U2_S1_L1.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeU2S1L1Application {

	public static void main(String[] args) {
		SpringApplication.run(BeU2S1L1Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU2S1L1Application.class);

		Menu menu=context.getBean(Menu.class);
		
		menu.printMenu();
		context.close();
	}

}
