package com.fdlSpring.Facades.FacadesMapping.Implament;

import com.fdlSpring.Facades.BloggerDTO.BloggerResponse;
import com.fdlSpring.Facades.FacadesMapping.Interface.ReaderFacadesInt;
import com.fdlSpring.Facades.ReaderDTO.ReaderRequest;
import com.fdlSpring.Facades.ReaderDTO.ReaderResponse;
import com.fdlSpring.Model.AdminModel;
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
    public String createReader(ReaderRequest request) {
        return readerServicesImp.createReader(mapper.map(request, ReaderModel.class));
    }

    @Override
    public String updateReader(ReaderRequest request, String id) {
        ReaderModel readerModel=mapper.map(request,ReaderModel.class);
        return readerServicesImp.updateReader(readerModel,id);
    }

    @Override
    public String deleteReaderById(String id) {
        return readerServicesImp.deleteReaderById(id);
    }

    @Override
    public ReaderResponse getById(String id) {
        return mapper.map(readerServicesImp.getById(id),ReaderResponse.class);
    }

    @Override
    public List<ReaderResponse> getAllReader() {
        List<ReaderResponse> responses=new ArrayList<>();
        List<ReaderModel> models=readerServicesImp.getAllReader();
        for (ReaderModel model : models) {
            responses.add(mapper.map(model,ReaderResponse.class));
        }
        return responses;
    }
}
