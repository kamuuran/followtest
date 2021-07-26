package az.elixir.social.Repositories;


import az.elixir.social.Domain.ServiceGroupModel;
import az.elixir.social.Domain.ServiceSubGroupModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceSubGroupRepository extends CrudRepository<ServiceSubGroupModel,Integer> {

    List<ServiceSubGroupModel> findAllByServiceGroupModelAndLang(ServiceGroupModel serviceGroupModel,String lang);




}
