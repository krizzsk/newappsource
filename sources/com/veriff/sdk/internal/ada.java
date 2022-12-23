package com.veriff.sdk.internal;

import com.veriff.sdk.internal.aci;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class ada extends aci.C21342a {

    /* renamed from: a */
    private final C21450bi f53809a;

    /* renamed from: b */
    private final boolean f53810b;

    /* renamed from: c */
    private final boolean f53811c;

    /* renamed from: d */
    private final boolean f53812d;

    private ada(C21450bi biVar, boolean z, boolean z2, boolean z3) {
        this.f53809a = biVar;
        this.f53810b = z;
        this.f53811c = z2;
        this.f53812d = z3;
    }

    /* renamed from: a */
    public static ada m50859a(C21450bi biVar) {
        if (biVar != null) {
            return new ada(biVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    /* renamed from: a */
    public aci<C22759yv, ?> mo53993a(Type type, Annotation[] annotationArr, acv acv) {
        C21420av<T> a = this.f53809a.mo54336a(type, m50860a(annotationArr));
        if (this.f53810b) {
            a = a.mo54228e();
        }
        if (this.f53811c) {
            a = a.mo54229f();
        }
        if (this.f53812d) {
            a = a.mo54226c();
        }
        return new adc(a);
    }

    /* renamed from: a */
    public aci<?, C22754yt> mo53994a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, acv acv) {
        C21420av<T> a = this.f53809a.mo54336a(type, m50860a(annotationArr));
        if (this.f53810b) {
            a = a.mo54228e();
        }
        if (this.f53811c) {
            a = a.mo54229f();
        }
        if (this.f53812d) {
            a = a.mo54226c();
        }
        return new adb(a);
    }

    /* renamed from: a */
    private static Set<? extends Annotation> m50860a(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C21428az.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }
}
