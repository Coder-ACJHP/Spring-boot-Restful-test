<h1> Spring-boot-data-jpa-rest-api example</h1>
<h3> In this repository I will create simple spring-boot-jpa-restful api and for testing it I used Apache Derby embedded database.</h3>
<p> I saw in some tutorials they not adding any annotation on <code>ApplicationStart.class</code> but for me not worked so we have to add some annotations to our start class to say to Spring <qoute>Hey Spring we have Service classes and Controller classes located in '------' package</qoute></p>
<p>Some thing like this :</p> <br>
<pre><code>
@SpringBootApplication
@EntityScan(basePackages = "com.coder.web.rest.entity")
@ComponentScan(basePackages = "com.coder.web.rest")
@EnableJpaRepositories(basePackages = "com.coder.web.rest.service")
public class SpringBootRestfulJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulJpaApplication.class, args);
	}
}
</code></pre>
<address>NOTE : For making your api test you can use <a href="https://www.getpostman.com/">POSTMAN</a> application as plugin on Chrome or as standalone application on your computer.</address>
