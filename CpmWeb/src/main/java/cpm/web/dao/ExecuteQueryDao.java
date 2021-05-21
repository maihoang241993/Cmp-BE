package cpm.web.dao;

import java.util.Map;

public interface ExecuteQueryDao {
    <T> T executeQueryFunction(String sql, Map parram, T clazz);

    <T> T executeQuery(Map parram, T clazz);

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
