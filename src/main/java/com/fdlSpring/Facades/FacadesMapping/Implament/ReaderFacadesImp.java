package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.FacadesMapping.Interface.ReaderFacadesInt;
import com.fdlSpring.Facades.ReaderDTO;
import com.fdlSpring.Model.ReaderModel;
import com.fdlSpring.Services.ReaderManager.ReaderServicesImp;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ReaderFacadesImp  implements ReaderFacadesInt {

    @Resource
    private ModelMapper mapper;

    @Resource
    private ReaderServicesImp readerServicesImp;
    @Override
    public String createReader(ReaderDTO request) {
        return readerServicesImp.createReader(mapper.map(request, ReaderModel.class));
    }

    @Override
    public String updateReader(ReaderDTO request, String id) {
        ReaderModel readerModel=mapper.map(request,ReaderModel.class);
        return readerServicesImp.updateReader(readerModel,id);
    }

    @Override
    public String deleteReaderById(String id) {
        return readerServicesImp.deleteReaderById(id);
    }

    @Override
    public ReaderDTO getById(String id) {
        return mapper.map(readerServicesImp.getById(id), ReaderDTO.class);
    }

    @Override
    public List<ReaderDTO> getAllReader() {
        List<ReaderDTO> responses=new ArrayList<>();
        List<ReaderModel> models=readerServicesImp.getAllReader();
        for (ReaderModel model : models) {
            responses.add(mapper.map(model, ReaderDTO.class));
        }
        return responses;
    }
}
