package com.moovit.app.ads;

import android.os.Parcelable;
import android.util.SparseArray;
import p583jk.C17884p;

/* renamed from: com.moovit.app.ads.h */
public final class C14741h {

    /* renamed from: a */
    public final SparseArray<Object> f37521a = new SparseArray<>();

    /* renamed from: a */
    public final void mo44745a(int i, Parcelable parcelable) {
        this.f37521a.append(i, parcelable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14741h)) {
            return false;
        }
        return this.f37521a.equals(((C14741h) obj).f37521a);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f37521a);
    }
}
