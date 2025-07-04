package org.springframework.boot.jackson;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JsonMixinModuleEntries}.
 */
public class JsonMixinModuleEntries__TestContext002_BeanDefinitions {
  /**
   * Get the bean instance for 'jsonMixinModuleEntries'.
   */
  private static JsonMixinModuleEntries getJsonMixinModuleEntriesInstance() {
    return JsonMixinModuleEntries.create((mixins) -> {
    } );
  }

  /**
   * Get the bean definition for 'jsonMixinModuleEntries'.
   */
  public static BeanDefinition getJsonMixinModuleEntriesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonMixinConfiguration");
    beanDefinition.setTargetType(JsonMixinModuleEntries.class);
    beanDefinition.setInstanceSupplier(JsonMixinModuleEntries__TestContext002_BeanDefinitions::getJsonMixinModuleEntriesInstance);
    return beanDefinition;
  }
}
