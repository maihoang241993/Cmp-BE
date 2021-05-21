package cpm.web.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ExecuteQueryDaoImpl implements ExecuteQueryDao {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private static NamedParameterJdbcTemplate JdbcTemplate;

    public ExecuteQueryDaoImpl(NamedParameterJdbcTemplate template) {
        this.JdbcTemplate = template;
    }

    @Override
    public <T> T executeQueryFunction(String sql, Map requestParram, T clazz) {
        return (T) this.queryFunctionData(sql,requestParram,clazz);
    }

    @Override
    public <T> T executeQuery(Map parram, T clazz) {
        return (T) this.queryData(parram,clazz);
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

    private <T> T queryFunctionData(String sql, Map<String, String> requestData, T clazz) {

        StringBuffer strParramFun = new StringBuffer();
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        int index = 0;
        for (HashMap.Entry<String, String> entry : requestData.entrySet()) {
            strParramFun = index > 0 ? strParramFun.append(",") : strParramFun;
            strParramFun.append(String.format(":%s",entry.getKey()));
            sqlParameterSource.addValue(entry.getKey(),entry.getValue());
            index++;
        }
        final String sqlLast = String.format("SELECT * FROM %s(%s)", sql, strParramFun.toString());
        try {
            LOGGER.info("Start queryFunctionData: " + sqlLast);
            SqlParameterSource parameters = sqlParameterSource;

            List<?> result = JdbcTemplate.query(sqlLast, parameters,new BeanPropertyRowMapper<>(clazz.getClass()));
            LOGGER.info("End queryFunctionData: " + sql);
            return (T) result;
        } catch (DataAccessException e) {
            LOGGER.error("Error : " + e.toString());
            throw new RuntimeException(e);
        }
    }

    private <T> T queryData(Map<String, String> requestData, T clazz) {
        try {

            for (Field field : clazz.getClass().getDeclaredFields()) {

            }

//            String sqlLast;
//            SqlParameterSource sqlParameterSource;
//            LOGGER.info("Start queryData: " + sqlLast);
//            SqlParameterSource parameters = sqlParameterSource;
//
            List<?> result = null; //JdbcTemplate.query("", new SqlParameterSource,new BeanPropertyRowMapper<>(clazz.getClass()));
//            LOGGER.info("End queryData: " + sql);
            return (T) result;
        } catch (DataAccessException e) {
            LOGGER.error("Error : " + e.toString());
            throw new RuntimeException(e);
        }
    }
}
