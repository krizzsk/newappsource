package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.q2 */
public abstract class C14309q2 {
    /* renamed from: a */
    public abstract int mo42830a();

    /* renamed from: b */
    public abstract long mo42831b();

    /* renamed from: c */
    public abstract String mo42832c();

    /* renamed from: d */
    public abstract boolean mo42833d();

    /* renamed from: e */
    public abstract boolean mo42834e();

    /* renamed from: f */
    public abstract byte[] mo42836f();

    /* renamed from: g */
    public final boolean mo42882g() {
        if (mo42832c() == null) {
            return false;
        }
        return mo42832c().endsWith("/");
    }
}
