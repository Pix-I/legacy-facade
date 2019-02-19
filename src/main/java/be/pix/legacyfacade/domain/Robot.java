package be.pix.legacyfacade.domain;


import javax.persistence.*;


@Entity
@Table(name = "ROBOT")
public class Robot {

    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue
    private String id;
    @Column(name = "model")
    private String model;

    public Robot(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
