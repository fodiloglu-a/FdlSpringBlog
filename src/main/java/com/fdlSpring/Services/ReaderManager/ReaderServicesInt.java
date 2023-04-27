package com.fdlSpring.Services.ReaderManager;

import com.fdlSpring.Facades.ReaderDTO.ReaderRequest;
import com.fdlSpring.Model.ReaderModel;

import java.util.List;

public interface ReaderServicesInt {
    String createReader(ReaderModel map);

    String updateReader(ReaderModel request, String id);

    String deleteReaderById(String id);

    ReaderModel getById(String id);

    List<ReaderModel> getAllReader();
}
