package com.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * @author LiSheng
 * @date 2020/12/10 17:38
 */
@Configuration
public class ThymeleafConfig {
    @Bean
    public SpringResourceTemplateResolver templateResolver(){
        // SpringResourceTemplateResolver自动与Spring自己集成
        // 资源解决基础设施, 强烈推荐。
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        // HTML是默认值, 为了清楚起见, 在此处添加。
        templateResolver.setTemplateMode(TemplateMode.HTML);
        // 默认情况下, 模板缓存为true。如果您想要设置为false
        // 模板在修改时自动更新。
        templateResolver.setCacheable(true);
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver){
        // SpringTemplateEngine自动应用SpringStandardDialect
        // 并启用Spring自己的MessageSource消息解析机制。
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        // 使用Spring 4.2.4或更高版本启用SpringEL编译器
        // 可以加快大多数情况下的执行速度, 但是当一个模板中
        // 的表达式在不同数据类型之间重用时,
        // 可能与特定情况不兼容, 因此该标志默认为“false”
        // 以实现更安全的向后兼容性。
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver(SpringTemplateEngine templateEngine){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        // 注意“order”和“viewNames”是可选的
        viewResolver.setOrder(1);
        viewResolver.setViewNames(new String[] {".html", ".xhtml"});
        return viewResolver;
    }
}
