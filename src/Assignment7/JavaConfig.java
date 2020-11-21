package Assignment7;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:playerInfo.properties")
public class JavaConfig {
    
    @Bean
    public FootballPlayer manUPlayer(){
        return new ManUPlayer(shangalo());
    }
    
    @Bean
    public FootballPlayer barcaPlayer(){
        return new BarcaPlayer(nutMeg());
    }
    
    @Bean
    public FootballPlayer madridPlayer(){
        return new MadridPlayer(nutMeg());
    }
    
    @Bean
    public DribbleStyle nutMeg(){
        return new NutMeg();
    }
    
    @Bean
    public DribbleStyle shangalo(){
        return new Shangalo();
    }
}
