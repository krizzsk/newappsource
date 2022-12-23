package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* renamed from: com.google.android.datatransport.cct.internal.c */
public final class C3864c extends NetworkConnectionInfo {

    /* renamed from: a */
    public final NetworkConnectionInfo.NetworkType f13383a;

    /* renamed from: b */
    public final NetworkConnectionInfo.MobileSubtype f13384b;

    public C3864c(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f13383a = networkType;
        this.f13384b = mobileSubtype;
    }

    /* renamed from: a */
    public final NetworkConnectionInfo.MobileSubtype mo15757a() {
        return this.f13384b;
    }

    /* renamed from: b */
    public final NetworkConnectionInfo.NetworkType mo15758b() {
        return this.f13383a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f13383a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.mo15758b()) : networkConnectionInfo.mo15758b() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f13384b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.mo15757a() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.mo15757a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        NetworkConnectionInfo.NetworkType networkType = this.f13383a;
        int i2 = 0;
        if (networkType == null) {
            i = 0;
        } else {
            i = networkType.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f13384b;
        if (mobileSubtype != null) {
            i2 = mobileSubtype.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("NetworkConnectionInfo{networkType=");
        k.append(this.f13383a);
        k.append(", mobileSubtype=");
        k.append(this.f13384b);
        k.append("}");
        return k.toString();
    }
}
