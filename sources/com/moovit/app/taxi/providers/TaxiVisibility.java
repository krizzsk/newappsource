package com.moovit.app.taxi.providers;

import p810sz.C19577c;

public enum TaxiVisibility {
    ALWAYS,
    NOT_INSTALLED,
    PAYMENT_ACCOUNT_CONNECTED;
    
    public static final C19577c<TaxiVisibility> CODER = null;

    /* access modifiers changed from: public */
    static {
        TaxiVisibility taxiVisibility;
        TaxiVisibility taxiVisibility2;
        TaxiVisibility taxiVisibility3;
        CODER = new C19577c<>(TaxiVisibility.class, taxiVisibility, taxiVisibility2, taxiVisibility3);
    }
}
