package com.xworkz.databaseforms.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DBConfiguration {


    public DBConfiguration()
    {
        System.out.println("Constructor created for DBConfiguration..");
    }



    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.userName}")
    private String userName;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driver}")
    private String driver;

    @Bean
    public DataSource dataSource() {
        System.out.println("Registered DataSource");
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername(userName);
        driverManagerDataSource.setPassword(password);
        driverManagerDataSource.setDriverClassName(driver);

        return driverManagerDataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource) {
        System.out.println("Created LocalContainerEntityManagerFactoryBean");

        //
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource);
        JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        bean.setJpaVendorAdapter(jpaVendorAdapter);
        bean.setPackagesToScan("com.xworkz.databaseforms");

        //for showing queries in console
        Properties properties=new Properties();
        properties.put("hibernate.show_sql","true");
        bean.setJpaProperties(properties);

        return bean;
    }
}





