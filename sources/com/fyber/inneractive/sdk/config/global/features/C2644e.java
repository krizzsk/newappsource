package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.global.C2635b;
import com.fyber.inneractive.sdk.config.global.C2658k;
import com.fyber.inneractive.sdk.config.global.C2661n;
import com.fyber.inneractive.sdk.config.global.C2663p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.e */
public abstract class C2644e extends C2663p {

    /* renamed from: b */
    public String f9302b;

    /* renamed from: c */
    public List<C2635b> f9303c = new ArrayList();

    /* renamed from: d */
    public Map<String, C2658k> f9304d = new HashMap();

    public C2644e(String str) {
        this.f9302b = str;
    }

    /* renamed from: a */
    public String mo13237a(String str, String str2) {
        String str3;
        Iterator<String> it = this.f9304d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = this.f9304d.get(it.next()).mo13241c(str);
            if (str3 != null) {
                break;
            }
        }
        if (str3 != null) {
            return str3;
        }
        C2661n nVar = this.f9327a;
        return nVar != null ? nVar.mo13237a(str, str2) : str2;
    }

    /* renamed from: b */
    public abstract C2644e mo13234b();

    /* renamed from: b */
    public Integer mo13240b(String str) {
        Integer num;
        Iterator<String> it = this.f9304d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = this.f9304d.get(it.next()).mo13240b(str);
            if (num != null) {
                break;
            }
        }
        if (num == null) {
            return super.mo13240b(str);
        }
        return num;
    }

    /* renamed from: c */
    public String mo13241c(String str) {
        return mo13237a(str, (String) null);
    }

    /* renamed from: d */
    public Boolean mo13242d(String str) {
        Boolean bool;
        Iterator<String> it = this.f9304d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = this.f9304d.get(it.next()).mo13242d(str);
            if (bool != null) {
                break;
            }
        }
        if (bool == null) {
            return super.mo13242d(str);
        }
        return bool;
    }

    public String toString() {
        return String.format("id: %s, params: %s exp: %s", new Object[]{this.f9302b, this.f9327a, this.f9303c});
    }

    /* renamed from: a */
    public Double mo13236a(String str) {
        Double d;
        Iterator<String> it = this.f9304d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d = null;
                break;
            }
            d = this.f9304d.get(it.next()).mo13236a(str);
            if (d != null) {
                break;
            }
        }
        return d == null ? super.mo13236a(str) : d;
    }

    /* renamed from: a */
    public boolean mo13239a(String str, boolean z) {
        Boolean d = mo13242d(str);
        return d != null ? d.booleanValue() : z;
    }

    /* renamed from: a */
    public void mo13238a(C2644e eVar) {
        eVar.f9302b = this.f9302b;
        eVar.f9327a = this.f9327a;
        eVar.f9303c = new ArrayList(this.f9303c);
        eVar.f9304d = new HashMap(this.f9304d);
    }
}
