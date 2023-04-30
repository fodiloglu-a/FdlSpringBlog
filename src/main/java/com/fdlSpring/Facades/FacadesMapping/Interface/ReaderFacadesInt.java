package com.fdlSpring.Facades.FacadesMapping.Interface;

import com.fdlSpring.Facades.ReaderDTO;

import java.util.List;

public interface ReaderFacadesInt {

    String createReader(ReaderDTO request);

    String updateReader(ReaderDTO request, String id);

    String deleteReaderById(String id);

    ReaderDTO getById(String id);

    List<ReaderDTO> getAllReader();
}
