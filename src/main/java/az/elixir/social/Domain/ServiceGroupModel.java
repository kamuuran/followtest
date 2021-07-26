package az.elixir.social.Domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SERVICE_GROUP")
public class ServiceGroupModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String serviceGroupName;


    @OneToMany(
            mappedBy = "serviceGroupModel",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ServiceSubGroupModel> serviceSubGroupModels = new ArrayList<>();


    public ServiceGroupModel() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceGroupName() {
        return serviceGroupName;
    }

    public void setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
    }

    public List<ServiceSubGroupModel> getServiceSubGroupModels() {
        return serviceSubGroupModels;
    }

    public void setServiceSubGroupModels(List<ServiceSubGroupModel> serviceSubGroupModels) {
        this.serviceSubGroupModels = serviceSubGroupModels;
    }
}
