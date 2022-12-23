package v10;

import android.graphics.Bitmap;
import android.graphics.PointF;
import p060d6.C4393i;
import p060d6.C4397l;

/* renamed from: v10.c */
public final class C20067c implements C4397l<C20065a>, C4393i {

    /* renamed from: b */
    public final C4397l<Bitmap> f50912b;

    /* renamed from: c */
    public final C20065a f50913c;

    public C20067c(C4397l<Bitmap> lVar, PointF pointF) {
        this.f50912b = lVar;
        this.f50913c = new C20065a(lVar.get(), pointF);
    }

    /* renamed from: c */
    public static C20067c m47570c(C4397l<Bitmap> lVar, PointF pointF) {
        if (lVar == null) {
            return null;
        }
        return new C20067c(lVar, pointF);
    }

    /* renamed from: a */
    public final void mo10979a() {
        this.f50912b.mo10979a();
    }

    /* renamed from: b */
    public final Class<C20065a> mo10980b() {
        return C20065a.class;
    }

    /* renamed from: e */
    public final int mo10983e() {
        int i;
        if (this.f50913c.f50910b != null) {
            i = 8;
        } else {
            i = 0;
        }
        return this.f50912b.mo10983e() + i;
    }

    public final Object get() {
        return this.f50913c;
    }

    public final void initialize() {
        C4397l<Bitmap> lVar = this.f50912b;
        if (lVar instanceof C4393i) {
            ((C4393i) lVar).initialize();
        }
    }
}
