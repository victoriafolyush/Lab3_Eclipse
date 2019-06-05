package ua.lviv.iot.Db_Lab8.managers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.Db_Lab8.models.Fuel;
import ua.lviv.iot.Db_Lab8.models.WheelFormula;

@SpringBootApplication
public class DbLab8Application {

    public static void main(String[] args) {
        SpringApplication.run(DbLab8Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(SkiResortMachineryRepository repository) {
        return (args) -> {
            repository.save(new SkiResortMachinery("Snow Generator R5", "SMI", 15.6, 41.6, Fuel.DIESEL, WheelFormula.FOUR_FOUR ));
            repository.save(new SkiResortMachinery("Swivel Mast Yg56", "SMI", 25.6, 42.6, Fuel.KEROSENE, WheelFormula.FOUR_TWO ));
            repository.save(new SkiResortMachinery("Snow Tower E6", "SMI", 35.6, 43.6, Fuel.GAZOLINE, WheelFormula.TWO_TWO ));
        };
        

    }

}
