package p275u9;

import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p325y9.C7348a;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: u9.a */
public final class C6728a implements C19449c<C7348a> {

    /* renamed from: a */
    public static final C6728a f20825a = new C6728a();

    /* renamed from: b */
    public static final C19448b f20826b;

    /* renamed from: c */
    public static final C19448b f20827c;

    /* renamed from: d */
    public static final C19448b f20828d;

    /* renamed from: e */
    public static final C19448b f20829e;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f20826b = new C19448b("window", C16530d.m42017j(hashMap));
        C14455a aVar2 = new C14455a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f20827c = new C19448b("logSourceMetrics", C16530d.m42017j(hashMap2));
        C14455a aVar3 = new C14455a(3, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(aVar3.annotationType(), aVar3);
        f20828d = new C19448b("globalMetrics", C16530d.m42017j(hashMap3));
        C14455a aVar4 = new C14455a(4, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(aVar4.annotationType(), aVar4);
        f20829e = new C19448b("appNamespace", C16530d.m42017j(hashMap4));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        C7348a aVar = (C7348a) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(f20826b, (Object) aVar.f22569a);
        dVar.add(f20827c, (Object) aVar.f22570b);
        dVar.add(f20828d, (Object) aVar.f22571c);
        dVar.add(f20829e, (Object) aVar.f22572d);
    }
}
