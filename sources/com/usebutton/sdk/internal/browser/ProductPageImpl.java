package com.usebutton.sdk.internal.browser;

import com.usebutton.sdk.internal.web.ButtonJavascriptInterface;
import com.usebutton.sdk.purchasepath.Commission;
import com.usebutton.sdk.purchasepath.Product;
import com.usebutton.sdk.purchasepath.ProductPage;

public class ProductPageImpl extends BrowserPageImpl implements ProductPage {
    private final Commission commission;
    private final Product product;

    public ProductPageImpl(String str, Product product2, Commission commission2, ButtonJavascriptInterface buttonJavascriptInterface) {
        super(str, buttonJavascriptInterface);
        this.product = product2;
        this.commission = commission2;
    }

    public Commission getCommission() {
        return this.commission;
    }

    public Product getProduct() {
        return this.product;
    }
}
