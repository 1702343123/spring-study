package com.spring.orm.Aop.Aop.IoC.quickstart.annotation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Phone {
    //通过@Value注解给简单类型赋值
    @Value("iPhoneX")
    private String brand;
    @Value("666.6")
    private Double prise;
}
