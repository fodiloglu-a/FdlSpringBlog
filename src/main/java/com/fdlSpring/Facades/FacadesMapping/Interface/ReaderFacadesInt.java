package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.BlogDto.BlogRequest;
import com.fdlSpring.Facades.BlogDto.BlogResponse;
import com.fdlSpring.Facades.ReaderDTO.ReaderRequest;
import com.fdlSpring.Facades.ReaderDTO.ReaderResponse;

import java.util.List;

public interface ReaderFacadesInt {

    String createReader(ReaderRequest request);

    String updateReader(ReaderRequest request, String id);

    String deleteReaderById(String id);

    ReaderResponse getById(String id);

    List<ReaderResponse> getAllReader();
}
