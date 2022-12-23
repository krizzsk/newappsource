package com.usebutton.sdk.internal;

import com.usebutton.sdk.purchasepath.PurchasePath;
import com.usebutton.sdk.purchasepath.PurchasePathExtension;
import com.usebutton.sdk.purchasepath.PurchasePathInterface;
import com.usebutton.sdk.purchasepath.PurchasePathListener;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;

public class NoOpPurchasePath implements PurchasePathInterface {
    public void fetch(PurchasePathRequest purchasePathRequest, PurchasePathListener purchasePathListener) {
        purchasePathListener.onComplete((PurchasePath) null, new IllegalStateException("Button.configure() must be called before using Purchase Path API"));
    }

    public PurchasePathExtension getExtension() {
        return null;
    }

    public boolean isBrowserEnabled() {
        return false;
    }

    public void setExtension(PurchasePathExtension purchasePathExtension) {
    }
}
