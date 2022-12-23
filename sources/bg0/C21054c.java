package bg0;

import jh0.C23734h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import mf0.C24362h;

/* renamed from: bg0.c */
public interface C21054c {

    /* renamed from: bg0.c$a */
    public static final class C21055a implements C21054c {

        /* renamed from: a */
        public static final C21055a f52858a = new C21055a();

        /* renamed from: a */
        public final boolean mo53183a(DeserializedClassDescriptor deserializedClassDescriptor, C23734h hVar) {
            C24362h.m61211f(deserializedClassDescriptor, "classDescriptor");
            return true;
        }
    }

    /* renamed from: bg0.c$b */
    public static final class C21056b implements C21054c {

        /* renamed from: a */
        public static final C21056b f52859a = new C21056b();

        /* renamed from: a */
        public final boolean mo53183a(DeserializedClassDescriptor deserializedClassDescriptor, C23734h hVar) {
            C24362h.m61211f(deserializedClassDescriptor, "classDescriptor");
            return !hVar.getAnnotations().mo53070b1(C21057d.f52860a);
        }
    }

    /* renamed from: a */
    boolean mo53183a(DeserializedClassDescriptor deserializedClassDescriptor, C23734h hVar);
}
