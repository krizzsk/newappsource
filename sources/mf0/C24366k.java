package mf0;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import sf0.C24855b;
import sf0.C24857d;
import sf0.C24858e;
import sf0.C24859f;
import sf0.C24861g;
import sf0.C24862h;
import sf0.C24864i;

/* renamed from: mf0.k */
public class C24366k {
    /* renamed from: a */
    public C24858e mo59363a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: b */
    public C24855b mo59364b(Class cls) {
        return new C24358d(cls);
    }

    /* renamed from: c */
    public C24857d mo59365c(Class cls, String str) {
        return new C24364i(cls, str);
    }

    /* renamed from: d */
    public C24859f mo59366d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* renamed from: e */
    public C24861g mo59367e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: f */
    public C24862h mo59368f(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: g */
    public C24864i mo59369g(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* renamed from: h */
    public String mo59370h(Lambda lambda) {
        return mo59371i(lambda);
    }

    /* renamed from: i */
    public String mo59371i(C24360f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
