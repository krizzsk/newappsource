package com.google.android.datatransport.cct.internal;

import p263t9.C6607a;

public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private ClientType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public abstract C6607a mo15755a();

    /* renamed from: b */
    public abstract ClientType mo15756b();
}
