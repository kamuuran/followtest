package az.elixir.social.Repositories;

import az.elixir.social.Domain.ServiceSubGroupModel;
import az.elixir.social.Domain.ServicesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends CrudRepository<ServicesModel,Integer> {

    List<ServicesModel> findAllByServiceSubGroupModelAndLang(ServiceSubGroupModel serviceSubGroupModel,String Lang);

    ServicesModel findByServiceCode(int serviceCode);

}
