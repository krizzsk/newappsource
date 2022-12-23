package p577je;

import com.appboy.support.AppboyFileUtils;
import com.appsflyer.ServerParameters;
import com.appsflyer.share.Constants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import p577je.C17746a0;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;
import p813te.C19668a;
import p813te.C19669b;

/* renamed from: je.a */
public final class C17724a implements C19668a {

    /* renamed from: a */
    public static final C17724a f45474a = new C17724a();

    /* renamed from: je.a$a */
    public static final class C17725a implements C19449c<C17746a0.C17747a> {

        /* renamed from: a */
        public static final C17725a f45475a = new C17725a();

        /* renamed from: b */
        public static final C19448b f45476b = C19448b.m46849b(Constants.URL_MEDIA_SOURCE);

        /* renamed from: c */
        public static final C19448b f45477c = C19448b.m46849b("processName");

        /* renamed from: d */
        public static final C19448b f45478d = C19448b.m46849b("reasonCode");

        /* renamed from: e */
        public static final C19448b f45479e = C19448b.m46849b("importance");

        /* renamed from: f */
        public static final C19448b f45480f = C19448b.m46849b("pss");

        /* renamed from: g */
        public static final C19448b f45481g = C19448b.m46849b("rss");

        /* renamed from: h */
        public static final C19448b f45482h = C19448b.m46849b("timestamp");

