package org.springframework.samples.petclinic.service;

import org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator__TestContext003_BeanDefinitions;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcClientAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcTemplateConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.DataSourceInitializationConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties__TestContext003_BeanDefinitions;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.context.properties.BoundConfigurationProperties__TestContext003_BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__TestContext003_BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__TestContext003_BeanDefinitions;
import org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer__TestContext003_BeanDefinitions;
import org.springframework.boot.test.autoconfigure.jdbc.TestDatabaseAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManagerAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.test.context.ImportsContextCustomizer__TestContext003_BeanDefinitions;
import org.springframework.boot.test.mock.mockito.MockitoPostProcessor__TestContext003_BeanDefinitions;
import org.springframework.boot.testcontainers.service.connection.ServiceConnectionAutoConfiguration__TestContext003_BeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__TestContext003_BeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__TestContext003_BeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__TestContext003_BeanDefinitions;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext__TestContext003_BeanDefinitions;
import org.springframework.data.jpa.repository.support.DefaultJpaContext__TestContext003_BeanDefinitions;
import org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistrarPostProcessor__TestContext003_BeanDefinitions;
import org.springframework.data.jpa.repository.support.JpaEvaluationContextExtension__TestContext003_BeanDefinitions;
import org.springframework.data.jpa.util.JpaMetamodelCacheCleanup__TestContext003_BeanDefinitions;
import org.springframework.data.repository.core.support.PropertiesBasedNamedQueries__TestContext003_BeanDefinitions;
import org.springframework.data.repository.core.support.RepositoryComposition__TestContext003_BeanDefinitions;
import org.springframework.orm.jpa.SharedEntityManagerCreator__TestContext003_BeanDefinitions;
import org.springframework.samples.petclinic.PetClinicApplication__TestContext003_BeanDefinitions;
import org.springframework.samples.petclinic.owner.OwnerRepository__TestContext003_BeanDefinitions;
import org.springframework.samples.petclinic.vet.VetRepository__TestContext003_BeanDefinitions;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration__TestContext003_BeanDefinitions;
import org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration__TestContext003_BeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
public class ClinicServiceTests__TestContext003_BeanFactoryRegistrations {
  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__TestContext003_BeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__TestContext003_BeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.context.ImportsContextCustomizer$ImportsCleanupPostProcessor", ImportsContextCustomizer__TestContext003_BeanDefinitions.ImportsCleanupPostProcessor.getImportsCleanupPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.mock.mockito.MockitoPostProcessor$SpyPostProcessor", MockitoPostProcessor__TestContext003_BeanDefinitions.SpyPostProcessor.getSpyPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.mock.mockito.MockitoPostProcessor", MockitoPostProcessor__TestContext003_BeanDefinitions.getMockitoPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("petClinicApplication", PetClinicApplication__TestContext003_BeanDefinitions.getPetClinicApplicationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.AutoConfigurationPackages", AutoConfigurationPackages__TestContext003_BeanDefinitions.BasePackages.getAutoConfigurationPackagesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.testcontainers.service.connection.ServiceConnectionAutoConfiguration", ServiceConnectionAutoConfiguration__TestContext003_BeanDefinitions.getServiceConnectionAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.autoconfigure.jdbc.TestDatabaseAutoConfiguration", TestDatabaseAutoConfiguration__TestContext003_BeanDefinitions.getTestDatabaseAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$Hikari", DataSourceConfiguration__TestContext003_BeanDefinitions.Hikari.getHikariBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcConnectionDetailsHikariBeanPostProcessor", DataSourceConfiguration__TestContext003_BeanDefinitions.Hikari.getJdbcConnectionDetailsHikariBeanPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("dataSource", DataSourceConfiguration__TestContext003_BeanDefinitions.Hikari.getDataSourceBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration$PooledDataSourceConfiguration", DataSourceAutoConfiguration__TestContext003_BeanDefinitions.PooledDataSourceConfiguration.getPooledDataSourceConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcConnectionDetails", DataSourceAutoConfiguration__TestContext003_BeanDefinitions.PooledDataSourceConfiguration.getJdbcConnectionDetailsBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration$HikariPoolDataSourceMetadataProviderConfiguration", DataSourcePoolMetadataProvidersConfiguration__TestContext003_BeanDefinitions.HikariPoolDataSourceMetadataProviderConfiguration.getHikariPoolDataSourceMetadataProviderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("hikariPoolDataSourceMetadataProvider", DataSourcePoolMetadataProvidersConfiguration__TestContext003_BeanDefinitions.HikariPoolDataSourceMetadataProviderConfiguration.getHikariPoolDataSourceMetadataProviderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration", DataSourcePoolMetadataProvidersConfiguration__TestContext003_BeanDefinitions.getDataSourcePoolMetadataProvidersConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration", DataSourceAutoConfiguration__TestContext003_BeanDefinitions.getDataSourceAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__TestContext003_BeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__TestContext003_BeanDefinitions.ConfigurationPropertiesBinderFactory.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__TestContext003_BeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__TestContext003_BeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
    beanFactory.registerBeanDefinition("spring.datasource-org.springframework.boot.autoconfigure.jdbc.DataSourceProperties", DataSourceProperties__TestContext003_BeanDefinitions.getDataSourcePropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$PersistenceManagedTypesConfiguration", JpaBaseConfiguration__TestContext003_BeanDefinitions.PersistenceManagedTypesConfiguration.getPersistenceManagedTypesConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("persistenceManagedTypes", JpaBaseConfiguration__TestContext003_BeanDefinitions.PersistenceManagedTypesConfiguration.getPersistenceManagedTypesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaConfiguration", HibernateJpaConfiguration__TestContext003_BeanDefinitions.getHibernateJpaConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("transactionManager", JpaBaseConfiguration__TestContext003_BeanDefinitions.getTransactionManagerBeanDefinition());
    beanFactory.registerBeanDefinition("jpaVendorAdapter", JpaBaseConfiguration__TestContext003_BeanDefinitions.getJpaVendorAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("entityManagerFactoryBuilder", JpaBaseConfiguration__TestContext003_BeanDefinitions.getEntityManagerFactoryBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("entityManagerFactory", JpaBaseConfiguration__TestContext003_BeanDefinitions.getEntityManagerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("spring.jpa.hibernate-org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties", HibernateProperties__TestContext003_BeanDefinitions.getHibernatePropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("spring.jpa-org.springframework.boot.autoconfigure.orm.jpa.JpaProperties", JpaProperties__TestContext003_BeanDefinitions.getJpaPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration", HibernateJpaAutoConfiguration__TestContext003_BeanDefinitions.getHibernateJpaAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration", JpaRepositoriesAutoConfiguration__TestContext003_BeanDefinitions.getJpaRepositoriesAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jpaSharedEM_entityManagerFactory", SharedEntityManagerCreator__TestContext003_BeanDefinitions.getJpaSharedEMentityManagerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("emBeanDefinitionRegistrarPostProcessor", EntityManagerBeanDefinitionRegistrarPostProcessor__TestContext003_BeanDefinitions.getEmBeanDefinitionRegistrarPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("jpaMappingContext", JpaMetamodelMappingContext__TestContext003_BeanDefinitions.getJpaMappingContextBeanDefinition());
    beanFactory.registerBeanDefinition("jpaContext", DefaultJpaContext__TestContext003_BeanDefinitions.getJpaContextBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.data.jpa.util.JpaMetamodelCacheCleanup", JpaMetamodelCacheCleanup__TestContext003_BeanDefinitions.getJpaMetamodelCacheCleanupBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.data.jpa.repository.support.JpaEvaluationContextExtension", JpaEvaluationContextExtension__TestContext003_BeanDefinitions.getJpaEvaluationContextExtensionBeanDefinition());
    beanFactory.registerBeanDefinition("jpa.named-queries#0", PropertiesBasedNamedQueries__TestContext003_BeanDefinitions.getNamedqueriesBeanDefinition());
    beanFactory.registerBeanDefinition("jpa.VetRepository.fragments#0", RepositoryComposition__TestContext003_BeanDefinitions.RepositoryFragments.getFragmentsBeanDefinition());
    beanFactory.registerBeanDefinition("vetRepository", VetRepository__TestContext003_BeanDefinitions.getVetRepositoryBeanDefinition());
    beanFactory.registerBeanDefinition("jpa.named-queries#1", PropertiesBasedNamedQueries__TestContext003_BeanDefinitions.getNamedqueriesBeanDefinition1());
    beanFactory.registerBeanDefinition("jpa.OwnerRepository.fragments#0", RepositoryComposition__TestContext003_BeanDefinitions.RepositoryFragments.getFragmentsBeanDefinition1());
    beanFactory.registerBeanDefinition("ownerRepository", OwnerRepository__TestContext003_BeanDefinitions.getOwnerRepositoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.JdbcTemplateConfiguration", JdbcTemplateConfiguration__TestContext003_BeanDefinitions.getJdbcTemplateConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcTemplate", JdbcTemplateConfiguration__TestContext003_BeanDefinitions.getJdbcTemplateBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcTemplateConfiguration", NamedParameterJdbcTemplateConfiguration__TestContext003_BeanDefinitions.getNamedParameterJdbcTemplateConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("namedParameterJdbcTemplate", NamedParameterJdbcTemplateConfiguration__TestContext003_BeanDefinitions.getNamedParameterJdbcTemplateBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration", JdbcTemplateAutoConfiguration__TestContext003_BeanDefinitions.getJdbcTemplateAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.jdbc-org.springframework.boot.autoconfigure.jdbc.JdbcProperties", JdbcProperties__TestContext003_BeanDefinitions.getJdbcPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor", DatabaseInitializationDependencyConfigurer__TestContext003_BeanDefinitions.DependsOnDatabaseInitializationPostProcessor.getDependsOnDatabaseInitializationPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.JdbcClientAutoConfiguration", JdbcClientAutoConfiguration__TestContext003_BeanDefinitions.getJdbcClientAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcClient", JdbcClientAutoConfiguration__TestContext003_BeanDefinitions.getJdbcClientBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.sql.init.DataSourceInitializationConfiguration", DataSourceInitializationConfiguration__TestContext003_BeanDefinitions.getDataSourceInitializationConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("dataSourceScriptDatabaseInitializer", DataSourceInitializationConfiguration__TestContext003_BeanDefinitions.getDataSourceScriptDatabaseInitializerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration", SqlInitializationAutoConfiguration__TestContext003_BeanDefinitions.getSqlInitializationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties", SqlInitializationProperties__TestContext003_BeanDefinitions.getSqlInitializationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration$JdbcTransactionManagerConfiguration", DataSourceTransactionManagerAutoConfiguration__TestContext003_BeanDefinitions.JdbcTransactionManagerConfiguration.getJdbcTransactionManagerConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration", DataSourceTransactionManagerAutoConfiguration__TestContext003_BeanDefinitions.getDataSourceTransactionManagerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration", ProxyTransactionManagementConfiguration__TestContext003_BeanDefinitions.getProxyTransactionManagementConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.transaction.config.internalTransactionAdvisor", ProxyTransactionManagementConfiguration__TestContext003_BeanDefinitions.getInternalTransactionAdvisorBeanDefinition());
    beanFactory.registerBeanDefinition("transactionAttributeSource", ProxyTransactionManagementConfiguration__TestContext003_BeanDefinitions.getTransactionAttributeSourceBeanDefinition());
    beanFactory.registerBeanDefinition("transactionInterceptor", ProxyTransactionManagementConfiguration__TestContext003_BeanDefinitions.getTransactionInterceptorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.transaction.config.internalTransactionalEventListenerFactory", AbstractTransactionManagementConfiguration__TestContext003_BeanDefinitions.getInternalTransactionalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration$CglibAutoProxyConfiguration", TransactionAutoConfiguration__TestContext003_BeanDefinitions.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration.getCglibAutoProxyConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.aop.config.internalAutoProxyCreator", InfrastructureAdvisorAutoProxyCreator__TestContext003_BeanDefinitions.getInternalAutoProxyCreatorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration", TransactionAutoConfiguration__TestContext003_BeanDefinitions.EnableTransactionManagementConfiguration.getEnableTransactionManagementConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$TransactionTemplateConfiguration", TransactionAutoConfiguration__TestContext003_BeanDefinitions.TransactionTemplateConfiguration.getTransactionTemplateConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("transactionTemplate", TransactionAutoConfiguration__TestContext003_BeanDefinitions.TransactionTemplateConfiguration.getTransactionTemplateBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration", TransactionAutoConfiguration__TestContext003_BeanDefinitions.getTransactionAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManagerAutoConfiguration", TestEntityManagerAutoConfiguration__TestContext003_BeanDefinitions.getTestEntityManagerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("testEntityManager", TestEntityManagerAutoConfiguration__TestContext003_BeanDefinitions.getTestEntityManagerBeanDefinition());
    beanFactory.registerBeanDefinition("jpaSharedEM_AWC_entityManagerFactory", SharedEntityManagerCreator__TestContext003_BeanDefinitions.getJpaSharedEMAWCentityManagerFactoryBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
  }
}
