package com.google.android.datatransport.cct.internal;

import com.appsflyer.ServerParameters;
import com.usebutton.sdk.internal.events.Events;
import java.io.IOException;
import p263t9.C6607a;
import p263t9.C6608b;
import p263t9.C6609c;
import p263t9.C6610d;
import p263t9.C6612e;
import p263t9.C6614g;
import p263t9.C6615h;
import p263t9.C6617i;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;
import p813te.C19668a;
import p813te.C19669b;

/* renamed from: com.google.android.datatransport.cct.internal.a */
public final class C3856a implements C19668a {

    /* renamed from: a */
    public static final C3856a f13343a = new C3856a();

    /* renamed from: com.google.android.datatransport.cct.internal.a$a */
    public static final class C3857a implements C19449c<C6607a> {

        /* renamed from: a */
        public static final C3857a f13344a = new C3857a();

        /* renamed from: b */
        public static final C19448b f13345b = C19448b.m46849b("sdkVersion");

        /* renamed from: c */
        public static final C19448b f13346c = C19448b.m46849b(ServerParameters.MODEL);

        /* renamed from: d */
        public static final C19448b f13347d = C19448b.m46849b("hardware");

        /* renamed from: e */
        public static final C19448b f13348e = C19448b.m46849b(ServerParameters.DEVICE_KEY);

        /* renamed from: f */
        public static final C19448b f13349f = C19448b.m46849b("product");

        /* renamed from: g */
        public static final C19448b f13350g = C19448b.m46849b("osBuild");

        /* renamed from: h */
        public static final C19448b f13351h = C19448b.m46849b("manufacturer");

        /* renamed from: i */
        public static final C19448b f13352i = C19448b.m46849b(Events.PROPERTY_FINGERPRINT);

        /* renamed from: j */
        public static final C19448b f13353j = C19448b.m46849b("locale");

        /* renamed from: k */
        public static final C19448b f13354k = C19448b.m46849b(ServerParameters.COUNTRY);

        /* renamed from: l */
        public static final C19448b f13355l = C19448b.m46849b("mccMnc");

        /* renamed from: m */
        public static final C19448b f13356m = C19448b.m46849b("applicationBuild");

        public final void encode(Object obj, Object obj2) throws IOException {
            C6607a aVar = (C6607a) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f13345b, (Object) aVar.mo22767l());
            dVar.add(f13346c, (Object) aVar.mo22764i());
            dVar.add(f13347d, (Object) aVar.mo22760e());
            dVar.add(f13348e, (Object) aVar.mo22758c());
            dVar.add(f13349f, (Object) aVar.mo22766k());
            dVar.add(f13350g, (Object) aVar.mo22765j());
            dVar.add(f13351h, (Object) aVar.mo22762g());
            dVar.add(f13352i, (Object) aVar.mo22759d());
            dVar.add(f13353j, (Object) aVar.mo22761f());
            dVar.add(f13354k, (Object) aVar.mo22757b());
            dVar.add(f13355l, (Object) aVar.mo22763h());
            dVar.add(f13356m, (Object) aVar.mo22756a());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$b */
    public static final class C3858b implements C19449c<C6614g> {

        /* renamed from: a */
        public static final C3858b f13357a = new C3858b();

        /* renamed from: b */
        public static final C19448b f13358b = C19448b.m46849b("logRequest");

