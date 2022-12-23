package x10;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import c00.C13733n;
import p025b6.C1492e;
import p060d6.C4397l;
import p208p6.C6095c;
import v10.C20065a;
import w10.C20268a;
import z10.C20802f;

/* renamed from: x10.a */
public final class C20442a implements C6095c<C20065a, C20268a> {

    /* renamed from: b */
    public final C20443a f51784b;

    /* renamed from: x10.a$a */
    public static class C20443a implements C13733n<C20065a, C20268a> {

        /* renamed from: b */
        public final Resources f51785b;

        public C20443a(Resources resources) {
            this.f51785b = resources;
        }

        public final Object convert(Object obj) throws Exception {
            C20065a aVar = (C20065a) obj;
            return new C20268a(new BitmapDrawable(this.f51785b, aVar.f50909a), aVar.f50910b);
        }
    }

    public C20442a(Resources resources) {
        this.f51784b = new C20443a(resources);
    }

    /* renamed from: h */
    public final C4397l<C20268a> mo20049h(C4397l<C20065a> lVar, C1492e eVar) {
        Class<C20268a> cls = C20268a.class;
        C20443a aVar = this.f51784b;
        if (lVar == null) {
            return null;
        }
        return new C20802f(lVar, cls, aVar);
    }
}
