package com.zte.sdn.oscp.mapper;

import com.zte.sdn.oscp.domain.Blog;
import com.zte.sdn.oscp.mapper.BlogMapper;
import com.zte.sdn.oscp.mapper.SQConfiguration;
import com.zte.sdn.oscp.mapper.SQExecutor;
import com.zte.sdn.oscp.mapper.SQSqlSession;
import org.junit.Test;

/**
 * @Author: Livio
 * @Date: 2021/3/21 22:13
 */
public class MyBaitsTest {
    @Test
    public void testGetById() {
        SQConfiguration configuration = new SQConfiguration();
        SQExecutor executor = new SQExecutor();
        //在MyBait中SqlSession是入口，可以通过SqlSessionFactory获取
        SQSqlSession session = new SQSqlSession(configuration, executor);
        BlogMapper blogMapper = session.getMapper(BlogMapper.class);
        Blog blog = blogMapper.getById("no.1");
        System.out.println(blog);
    }
}
