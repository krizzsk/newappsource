package p019b0;

import ac0.C7557a;
import android.content.Context;
import bf0.C21050d;
import ce0.C21100e;
import com.appsflyer.internal.referrer.Payload;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.types.AKHostedConfig;
import com.squareup.moshi.JsonDataException;
import fe0.C23341a;
import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23538f;
import hi0.C23569w;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import mf0.C24362h;
import nc0.C12954d;
import p026b7.C1502g;
import p043ch.qos.logback.classic.Logger;
import p277ub.C6803r;
import p584jl.C17886b;
import wb0.C13233c;
import yb0.C13301f;

/* renamed from: b0.b */
public final class C1425b implements C23538f, C23341a {

    /* renamed from: b */
    public String f5271b;

    public /* synthetic */ C1425b(String str) {
        this.f5271b = str;
    }

    /* renamed from: e */
    public static C1425b m3809e(C6803r rVar) {
        String str;
        String str2;
        rVar.mo22981A(2);
        int p = rVar.mo22997p();
        int i = p >> 1;
        int p2 = ((rVar.mo22997p() >> 3) & 31) | ((p & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        if (p2 < 10) {
            str2 = ".0";
        } else {
            str2 = ".";
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(p2);
        return new C1425b(sb.toString());
    }

    /* renamed from: a */
    public boolean mo2079a() {
        return false;
    }

    /* renamed from: b */
    public String mo2080b() {
        return this.f5271b;
    }

    /* renamed from: c */
    public void mo5762c(C23534e eVar, IOException iOException) {
        boolean z;
        UMOAdKitError uMOAdKitError;
        boolean z2 = true;
        if (eVar != null && ((C23569w) eVar).isCanceled()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C12954d.m32799b(C13233c.m33333b(), 1, iOException);
            if (!(iOException instanceof SocketTimeoutException) && !(iOException instanceof ConnectException)) {
                z2 = false;
            }
            if (z2) {
                uMOAdKitError = UMOAdKitError.EXTERNAL_CONFIG_FETCH_TIMED_OUT;
            } else {
                uMOAdKitError = UMOAdKitError.EXTERNAL_CONFIG_FETCH_FAILED;
            }
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AK_INIT: ");
            J0.append(C13233c.m33333b().getString(C1502g.umoak_hosted_configuration_fetch_failed));
            J0.append(" (");
            J0.append(uMOAdKitError.getDesc());
            J0.append(')');
            logger.mo6667d(J0.toString());
            C17886b.f45891e = false;
            C13301f fVar = C13301f.f33010a;
            C13301f.f33011b = uMOAdKitError;
            fVar.mo40205d(false);
        }
    }

    /* renamed from: d */
    public void mo5763d(C23534e eVar, C23529c0 c0Var) {
        C24362h.m61211f(c0Var, Payload.RESPONSE);
        boolean z = true;
        if (eVar == null || !((C23569w) eVar).isCanceled()) {
            z = false;
        }
        if (!z) {
            if (!c0Var.mo58644v()) {
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("AK_INIT: ");
                Context b = C13233c.m33333b();
                int i = C1502g.umoak_hosted_configuration_fetch_failed;
                J0.append(b.getString(i));
                J0.append(" (StatusCode: ");
                J0.append(c0Var.f59412d);
                J0.append(')');
                logger.mo6667d(J0.toString());
                UMOAdKitError uMOAdKitError = UMOAdKitError.EXTERNAL_CONFIG_FETCH_FAILED;
                Logger logger2 = C7557a.f23040a;
                StringBuilder J02 = C21100e.m49315J0("AK_INIT: ");
                J02.append(C13233c.m33333b().getString(i));
                J02.append(" (");
                J02.append(uMOAdKitError.getDesc());
                J02.append(')');
                logger2.mo6667d(J02.toString());
                C17886b.f45891e = false;
                C13301f fVar = C13301f.f33010a;
                C13301f.f33011b = uMOAdKitError;
                fVar.mo40205d(false);
            } else if (c0Var.f59412d == 204) {
                C7557a.f23040a.mo6667d("AK_INIT: Hosted Config Json fetched but it is EMPTY");
                UMOAdKitError uMOAdKitError2 = UMOAdKitError.INVALID_EXTERNAL_CONFIG_PARAMS;
                Logger logger3 = C7557a.f23040a;
                StringBuilder J03 = C21100e.m49315J0("AK_INIT: ");
                J03.append(C13233c.m33333b().getString(C1502g.umoak_hosted_configuration_fetch_failed));
                J03.append(" (");
                J03.append(uMOAdKitError2.getDesc());
                J03.append(')');
                logger3.mo6667d(J03.toString());
                C17886b.f45891e = false;
                C13301f fVar2 = C13301f.f33010a;
                C13301f.f33011b = uMOAdKitError2;
                fVar2.mo40205d(false);
            } else {
                Logger logger4 = C7557a.f23040a;
                StringBuilder J04 = C21100e.m49315J0("AK_INIT: ********** ");
                J04.append(C13233c.m33333b().getString(C1502g.umoak_hosted_configuration_fetch_success));
                J04.append(" ********** ");
                logger4.mo6672i(J04.toString());
                try {
                    C23536e0 e0Var = c0Var.f59416h;
                    C21050d dVar = null;
                    if (e0Var != null) {
                        String str = this.f5271b;
                        String v = e0Var.mo58649v();
                        C24362h.m61210e(v, "respJson");
                        AKHostedConfig q = C17886b.m44490q(v, false);
                        if (q != null) {
                            if (C17886b.m44493t(q, false)) {
                                C17886b.m44492s(str, v);
                            }
                            dVar = C21050d.f52856a;
                        }
                        if (dVar == null) {
                            C17886b.m44491r(UMOAdKitError.INVALID_EXTERNAL_CONFIG_PARAMS);
                        }
                        dVar = C21050d.f52856a;
                    }
                    if (dVar == null) {
                        UMOAdKitError uMOAdKitError3 = UMOAdKitError.INVALID_EXTERNAL_CONFIG_PARAMS;
                        Logger logger5 = C7557a.f23040a;
                        logger5.mo6667d("AK_INIT: " + C13233c.m33333b().getString(C1502g.umoak_hosted_configuration_fetch_failed) + " (" + uMOAdKitError3.getDesc() + ')');
                        C17886b.f45891e = false;
                        C13301f fVar3 = C13301f.f33010a;
                        C13301f.f33011b = uMOAdKitError3;
                        fVar3.mo40205d(false);
                    }
                } catch (IOException e) {
                    Logger logger6 = C7557a.f23040a;
                    StringBuilder J05 = C21100e.m49315J0("AK_INIT: IOException while processing Hosted Config Json (Exception: ");
                    J05.append(e.getLocalizedMessage());
                    J05.append(')');
                    logger6.mo6667d(J05.toString());
                    UMOAdKitError uMOAdKitError4 = UMOAdKitError.INVALID_EXTERNAL_CONFIG_PARAMS;
                    Logger logger7 = C7557a.f23040a;
                    StringBuilder J06 = C21100e.m49315J0("AK_INIT: ");
                    J06.append(C13233c.m33333b().getString(C1502g.umoak_hosted_configuration_fetch_failed));
                    J06.append(" (");
                    J06.append(uMOAdKitError4.getDesc());
                    J06.append(')');
                    logger7.mo6667d(J06.toString());
                    C17886b.f45891e = false;
                    C13301f fVar4 = C13301f.f33010a;
                    C13301f.f33011b = uMOAdKitError4;
                    fVar4.mo40205d(false);
                } catch (JsonDataException e2) {
                    Logger logger8 = C7557a.f23040a;
                    StringBuilder J07 = C21100e.m49315J0("AK_INIT: JsonDataException while processing Hosted Config Json (Exception: ");
                    J07.append(e2.getLocalizedMessage());
                    J07.append(')');
                    logger8.mo6667d(J07.toString());
                    UMOAdKitError uMOAdKitError5 = UMOAdKitError.INVALID_EXTERNAL_CONFIG_PARAMS;
                    Logger logger9 = C7557a.f23040a;
                    StringBuilder J08 = C21100e.m49315J0("AK_INIT: ");
                    J08.append(C13233c.m33333b().getString(C1502g.umoak_hosted_configuration_fetch_failed));
                    J08.append(" (");
                    J08.append(uMOAdKitError5.getDesc());
                    J08.append(')');
                    logger9.mo6667d(J08.toString());
                    C17886b.f45891e = false;
                    C13301f fVar5 = C13301f.f33010a;
                    C13301f.f33011b = uMOAdKitError5;
                    fVar5.mo40205d(false);
                }
            }
        }
    }

    public int getStatus() {
        return -1;
    }
}
