package mlmall.mlmalladminbe.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String imageUrl;
  private Long originPrice;
  private Long salePrice;
  private Long rewardPoint;
  private Long amount;
  private int order;
  private SaleStatus saleStatus;
  private Long viewCount;
  private LocalDateTime createAt;
  private LocalDateTime updateAt;
}
