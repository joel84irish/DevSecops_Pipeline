package org.springframework.boot.autoconfigure.web.servlet;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WebMvcProperties}.
 */
public class WebMvcProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'webMvcProperties'.
   */
  public static BeanDefinition getWebMvcPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebMvcProperties.class);
    beanDefinition.setInstanceSupplier(WebMvcProperties::new);
    return beanDefinition;
  }
}
