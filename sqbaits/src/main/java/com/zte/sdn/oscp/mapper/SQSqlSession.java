package com.zte.sdn.oscp.mapper;

/**
 * @Author: Livio
 * @Date: 2021/3/21 22:05
 */
public class SQSqlSession {

    private SQConfiguration configuration;

    private SQExecutor executor;

    public SQSqlSession(SQConfiguration configuration, SQExecutor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object parameter) {
        //在session中的固定查询方法，会根据语句标识获取到真正对应的SQL语句
        //1.通过statementId定位具体的SQL语句
        String sql = SQConfiguration.sqlMappings.getString(statementId);
        return executor.query(sql, parameter);
    }

    public <T> T getMapper(Class<T> cls) {
        return configuration.getMapper(cls,this);
    }

}
