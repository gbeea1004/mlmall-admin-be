package mlmall.mlmalladminbe.product.controller;

import lombok.RequiredArgsConstructor;
import mlmall.mlmalladminbe.common.BaseResponse;
import mlmall.mlmalladminbe.product.domain.Product;
import mlmall.mlmalladminbe.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/products")
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public BaseResponse<List<Product>> getProducts() {
        return new BaseResponse<>(productService.getProducts());
    }
}
