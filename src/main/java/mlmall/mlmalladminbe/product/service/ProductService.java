package mlmall.mlmalladminbe.product.service;

import mlmall.mlmalladminbe.product.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    /**
     * 상품 리스트 조회
     */
    public List<Product> getProducts() {
        return new ArrayList<>();
    }
}
