package g20;

import android.content.Context;
import ce0.C21100e;

/* renamed from: g20.e */
public final class C17145e<O, T> extends C17142d<Object, Object> {

    /* renamed from: b */
    public final C17142d<Object, Object> f44378b;

    /* renamed from: c */
    public final C17142d<Object, Object> f44379c;

    /* renamed from: d */
    public final C17142d<? super O, String> f44380d;

    /* renamed from: e */
    public final int f44381e;

    public C17145e(C17142d<O, String> dVar, int i, C17142d<? super O, ? extends T> dVar2, C17142d<? super O, ? extends T> dVar3) {
        C21100e.m49373x(dVar2, "successProperty");
        this.f44378b = dVar2;
        C21100e.m49373x(dVar3, "failProperty");
        this.f44379c = dVar3;
        C21100e.m49373x(dVar, "testProperty");
        this.f44380d = dVar;
        this.f44381e = i;
    }

    /* renamed from: a */
    public final Object mo49725a(Context context, Object obj) {
        int i;
        C17142d<Object, Object> dVar;
        String a = this.f44380d.mo49725a(context, obj);
        boolean z = false;
        if (a != null) {
            i = a.length();
        } else {
            i = 0;
        }
        if (i >= this.f44381e) {
            z = true;
        }
        if (z) {
            dVar = this.f44378b;
        } else {
            dVar = this.f44379c;
        }
        return dVar.mo49725a(context, obj);
    }

    /* renamed from: b */
    public final Object mo49727b(Context context, Object obj) {
        int i;
        C17142d<Object, Object> dVar;
        String a = this.f44380d.mo49725a(context, obj);
        boolean z = false;
        if (a != null) {
            i = a.length();
        } else {
            i = 0;
        }
        if (i >= this.f44381e) {
            z = true;
        }
        if (z) {
            dVar = this.f44378b;
        } else {
            dVar = this.f44379c;
        }
        return dVar.mo49727b(context, obj);
    }

    /* renamed from: c */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder k = C13555b.m33972k("(");
        k.append(this.f44380d);
        k.append(".length >= ");
        k.append(this.f44381e);
        k.append(")");
        sb.append(k.toString());
        sb.append(" ? (");
        sb.append(this.f44378b);
        sb.append(") : (");
        sb.append(this.f44379c);
        sb.append(")");
        return sb.toString();
    }
}
