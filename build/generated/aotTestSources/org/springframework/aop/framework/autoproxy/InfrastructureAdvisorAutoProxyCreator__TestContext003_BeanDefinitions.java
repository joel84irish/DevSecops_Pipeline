package org.springframework.aop.framework.autoproxy;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link InfrastructureAdvisorAutoProxyCreator}.
 */
public class InfrastructureAdvisorAutoProxyCreator__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'internalAutoProxyCreator'.
   */
  public static BeanDefinition getInternalAutoProxyCreatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(InfrastructureAdvisorAutoProxyCreator.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.getPropertyValues().addPropertyValue("order", -2147483648);
    beanDefinition.getPropertyValues().addPropertyValue("proxyTargetClass", true);
    beanDefinition.setInstanceSupplier(InfrastructureAdvisorAutoProxyCreator::new);
    return beanDefinition;
  }
}
