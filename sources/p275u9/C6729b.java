package p275u9;

import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p325y9.C7350b;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: u9.b */
public final class C6729b implements C19449c<C7350b> {

    /* renamed from: a */
    public static final C6729b f20830a = new C6729b();

    /* renamed from: b */
    public static final C19448b f20831b;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f20831b = new C19448b("storageMetrics", C16530d.m42017j(hashMap));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        ((C19450d) obj2).add(f20831b, (Object) ((C7350b) obj).f22577a);
    }
}
