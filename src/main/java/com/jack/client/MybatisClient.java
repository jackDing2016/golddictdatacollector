package com.jack.client;

import com.jack.dao.DefinitionMapper;
import com.jack.dao.WordMapper;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;

public class MybatisClient {

    public static SqlSessionFactory getSqlSessionFactory() {
        // datasource
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/goldendict");
        dataSource.setUser("root");
        dataSource.setPassword("880201");

        // transaction factory
        TransactionFactory transactionFactory = new JdbcTransactionFactory();

        // environment
        Environment environment = new Environment("development", transactionFactory, dataSource);

        // configuration
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(WordMapper.class);
        configuration.addMapper(DefinitionMapper.class);


//        configuration.addMappers("com.jack.xml");
//        configuration.resour
//        configuration.addMappedStatement();
//        configuration.add
        // sql session factory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        return sqlSessionFactory;
    }

}
