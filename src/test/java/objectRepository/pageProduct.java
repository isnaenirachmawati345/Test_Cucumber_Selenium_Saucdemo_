package objectRepository;

import org.openqa.selenium.By;

public class pageProduct {

    By btn_addToCart = By.xpath("//button[contains(text(),'Add to cart')]");
    By badge_amountProduct = By.className("shopping_cart_badge");
    By product_image = By.id("item_4_img_link");
    By page_detailProduct = By.id("inventory_item_container");
    By btn_backToProduct = By.id("back-to-products");
    By tittle_product = By.xpath("//span[@class='title']");

    public By getBtn_addToCart() {
        return btn_addToCart;
    }

    public By getBadge_amountProduct() {
        return badge_amountProduct;
    }

    public By getProduct_image(){return product_image; }

    public By getPage_detailProduct(){return page_detailProduct;}

    public By getBtn_backToProduct(){return btn_backToProduct; }

    public By getTittle_product(){return tittle_product; }
}
