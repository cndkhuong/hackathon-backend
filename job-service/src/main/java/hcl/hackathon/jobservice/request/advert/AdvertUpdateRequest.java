package hcl.hackathon.jobservice.request.advert;

import hcl.hackathon.jobservice.enums.AdvertStatus;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AdvertUpdateRequest {
    @NotBlank(message = "Advert id is required")
    private String id;
    private String name;
    private String description;
    private int deliveryTime;
    private int price;
    private AdvertStatus status;
}
