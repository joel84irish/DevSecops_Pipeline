package org.springframework.boot.autoconfigure.web.servlet.error;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;

/**
 * Bean definitions for {@link ErrorMvcAutoConfiguration}.
 */
public class ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ErrorMvcAutoConfiguration> getErrorMvcAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ErrorMvcAutoConfiguration>forConstructor(ServerProperties.class)
            .withGenerator((registeredBean, args) -> new ErrorMvcAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'errorMvcAutoConfiguration'.
   */
  public static BeanDefinition getErrorMvcAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ErrorMvcAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getErrorMvcAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'errorAttributes'.
   */
  private static BeanInstanceSupplier<DefaultErrorAttributes> getErrorAttributesInstanceSupplier() {
    return BeanInstanceSupplier.<DefaultErrorAttributes>forFactoryMethod(ErrorMvcAutoConfiguration.class, "errorAttributes")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.class).errorAttributes());
  }

  /**
   * Get the bean definition for 'errorAttributes'.
   */
  public static BeanDefinition getErrorAttributesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultErrorAttributes.class);
    beanDefinition.setInstanceSupplier(getErrorAttributesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'basicErrorController'.
   */
  private static BeanInstanceSupplier<BasicErrorController> getBasicErrorControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BasicErrorController>forFactoryMethod(ErrorMvcAutoConfiguration.class, "basicErrorController", ErrorAttributes.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.class).basicErrorController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'basicErrorController'.
   */
  public static BeanDefinition getBasicErrorControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BasicErrorController.class);
    beanDefinition.setInstanceSupplier(getBasicErrorControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'errorPageCustomizer'.
   */
  private static BeanInstanceSupplier<ErrorMvcAutoConfiguration.ErrorPageCustomizer> getErrorPageCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ErrorMvcAutoConfiguration.ErrorPageCustomizer>forFactoryMethod(ErrorMvcAutoConfiguration.class, "errorPageCustomizer", DispatcherServletPath.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.class).errorPageCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'errorPageCustomizer'.
   */
  public static BeanDefinition getErrorPageCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ErrorMvcAutoConfiguration.ErrorPageCustomizer.class);
    beanDefinition.setInstanceSupplier(getErrorPageCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'preserveErrorControllerTargetClassPostProcessor'.
   */
  public static BeanDefinition getPreserveErrorControllerTargetClassPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ErrorMvcAutoConfiguration.class);
    beanDefinition.setTargetType(ErrorMvcAutoConfiguration.PreserveErrorControllerTargetClassPostProcessor.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<ErrorMvcAutoConfiguration.PreserveErrorControllerTargetClassPostProcessor>forFactoryMethod(ErrorMvcAutoConfiguration.class, "preserveErrorControllerTargetClassPostProcessor").withGenerator((registeredBean) -> ErrorMvcAutoConfiguration.preserveErrorControllerTargetClassPostProcessor()));
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration}.
   */
  public static class DefaultErrorViewResolverConfiguration {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration'.
     */
    private static BeanInstanceSupplier<ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration> getDefaultErrorViewResolverConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration>forConstructor(ApplicationContext.class, WebProperties.class)
              .withGenerator((registeredBean, args) -> new ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'defaultErrorViewResolverConfiguration'.
     */
    public static BeanDefinition getDefaultErrorViewResolverConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration.class);
      beanDefinition.setInstanceSupplier(getDefaultErrorViewResolverConfigurationInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'conventionErrorViewResolver'.
     */
    private static BeanInstanceSupplier<DefaultErrorViewResolver> getConventionErrorViewResolverInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DefaultErrorViewResolver>forFactoryMethod(ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration.class, "conventionErrorViewResolver")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration.class).conventionErrorViewResolver());
    }

    /**
     * Get the bean definition for 'conventionErrorViewResolver'.
     */
    public static BeanDefinition getConventionErrorViewResolverBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultErrorViewResolver.class);
      beanDefinition.setInstanceSupplier(getConventionErrorViewResolverInstanceSupplier());
      return beanDefinition;
    }
  }
}
