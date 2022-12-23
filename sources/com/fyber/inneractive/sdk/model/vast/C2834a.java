package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.model.vast.a */
public class C2834a {

    /* renamed from: a */
    public final String f9733a;

    /* renamed from: b */
    public final String f9734b;

    /* renamed from: c */
    public final String f9735c;

    /* renamed from: d */
    public final boolean f9736d;

    public C2834a(String str, String str2, String str3) {
        String str4;
        String str5;
        boolean z;
        String str6 = null;
        if (str != null) {
            str4 = str.trim();
        } else {
            str4 = null;
        }
        this.f9733a = str4;
        if (str2 != null) {
            str5 = str2.trim();
        } else {
            str5 = null;
        }
        this.f9734b = str5;
        str6 = str3 != null ? str3.trim() : str6;
        this.f9735c = str6;
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6) || !str6.contains("[TIME]")) {
            z = false;
        } else {
            z = true;
        }
        this.f9736d = z;
    }
}
