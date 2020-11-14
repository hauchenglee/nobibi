package com.nobibi;

import com.nobibi.common.config.SpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nobibi.nobibicore.dao.mysql")
//@Import(SpringConfiguration.class)
public class NobibiCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(NobibiCoreApplication.class, args);
    }

}
