package hcl.hackathon.jobservice.repository;

import hcl.hackathon.jobservice.enums.Advertiser;
import hcl.hackathon.jobservice.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertRepository extends JpaRepository<Advert, String> {
    List<Advert> getAdvertsByUserIdAndAdvertiser(String id, Advertiser advertiser);
}
