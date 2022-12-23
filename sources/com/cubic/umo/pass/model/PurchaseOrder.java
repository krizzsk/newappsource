package com.cubic.umo.pass.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PurchaseOrder;", "Landroid/os/Parcelable;", "CREATOR", "a", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class PurchaseOrder implements Parcelable {
    public static final C2257a CREATOR = new C2257a();

    /* renamed from: b */
    public final String f8216b;

    /* renamed from: c */
    public double f8217c;

    /* renamed from: d */
    public final LinkedHashMap f8218d;

    /* renamed from: e */
    public Integer f8219e;

    /* renamed from: f */
    public final int f8220f;

    /* renamed from: g */
    public final int f8221g;

    /* renamed from: com.cubic.umo.pass.model.PurchaseOrder$a */
    public static final class C2257a implements Parcelable.Creator<PurchaseOrder> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new PurchaseOrder(parcel);
        }

        public final Object[] newArray(int i) {
            return new PurchaseOrder[i];
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseOrder(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            mf0.C24362h.m61211f(r5, r0)
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.f8218d = r0
            java.lang.String r1 = r5.readString()
            mf0.C24362h.m61208c(r1)
            r4.f8216b = r1
            double r1 = r5.readDouble()
            r4.f8217c = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r5.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto L_0x0030
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            r4.f8219e = r1
            int r1 = r5.readInt()
            r4.f8220f = r1
            int r1 = r5.readInt()
            r4.f8221g = r1
            android.os.Bundle r5 = r5.readBundle()
            if (r5 != 0) goto L_0x0046
            goto L_0x0059
        L_0x0046:
            java.lang.String r1 = "item_map"
            java.io.Serializable r5 = r5.getSerializable(r1)
            boolean r1 = r5 instanceof java.util.HashMap
            if (r1 == 0) goto L_0x0053
            r3 = r5
            java.util.HashMap r3 = (java.util.HashMap) r3
        L_0x0053:
            if (r3 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r0.putAll(r3)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.PurchaseOrder.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f8216b);
        parcel.writeDouble(this.f8217c);
        parcel.writeValue(this.f8219e);
        parcel.writeInt(this.f8220f);
        parcel.writeInt(this.f8221g);
        Bundle bundle = new Bundle(1);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f8218d);
        bundle.putSerializable("item_map", hashMap);
    }
}
