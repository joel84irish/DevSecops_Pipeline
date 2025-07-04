package org.springframework.boot.actuate.autoconfigure.web.exchanges;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HttpExchangesEndpointAutoConfiguration}.
 */
public class HttpExchangesEndpointAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'httpExchangesEndpointAutoConfiguration'.
   */
  public static BeanDefinition getHttpExchangesEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpExchangesEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(HttpExchangesEndpointAutoConfiguration::new);
    return beanDefinition;
  }
}
