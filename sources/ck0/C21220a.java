package ck0;

import ck0.C21230e;
import ek0.C23339w;
import hi0.C23521b0;
import hi0.C23533d0;
import hi0.C23536e0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import si0.C24898f;

/* renamed from: ck0.a */
public final class C21220a extends C21230e.C21231a {

    /* renamed from: ck0.a$a */
    public static final class C21221a implements C21230e<C23536e0, C23536e0> {

        /* renamed from: a */
        public static final C21221a f53167a = new C21221a();

        public final Object convert(Object obj) throws IOException {
            C23536e0 e0Var = (C23536e0) obj;
            try {
                C24898f fVar = new C24898f();
                e0Var.mo53600t().mo61398W1(fVar);
                return new C23533d0(e0Var.mo53599q(), e0Var.mo53598i(), fVar);
            } finally {
                e0Var.close();
            }
        }
    }

    /* renamed from: ck0.a$b */
    public static final class C21222b implements C21230e<C23521b0, C23521b0> {

        /* renamed from: a */
        public static final C21222b f53168a = new C21222b();

        public final Object convert(Object obj) throws IOException {
            return (C23521b0) obj;
        }
    }

    /* renamed from: ck0.a$c */
    public static final class C21223c implements C21230e<C23536e0, C23536e0> {

        /* renamed from: a */
        public static final C21223c f53169a = new C21223c();

        public final Object convert(Object obj) throws IOException {
            return (C23536e0) obj;
        }
    }

    /* renamed from: ck0.a$d */
    public static final class C21224d implements C21230e<Object, String> {
    }

    /* renamed from: ck0.a$e */
    public static final class C21225e implements C21230e<C23536e0, Void> {

        /* renamed from: a */
        public static final C21225e f53170a = new C21225e();

        public final Object convert(Object obj) throws IOException {
            ((C23536e0) obj).close();
            return null;
        }
    }

    /* renamed from: a */
    public final C21230e mo53581a(Type type) {
        if (C23521b0.class.isAssignableFrom(C21273u.m49949e(type))) {
            return C21222b.f53168a;
        }
        return null;
    }

    /* renamed from: b */
    public final C21230e mo53582b(Type type, Annotation[] annotationArr) {
        if (type == C23536e0.class) {
            Class<C23339w> cls = C23339w.class;
            int length = annotationArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (cls.isInstance(annotationArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return C21223c.f53169a;
            }
            return C21221a.f53167a;
        } else if (type == Void.class) {
            return C21225e.f53170a;
        } else {
            return null;
        }
    }
}
