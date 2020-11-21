package FirstDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("FirstDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    
    //define bean for tenniscoach
    @Bean
    public Coach tennisCoach(){
       TennisCoach tennisCoach = new TennisCoach(fortuneService());
        return tennisCoach;
    }
    
    //defining bean for fortuneservice
    @Bean
    public FortuneService fortuneService(){
        return new HappyFortuneService();
    }
}
