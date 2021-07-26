package az.elixir.social.Domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SERVICE_SUB_GROUP")

public class ServiceSubGroupModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String serviceSubGroupName;

    private String lang;


    @ManyToOne(fetch = FetchType.LAZY)
    private ServiceGroupModel serviceGroupModel;


    @OneToMany(
            mappedBy = "serviceSubGroupModel",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ServicesModel> servicesModels = new ArrayList<>();

    public ServiceSubGroupModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceSubGroupName() {
        return serviceSubGroupName;
    }

    public void setServiceSubGroupName(String serviceSubGroupName) {
        this.serviceSubGroupName = serviceSubGroupName;
    }

    public ServiceGroupModel getServiceGroupModel() {
        return serviceGroupModel;
    }

    public void setServiceGroupModel(ServiceGroupModel serviceGroupModel) {
        this.serviceGroupModel = serviceGroupModel;
    }

    public List<ServicesModel> getServicesModels() {
        return servicesModels;
    }

    public void setServicesModels(List<ServicesModel> servicesModels) {
        this.servicesModels = servicesModels;
    }


    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
