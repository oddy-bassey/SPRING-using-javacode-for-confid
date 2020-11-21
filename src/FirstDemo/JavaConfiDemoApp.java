package FirstDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfiDemoApp {
    public static void main(String[] args){
        
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        
        //retrieving the bean from spring container
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        
        System.out.println(theCoach.getDailyFortune());
        
        System.out.println("Email: "+theCoach.getEmail());
        
        System.out.println("Team: "+theCoach.getTeam());
        
        context.close();
    }
}
