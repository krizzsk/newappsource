package p275u9;

import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p325y9.C7352d;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: u9.f */
public final class C6733f implements C19449c<C7352d> {

    /* renamed from: a */
    public static final C6733f f20840a = new C6733f();

    /* renamed from: b */
    public static final C19448b f20841b;

    /* renamed from: c */
    public static final C19448b f20842c;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f20841b = new C19448b("currentCacheSizeBytes", C16530d.m42017j(hashMap));
        C14455a aVar2 = new C14455a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f20842c = new C19448b("maxCacheSizeBytes", C16530d.m42017j(hashMap2));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        C7352d dVar = (C7352d) obj;
        C19450d dVar2 = (C19450d) obj2;
        dVar2.add(f20841b, dVar.f22581a);
        dVar2.add(f20842c, dVar.f22582b);
    }
}
