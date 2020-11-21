package Assignment7;

import org.springframework.beans.factory.annotation.Value;

public class BarcaPlayer implements FootballPlayer{
    
    @Value("${jesse.number}")
    private String jesse;
    
    @Value("${role}")
    private String role;
    
    private DribbleStyle dribbleStyle;
    
    public BarcaPlayer(DribbleStyle dribbleStyle){
        this.dribbleStyle = dribbleStyle;
    }
    
    public String getJesse() {
        return jesse;
    }

    public String getRole() {
        return role;
    }

    public DribbleStyle getDribbleStyle() {
        return dribbleStyle;
    }
    
    @Override
    public void player() {
        System.out.println("Messi");
        System.out.println("Player jesse: "+getJesse());
        System.out.println("Player role: "+getRole());
        getDribbleStyle().dribbleStyle();
    }
}
