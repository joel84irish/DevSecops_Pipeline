package org.springframework.boot.autoconfigure.task;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TaskExecutionAutoConfiguration}.
 */
public class TaskExecutionAutoConfiguration__TestContext004_BeanDefinitions {
  /**
   * Get the bean definition for 'taskExecutionAutoConfiguration'.
   */
  public static BeanDefinition getTaskExecutionAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaskExecutionAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(TaskExecutionAutoConfiguration::new);
    return beanDefinition;
  }
}
