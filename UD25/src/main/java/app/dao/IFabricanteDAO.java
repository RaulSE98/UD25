package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import app.dto.Fabricante;

/**
 * @author Raul
 *
 */

public interface  IFabricanteDAO extends JpaRepository<Fabricante, Long>{

}
