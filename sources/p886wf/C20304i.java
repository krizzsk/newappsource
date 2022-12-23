package p886wf;

import p862vf.C20119c;

/* renamed from: wf.i */
public final class C20304i implements C20119c {

    /* renamed from: a */
    public final String f51489a;

    /* renamed from: b */
    public final int f51490b;

    public C20304i(String str, int i) {
        this.f51489a = str;
        this.f51490b = i;
    }

    /* renamed from: a */
    public final String mo52359a() {
        if (this.f51490b == 0) {
            return "";
        }
        String str = this.f51489a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    /* renamed from: b */
    public final long mo52360b() {
        if (this.f51490b == 0) {
            return 0;
        }
        String trim = mo52359a().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "long"}), e);
        }
    }

    /* renamed from: c */
    public final double mo52361c() {
        if (this.f51490b == 0) {
            return 0.0d;
        }
        String trim = mo52359a().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "double"}), e);
        }
    }

    /* renamed from: d */
    public final boolean mo52362d() throws IllegalArgumentException {
        if (this.f51490b == 0) {
            return false;
        }
        String trim = mo52359a().trim();
        if (C20302g.f51480e.matcher(trim).matches()) {
            return true;
        }
        if (C20302g.f51481f.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "boolean"}));
    }

    /* renamed from: e */
    public final int mo52363e() {
        return this.f51490b;
    }
}
