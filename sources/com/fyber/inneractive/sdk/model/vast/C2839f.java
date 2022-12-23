package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.vast.C2796a;
import java.util.List;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.model.vast.f */
public class C2839f {

    /* renamed from: a */
    public Integer f9761a;

    /* renamed from: b */
    public Integer f9762b;

    /* renamed from: c */
    public String f9763c;

    /* renamed from: d */
    public C2842i f9764d;

    /* renamed from: e */
    public String f9765e;

    /* renamed from: f */
    public String f9766f;

    /* renamed from: g */
    public String f9767g;

    /* renamed from: h */
    public List<String> f9768h;

    /* renamed from: i */
    public C2796a.C2797a f9769i;

    /* renamed from: j */
    public List<C2849p> f9770j;

    public String toString() {
        StringBuilder n = C13437d.m33708n("Companion: ", " w:");
        n.append(this.f9761a);
        n.append(" h:");
        n.append(this.f9762b);
        n.append(" ctr:");
        n.append(this.f9767g);
        n.append(" clt:");
        n.append(this.f9768h);
        if (!TextUtils.isEmpty(this.f9766f)) {
            n.append(" html:");
            n.append(this.f9766f);
        }
        if (this.f9764d != null) {
            n.append(" static:");
            n.append(this.f9764d.f9780b);
            n.append("creative:");
            n.append(this.f9764d.f9779a);
        }
        if (!TextUtils.isEmpty(this.f9765e)) {
            n.append(" iframe:");
            n.append(this.f9765e);
        }
        n.append(" events:");
        n.append(this.f9770j);
        if (this.f9769i != null) {
            n.append(" reason:");
            n.append(this.f9769i.f9658a);
        }
        return n.toString();
    }
}
