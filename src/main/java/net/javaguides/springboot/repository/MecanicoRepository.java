package net.javaguides.springboot.repository;


import net.javaguides.springboot.model.Mecanicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanicos, Long> {
}
