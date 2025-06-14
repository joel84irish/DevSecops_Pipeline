package org.springframework.boot.autoconfigure.jdbc;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JdbcProperties}.
 */
public class JdbcProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'jdbcProperties'.
   */
  public static BeanDefinition getJdbcPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JdbcProperties.class);
    beanDefinition.setInstanceSupplier(JdbcProperties::new);
    return beanDefinition;
  }
}
