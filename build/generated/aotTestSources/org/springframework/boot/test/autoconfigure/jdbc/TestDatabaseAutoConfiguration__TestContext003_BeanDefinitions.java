package org.springframework.boot.test.autoconfigure.jdbc;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestDatabaseAutoConfiguration}.
 */
public class TestDatabaseAutoConfiguration__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'testDatabaseAutoConfiguration'.
   */
  public static BeanDefinition getTestDatabaseAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TestDatabaseAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(TestDatabaseAutoConfiguration::new);
    return beanDefinition;
  }
}
