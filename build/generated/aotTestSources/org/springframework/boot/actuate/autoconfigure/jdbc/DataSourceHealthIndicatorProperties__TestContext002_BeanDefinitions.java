package org.springframework.boot.actuate.autoconfigure.jdbc;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourceHealthIndicatorProperties}.
 */
public class DataSourceHealthIndicatorProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceHealthIndicatorProperties'.
   */
  public static BeanDefinition getDataSourceHealthIndicatorPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceHealthIndicatorProperties.class);
    beanDefinition.setInstanceSupplier(DataSourceHealthIndicatorProperties::new);
    return beanDefinition;
  }
}
