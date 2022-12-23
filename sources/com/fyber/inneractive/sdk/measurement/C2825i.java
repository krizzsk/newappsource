package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.response.C3652i;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.measurement.i */
public class C2825i implements C3652i {

    /* renamed from: a */
    public URL f9698a;

    /* renamed from: b */
    public String f9699b;

    /* renamed from: c */
    public Map<C2850q, List<String>> f9700c = new HashMap();

    /* renamed from: d */
    public String f9701d;

    /* renamed from: e */
    public String f9702e;

    /* renamed from: f */
    public String f9703f;

    /* renamed from: g */
    public boolean f9704g = false;

    /* renamed from: a */
    public void mo13615a(C2850q qVar, String str) {
        List list = this.f9700c.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f9700c.put(qVar, list);
        }
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }

    /* renamed from: b */
    public boolean mo13616b() {
        String str;
        if (!this.f9704g || this.f9698a == null || ((str = this.f9699b) != null && (TextUtils.isEmpty(str) || !this.f9699b.equalsIgnoreCase("omid")))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Verification{mJavaScriptResource=");
        k.append(this.f9698a);
        k.append(", mTrackingEvents=");
        k.append(this.f9700c);
        k.append(", mVerificationParameters='");
        C25541a.m63890u(k, this.f9701d, '\'', ", mVendor='");
        k.append(this.f9702e);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    /* renamed from: a */
    public List<String> mo13613a(C2850q qVar) {
        Map<C2850q, List<String>> map;
        if (qVar == null || (map = this.f9700c) == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: a */
    public String mo13614a() {
        String str;
        if (!this.f9704g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f9699b)) {
            return "apiFramework = ";
        }
        if (!this.f9699b.equalsIgnoreCase("omid")) {
            return String.format("apiFramework = %s", new Object[]{this.f9699b});
        }
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(this.f9703f)) {
            str = "";
        } else {
            str = this.f9703f;
        }
        objArr[0] = str;
        return String.format("JavaScriptResource_url = %s", objArr);
    }
}
