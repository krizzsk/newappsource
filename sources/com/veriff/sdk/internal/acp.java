package com.veriff.sdk.internal;

import com.veriff.sdk.internal.aci;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p988j$.util.Optional;

@IgnoreJRERequirement
final class acp extends aci.C21342a {

    /* renamed from: a */
    public static final aci.C21342a f53671a = new acp();

    @IgnoreJRERequirement
    /* renamed from: com.veriff.sdk.internal.acp$a */
    public static final class C21361a<T> implements aci<C22759yv, Optional<T>> {

        /* renamed from: a */
        public final aci<C22759yv, T> f53672a;

        public C21361a(aci<C22759yv, T> aci) {
            this.f53672a = aci;
        }

        /* renamed from: a */
        public Optional<T> mo53996a(C22759yv yvVar) throws IOException {
            return Optional.ofNullable(this.f53672a.mo53996a(yvVar));
        }
    }

    /* renamed from: a */
    public aci<C22759yv, ?> mo53993a(Type type, Annotation[] annotationArr, acv acv) {
        if (aci.C21342a.m50669a(type) != Optional.class) {
            return null;
        }
        return new C21361a(acv.mo54084b(aci.C21342a.m50670a(0, (ParameterizedType) type), annotationArr));
    }
}
