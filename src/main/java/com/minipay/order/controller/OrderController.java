package com.minipay.order.controller;

import com.minipay.order.feign.ProductFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final ProductFeign productFeign;

    public OrderController(ProductFeign productFeign) {
        this.productFeign = productFeign;
    }

    @GetMapping("/order/get")
    public String getOrder() {
        return "订单服务调用商品服务：" + productFeign.getProductInfo();
    }
}