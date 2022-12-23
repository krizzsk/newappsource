package p484ff;

import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p508gf.C17188a;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: ff.b */
public final class C16959b implements C19449c<C17188a> {

    /* renamed from: a */
    public static final C16959b f44019a = new C16959b();

    /* renamed from: b */
    public static final C19448b f44020b;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f44020b = new C19448b("messagingClientEvent", C16530d.m42017j(hashMap));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        ((C19450d) obj2).add(f44020b, (Object) ((C17188a) obj).f44430a);
    }
}
