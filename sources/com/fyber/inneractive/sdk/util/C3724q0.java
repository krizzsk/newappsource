package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.q0 */
public class C3724q0 {

    /* renamed from: a */
    public int f12915a;

    /* renamed from: b */
    public int f12916b;

    public C3724q0(int i, int i2) {
        this.f12915a = i;
        this.f12916b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3724q0.class != obj.getClass()) {
            return false;
        }
        C3724q0 q0Var = (C3724q0) obj;
        if (this.f12915a == q0Var.f12915a && this.f12916b == q0Var.f12916b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f12915a * 31) + this.f12916b;
    }
}
