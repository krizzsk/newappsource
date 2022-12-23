package com.usebutton.sdk.purchasepath;

public interface PurchasePathInterface {
    void fetch(PurchasePathRequest purchasePathRequest, PurchasePathListener purchasePathListener);

    PurchasePathExtension getExtension();

    boolean isBrowserEnabled();

    void setExtension(PurchasePathExtension purchasePathExtension);
}
