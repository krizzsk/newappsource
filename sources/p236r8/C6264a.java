package p236r8;

import ac0.C7557a;
import android.app.ActivityManager;
import bf0.C21049c;
import bi0.C21065d;
import cc0.C7585a;
import cc0.C7588d;
import cc0.C7589e;
import ce0.C21100e;
import com.umo.ads.p346k.zzb;
import com.umo.ads.p346k.zzh;
import com.umo.ads.p346k.zzj;
import ff0.C23349c;
import hi0.C23566v;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import p001a0.C0016g;
import p009a8.C0115o;
import p019b0.C1425b;
import p026b7.C1502g;
import p043ch.qos.logback.classic.Logger;
import p061d7.C4402a;
import p262t8.C6606a;
import p335z7.C7492a;
import p389bl.C13637c;
import p502fx.C17118c;
import p583jk.C17884p;
import p584jl.C17886b;
import uh0.C25081h;
import wb0.C13233c;
import wh0.C25177g;
import yb0.C13301f;

/* renamed from: r8.a */
public final /* synthetic */ class C6264a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f19732b;

    public /* synthetic */ C6264a(int i) {
        this.f19732b = i;
    }

    public final void run() {
        String o;
        String str;
        String str2;
        switch (this.f19732b) {
            case 0:
                Class<C6265b> cls = C6265b.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        Object systemService = C0115o.m210a().getSystemService("activity");
                        if (systemService != null) {
                            C6265b.m14853a((ActivityManager) systemService);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    } catch (Exception unused) {
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                C13301f fVar = C13301f.f33010a;
                C4402a aVar = C13233c.f32844c;
                if (aVar == null) {
                    o = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    String str3 = aVar.f15456b;
                    C24362h.m61211f(str3, "<this>");
                    if (!C25081h.m62836z(str3, "/", true)) {
                        str3 = C24362h.m61216k("/", str3);
                    }
                    sb.append(str3);
                    o = C0016g.m31o(sb, aVar.f15455a, "/umo_ad_kit_params.json");
                }
                String str4 = o;
                C7585a aVar2 = new C7585a(10, 10);
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("AK_INIT: ");
                J0.append(C13233c.m33333b().getString(C1502g.umoak_loader_msg_fetch_config));
                J0.append(": ");
                J0.append(str4);
                J0.append("...");
                logger.mo6672i(J0.toString());
                C17886b.f45891e = true;
                C1425b bVar = new C1425b(str4);
                C24362h.m61211f(str4, "reqUrl");
                C21049c<zzb> cVar = zzb.f30809c;
                zzb a = zzb.C12084a.m32052a();
                C23566v vVar = aVar2.f23101a;
                if (vVar != null) {
                    a.getClass();
                    C7589e eVar = new C7589e(bVar);
                    C21065d dVar = C7492a.f22973b;
                    C25177g.m63218b(dVar, CoroutineContext.DefaultImpls.m58548a(C17884p.m44356a(), eVar), new zzj(a, str4, (C23349c) null, bVar, vVar), 2);
                    C4402a aVar3 = C13233c.f32844c;
                    if (aVar3 == null || (str2 = aVar3.f15456b) == null) {
                        str = null;
                    } else {
                        if (!C25081h.m62836z(str2, "/", true)) {
                            str2 = C24362h.m61216k("/", str2);
                        }
                        str = C24362h.m61216k("ad_templates/umo_ad_kit_ad_templates_android.json", str2);
                    }
                    C24362h.m61208c(str);
                    C13637c.f33648o = new C7585a(10, 10);
                    C7557a.f23040a.mo6672i("AK_INIT: Fetching hosted Ad Rendering Templates Json: " + str + "...");
                    C13637c.f33646m = true;
                    C7585a aVar4 = C13637c.f33648o;
                    if (aVar4 != null) {
                        C17118c cVar2 = new C17118c(str, 1);
                        zzb a2 = zzb.C12084a.m32052a();
                        C23566v vVar2 = aVar4.f23101a;
                        if (vVar2 != null) {
                            a2.getClass();
                            C25177g.m63218b(dVar, CoroutineContext.DefaultImpls.m58548a(C17884p.m44356a(), new C7588d(cVar2)), new zzh(a2, str, (C23349c) null, cVar2, vVar2), 2);
                            return;
                        }
                        C24362h.m61217l("client");
                        throw null;
                    }
                    return;
                }
                C24362h.m61217l("client");
                throw null;
        }
    }
}
