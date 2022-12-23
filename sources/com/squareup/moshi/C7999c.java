package com.squareup.moshi;

import com.squareup.moshi.C7995a;
import com.squareup.moshi.C8011k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import nb0.C12947k;
import nb0.C12949m;

/* renamed from: com.squareup.moshi.c */
public final class C7999c extends C7995a.C7997b {

    /* renamed from: h */
    public C8011k<Object> f24242h;

    /* renamed from: i */
    public final /* synthetic */ Type[] f24243i;

    /* renamed from: j */
    public final /* synthetic */ Type f24244j;

    /* renamed from: k */
    public final /* synthetic */ Set f24245k;

    /* renamed from: l */
    public final /* synthetic */ Set f24246l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7999c(Type type, Set set, Object obj, Method method, int i, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i, 1, z);
        this.f24243i = typeArr;
        this.f24244j = type2;
        this.f24245k = set2;
        this.f24246l = set3;
    }

    /* renamed from: a */
    public final void mo25040a(C8017o oVar, C8011k.C8012a aVar) {
        C8011k<Object> kVar;
        super.mo25040a(oVar, aVar);
        if (!C12949m.m32788b(this.f24243i[0], this.f24244j) || !this.f24245k.equals(this.f24246l)) {
            kVar = oVar.mo25082c(this.f24244j, this.f24246l, (String) null);
        } else {
            kVar = oVar.mo25083d(aVar, this.f24244j, this.f24246l);
        }
        this.f24242h = kVar;
    }

    /* renamed from: d */
    public final void mo25043d(C12947k kVar, Object obj) throws IOException, InvocationTargetException {
        this.f24242h.mo11094e(kVar, mo25042c(obj));
    }
}
