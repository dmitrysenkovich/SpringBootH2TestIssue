package org.springframework.boot.h2.issue;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

public class SecondTestIT extends Base {
    @Test
    public void firstTest() throws SQLException {
        DataSource dataSource = jdbcTemplate.getDataSource();
        Connection connection = dataSource.getConnection();
        DatabaseMetaData dmd = connection.getMetaData();
        String url = dmd.getURL();
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
        System.out.println(url);
    }
}
