package com.springboot.rest.config;

/*import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;*/

/*@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@EnableJpaRepositories(basePackages = "com.baoviet.mhol.persistence.dao")
@ComponentScan("com.baoviet.mhol.service")*/
public class ApplicationJPAConfiguration
{
	/*
	 * @Bean(destroyMethod ="" ) public DataSource
	 * dataSource(@Value("${db.jndi}") String jndiName) { JndiDataSourceLookup
	 * lookup = new JndiDataSourceLookup(); lookup.setResourceRef(true); return
	 * lookup.getDataSource(jndiName); }
	 * 
	 * @Bean public LocalContainerEntityManagerFactoryBean
	 * entityManagerFactory(DataSource dataSource, JpaVendorAdapter
	 * jpaVendorAdapter) { LocalContainerEntityManagerFactoryBean lef = new
	 * LocalContainerEntityManagerFactoryBean(); lef.setDataSource(dataSource);
	 * lef.setJpaVendorAdapter(jpaVendorAdapter);
	 * lef.setPackagesToScan("com.baoviet.mhol.persistence.model");
	 * lef.setJpaDialect(new OpenJpaDialect()); return lef; }
	 * 
	 * @Bean public JpaVendorAdapter jpaVendorAdapter() { OpenJpaVendorAdapter
	 * OpenJpaVendorAdaptor = new OpenJpaVendorAdapter();
	 * OpenJpaVendorAdaptor.setShowSql(true);
	 * OpenJpaVendorAdaptor.setGenerateDdl(true);
	 * OpenJpaVendorAdaptor.setDatabasePlatform(
	 * "org.OpenJpa.dialect.Oracle10gDialect"); return OpenJpaVendorAdaptor; }
	 * 
	 * @Bean public PlatformTransactionManager
	 * transactionManager(EntityManagerFactory emf){ JpaTransactionManager
	 * transactionManager = new JpaTransactionManager();
	 * transactionManager.setEntityManagerFactory(emf); return
	 * transactionManager; }
	 * 
	 * }
	 */
}