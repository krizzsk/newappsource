package p275u9;

import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p325y9.C7351c;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: u9.d */
public final class C6731d implements C19449c<C7351c> {

    /* renamed from: a */
    public static final C6731d f20835a = new C6731d();

    /* renamed from: b */
    public static final C19448b f20836b;

    /* renamed from: c */
    public static final C19448b f20837c;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f20836b = new C19448b("logSource", C16530d.m42017j(hashMap));
        C14455a aVar2 = new C14455a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f20837c = new C19448b("logEventDropped", C16530d.m42017j(hashMap2));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        C7351c cVar = (C7351c) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(f20836b, (Object) cVar.f22579a);
        dVar.add(f20837c, (Object) cVar.f22580b);
    }
}
