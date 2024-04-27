package hcl.hackathon.jobservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import hcl.hackathon.jobservice.enums.OfferStatus;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferDto {
    private String id;
    private String userId;
    private String advertId;
    private int offeredPrice;
    private OfferStatus status;
}
