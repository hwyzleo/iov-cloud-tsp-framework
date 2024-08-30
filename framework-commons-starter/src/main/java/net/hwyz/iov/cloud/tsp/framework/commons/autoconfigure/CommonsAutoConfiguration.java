package net.hwyz.iov.cloud.tsp.framework.commons.autoconfigure;

import net.hwyz.iov.cloud.tsp.framework.commons.converter.ClientAccountConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author hwyz_leo
 */
@Configuration
public class CommonsAutoConfiguration {

    @Bean
    public ClientAccountConverter clientAccountConverter() {
        return new ClientAccountConverter();
    }

}
