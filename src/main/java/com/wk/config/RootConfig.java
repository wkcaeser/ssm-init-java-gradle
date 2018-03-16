package com.wk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//扫描bean，过滤web相关的
@ComponentScan(basePackages = {"com.wk"},
	excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
	}
)
public class RootConfig {
}
