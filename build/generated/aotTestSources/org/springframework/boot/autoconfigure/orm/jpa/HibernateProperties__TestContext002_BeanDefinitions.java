package org.springframework.boot.autoconfigure.orm.jpa;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HibernateProperties}.
 */
public class HibernateProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'hibernateProperties'.
   */
  public static BeanDefinition getHibernatePropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HibernateProperties.class);
    beanDefinition.setInstanceSupplier(HibernateProperties::new);
    return beanDefinition;
  }
}
