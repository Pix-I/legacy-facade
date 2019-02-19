package be.pix.legacyfacade.service;

import be.pix.legacyfacade.dao.RobotRepository;
import be.pix.legacyfacade.domain.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RobotServiceImpl implements RobotService {

    private final RobotRepository repository;

    @Autowired
    public RobotServiceImpl(RobotRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<String> listRobotModels() {
        List<Robot> all = repository.findAll();
        return all.stream().map(Robot::getModel).collect(Collectors.toList());
    }
}
