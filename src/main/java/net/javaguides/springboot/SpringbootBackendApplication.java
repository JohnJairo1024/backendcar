package net.javaguides.springboot;

import net.javaguides.springboot.model.Mantenimiento;
import net.javaguides.springboot.model.Mecanicos;
import net.javaguides.springboot.repository.MantenimientoRepository;
import net.javaguides.springboot.repository.MecanicoRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootBackendApplication {

    @Autowired
    private MantenimientoRepository mantenimientoRepository;
    @Autowired
    private MecanicoRepository mecanicoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        return () -> {

            // Pedidos
            mantenimientoRepository.save(new Mantenimiento(1, 2, "20-20-10"));
            //mantenimientoRepository.save(new Mantenimiento(1, 2, new Vehiculo(), "", new Mecanicos(), new Mecanicos()));

            //Mecanicos
            mecanicoRepository.save(new Mecanicos(1024L, "CC", "John", "Jairo", "Ochoa", "Mesa", "314386", "Cra74", "john@gmail.com", true));


        };
    }


}


