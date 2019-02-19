package be.pix.legacyfacade.service;

import be.pix.legacyfacade.dao.RobotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotServiceImpl implements RobotService {

    private final RobotRepository repository;

    @Autowired
    public RobotServiceImpl(RobotRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<String> listRobotModels() {


        return null;
    }
}
