package p861ve;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.C14456b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p789se.C19449c;
import p789se.C19451e;
import p813te.C19669b;

/* renamed from: ve.e */
public final class C20114e {

    /* renamed from: a */
    public final Map<Class<?>, C19449c<?>> f51028a;

    /* renamed from: b */
    public final Map<Class<?>, C19451e<?>> f51029b;

    /* renamed from: c */
    public final C19449c<Object> f51030c;

    /* renamed from: ve.e$a */
    public static final class C20115a implements C19669b<C20115a> {

        /* renamed from: a */
        public static final C20113d f51031a = new C20113d();
    }

    public C20114e(HashMap hashMap, HashMap hashMap2, C20113d dVar) {
        this.f51028a = hashMap;
        this.f51029b = hashMap2;
        this.f51030c = dVar;
    }

    /* renamed from: a */
    public final void mo52353a(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        Map<Class<?>, C19449c<?>> map = this.f51028a;
        C14456b bVar = new C14456b(byteArrayOutputStream, map, this.f51029b, this.f51030c);
        if (obj != null) {
            C19449c cVar = map.get(obj.getClass());
            if (cVar != null) {
                cVar.encode(obj, bVar);
                return;
            }
            StringBuilder k = C13555b.m33972k("No encoder for ");
            k.append(obj.getClass());
            throw new EncodingException(k.toString());
        }
    }
}
