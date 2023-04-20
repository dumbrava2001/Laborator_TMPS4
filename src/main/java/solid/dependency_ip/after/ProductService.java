package solid.dependency_ip.after;

import java.util.ArrayList;
import java.util.List;
import solid.dependency_ip.Product;

public class ProductService {

  private final List<Product> productList = new ArrayList<>(List.of(
      new Product("G14", "Asus", 1300),
      new Product("Macbook Pro 14", "Apple", 2000),
      new Product("XPS 15", "Dell", 2100)
  ));

  private final Convertor convertor;

  public ProductService(Convertor convertor) {
    this.convertor = convertor;
  }

  public String getProductByName(String name) {
    Product product = productList.stream()
        .filter(pr -> pr.name().trim().equalsIgnoreCase(name.trim()))
        .findFirst()
        .orElseThrow();

    return convertor.convertProduct(product);
  }
}
