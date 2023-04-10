package sn.esp.custumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import sn.esp.custumerservice.configuration.RsakeysConfig;

@SpringBootApplication
@EnableConfigurationProperties(RsakeysConfig.class)
public class CustumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustumerServiceApplication.class, args);
    }

}
