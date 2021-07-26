package az.elixir.social.Services;


import az.elixir.social.DTO.ServiceSubGroupDTO;
import az.elixir.social.Domain.ServiceGroupModel;
import az.elixir.social.Domain.ServiceSubGroupModel;
import az.elixir.social.Repositories.ServiceSubGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceSubGroupServiceIMPL implements ServiceSubGroupService {
    @Autowired
    private ServiceSubGroupRepository serviceSubGroupRepository;





    @Override
    public List<ServiceSubGroupDTO> getListOfSubGroup(ServiceGroupModel serviceGroupModel,String lang) throws Exception {
        List<ServiceSubGroupDTO> serviceSubGroupDTOS =new ArrayList<>();
        try {
            List<ServiceSubGroupModel> serviceSubGroupModels =  serviceSubGroupRepository.findAllByServiceGroupModelAndLang(serviceGroupModel,lang);
            for(int i=0;i<serviceSubGroupModels.size();i++){
                ServiceSubGroupDTO serviceSubGroupDTO = new ServiceSubGroupDTO();
                serviceSubGroupDTO.setId(serviceSubGroupModels.get(i).getId());
                serviceSubGroupDTO.setServiceSubGroupName(serviceSubGroupModels.get(i).getServiceSubGroupName());
                serviceSubGroupDTOS.add(serviceSubGroupDTO);

            }



        } catch (Exception e){
        throw new Exception(e.getMessage());
    }
        return serviceSubGroupDTOS;
    }

    @Override
    public ServiceSubGroupModel getServiceSubgGroup(int id) throws Exception {
        ServiceSubGroupModel serviceSubGroupModel;
        try {
            serviceSubGroupModel= serviceSubGroupRepository.findById(id).get();

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return serviceSubGroupModel;
    }
}
