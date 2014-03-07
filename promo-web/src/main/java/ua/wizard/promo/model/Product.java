package ua.wizard.promo.model;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.03.14
 * Time: 5:05
 * To change this template use File | Settings | File Templates.
 */
public class Product {

    private final String name;
    private final String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
