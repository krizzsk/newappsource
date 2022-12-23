package org.simpleframework.xml.transform;

import java.util.Date;
import mj0.C24407m;
import mj0.C24415u;

/* renamed from: org.simpleframework.xml.transform.a */
public final class C24678a<T extends Date> implements C24415u<T> {

    /* renamed from: a */
    public final C24407m<T> f62477a;

    public C24678a(Class<T> cls) throws Exception {
        this.f62477a = new C24407m<>(cls);
    }

    /* renamed from: b */
    public final synchronized T mo60538a(String str) throws Exception {
        Object[] objArr;
        Long valueOf = Long.valueOf(DateType.getDate(str).getTime());
        objArr = new Object[]{valueOf};
        return (Date) this.f62477a.f61767a.newInstance(objArr);
    }
}
