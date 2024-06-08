package pe.edu.cibertec.DAWII_T1_ORTIZLUIS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.DAWII_T1_ORTIZLUIS.model.bd.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNomrol(String nomrol);
}
