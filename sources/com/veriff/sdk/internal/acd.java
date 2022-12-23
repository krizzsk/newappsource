package com.veriff.sdk.internal;

import bf0.C21050d;
import com.veriff.sdk.internal.aci;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

final class acd extends aci.C21342a {

    /* renamed from: a */
    private boolean f53613a = true;

    /* renamed from: com.veriff.sdk.internal.acd$a */
    public static final class C21330a implements aci<C22759yv, C22759yv> {

        /* renamed from: a */
        public static final C21330a f53614a = new C21330a();

        /* renamed from: a */
        public C22759yv mo53996a(C22759yv yvVar) throws IOException {
            try {
                return acz.m50830a(yvVar);
            } finally {
                yvVar.close();
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acd$b */
    public static final class C21331b implements aci<C22754yt, C22754yt> {

        /* renamed from: a */
        public static final C21331b f53615a = new C21331b();

        /* renamed from: a */
        public C22754yt mo53996a(C22754yt ytVar) {
            return ytVar;
        }
    }

    /* renamed from: com.veriff.sdk.internal.acd$c */
    public static final class C21332c implements aci<C22759yv, C22759yv> {

        /* renamed from: a */
        public static final C21332c f53616a = new C21332c();

        /* renamed from: a */
        public C22759yv mo53996a(C22759yv yvVar) {
            return yvVar;
        }
    }

    /* renamed from: com.veriff.sdk.internal.acd$d */
    public static final class C21333d implements aci<Object, String> {

        /* renamed from: a */
        public static final C21333d f53617a = new C21333d();

        /* renamed from: b */
        public String mo53996a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: com.veriff.sdk.internal.acd$e */
    public static final class C21334e implements aci<C22759yv, C21050d> {

        /* renamed from: a */
        public static final C21334e f53618a = new C21334e();

        /* renamed from: a */
        public C21050d mo53996a(C22759yv yvVar) {
            yvVar.close();
            return C21050d.f52856a;
        }
    }

    /* renamed from: com.veriff.sdk.internal.acd$f */
    public static final class C21335f implements aci<C22759yv, Void> {

        /* renamed from: a */
        public static final C21335f f53619a = new C21335f();

        /* renamed from: a */
        public Void mo53996a(C22759yv yvVar) {
            yvVar.close();
            return null;
        }
    }

    /* renamed from: a */
    public aci<C22759yv, ?> mo53993a(Type type, Annotation[] annotationArr, acv acv) {
        if (type == C22759yv.class) {
            if (acz.m50843a(annotationArr, (Class<? extends Annotation>) adz.class)) {
                return C21332c.f53616a;
            }
            return C21330a.f53614a;
        } else if (type == Void.class) {
            return C21335f.f53619a;
        } else {
            if (!this.f53613a || type != C21050d.class) {
                return null;
            }
            try {
                return C21334e.f53618a;
            } catch (NoClassDefFoundError unused) {
                this.f53613a = false;
                return null;
            }
        }
    }

    /* renamed from: a */
    public aci<?, C22754yt> mo53994a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, acv acv) {
        if (C22754yt.class.isAssignableFrom(acz.m50831a(type))) {
            return C21331b.f53615a;
        }
        return null;
    }
}
