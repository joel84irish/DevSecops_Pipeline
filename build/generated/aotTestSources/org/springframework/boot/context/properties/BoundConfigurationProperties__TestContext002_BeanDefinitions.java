package org.springframework.boot.context.properties;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BoundConfigurationProperties}.
 */
public class BoundConfigurationProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'boundConfigurationProperties'.
   */
  public static BeanDefinition getBoundConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BoundConfigurationProperties.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(BoundConfigurationProperties::new);
    return beanDefinition;
  }
}
