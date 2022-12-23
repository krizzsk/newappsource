package x10;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import c00.C13733n;
import p025b6.C1492e;
import p060d6.C4397l;
import p208p6.C6095c;
import v10.C20065a;
import z10.C20802f;

/* renamed from: x10.b */
public final class C20444b implements C6095c<C20065a, BitmapDrawable> {

    /* renamed from: b */
    public final C20445a f51786b;

    /* renamed from: x10.b$a */
    public static class C20445a implements C13733n<C20065a, BitmapDrawable> {

        /* renamed from: b */
        public final Resources f51787b;

        public C20445a(Resources resources) {
            this.f51787b = resources;
        }

        public final Object convert(Object obj) throws Exception {
            return new BitmapDrawable(this.f51787b, ((C20065a) obj).f50909a);
        }
    }

    public C20444b(Resources resources) {
        this.f51786b = new C20445a(resources);
    }

    /* renamed from: h */
    public final C4397l<BitmapDrawable> mo20049h(C4397l<C20065a> lVar, C1492e eVar) {
        Class<BitmapDrawable> cls = BitmapDrawable.class;
        C20445a aVar = this.f51786b;
        if (lVar == null) {
            return null;
        }
        return new C20802f(lVar, cls, aVar);
    }
}
