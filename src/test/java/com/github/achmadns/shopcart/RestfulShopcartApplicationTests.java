package com.github.achmadns.shopcart;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestfulShopcartApplication.class)
@WebIntegrationTest(randomPort = true)
public class RestfulShopcartApplicationTests {
    private TestRestTemplate rest = new TestRestTemplate();
    @Value("http://localhost:${local.server.port}")
    private String baseUrl;

    @Before
    public void beforeTest() {

    }

    @Test
    public void get_home_should_ok() {
        final String home = rest.getForObject(baseUrl + "/api/v1/shop", String.class);
        Assertions.assertThat(home).isEqualToIgnoringCase("Welcome to shopcart!");
    }

}
