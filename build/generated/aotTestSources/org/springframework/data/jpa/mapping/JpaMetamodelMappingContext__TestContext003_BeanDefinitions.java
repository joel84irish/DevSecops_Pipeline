package org.springframework.data.jpa.mapping;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.jpa.repository.config.JpaMetamodelMappingContextFactoryBean;

/**
 * Bean definitions for {@link JpaMetamodelMappingContext}.
 */
public class JpaMetamodelMappingContext__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'jpaMappingContext'.
   */
  public static BeanDefinition getJpaMappingContextBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JpaMetamodelMappingContextFactoryBean.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(JpaMetamodelMappingContextFactoryBean::new);
    return beanDefinition;
  }
}
