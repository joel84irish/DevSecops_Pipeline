package org.springframework.boot.autoconfigure.sql.init;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SqlInitializationAutoConfiguration}.
 */
public class SqlInitializationAutoConfiguration__TestContext004_BeanDefinitions {
  /**
   * Get the bean definition for 'sqlInitializationAutoConfiguration'.
   */
  public static BeanDefinition getSqlInitializationAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SqlInitializationAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(SqlInitializationAutoConfiguration::new);
    return beanDefinition;
  }
}
