package Assignment7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        FootballPlayer player = context.getBean("madridPlayer", MadridPlayer.class);
        
        player.player();
    }
}
