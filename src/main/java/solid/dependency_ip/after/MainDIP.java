package solid.dependency_ip.after;

public class MainDIP {

  public static void main(String[] args) {
    Convertor convertor = new JsonConvertor();

    ProductService productService = new ProductService(convertor);
    System.out.println(productService.getProductByName("G14"));

    ProductService productService1 = new ProductService(new XmlConvertor());
    System.out.println(productService1.getProductByName("G14"));
  }
}
