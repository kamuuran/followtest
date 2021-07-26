package az.elixir.social.Services;

import az.elixir.social.DTO.ServiceDTO;
import az.elixir.social.Domain.ServiceSubGroupModel;
import az.elixir.social.Domain.ServicesModel;
import az.elixir.social.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesServiceIMPL implements ServicesService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<ServiceDTO> listOfService(ServiceSubGroupModel serviceSubGroupModel,String lang) throws Exception {
        List<ServiceDTO> serviceDTOS = new ArrayList<>();
        try {
            List<ServicesModel> servicesModels = serviceRepository.findAllByServiceSubGroupModelAndLang(serviceSubGroupModel,lang);

            for(int i=0;i<servicesModels.size();i++){
                ServiceDTO serviceDTO = new ServiceDTO();
                serviceDTO.setName(servicesModels.get(i).getServiceName());
                serviceDTO.setServiceCode(servicesModels.get(i).getServiceCode());
                serviceDTO.setServiceDescription(servicesModels.get(i).getDescription());
                serviceDTOS.add(serviceDTO);
            }



        }catch (Exception e){
 throw new Exception(e.getMessage());
        }
        return serviceDTOS;
    }

    @Override
    public ServicesModel getById(int id) throws Exception {
ServicesModel servicesModel;
        try {
            servicesModel=serviceRepository.findByServiceCode(id);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return servicesModel;
    }
}
