package dz.m2gl.al.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
	 @Bean
	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	                .route(r -> r.path("/course/**")
	                        .uri("http://localhost:8080/")
	                       // .id("courseModule")
	                        )

	                .route(r -> r.path("/teacher/**")
	                        .uri("http://localhost:8181/")
	                       //.id("teacherModule")
	                        )
	                .build();
	    }

}
