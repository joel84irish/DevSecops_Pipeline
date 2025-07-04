package org.springframework.boot.actuate.autoconfigure.audit;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AuditEventsEndpointAutoConfiguration}.
 */
public class AuditEventsEndpointAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'auditEventsEndpointAutoConfiguration'.
   */
  public static BeanDefinition getAuditEventsEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuditEventsEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(AuditEventsEndpointAutoConfiguration::new);
    return beanDefinition;
  }
}
