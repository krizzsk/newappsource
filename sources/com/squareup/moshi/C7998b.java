package com.squareup.moshi;

import com.squareup.moshi.C7995a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import nb0.C12947k;

/* renamed from: com.squareup.moshi.b */
public final class C7998b extends C7995a.C7997b {
    public C7998b(Type type, Set set, Object obj, Method method, int i) {
        super(type, set, obj, method, i, 2, true);
    }

    /* renamed from: d */
    public final void mo25043d(C12947k kVar, Object obj) throws IOException, InvocationTargetException {
        C8011k<?>[] kVarArr = this.f24240f;
        Object[] objArr = new Object[(kVarArr.length + 2)];
        objArr[0] = kVar;
        objArr[1] = obj;
        System.arraycopy(kVarArr, 0, objArr, 2, kVarArr.length);
        try {
            this.f24238d.invoke(this.f24237c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
