package y40;

import com.moovit.inputfields.InputFieldValue;
import java.util.ArrayList;
import java.util.List;
import p057d3.C4339c;
import p358af.C13437d;

/* renamed from: y40.c */
public final class C25774c extends C4339c {

    /* renamed from: b */
    public final String f64292b;

    /* renamed from: c */
    public final String f64293c;

    /* renamed from: d */
    public final String f64294d;

    /* renamed from: e */
    public final List<InputFieldValue> f64295e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25774c(String str, String str2, String str3, ArrayList arrayList) {
        super(str, str2);
        C13437d.m33711q(str, "contextId", str2, "analyticKey", str3, "handlerIdentifier");
        this.f64292b = str;
        this.f64293c = str2;
        this.f64294d = str3;
        this.f64295e = arrayList;
    }

    /* renamed from: s */
    public final String mo19843s() {
        return this.f64293c;
    }

    /* renamed from: t */
    public final String mo19844t() {
        return this.f64292b;
    }
}
