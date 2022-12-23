package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;

/* renamed from: com.google.android.play.core.assetpacks.g0 */
public final class C14267g0 extends C14246b {

    /* renamed from: a */
    public final long f35871a;

    /* renamed from: b */
    public final Map f35872b;

    public C14267g0(long j, HashMap hashMap) {
        this.f35871a = j;
        this.f35872b = hashMap;
    }

    /* renamed from: a */
    public final Map<String, AssetPackState> mo42800a() {
        return this.f35872b;
    }

    /* renamed from: b */
    public final long mo42801b() {
        return this.f35871a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14246b) {
            C14246b bVar = (C14246b) obj;
            if (this.f35871a != bVar.mo42801b() || !this.f35872b.equals(bVar.mo42800a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f35871a;
        return this.f35872b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f35871a;
        String obj = this.f35872b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        return C0016g.m31o(sb, obj, "}");
    }
}
