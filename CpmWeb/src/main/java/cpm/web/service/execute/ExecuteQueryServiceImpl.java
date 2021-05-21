package cpm.web.service.execute;

import cpm.web.dao.ExecuteQueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExecuteQueryServiceImpl implements ExecuteQueryService {
    @Autowired
    ExecuteQueryDao executeQueryDao;

    @Override
    public <T> T executeQueryFunction(String sql, Map hmParram, T clazz) {
        return executeQueryDao.executeQueryFunction(sql, hmParram, clazz);
    }

    @Override
    public <T> T executeQuery(Map hmParram, T clazz) {
        return executeQueryDao.executeQuery(hmParram, clazz);
    }

//    @Override
//    public void insertData(Class<?> data) {
//
//    }
//
//    @Override
//    public void updateData(Class<?> data) {
//
//    }
//
//    @Override
//    public void bulkUpdateData(Class<?> data) {
//
//    }
//
//    @Override
//    public void delete(Class<?> data) {
//
//    }
//
//    @Override
//    public void bulkDelete(Class<?> data) {
//
//    }
}
