package be.pix.legacyfacade.dao;

import be.pix.legacyfacade.domain.Robot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotRepository extends JpaRepository<Robot,String> {

}
