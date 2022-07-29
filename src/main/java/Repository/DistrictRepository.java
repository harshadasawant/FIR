package Repository;

import com.police.fir.Entity.CitizenFirSearchBean;
import com.police.fir.Entity.District;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends CrudRepository<CitizenFirSearchBean, Long> {

  public static void main(String[] args) {
      District district = new District();
      district.setDistrictId(01);
      district.setDistrictName("mumbai");

  }



}