        public final void encode(Object obj, Object obj2) throws IOException {
            ((C19450d) obj2).add(f13358b, (Object) ((C6614g) obj).mo22771a());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$c */
    public static final class C3859c implements C19449c<ClientInfo> {

        /* renamed from: a */
        public static final C3859c f13359a = new C3859c();

        /* renamed from: b */
        public static final C19448b f13360b = C19448b.m46849b("clientType");

        /* renamed from: c */
        public static final C19448b f13361c = C19448b.m46849b("androidClientInfo");

        public final void encode(Object obj, Object obj2) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f13360b, (Object) clientInfo.mo15756b());
            dVar.add(f13361c, (Object) clientInfo.mo15755a());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$d */
    public static final class C3860d implements C19449c<C6615h> {

        /* renamed from: a */
        public static final C3860d f13362a = new C3860d();

        /* renamed from: b */
        public static final C19448b f13363b = C19448b.m46849b("eventTimeMs");

        /* renamed from: c */
        public static final C19448b f13364c = C19448b.m46849b("eventCode");

        /* renamed from: d */
        public static final C19448b f13365d = C19448b.m46849b("eventUptimeMs");

        /* renamed from: e */
        public static final C19448b f13366e = C19448b.m46849b("sourceExtension");

        /* renamed from: f */
        public static final C19448b f13367f = C19448b.m46849b("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final C19448b f13368g = C19448b.m46849b("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final C19448b f13369h = C19448b.m46849b("networkConnectionInfo");

        public final void encode(Object obj, Object obj2) throws IOException {
            C6615h hVar = (C6615h) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f13363b, hVar.mo22776b());
            dVar.add(f13364c, (Object) hVar.mo22775a());
            dVar.add(f13365d, hVar.mo22777c());
            dVar.add(f13366e, (Object) hVar.mo22779e());
            dVar.add(f13367f, (Object) hVar.mo22781f());
            dVar.add(f13368g, hVar.mo22782g());
            dVar.add(f13369h, (Object) hVar.mo22778d());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$e */
    public static final class C3861e implements C19449c<C6617i> {

        /* renamed from: a */
        public static final C3861e f13370a = new C3861e();

        /* renamed from: b */
        public static final C19448b f13371b = C19448b.m46849b("requestTimeMs");

        /* renamed from: c */
        public static final C19448b f13372c = C19448b.m46849b("requestUptimeMs");

        /* renamed from: d */
        public static final C19448b f13373d = C19448b.m46849b("clientInfo");

        /* renamed from: e */
        public static final C19448b f13374e = C19448b.m46849b("logSource");

        /* renamed from: f */
        public static final C19448b f13375f = C19448b.m46849b("logSourceName");

        /* renamed from: g */
        public static final C19448b f13376g = C19448b.m46849b("logEvent");

        /* renamed from: h */
        public static final C19448b f13377h = C19448b.m46849b("qosTier");

        public final void encode(Object obj, Object obj2) throws IOException {
            C6617i iVar = (C6617i) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f13371b, iVar.mo22791f());
            dVar.add(f13372c, iVar.mo22792g());
            dVar.add(f13373d, (Object) iVar.mo22785a());
            dVar.add(f13374e, (Object) iVar.mo22787c());
            dVar.add(f13375f, (Object) iVar.mo22788d());
            dVar.add(f13376g, (Object) iVar.mo22786b());
            dVar.add(f13377h, (Object) iVar.mo22789e());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$f */
    public static final class C3862f implements C19449c<NetworkConnectionInfo> {

        /* renamed from: a */
        public static final C3862f f13378a = new C3862f();

        /* renamed from: b */
        public static final C19448b f13379b = C19448b.m46849b("networkType");

        /* renamed from: c */
        public static final C19448b f13380c = C19448b.m46849b("mobileSubtype");

        public final void encode(Object obj, Object obj2) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f13379b, (Object) networkConnectionInfo.mo15758b());
            dVar.add(f13380c, (Object) networkConnectionInfo.mo15757a());
        }
    }

    public final void configure(C19669b<?> bVar) {
        C3858b bVar2 = C3858b.f13357a;
        bVar.registerEncoder(C6614g.class, bVar2);
        bVar.registerEncoder(C6609c.class, bVar2);
        C3861e eVar = C3861e.f13370a;
        bVar.registerEncoder(C6617i.class, eVar);
        bVar.registerEncoder(C6612e.class, eVar);
        C3859c cVar = C3859c.f13359a;
        bVar.registerEncoder(ClientInfo.class, cVar);
        bVar.registerEncoder(C3863b.class, cVar);
        C3857a aVar = C3857a.f13344a;
        bVar.registerEncoder(C6607a.class, aVar);
        bVar.registerEncoder(C6608b.class, aVar);
        C3860d dVar = C3860d.f13362a;
        bVar.registerEncoder(C6615h.class, dVar);
        bVar.registerEncoder(C6610d.class, dVar);
        C3862f fVar = C3862f.f13378a;
        bVar.registerEncoder(NetworkConnectionInfo.class, fVar);
        bVar.registerEncoder(C3864c.class, fVar);
    }
}
