package com.zwh.zapiclientsdk;

import com.zwh.zapiclientsdk.client.ZApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class ZApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ZApiClient zApiClient() {
        return new ZApiClient(accessKey, secretKey);
    }

}
