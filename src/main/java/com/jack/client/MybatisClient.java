package com.jack.client;

import com.jack.constatnt.Constant;
import com.jack.dao.DefinitionMapper;
import com.jack.dao.WordMapper;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.File;

public class MybatisClient {

    public static SqlSessionFactory getSqlSessionFactory() {

        // read datasource info from properties file
        Configurations configurations = new Configurations();
        org.apache.commons.configuration2.Configuration dbConfiguration = null;


        // read program env
        String env = System.getenv("jack_env");

        String configureFile = null;

        // default configure file
        if (StringUtils.isEmpty(env)) configureFile = "database-dev.properties";

        if (Constant.env_dev.equals(env)) configureFile = "database-dev.properties";
        else configureFile = "database-prod.properties";

        try {
            dbConfiguration = configurations.properties(new File(configureFile));
        } catch (ConfigurationException e) {
            throw new RuntimeException();
        }

        String url = dbConfiguration.getString("database.url");
        String user = dbConfiguration.getString("database.user");
        String password = dbConfiguration.getString("database.password");


        // datasource
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        // transaction factory
        TransactionFactory transactionFactory = new JdbcTransactionFactory();

        // environment
        Environment environment = new Environment("development", transactionFactory, dataSource);

        // dbConfiguration
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(WordMapper.class);
        configuration.addMapper(DefinitionMapper.class);


//        dbConfiguration.addMappers("com.jack.xml");
//        dbConfiguration.resour
//        dbConfiguration.addMappedStatement();
//        dbConfiguration.add
        // sql session factory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        return sqlSessionFactory;
    }

}
