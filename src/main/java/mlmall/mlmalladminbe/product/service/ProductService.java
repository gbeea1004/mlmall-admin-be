package mlmall.mlmalladminbe.product.service;

import java.util.ArrayList;
import java.util.List;
import mlmall.mlmalladminbe.product.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  /**
   * 상품 리스트 조회
   */
  public List<Product> getProducts() {
    return new ArrayList<>();
  }
}
