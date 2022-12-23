package com.moovit.map;

import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.moovit.map.C16273d;
import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: com.moovit.map.k */
public final class C16286k extends C16273d {

    /* renamed from: b */
    public final Color f42558b;

    /* renamed from: c */
    public final LineStyle f42559c;

    public C16286k(Color color, LineStyle lineStyle) {
        C21100e.m49373x(color, "fillColor");
        this.f42558b = color;
        this.f42559c = lineStyle;
    }

    /* renamed from: b */
    public final Object mo48602b(C16273d.C16274a aVar, Boolean bool) {
        return aVar.mo48758a(this, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16286k)) {
            return false;
        }
        C16286k kVar = (C16286k) obj;
        if (!this.f42558b.equals(kVar.f42558b) || !C20975x0.m49118e(this.f42559c, kVar.f42559c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42558b), C17884p.m44335F(this.f42559c));
    }
}
