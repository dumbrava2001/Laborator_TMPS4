package solid.dependency_ip.after;

import solid.dependency_ip.Product;

public class JsonConvertor implements Convertor {

  @Override
  public String convertProduct(Product product) {
    return "{" + "name:" + product.name() + ",brand:" + product.brand() + ",price:"
        + product.price() + "}";
  }
}
