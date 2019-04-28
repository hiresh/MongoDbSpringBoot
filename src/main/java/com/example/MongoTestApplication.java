package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
/*
 * use the above annotation when localhost is not hosting db server
 * 
 * URL should pass the request params exactly as variables in controller method
 * 
 * implement using a custom mongo template
 * 
 *local installation of mongoDB needed as this is not embedded db server,
 *Create a db connection with same name as given in application.properties (test1)
 *via mongo atlas.
 */
public class MongoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoTestApplication.class, args);
	}
	
	 /* @Bean
	    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
	                                       MongoMappingContext context) {

	        MappingMongoConverter converter =
	                new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
	        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);

	        return mongoTemplate;

	    }*/

}
