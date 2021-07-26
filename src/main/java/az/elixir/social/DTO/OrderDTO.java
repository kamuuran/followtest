package az.elixir.social.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.Nullable;

public class OrderDTO {

    @Nullable
    private int serviceId;
    @Nullable
    private String link;
    @Nullable
    private int quantity;
    @Nullable
    private String comments;
    @Nullable
    private String username;
    @Nullable
    private int posts;
    @Nullable
    private int min;
    @Nullable
    private int max;

    public OrderDTO() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;


    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "serviceId=" + serviceId +
                ", link='" + link + '\'' +
                ", quantity=" + quantity +
                ", comments='" + comments + '\'' +
                ", username='" + username + '\'' +
                ", posts=" + posts +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
