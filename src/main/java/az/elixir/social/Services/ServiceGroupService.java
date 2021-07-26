package az.elixir.social.Services;

import az.elixir.social.DTO.ServiceGroupDTO;
import az.elixir.social.Domain.ServiceGroupModel;

import java.util.List;

public interface ServiceGroupService {

    List<ServiceGroupDTO> getListofServiceGroup() throws Exception;


    ServiceGroupModel getServiceGroup(int id) throws Exception;
}
