package com.veriff.sdk.internal.permission;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/permission/PermissionResult;", "", "permission", "Lcom/veriff/sdk/internal/permission/Permission;", "isGranted", "", "(Lcom/veriff/sdk/internal/permission/Permission;Z)V", "()Z", "getPermission", "()Lcom/veriff/sdk/internal/permission/Permission;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.permission.d */
public final class C22256d {

    /* renamed from: a */
    private final C22254c f56118a;

    /* renamed from: b */
    private final boolean f56119b;

    public C22256d(C22254c cVar, boolean z) {
        C24362h.m61211f(cVar, "permission");
        this.f56118a = cVar;
        this.f56119b = z;
    }

    /* renamed from: a */
    public final C22254c mo56209a() {
        return this.f56118a;
    }

    /* renamed from: b */
    public final boolean mo56210b() {
        return this.f56119b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22256d)) {
            return false;
        }
        C22256d dVar = (C22256d) obj;
        return C24362h.m61206a(this.f56118a, dVar.f56118a) && this.f56119b == dVar.f56119b;
    }

    public int hashCode() {
        C22254c cVar = this.f56118a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.f56119b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("PermissionResult(permission=");
        k.append(this.f56118a);
        k.append(", isGranted=");
        return C25541a.m63885p(k, this.f56119b, ")");
    }
}
