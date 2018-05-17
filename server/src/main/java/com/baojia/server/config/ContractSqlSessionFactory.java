package com.baojia.server.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.baojia.server.mapper.contract"}, sqlSessionFactoryRef = "sqlSessionFactory3")
public class ContractSqlSessionFactory {
    @Autowired
    @Qualifier("contractDataSource")
    private DataSource contractDataSource;


    @Bean
    public SqlSessionFactory sqlSessionFactory3() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(contractDataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/contract/*.xml"));
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate3() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory3()); // 使用上面配置的Factory
        return template;
    }

}
