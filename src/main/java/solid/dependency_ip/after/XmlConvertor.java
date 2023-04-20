package solid.dependency_ip.after;

import solid.dependency_ip.Product;

public class XmlConvertor implements Convertor {

  @Override
  public String convertProduct(Product product) {
    return "<product>" + "<name>" + product.name() + "<name/>" + "<brand>" + product.brand()
        + "<brand/>" + "<price>" + product.price() + "<price/>" + "<product>";
  }
}
