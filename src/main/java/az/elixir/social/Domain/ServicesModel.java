package az.elixir.social.Domain;

import javax.persistence.*;

@Entity
@Table(name = "SERVICE")

public class ServicesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private int serviceCode;

    private String description;

    private String serviceName;


    private double rate;

    private String lang;

    @ManyToOne(fetch = FetchType.LAZY)
    private ServiceSubGroupModel serviceSubGroupModel;

    public ServicesModel() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public ServiceSubGroupModel getServiceSubGroupModel() {
        return serviceSubGroupModel;
    }

    public void setServiceSubGroupModel(ServiceSubGroupModel serviceSubGroupModel) {
        this.serviceSubGroupModel = serviceSubGroupModel;
    }
}
