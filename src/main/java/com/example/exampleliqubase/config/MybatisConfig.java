package com.example.exampleliqubase.config;

import javax.sql.DataSource;

import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement(mode = AdviceMode.PROXY)
@MapperScan(basePackages = {
        "com.example.exampleliqubase.dao"
})
public class MybatisConfig {

    @Autowired
    private DataSource dataSource;

    private static final String mapperFiles[] = {"SubscriberMapper.xml","PaymentMapper.xml","TariffMapper.xml"};

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * Sql session factory sql session factory.
     *
     * @return the sql session factory
     * @throws Exception the exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setVfs(SpringBootVFS.class);
        sessionFactory.setTypeAliasesPackage(
                "com.example.exampleliqubase.model"
        );

        SqlSessionFactory sqlSessionFactory = sessionFactory.getObject();
        if (sqlSessionFactory != null) {
            org.apache.ibatis.session.Configuration configuration = sqlSessionFactory.getConfiguration();
            configuration.setMapUnderscoreToCamelCase(true);
            // lazy loading
            configuration.getLazyLoadTriggerMethods().clear();
            configuration.setLazyLoadingEnabled(true);
        }




        for(String mapperFile: mapperFiles){
            System.out.println(mapperFile);
            File initialFile = new File("src/main/resources/mappers/"+mapperFile);
            InputStream in = new FileInputStream(initialFile);
            System.out.println(in);
            XMLMapperBuilder xmlMapperBuilder = new XMLMapperBuilder(
                    in,sqlSessionFactory.getConfiguration(),
                    mapperFile,sqlSessionFactory.getConfiguration().getSqlFragments());
            xmlMapperBuilder.parse();

        }


        return sessionFactory.getObject();
    }
}
