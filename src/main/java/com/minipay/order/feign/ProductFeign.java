package com.minipay.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface ProductFeign {

    @GetMapping("/product/hello")
    String getProductInfo();
}