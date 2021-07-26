package az.elixir.social.Services;

import az.elixir.social.DTO.ServiceDTO;
import az.elixir.social.Domain.ServiceSubGroupModel;
import az.elixir.social.Domain.ServicesModel;

import java.util.List;

public interface ServicesService {

    List<ServiceDTO> listOfService(ServiceSubGroupModel serviceSubGroupModel,String lang) throws Exception;

    ServicesModel getById(int id) throws Exception;


}
