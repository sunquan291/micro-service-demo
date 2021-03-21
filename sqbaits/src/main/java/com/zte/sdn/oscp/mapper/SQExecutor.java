package com.zte.sdn.oscp.mapper;

import com.zte.sdn.oscp.domain.Blog;

/**
 * @Author: Livio
 * @Date: 2021/3/21 22:14
 */
public class SQExecutor {
    public <T> T query(String sql, Object parameter) {
        String fullSql = String.format(sql, parameter);
        System.out.println(fullSql);
        Blog blog = new Blog();
        blog.setName("sunquan");
        blog.setNo((String) parameter);
        return (T) blog;
    }
}
