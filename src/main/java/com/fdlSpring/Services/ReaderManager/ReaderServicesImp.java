package com.fdlSpring.Services.ReaderManager;

import com.fdlSpring.Facades.ReaderDTO.ReaderRequest;
import com.fdlSpring.Model.ReaderModel;
import com.fdlSpring.Repository.ReaderDao;
import jakarta.annotation.Resource;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

import java.util.List;

public class ReaderServicesImp implements ReaderServicesInt {

    @Resource
    private ReaderDao readerDao;

    @Override
    public String createReader(ReaderModel map) {
        readerDao.save(map);
        return "null";
    }

    @Override
    public String updateReader(ReaderModel request, String id) {
        readerDao.save(readerDao.findById(id).get());
        return "null";
    }

    @Override
    public String deleteReaderById(String id) {
        readerDao.deleteById(id);
        return "null";
    }

    @Override
    public  ReaderModel getById(String id) {

        return   readerDao.findById(id).get();
    }

    @Override
    public List<ReaderModel> getAllReader() {
        return readerDao.findAll();
    }
}