        /* renamed from: i */
        public static final C19448b f45483i = C19448b.m46849b("traceFile");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17747a aVar = (C17746a0.C17747a) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45476b, aVar.mo50180b());
            dVar.add(f45477c, (Object) aVar.mo50181c());
            dVar.add(f45478d, aVar.mo50183e());
            dVar.add(f45479e, aVar.mo50179a());
            dVar.add(f45480f, aVar.mo50182d());
            dVar.add(f45481g, aVar.mo50184f());
            dVar.add(f45482h, aVar.mo50185g());
            dVar.add(f45483i, (Object) aVar.mo50186h());
        }
    }

    /* renamed from: je.a$b */
    public static final class C17726b implements C19449c<C17746a0.C17750c> {

        /* renamed from: a */
        public static final C17726b f45484a = new C17726b();

        /* renamed from: b */
        public static final C19448b f45485b = C19448b.m46849b(LinksConfiguration.KEY_KEY);

        /* renamed from: c */
        public static final C19448b f45486c = C19448b.m46849b("value");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17750c cVar = (C17746a0.C17750c) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45485b, (Object) cVar.mo50187a());
            dVar.add(f45486c, (Object) cVar.mo50188b());
        }
    }

    /* renamed from: je.a$c */
    public static final class C17727c implements C19449c<C17746a0> {

        /* renamed from: a */
        public static final C17727c f45487a = new C17727c();

        /* renamed from: b */
        public static final C19448b f45488b = C19448b.m46849b("sdkVersion");

        /* renamed from: c */
        public static final C19448b f45489c = C19448b.m46849b("gmpAppId");

        /* renamed from: d */
        public static final C19448b f45490d = C19448b.m46849b(ServerParameters.PLATFORM);

        /* renamed from: e */
        public static final C19448b f45491e = C19448b.m46849b("installationUuid");

        /* renamed from: f */
        public static final C19448b f45492f = C19448b.m46849b("buildVersion");

        /* renamed from: g */
        public static final C19448b f45493g = C19448b.m46849b("displayVersion");

        /* renamed from: h */
        public static final C19448b f45494h = C19448b.m46849b("session");

        /* renamed from: i */
        public static final C19448b f45495i = C19448b.m46849b("ndkPayload");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0 a0Var = (C17746a0) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45488b, (Object) a0Var.mo50176g());
            dVar.add(f45489c, (Object) a0Var.mo50172c());
            dVar.add(f45490d, a0Var.mo50175f());
            dVar.add(f45491e, (Object) a0Var.mo50173d());
            dVar.add(f45492f, (Object) a0Var.mo50170a());
            dVar.add(f45493g, (Object) a0Var.mo50171b());
            dVar.add(f45494h, (Object) a0Var.mo50177h());
            dVar.add(f45495i, (Object) a0Var.mo50174e());
        }
    }

    /* renamed from: je.a$d */
    public static final class C17728d implements C19449c<C17746a0.C17751d> {

        /* renamed from: a */
        public static final C17728d f45496a = new C17728d();

        /* renamed from: b */
        public static final C19448b f45497b = C19448b.m46849b("files");

        /* renamed from: c */
        public static final C19448b f45498c = C19448b.m46849b("orgId");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17751d dVar = (C17746a0.C17751d) obj;
            C19450d dVar2 = (C19450d) obj2;
            dVar2.add(f45497b, (Object) dVar.mo50189a());
            dVar2.add(f45498c, (Object) dVar.mo50190b());
        }
    }

    /* renamed from: je.a$e */
    public static final class C17729e implements C19449c<C17746a0.C17751d.C17752a> {

        /* renamed from: a */
        public static final C17729e f45499a = new C17729e();

        /* renamed from: b */
        public static final C19448b f45500b = C19448b.m46849b("filename");

        /* renamed from: c */
        public static final C19448b f45501c = C19448b.m46849b("contents");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17751d.C17752a aVar = (C17746a0.C17751d.C17752a) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45500b, (Object) aVar.mo50192b());
            dVar.add(f45501c, (Object) aVar.mo50191a());
        }
    }

    /* renamed from: je.a$f */
    public static final class C17730f implements C19449c<C17746a0.C17753e.C17754a> {

        /* renamed from: a */
        public static final C17730f f45502a = new C17730f();

        /* renamed from: b */
        public static final C19448b f45503b = C19448b.m46849b("identifier");

        /* renamed from: c */
        public static final C19448b f45504c = C19448b.m46849b(MediationMetaData.KEY_VERSION);

        /* renamed from: d */
        public static final C19448b f45505d = C19448b.m46849b("displayVersion");

        /* renamed from: e */
        public static final C19448b f45506e = C19448b.m46849b("organization");

        /* renamed from: f */
        public static final C19448b f45507f = C19448b.m46849b("installationUuid");

        /* renamed from: g */
        public static final C19448b f45508g = C19448b.m46849b("developmentPlatform");

        /* renamed from: h */
        public static final C19448b f45509h = C19448b.m46849b("developmentPlatformVersion");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17754a aVar = (C17746a0.C17753e.C17754a) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45503b, (Object) aVar.mo50208d());
            dVar.add(f45504c, (Object) aVar.mo50211g());
            dVar.add(f45505d, (Object) aVar.mo50207c());
            dVar.add(f45506e, (Object) aVar.mo50210f());
            dVar.add(f45507f, (Object) aVar.mo50209e());
            dVar.add(f45508g, (Object) aVar.mo50205a());
            dVar.add(f45509h, (Object) aVar.mo50206b());
        }
    }

    /* renamed from: je.a$g */
    public static final class C17731g implements C19449c<C17746a0.C17753e.C17754a.C17755a> {

        /* renamed from: a */
        public static final C17731g f45510a = new C17731g();

        /* renamed from: b */
        public static final C19448b f45511b = C19448b.m46849b("clsId");

        public final void encode(Object obj, Object obj2) throws IOException {
            C19448b bVar = f45511b;
            ((C17746a0.C17753e.C17754a.C17755a) obj).mo50212a();
            ((C19450d) obj2).add(bVar, (Object) null);
        }
    }

    /* renamed from: je.a$h */
    public static final class C17732h implements C19449c<C17746a0.C17753e.C17757c> {

        /* renamed from: a */
        public static final C17732h f45512a = new C17732h();

        /* renamed from: b */
        public static final C19448b f45513b = C19448b.m46849b("arch");

        /* renamed from: c */
        public static final C19448b f45514c = C19448b.m46849b(ServerParameters.MODEL);

        /* renamed from: d */
        public static final C19448b f45515d = C19448b.m46849b("cores");

        /* renamed from: e */
        public static final C19448b f45516e = C19448b.m46849b("ram");

        /* renamed from: f */
        public static final C19448b f45517f = C19448b.m46849b("diskSpace");

        /* renamed from: g */
        public static final C19448b f45518g = C19448b.m46849b("simulator");

        /* renamed from: h */
        public static final C19448b f45519h = C19448b.m46849b("state");

        /* renamed from: i */
        public static final C19448b f45520i = C19448b.m46849b("manufacturer");

        /* renamed from: j */
        public static final C19448b f45521j = C19448b.m46849b("modelClass");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17757c cVar = (C17746a0.C17753e.C17757c) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45513b, cVar.mo50213a());
            dVar.add(f45514c, (Object) cVar.mo50217e());
            dVar.add(f45515d, cVar.mo50214b());
            dVar.add(f45516e, cVar.mo50219g());
            dVar.add(f45517f, cVar.mo50215c());
            dVar.add(f45518g, cVar.mo50221i());
            dVar.add(f45519h, cVar.mo50220h());
            dVar.add(f45520i, (Object) cVar.mo50216d());
            dVar.add(f45521j, (Object) cVar.mo50218f());
        }
    }

    /* renamed from: je.a$i */
    public static final class C17733i implements C19449c<C17746a0.C17753e> {

        /* renamed from: a */
        public static final C17733i f45522a = new C17733i();

        /* renamed from: b */
        public static final C19448b f45523b = C19448b.m46849b("generator");

        /* renamed from: c */
        public static final C19448b f45524c = C19448b.m46849b("identifier");

        /* renamed from: d */
        public static final C19448b f45525d = C19448b.m46849b("startedAt");

        /* renamed from: e */
        public static final C19448b f45526e = C19448b.m46849b("endedAt");

        /* renamed from: f */
        public static final C19448b f45527f = C19448b.m46849b("crashed");

        /* renamed from: g */
        public static final C19448b f45528g = C19448b.m46849b("app");

        /* renamed from: h */
        public static final C19448b f45529h = C19448b.m46849b("user");

        /* renamed from: i */
        public static final C19448b f45530i = C19448b.m46849b("os");

        /* renamed from: j */
        public static final C19448b f45531j = C19448b.m46849b(ServerParameters.DEVICE_KEY);

        /* renamed from: k */
        public static final C19448b f45532k = C19448b.m46849b("events");

        /* renamed from: l */
        public static final C19448b f45533l = C19448b.m46849b("generatorType");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e eVar = (C17746a0.C17753e) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45523b, (Object) eVar.mo50197e());
            dVar.add(f45524c, (Object) eVar.mo50199g().getBytes(C17746a0.f45593a));
            dVar.add(f45525d, eVar.mo50201i());
            dVar.add(f45526e, (Object) eVar.mo50195c());
            dVar.add(f45527f, eVar.mo50203k());
            dVar.add(f45528g, (Object) eVar.mo50193a());
            dVar.add(f45529h, (Object) eVar.mo50202j());
            dVar.add(f45530i, (Object) eVar.mo50200h());
            dVar.add(f45531j, (Object) eVar.mo50194b());
            dVar.add(f45532k, (Object) eVar.mo50196d());
            dVar.add(f45533l, eVar.mo50198f());
        }
    }

    /* renamed from: je.a$j */
    public static final class C17734j implements C19449c<C17746a0.C17753e.C17759d.C17760a> {

        /* renamed from: a */
        public static final C17734j f45534a = new C17734j();

        /* renamed from: b */
        public static final C19448b f45535b = C19448b.m46849b("execution");

        /* renamed from: c */
        public static final C19448b f45536c = C19448b.m46849b("customAttributes");

        /* renamed from: d */
        public static final C19448b f45537d = C19448b.m46849b("internalKeys");

        /* renamed from: e */
        public static final C19448b f45538e = C19448b.m46849b(PostInstallNotificationProvider.KEY_BG);

        /* renamed from: f */
        public static final C19448b f45539f = C19448b.m46849b("uiOrientation");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d.C17760a aVar = (C17746a0.C17753e.C17759d.C17760a) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45535b, (Object) aVar.mo50229c());
            dVar.add(f45536c, (Object) aVar.mo50228b());
            dVar.add(f45537d, (Object) aVar.mo50230d());
            dVar.add(f45538e, (Object) aVar.mo50227a());
            dVar.add(f45539f, aVar.mo50231e());
        }
    }

    /* renamed from: je.a$k */
    public static final class C17735k implements C19449c<C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a> {

        /* renamed from: a */
        public static final C17735k f45540a = new C17735k();

        /* renamed from: b */
        public static final C19448b f45541b = C19448b.m46849b("baseAddress");

        /* renamed from: c */
        public static final C19448b f45542c = C19448b.m46849b("size");

        /* renamed from: d */
        public static final C19448b f45543d = C19448b.m46849b("name");

        /* renamed from: e */
        public static final C19448b f45544e = C19448b.m46849b("uuid");

        public final void encode(Object obj, Object obj2) throws IOException {
            byte[] bArr;
            C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a aVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45541b, aVar.mo50238a());
            dVar.add(f45542c, aVar.mo50240c());
            dVar.add(f45543d, (Object) aVar.mo50239b());
            C19448b bVar = f45544e;
            String d = aVar.mo50241d();
            if (d != null) {
                bArr = d.getBytes(C17746a0.f45593a);
            } else {
                bArr = null;
            }
            dVar.add(bVar, (Object) bArr);
        }
    }

    /* renamed from: je.a$l */
    public static final class C17736l implements C19449c<C17746a0.C17753e.C17759d.C17760a.C17762b> {

        /* renamed from: a */
        public static final C17736l f45545a = new C17736l();

        /* renamed from: b */
        public static final C19448b f45546b = C19448b.m46849b("threads");

        /* renamed from: c */
        public static final C19448b f45547c = C19448b.m46849b("exception");

        /* renamed from: d */
        public static final C19448b f45548d = C19448b.m46849b("appExitInfo");

        /* renamed from: e */
        public static final C19448b f45549e = C19448b.m46849b("signal");

        /* renamed from: f */
        public static final C19448b f45550f = C19448b.m46849b("binaries");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d.C17760a.C17762b bVar = (C17746a0.C17753e.C17759d.C17760a.C17762b) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45546b, (Object) bVar.mo50237e());
            dVar.add(f45547c, (Object) bVar.mo50235c());
            dVar.add(f45548d, (Object) bVar.mo50233a());
            dVar.add(f45549e, (Object) bVar.mo50236d());
            dVar.add(f45550f, (Object) bVar.mo50234b());
        }
    }

    /* renamed from: je.a$m */
    public static final class C17737m implements C19449c<C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b> {

        /* renamed from: a */
        public static final C17737m f45551a = new C17737m();

        /* renamed from: b */
        public static final C19448b f45552b = C19448b.m46849b("type");

        /* renamed from: c */
        public static final C19448b f45553c = C19448b.m46849b("reason");

        /* renamed from: d */
        public static final C19448b f45554d = C19448b.m46849b("frames");

        /* renamed from: e */
        public static final C19448b f45555e = C19448b.m46849b("causedBy");

        /* renamed from: f */
        public static final C19448b f45556f = C19448b.m46849b("overflowCount");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b bVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45552b, (Object) bVar.mo50246e());
            dVar.add(f45553c, (Object) bVar.mo50245d());
            dVar.add(f45554d, (Object) bVar.mo50243b());
            dVar.add(f45555e, (Object) bVar.mo50242a());
            dVar.add(f45556f, bVar.mo50244c());
        }
    }

    /* renamed from: je.a$n */
    public static final class C17738n implements C19449c<C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c> {

        /* renamed from: a */
        public static final C17738n f45557a = new C17738n();

        /* renamed from: b */
        public static final C19448b f45558b = C19448b.m46849b("name");

        /* renamed from: c */
        public static final C19448b f45559c = C19448b.m46849b("code");

        /* renamed from: d */
        public static final C19448b f45560d = C19448b.m46849b("address");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c cVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45558b, (Object) cVar.mo50249c());
            dVar.add(f45559c, (Object) cVar.mo50248b());
            dVar.add(f45560d, cVar.mo50247a());
        }
    }

    /* renamed from: je.a$o */
    public static final class C17739o implements C19449c<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d> {

        /* renamed from: a */
        public static final C17739o f45561a = new C17739o();

        /* renamed from: b */
        public static final C19448b f45562b = C19448b.m46849b("name");

        /* renamed from: c */
        public static final C19448b f45563c = C19448b.m46849b("importance");

        /* renamed from: d */
        public static final C19448b f45564d = C19448b.m46849b("frames");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d dVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d) obj;
            C19450d dVar2 = (C19450d) obj2;
            dVar2.add(f45562b, (Object) dVar.mo50252c());
            dVar2.add(f45563c, dVar.mo50251b());
            dVar2.add(f45564d, (Object) dVar.mo50250a());
        }
    }

    /* renamed from: je.a$p */
    public static final class C17740p implements C19449c<C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b> {

        /* renamed from: a */
        public static final C17740p f45565a = new C17740p();

        /* renamed from: b */
        public static final C19448b f45566b = C19448b.m46849b("pc");

        /* renamed from: c */
        public static final C19448b f45567c = C19448b.m46849b("symbol");

        /* renamed from: d */
        public static final C19448b f45568d = C19448b.m46849b(AppboyFileUtils.FILE_SCHEME);

        /* renamed from: e */
        public static final C19448b f45569e = C19448b.m46849b("offset");

        /* renamed from: f */
        public static final C19448b f45570f = C19448b.m46849b("importance");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b bVar = (C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45566b, bVar.mo50256d());
            dVar.add(f45567c, (Object) bVar.mo50257e());
            dVar.add(f45568d, (Object) bVar.mo50253a());
            dVar.add(f45569e, bVar.mo50255c());
            dVar.add(f45570f, bVar.mo50254b());
        }
    }

    /* renamed from: je.a$q */
    public static final class C17741q implements C19449c<C17746a0.C17753e.C17759d.C17774c> {

        /* renamed from: a */
        public static final C17741q f45571a = new C17741q();

        /* renamed from: b */
        public static final C19448b f45572b = C19448b.m46849b(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL);

        /* renamed from: c */
        public static final C19448b f45573c = C19448b.m46849b("batteryVelocity");

        /* renamed from: d */
        public static final C19448b f45574d = C19448b.m46849b("proximityOn");

        /* renamed from: e */
        public static final C19448b f45575e = C19448b.m46849b("orientation");

        /* renamed from: f */
        public static final C19448b f45576f = C19448b.m46849b("ramUsed");

        /* renamed from: g */
        public static final C19448b f45577g = C19448b.m46849b("diskUsed");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d.C17774c cVar = (C17746a0.C17753e.C17759d.C17774c) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45572b, (Object) cVar.mo50258a());
            dVar.add(f45573c, cVar.mo50259b());
            dVar.add(f45574d, cVar.mo50263f());
            dVar.add(f45575e, cVar.mo50261d());
            dVar.add(f45576f, cVar.mo50262e());
            dVar.add(f45577g, cVar.mo50260c());
        }
    }

    /* renamed from: je.a$r */
    public static final class C17742r implements C19449c<C17746a0.C17753e.C17759d> {

        /* renamed from: a */
        public static final C17742r f45578a = new C17742r();

        /* renamed from: b */
        public static final C19448b f45579b = C19448b.m46849b("timestamp");

        /* renamed from: c */
        public static final C19448b f45580c = C19448b.m46849b("type");

        /* renamed from: d */
        public static final C19448b f45581d = C19448b.m46849b("app");

        /* renamed from: e */
        public static final C19448b f45582e = C19448b.m46849b(ServerParameters.DEVICE_KEY);

        /* renamed from: f */
        public static final C19448b f45583f = C19448b.m46849b("log");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17759d dVar = (C17746a0.C17753e.C17759d) obj;
            C19450d dVar2 = (C19450d) obj2;
            dVar2.add(f45579b, dVar.mo50225d());
            dVar2.add(f45580c, (Object) dVar.mo50226e());
            dVar2.add(f45581d, (Object) dVar.mo50222a());
            dVar2.add(f45582e, (Object) dVar.mo50223b());
            dVar2.add(f45583f, (Object) dVar.mo50224c());
        }
    }

    /* renamed from: je.a$s */
    public static final class C17743s implements C19449c<C17746a0.C17753e.C17759d.C17776d> {

        /* renamed from: a */
        public static final C17743s f45584a = new C17743s();

        /* renamed from: b */
        public static final C19448b f45585b = C19448b.m46849b("content");

        public final void encode(Object obj, Object obj2) throws IOException {
            ((C19450d) obj2).add(f45585b, (Object) ((C17746a0.C17753e.C17759d.C17776d) obj).mo50264a());
        }
    }

    /* renamed from: je.a$t */
    public static final class C17744t implements C19449c<C17746a0.C17753e.C17777e> {

        /* renamed from: a */
        public static final C17744t f45586a = new C17744t();

        /* renamed from: b */
        public static final C19448b f45587b = C19448b.m46849b(ServerParameters.PLATFORM);

        /* renamed from: c */
        public static final C19448b f45588c = C19448b.m46849b(MediationMetaData.KEY_VERSION);

        /* renamed from: d */
        public static final C19448b f45589d = C19448b.m46849b("buildVersion");

        /* renamed from: e */
        public static final C19448b f45590e = C19448b.m46849b("jailbroken");

        public final void encode(Object obj, Object obj2) throws IOException {
            C17746a0.C17753e.C17777e eVar = (C17746a0.C17753e.C17777e) obj;
            C19450d dVar = (C19450d) obj2;
            dVar.add(f45587b, eVar.mo50266b());
            dVar.add(f45588c, (Object) eVar.mo50267c());
            dVar.add(f45589d, (Object) eVar.mo50265a());
            dVar.add(f45590e, eVar.mo50268d());
        }
    }

    /* renamed from: je.a$u */
    public static final class C17745u implements C19449c<C17746a0.C17753e.C17779f> {

        /* renamed from: a */
        public static final C17745u f45591a = new C17745u();

        /* renamed from: b */
        public static final C19448b f45592b = C19448b.m46849b("identifier");

        public final void encode(Object obj, Object obj2) throws IOException {
            ((C19450d) obj2).add(f45592b, (Object) ((C17746a0.C17753e.C17779f) obj).mo50269a());
        }
    }

    public final void configure(C19669b<?> bVar) {
        C17727c cVar = C17727c.f45487a;
        bVar.registerEncoder(C17746a0.class, cVar);
        bVar.registerEncoder(C17780b.class, cVar);
        C17733i iVar = C17733i.f45522a;
        bVar.registerEncoder(C17746a0.C17753e.class, iVar);
        bVar.registerEncoder(C17792g.class, iVar);
        C17730f fVar = C17730f.f45502a;
        bVar.registerEncoder(C17746a0.C17753e.C17754a.class, fVar);
        bVar.registerEncoder(C17794h.class, fVar);
        C17731g gVar = C17731g.f45510a;
        bVar.registerEncoder(C17746a0.C17753e.C17754a.C17755a.class, gVar);
        bVar.registerEncoder(C17795i.class, gVar);
        C17745u uVar = C17745u.f45591a;
        bVar.registerEncoder(C17746a0.C17753e.C17779f.class, uVar);
        bVar.registerEncoder(C17818v.class, uVar);
        C17744t tVar = C17744t.f45586a;
        bVar.registerEncoder(C17746a0.C17753e.C17777e.class, tVar);
        bVar.registerEncoder(C17816u.class, tVar);
        C17732h hVar = C17732h.f45512a;
        bVar.registerEncoder(C17746a0.C17753e.C17757c.class, hVar);
        bVar.registerEncoder(C17796j.class, hVar);
        C17742r rVar = C17742r.f45578a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.class, rVar);
        bVar.registerEncoder(C17798k.class, rVar);
        C17734j jVar = C17734j.f45534a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17760a.class, jVar);
        bVar.registerEncoder(C17800l.class, jVar);
        C17736l lVar = C17736l.f45545a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17760a.C17762b.class, lVar);
        bVar.registerEncoder(C17802m.class, lVar);
        C17739o oVar = C17739o.f45561a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.class, oVar);
        bVar.registerEncoder(C17809q.class, oVar);
        C17740p pVar = C17740p.f45565a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17760a.C17762b.C17769d.C17771b.class, pVar);
        bVar.registerEncoder(C17811r.class, pVar);
        C17737m mVar = C17737m.f45551a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b.class, mVar);
        bVar.registerEncoder(C17805o.class, mVar);
        C17725a aVar = C17725a.f45475a;
        bVar.registerEncoder(C17746a0.C17747a.class, aVar);
        bVar.registerEncoder(C17783c.class, aVar);
        C17738n nVar = C17738n.f45557a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17760a.C17762b.C17767c.class, nVar);
        bVar.registerEncoder(C17807p.class, nVar);
        C17735k kVar = C17735k.f45540a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a.class, kVar);
        bVar.registerEncoder(C17803n.class, kVar);
        C17726b bVar2 = C17726b.f45484a;
        bVar.registerEncoder(C17746a0.C17750c.class, bVar2);
        bVar.registerEncoder(C17789d.class, bVar2);
        C17741q qVar = C17741q.f45571a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17774c.class, qVar);
        bVar.registerEncoder(C17813s.class, qVar);
        C17743s sVar = C17743s.f45584a;
        bVar.registerEncoder(C17746a0.C17753e.C17759d.C17776d.class, sVar);
        bVar.registerEncoder(C17815t.class, sVar);
        C17728d dVar = C17728d.f45496a;
        bVar.registerEncoder(C17746a0.C17751d.class, dVar);
        bVar.registerEncoder(C17790e.class, dVar);
        C17729e eVar = C17729e.f45499a;
        bVar.registerEncoder(C17746a0.C17751d.C17752a.class, eVar);
        bVar.registerEncoder(C17791f.class, eVar);
    }
}
