package com.squareup.moshi;

import com.squareup.moshi.C7995a;
import com.squareup.moshi.C8011k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import nb0.C12949m;

/* renamed from: com.squareup.moshi.e */
public final class C8001e extends C7995a.C7997b {

    /* renamed from: h */
    public C8011k<Object> f24247h;

    /* renamed from: i */
    public final /* synthetic */ Type[] f24248i;

    /* renamed from: j */
    public final /* synthetic */ Type f24249j;

    /* renamed from: k */
    public final /* synthetic */ Set f24250k;

    /* renamed from: l */
    public final /* synthetic */ Set f24251l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8001e(Type type, Set set, Object obj, Method method, int i, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i, 1, z);
        this.f24248i = typeArr;
        this.f24249j = type2;
        this.f24250k = set2;
        this.f24251l = set3;
    }

    /* renamed from: a */
    public final void mo25040a(C8017o oVar, C8011k.C8012a aVar) {
        C8011k<Object> kVar;
        super.mo25040a(oVar, aVar);
        if (!C12949m.m32788b(this.f24248i[0], this.f24249j) || !this.f24250k.equals(this.f24251l)) {
            kVar = oVar.mo25082c(this.f24248i[0], this.f24250k, (String) null);
        } else {
            kVar = oVar.mo25083d(aVar, this.f24248i[0], this.f24250k);
        }
        this.f24247h = kVar;
    }

    /* renamed from: b */
    public final Object mo25041b(JsonReader jsonReader) throws IOException, InvocationTargetException {
        return mo25042c(this.f24247h.mo11093a(jsonReader));
    }
}
