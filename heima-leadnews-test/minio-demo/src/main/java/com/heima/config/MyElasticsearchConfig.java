package com.heima.config;

        import org.apache.http.HttpHost;
        import org.elasticsearch.client.RestClient;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

/**
 * @Project: heima-leadnews
 * @Package: com.heima.config
 * @ClassName: MyElasticsearchConfig
 * @Description: TODO
 * @Author: xueyujiao
 * @Date: 2024/3/22
 * @Version 1.0
 */
@Configuration
public class MyElasticsearchConfig {

    @Value("${spring.elasticsearch.port}")
    private int port;

    @Value("${spring.elasticsearch.ip}")
    private String ip;

    @Value("${spring.elasticsearch.username}")
    private String username;

    @Value("${spring.elasticsearch.password}")
    private String password;

    @Bean
    public RestClient restClient(){
        System.out.println("ip=====" + this.ip);
        System.out.println("port=====" + this.port);
        System.out.println("username=====" + this.username);
        RestClient restClient = RestClient.builder(
                new HttpHost(ip, port,"http")).build();
//        ElasticsearchTransport transport = new RestClientTransport(
//                restClient, new JacksonJsonpMapper());
//        ElasticsearchClient client = new ElasticsearchClient(transport);
//        return new ElasticSearchResult(restClient,transport,client);
        return restClient;
    }

}
