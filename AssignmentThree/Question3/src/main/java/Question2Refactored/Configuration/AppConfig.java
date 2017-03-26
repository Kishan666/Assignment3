package Question2Refactored.Configuration;

/**
 * Created by Kishan on 2017-03-26.
 */
import Question2Refactored.Build.*;
        import Question2Refactored.Interface.ITransportModes;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean(name="airplane")
    public ITransportModes getAirplane(){return new Airplane();}

    @Bean(name="car")
    public ITransportModes getCar(){return new Car();}

    @Bean(name="motorbike")
    public ITransportModes getMotorBike(){return new MotorBike();}

    @Bean(name="ship")
    public ITransportModes getShip(){return new Ship();}




}
