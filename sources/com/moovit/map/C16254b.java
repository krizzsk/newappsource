package com.moovit.map;

import com.appboy.support.ValidationUtils;
import com.moovit.map.C16273d;
import p583jk.C17884p;
import v10.C20065a;

/* renamed from: com.moovit.map.b */
public final class C16254b extends C16273d {

    /* renamed from: b */
    public final C20065a f42466b;

    /* renamed from: c */
    public final int f42467c = ValidationUtils.APPBOY_STRING_MAX_LENGTH;

    public C16254b(C20065a aVar) {
        this.f42466b = aVar;
    }

    /* renamed from: b */
    public final Object mo48602b(C16273d.C16274a aVar, Boolean bool) {
        return aVar.mo48760c(bool);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16254b)) {
            return false;
        }
        C16254b bVar = (C16254b) obj;
        if (!this.f42466b.equals(bVar.f42466b) || this.f42467c != bVar.f42467c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42466b), this.f42467c);
    }
}
