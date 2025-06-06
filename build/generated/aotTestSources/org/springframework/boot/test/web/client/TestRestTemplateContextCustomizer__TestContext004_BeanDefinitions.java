package org.springframework.boot.test.web.client;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestRestTemplateContextCustomizer}.
 */
public class TestRestTemplateContextCustomizer__TestContext004_BeanDefinitions {
  /**
   * Bean definitions for {@link TestRestTemplateContextCustomizer.TestRestTemplateRegistrar}.
   */
  public static class TestRestTemplateRegistrar {
    /**
     * Get the bean definition for 'testRestTemplateRegistrar'.
     */
    public static BeanDefinition getTestRestTemplateRegistrarBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(TestRestTemplateContextCustomizer.TestRestTemplateRegistrar.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.setInstanceSupplier(TestRestTemplateContextCustomizer.TestRestTemplateRegistrar::new);
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link TestRestTemplateContextCustomizer.TestRestTemplateFactory}.
   */
  public static class TestRestTemplateFactory {
    /**
     * Get the bean definition for 'testRestTemplate'.
     */
    public static BeanDefinition getTestRestTemplateBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(TestRestTemplateContextCustomizer.TestRestTemplateFactory.class);
      beanDefinition.setInstanceSupplier(TestRestTemplateContextCustomizer.TestRestTemplateFactory::new);
      return beanDefinition;
    }
  }
}
