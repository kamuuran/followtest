package az.elixir.social.Services;

import az.elixir.social.DTO.ServiceSubGroupDTO;
import az.elixir.social.Domain.ServiceGroupModel;
import az.elixir.social.Domain.ServiceSubGroupModel;

import java.util.List;

public interface ServiceSubGroupService {

    List<ServiceSubGroupDTO> getListOfSubGroup(ServiceGroupModel serviceGroupModel, String lang) throws Exception;

    ServiceSubGroupModel getServiceSubgGroup(int id) throws Exception;
}
