package org.springframework.boot.context.properties;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ConfigurationPropertiesBindingPostProcessor}.
 */
public class ConfigurationPropertiesBindingPostProcessor__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'configurationPropertiesBindingPostProcessor'.
   */
  public static BeanDefinition getConfigurationPropertiesBindingPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConfigurationPropertiesBindingPostProcessor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(ConfigurationPropertiesBindingPostProcessor::new);
    return beanDefinition;
  }
}
