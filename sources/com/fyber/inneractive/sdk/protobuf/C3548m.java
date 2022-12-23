package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.m */
public final class C3548m implements C3599u1 {

    /* renamed from: a */
    public final C3540l f12518a;

    public C3548m(C3540l lVar) {
        C3540l lVar2 = (C3540l) C3609z.m9638a(lVar, "output");
        this.f12518a = lVar2;
        lVar2.f12509a = this;
    }

    /* renamed from: a */
    public void mo15099a(int i, float f) throws IOException {
        C3540l lVar = this.f12518a;
        lVar.getClass();
        lVar.mo15072g(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public void mo15104b(int i, Object obj, C3498f1 f1Var) throws IOException {
        this.f12518a.mo15062b(i, (C3564q0) obj, f1Var);
    }

    /* renamed from: a */
    public void mo15098a(int i, double d) throws IOException {
        C3540l lVar = this.f12518a;
        lVar.getClass();
        lVar.mo15070f(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public void mo15100a(int i, int i2) throws IOException {
        this.f12518a.mo15076j(i, C3540l.m9244d(i2));
    }

    /* renamed from: a */
    public void mo15101a(int i, long j) throws IOException {
        this.f12518a.mo15073g(i, C3540l.m9240b(j));
    }

    /* renamed from: a */
    public void mo15103a(int i, Object obj, C3498f1 f1Var) throws IOException {
        C3540l lVar = this.f12518a;
        lVar.mo15075i(i, 3);
        f1Var.mo14892a((C3564q0) obj, (C3599u1) lVar.f12509a);
        lVar.mo15075i(i, 4);
    }

    /* renamed from: a */
    public final void mo15102a(int i, Object obj) throws IOException {
        if (obj instanceof C3508i) {
            this.f12518a.mo15065c(i, (C3508i) obj);
        } else {
            this.f12518a.mo15059a(i, (C3564q0) obj);
        }
    }
}
