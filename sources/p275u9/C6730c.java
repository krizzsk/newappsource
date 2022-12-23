package p275u9;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: u9.c */
public final class C6730c implements C19449c<LogEventDropped> {

    /* renamed from: a */
    public static final C6730c f20832a = new C6730c();

    /* renamed from: b */
    public static final C19448b f20833b;

    /* renamed from: c */
    public static final C19448b f20834c;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f20833b = new C19448b("eventsDroppedCount", C16530d.m42017j(hashMap));
        C14455a aVar2 = new C14455a(3, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f20834c = new C19448b("reason", C16530d.m42017j(hashMap2));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(f20833b, logEventDropped.f13388a);
        dVar.add(f20834c, (Object) logEventDropped.f13389b);
    }
}
