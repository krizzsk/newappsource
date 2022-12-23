package p605ki;

import android.app.Application;
import com.masabi.justride.sdk.exception.MissingSDKException;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mf0.C24362h;
import p232r4.C6242b;
import p247s6.C6478c;
import p330z2.C7428f;
import p364al.C13480a;
import p413co.C13860h;
import p469eo.C16846b;
import p704om.C18791g;
import p726pk.C18928a;
import p870vn.C20164d;
import p870vn.C20169i;
import p916xl.C20536b;
import p965zn.C20878a;

/* renamed from: ki.b */
public final class C18047b extends C6242b {

    /* renamed from: o */
    public static final LinkedHashMap f46172o = new LinkedHashMap();

    /* renamed from: p */
    public static final C18048a f46173p = new C18048a();

    /* renamed from: d */
    public final C18056j f46174d;

    /* renamed from: e */
    public final C18055i f46175e;

    /* renamed from: f */
    public final C18046a f46176f;

    /* renamed from: g */
    public final C18069w f46177g;

    /* renamed from: h */
    public final C18068v f46178h;

    /* renamed from: i */
    public final C7428f f46179i;

    /* renamed from: j */
    public final C6478c f46180j;

    /* renamed from: k */
    public final C20536b f46181k;

    /* renamed from: l */
    public final String f46182l;

    /* renamed from: m */
    public final String f46183m;

    /* renamed from: n */
    public final C18791g f46184n;

    /* renamed from: ki.b$a */
    public static final class C18048a {
        /* renamed from: a */
        public static C18047b m44717a(String str) throws MissingSDKException {
            C24362h.m61211f(str, "identifier");
            C18047b bVar = (C18047b) C18047b.f46172o.get(str);
            if (bVar != null) {
                return bVar;
            }
            throw new MissingSDKException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18047b(Application application, C18928a aVar, C18791g gVar) {
        super(new C18054h(aVar, application, gVar), 3);
        C24362h.m61211f(application, "application");
        C24362h.m61211f(aVar, "sdkConfiguration");
        this.f46184n = gVar;
        C13480a aVar2 = (C13480a) ((C16846b) this.f19694c).mo49505a(C13480a.class, (String) null);
        C16846b bVar = (C16846b) this.f19694c;
        this.f46174d = new C18056j(bVar);
        this.f46175e = new C18055i(bVar);
        this.f46176f = new C18046a(bVar);
        this.f46177g = new C18069w(bVar);
        this.f46178h = new C18068v(bVar);
        Object a = bVar.mo49505a(C20169i.class, (String) null);
        if (a != null) {
            this.f46179i = new C7428f((Object) (C20164d) a);
            C16846b bVar2 = (C16846b) this.f19694c;
            C24362h.m61210e(bVar2, "serviceLocator");
            this.f46180j = new C6478c(bVar2);
            this.f46181k = (C20536b) ((C16846b) this.f19694c).mo49505a(C20536b.class, (String) null);
            String str = aVar.f48174a;
            C24362h.m61210e(str, "sdkConfiguration.brandId");
            this.f46182l = str;
            String str2 = aVar.f48175b;
            C24362h.m61210e(str2, "sdkConfiguration.environment");
            this.f46183m = str2;
            C13860h hVar = (C13860h) ((C16846b) this.f19694c).mo49505a(C13860h.class, (String) null);
            hVar.getClass();
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            C24362h.m61210e(newSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
            newSingleThreadExecutor.execute(hVar.f34095a);
            C16846b bVar3 = (C16846b) this.f19694c;
            C24362h.m61210e(bVar3, "serviceLocator");
            C18051e eVar = new C18051e(this, bVar3);
            application.registerActivityLifecycleCallbacks(new C20878a(eVar));
            eVar.mo50525a();
            f46172o.put(mo50524c(), this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.masabi.justride.sdk.platform.events.EventBus");
    }

    /* renamed from: c */
    public final String mo50524c() {
        return this.f46182l + '-' + this.f46183m;
    }
}
