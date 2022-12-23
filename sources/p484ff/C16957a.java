package p484ff;

import com.google.firebase.encoders.proto.C14455a;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.io.IOException;
import java.util.HashMap;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;

/* renamed from: ff.a */
public final class C16957a implements C19449c<MessagingClientEvent> {

    /* renamed from: a */
    public static final C16957a f43998a = new C16957a();

    /* renamed from: b */
    public static final C19448b f43999b;

    /* renamed from: c */
    public static final C19448b f44000c;

    /* renamed from: d */
    public static final C19448b f44001d;

    /* renamed from: e */
    public static final C19448b f44002e;

    /* renamed from: f */
    public static final C19448b f44003f;

    /* renamed from: g */
    public static final C19448b f44004g;

    /* renamed from: h */
    public static final C19448b f44005h;

    /* renamed from: i */
    public static final C19448b f44006i;

    /* renamed from: j */
    public static final C19448b f44007j;

    /* renamed from: k */
    public static final C19448b f44008k;

    /* renamed from: l */
    public static final C19448b f44009l;

    /* renamed from: m */
    public static final C19448b f44010m;

    /* renamed from: n */
    public static final C19448b f44011n;

    /* renamed from: o */
    public static final C19448b f44012o;

    /* renamed from: p */
    public static final C19448b f44013p;

    static {
        C14455a aVar = new C14455a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f43999b = new C19448b("projectNumber", C16530d.m42017j(hashMap));
        C14455a aVar2 = new C14455a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f44000c = new C19448b("messageId", C16530d.m42017j(hashMap2));
        C14455a aVar3 = new C14455a(3, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(aVar3.annotationType(), aVar3);
        f44001d = new C19448b("instanceId", C16530d.m42017j(hashMap3));
        C14455a aVar4 = new C14455a(4, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(aVar4.annotationType(), aVar4);
        f44002e = new C19448b("messageType", C16530d.m42017j(hashMap4));
        C14455a aVar5 = new C14455a(5, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(aVar5.annotationType(), aVar5);
        f44003f = new C19448b("sdkPlatform", C16530d.m42017j(hashMap5));
        C14455a aVar6 = new C14455a(6, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(aVar6.annotationType(), aVar6);
        f44004g = new C19448b("packageName", C16530d.m42017j(hashMap6));
        C14455a aVar7 = new C14455a(7, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(aVar7.annotationType(), aVar7);
        f44005h = new C19448b("collapseKey", C16530d.m42017j(hashMap7));
        C14455a aVar8 = new C14455a(8, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(aVar8.annotationType(), aVar8);
        f44006i = new C19448b("priority", C16530d.m42017j(hashMap8));
        C14455a aVar9 = new C14455a(9, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(aVar9.annotationType(), aVar9);
        f44007j = new C19448b("ttl", C16530d.m42017j(hashMap9));
        C14455a aVar10 = new C14455a(10, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(aVar10.annotationType(), aVar10);
        f44008k = new C19448b("topic", C16530d.m42017j(hashMap10));
        C14455a aVar11 = new C14455a(11, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(aVar11.annotationType(), aVar11);
        f44009l = new C19448b("bulkId", C16530d.m42017j(hashMap11));
        C14455a aVar12 = new C14455a(12, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(aVar12.annotationType(), aVar12);
        f44010m = new C19448b("event", C16530d.m42017j(hashMap12));
        C14455a aVar13 = new C14455a(13, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(aVar13.annotationType(), aVar13);
        f44011n = new C19448b("analyticsLabel", C16530d.m42017j(hashMap13));
        C14455a aVar14 = new C14455a(14, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(aVar14.annotationType(), aVar14);
        f44012o = new C19448b("campaignId", C16530d.m42017j(hashMap14));
        C14455a aVar15 = new C14455a(15, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap15 = new HashMap();
        hashMap15.put(aVar15.annotationType(), aVar15);
        f44013p = new C19448b("composerLabel", C16530d.m42017j(hashMap15));
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        C19450d dVar = (C19450d) obj2;
        dVar.add(f43999b, messagingClientEvent.f36603a);
        dVar.add(f44000c, (Object) messagingClientEvent.f36604b);
        dVar.add(f44001d, (Object) messagingClientEvent.f36605c);
        dVar.add(f44002e, (Object) messagingClientEvent.f36606d);
        dVar.add(f44003f, (Object) messagingClientEvent.f36607e);
        dVar.add(f44004g, (Object) messagingClientEvent.f36608f);
        dVar.add(f44005h, (Object) messagingClientEvent.f36609g);
        dVar.add(f44006i, messagingClientEvent.f36610h);
        dVar.add(f44007j, messagingClientEvent.f36611i);
        dVar.add(f44008k, (Object) messagingClientEvent.f36612j);
        dVar.add(f44009l, messagingClientEvent.f36613k);
        dVar.add(f44010m, (Object) messagingClientEvent.f36614l);
        dVar.add(f44011n, (Object) messagingClientEvent.f36615m);
        dVar.add(f44012o, messagingClientEvent.f36616n);
        dVar.add(f44013p, (Object) messagingClientEvent.f36617o);
    }
}
