package az.elixir.social.DTO;

public class OrderDetailsDTO {

    private String status;
    private String description;

    private double price;

    public OrderDetailsDTO() {
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
