package com.nobibi.common.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configurable
@Import(SpringWebMvcConfigurer.class)
@PropertySource({"classpath:application.properties"})
public class SpringConfiguration {
}
