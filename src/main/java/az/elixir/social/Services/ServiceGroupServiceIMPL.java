package az.elixir.social.Services;

import az.elixir.social.DTO.ServiceGroupDTO;
import az.elixir.social.Domain.ServiceGroupModel;
import az.elixir.social.Repositories.ServiceGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceGroupServiceIMPL implements ServiceGroupService{
    @Autowired
    private ServiceGroupRepository serviceGroupRepository;


    @Override
    public List<ServiceGroupDTO> getListofServiceGroup() throws Exception {
    List<ServiceGroupDTO> serviceGroupDTOS=new ArrayList<>();
        try{
    List<ServiceGroupModel> serviceGroupModels = serviceGroupRepository.findAll();
    for(int i=0;i<serviceGroupModels.size();i++){
        ServiceGroupDTO serviceGroupDTO = new ServiceGroupDTO();
        serviceGroupDTO.setId(serviceGroupModels.get(i).getId());
        serviceGroupDTO.setServiceGroupName(serviceGroupModels.get(i).getServiceGroupName());
    serviceGroupDTOS.add(serviceGroupDTO);

    }




        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return serviceGroupDTOS;
    }

    @Override
    public ServiceGroupModel getServiceGroup(int id) throws Exception {

        ServiceGroupModel serviceGroupModel;

        try{
        serviceGroupModel=serviceGroupRepository.findById(id).get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return serviceGroupModel;
    }
}
