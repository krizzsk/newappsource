package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22713xw;
import com.veriff.sdk.internal.acz;
import ff0.C23349c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class acl<ResponseT, ReturnT> extends acw<ReturnT> {

    /* renamed from: a */
    private final act f53635a;

    /* renamed from: b */
    private final C22713xw.C22714a f53636b;

    /* renamed from: c */
    private final aci<C22759yv, ResponseT> f53637c;

    /* renamed from: com.veriff.sdk.internal.acl$a */
    public static final class C21346a<ResponseT, ReturnT> extends acl<ResponseT, ReturnT> {

        /* renamed from: a */
        private final acf<ResponseT, ReturnT> f53638a;

        public C21346a(act act, C22713xw.C22714a aVar, aci<C22759yv, ResponseT> aci, acf<ResponseT, ReturnT> acf) {
            super(act, aVar, aci);
            this.f53638a = acf;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.veriff.sdk.internal.ace<ResponseT>, com.veriff.sdk.internal.ace] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo54018a(com.veriff.sdk.internal.ace<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                com.veriff.sdk.internal.acf<ResponseT, ReturnT> r2 = r0.f53638a
                java.lang.Object r1 = r2.mo54008b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.acl.C21346a.mo54018a(com.veriff.sdk.internal.ace, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: com.veriff.sdk.internal.acl$b */
    public static final class C21347b<ResponseT> extends acl<ResponseT, Object> {

        /* renamed from: a */
        private final acf<ResponseT, ace<ResponseT>> f53639a;

        /* renamed from: b */
        private final boolean f53640b;

        public C21347b(act act, C22713xw.C22714a aVar, aci<C22759yv, ResponseT> aci, acf<ResponseT, ace<ResponseT>> acf, boolean z) {
            super(act, aVar, aci);
            this.f53639a = acf;
            this.f53640b = z;
        }

        /* renamed from: a */
        public Object mo54018a(ace<ResponseT> ace, Object[] objArr) {
            ace ace2 = (ace) this.f53639a.mo54008b(ace);
            C23349c cVar = objArr[objArr.length - 1];
            try {
                if (this.f53640b) {
                    return acn.m50701b(ace2, cVar);
                }
                return acn.m50699a(ace2, cVar);
            } catch (Exception e) {
                return acn.m50700a(e, (C23349c<?>) cVar);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acl$c */
    public static final class C21348c<ResponseT> extends acl<ResponseT, Object> {

        /* renamed from: a */
        private final acf<ResponseT, ace<ResponseT>> f53641a;

        public C21348c(act act, C22713xw.C22714a aVar, aci<C22759yv, ResponseT> aci, acf<ResponseT, ace<ResponseT>> acf) {
            super(act, aVar, aci);
            this.f53641a = acf;
        }

        /* renamed from: a */
        public Object mo54018a(ace<ResponseT> ace, Object[] objArr) {
            ace ace2 = (ace) this.f53641a.mo54008b(ace);
            C23349c cVar = objArr[objArr.length - 1];
            try {
                return acn.m50702c(ace2, cVar);
            } catch (Exception e) {
                return acn.m50700a(e, (C23349c<?>) cVar);
            }
        }
    }

    public acl(act act, C22713xw.C22714a aVar, aci<C22759yv, ResponseT> aci) {
        this.f53635a = act;
        this.f53636b = aVar;
        this.f53637c = aci;
    }

    /* renamed from: a */
    public static <ResponseT, ReturnT> acl<ResponseT, ReturnT> m50692a(acv acv, Method method, act act) {
        Type type;
        boolean z;
        Class<acu> cls = acu.class;
        boolean z2 = act.f53738b;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type b = acz.m50845b(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (acz.m50831a(b) != cls || !(b instanceof ParameterizedType)) {
                z = false;
            } else {
                b = acz.m50837a(0, (ParameterizedType) b);
                z = true;
            }
            type = new acz.C21386b((Type) null, ace.class, b);
            annotations = acy.m50828a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        acf a = m50690a(acv, method, type, annotations);
        Type a2 = a.mo54007a();
        if (a2 == C22757yu.class) {
            throw acz.m50834a(method, C13555b.m33969h(acz.m50831a(a2), C13555b.m33972k("'"), "' is not a valid response body type. Did you mean ResponseBody?"), new Object[0]);
        } else if (a2 == cls) {
            throw acz.m50834a(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!act.f53737a.equals("HEAD") || Void.class.equals(a2)) {
            aci a3 = m50691a(acv, method, a2);
            C22713xw.C22714a aVar = acv.f53776a;
            if (!z2) {
                return new C21346a(act, aVar, a3, a);
            }
            if (z) {
                return new C21348c(act, aVar, a3, a);
            }
            return new C21347b(act, aVar, a3, a, false);
        } else {
            throw acz.m50834a(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract ReturnT mo54018a(ace<ResponseT> ace, Object[] objArr);

    /* renamed from: a */
    private static <ResponseT, ReturnT> acf<ResponseT, ReturnT> m50690a(acv acv, Method method, Type type, Annotation[] annotationArr) {
        try {
            return acv.mo54078a(type, annotationArr);
        } catch (RuntimeException e) {
            throw acz.m50836a(method, (Throwable) e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: a */
    private static <ResponseT> aci<C22759yv, ResponseT> m50691a(acv acv, Method method, Type type) {
        try {
            return acv.mo54084b(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw acz.m50836a(method, (Throwable) e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: a */
    public final ReturnT mo54019a(Object[] objArr) {
        return mo54018a(new aco(this.f53635a, objArr, this.f53636b, this.f53637c), objArr);
    }
}
