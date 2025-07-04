package org.springframework.boot.autoconfigure.jackson;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JacksonProperties}.
 */
public class JacksonProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonProperties'.
   */
  public static BeanDefinition getJacksonPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonProperties.class);
    beanDefinition.setInstanceSupplier(JacksonProperties::new);
    return beanDefinition;
  }
}
