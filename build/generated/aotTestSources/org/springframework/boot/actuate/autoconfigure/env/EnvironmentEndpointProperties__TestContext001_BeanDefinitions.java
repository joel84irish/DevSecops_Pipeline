package org.springframework.boot.actuate.autoconfigure.env;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EnvironmentEndpointProperties}.
 */
public class EnvironmentEndpointProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'environmentEndpointProperties'.
   */
  public static BeanDefinition getEnvironmentEndpointPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EnvironmentEndpointProperties.class);
    beanDefinition.setInstanceSupplier(EnvironmentEndpointProperties::new);
    return beanDefinition;
  }
}
