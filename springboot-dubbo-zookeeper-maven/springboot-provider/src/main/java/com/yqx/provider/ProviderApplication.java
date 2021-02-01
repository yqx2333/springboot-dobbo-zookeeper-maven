package com.yqx.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

// 在Spring启动器中将 Dubbo 的配置文件引用,并扫描Mapper包

@SpringBootApplication
// @ImportResource 该注解是将  applicationContext.xml文件中的bean加载到容器中
@ImportResource( "classpath:spring-dubbo.xml" )
@MapperScan( "com.yqx.provider.mapper" )    // 扫描mapper
public class ProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run( ProviderApplication.class );
        System.out.println( "服务器端执行成功!" );

    }


}
