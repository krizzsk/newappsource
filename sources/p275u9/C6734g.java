package p275u9;

import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p325y9.C7353e;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: u9.g */
public final class C6734g implements C19449c<C7353e> {

    /* renamed from: a */
    public static final C6734g f20843a = new C6734g();

    /* renamed from: b */
    public static final C19448b f20844b;

    /* renamed from: c */
    public static final C19448b f20845c;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f20844b = new C19448b("startMs", C16530d.m42017j(hashMap));
        C14455a aVar2 = new C14455a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f20845c = new C19448b("endMs", C16530d.m42017j(hashMap2));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        C7353e eVar = (C7353e) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(f20844b, eVar.f22583a);
        dVar.add(f20845c, eVar.f22584b);
    }
}
