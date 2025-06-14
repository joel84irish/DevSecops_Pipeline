package org.springframework.boot.autoconfigure.aop;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AopAutoConfiguration}.
 */
public class AopAutoConfiguration__TestContext004_BeanDefinitions {
  /**
   * Get the bean definition for 'aopAutoConfiguration'.
   */
  public static BeanDefinition getAopAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AopAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(AopAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link AopAutoConfiguration.AspectJAutoProxyingConfiguration}.
   */
  public static class AspectJAutoProxyingConfiguration {
    /**
     * Get the bean definition for 'aspectJAutoProxyingConfiguration'.
     */
    public static BeanDefinition getAspectJAutoProxyingConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(AopAutoConfiguration.AspectJAutoProxyingConfiguration.class);
      beanDefinition.setInstanceSupplier(AopAutoConfiguration.AspectJAutoProxyingConfiguration::new);
      return beanDefinition;
    }

    /**
     * Bean definitions for {@link AopAutoConfiguration.AspectJAutoProxyingConfiguration.CglibAutoProxyConfiguration}.
     */
    public static class CglibAutoProxyConfiguration {
      /**
       * Get the bean definition for 'cglibAutoProxyConfiguration'.
       */
      public static BeanDefinition getCglibAutoProxyConfigurationBeanDefinition() {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(AopAutoConfiguration.AspectJAutoProxyingConfiguration.CglibAutoProxyConfiguration.class);
        beanDefinition.setInstanceSupplier(AopAutoConfiguration.AspectJAutoProxyingConfiguration.CglibAutoProxyConfiguration::new);
        return beanDefinition;
      }
    }
  }
}
