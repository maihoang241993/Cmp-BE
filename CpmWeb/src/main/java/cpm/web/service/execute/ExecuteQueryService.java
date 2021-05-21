package cpm.web.service.execute;

import java.util.Map;

public interface ExecuteQueryService {
    <T> T executeQueryFunction(String sql, Map hmParram, T clazz);

    <T> T executeQuery(Map hmParram, T clazz);

//    void insertData(Class<?> data);
//
//    void updateData(Class<?> data);
//
//    void bulkUpdateData(Class<?> data);
//
//    void delete(Class<?> data);
//
//    void bulkDelete(Class<?> data);
}
