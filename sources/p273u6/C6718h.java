package p273u6;

import p311x6.C7176l;
import p358af.C13437d;

@Deprecated
/* renamed from: u6.h */
public abstract class C6718h<Z> extends C6708a<Z> {

    /* renamed from: c */
    public final int f20810c = Integer.MIN_VALUE;

    /* renamed from: d */
    public final int f20811d = Integer.MIN_VALUE;

    /* renamed from: a */
    public final void mo22742a(C6719i iVar) {
        if (C7176l.m16789i(this.f20810c, this.f20811d)) {
            iVar.mo11025b(this.f20810c, this.f20811d);
            return;
        }
        StringBuilder k = C13555b.m33972k("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        k.append(this.f20810c);
        k.append(" and height: ");
        throw new IllegalArgumentException(C13437d.m33707l(k, this.f20811d, ", either provide dimensions in the constructor or call override()"));
    }

    /* renamed from: j */
    public final void mo22753j(C6719i iVar) {
    }
}
