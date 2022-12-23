package p502fx;

import ac0.C7557a;
import bf0.C21050d;
import ce0.C21100e;
import com.appsflyer.internal.referrer.Payload;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.types.AKHostedAdTemplatesData;
import com.umo.ads.p351v.zza;
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
import p001a0.C0016g;
import p043ch.qos.logback.classic.Logger;
import p389bl.C13637c;
import wb0.C13233c;
import yb0.C13301f;

/* renamed from: fx.c */
public final class C17118c implements C23538f {

    /* renamed from: b */
    public final /* synthetic */ int f44303b;

    /* renamed from: c */
    public final String f44304c;

    public /* synthetic */ C17118c(String str, int i) {
        this.f44303b = i;
        this.f44304c = str;
    }

    /* renamed from: c */
    public final void mo5762c(C23534e eVar, IOException iOException) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        UMOAdKitError uMOAdKitError;
        boolean z4 = false;
        String str2 = "Timed Out";
        switch (this.f44303b) {
            case 1:
                if (eVar != null && ((C23569w) eVar).isCanceled()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if ((iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        str2 = "Failed";
                    }
                    C7557a.f23040a.mo6667d(C24362h.m61216k(str2, "AK_INIT: Fetching hosted Ad Rendering Templates Json "));
                    if (z3) {
                        uMOAdKitError = UMOAdKitError.REMOTE_AD_TEMPLATES_FETCH_TIMED_OUT;
                    } else {
                        uMOAdKitError = UMOAdKitError.REMOTE_AD_TEMPLATES_FETCH_FAILED;
                    }
                    if (C13637c.f33647n) {
                        C7557a.f23040a.mo6672i("AK_INIT: LOCAL Ad Templates would be used for Ad Rendering as REMOTE templates looks missing or invalid.");
                        UMOAdKitError uMOAdKitError2 = UMOAdKitError.NONE;
                        C13637c.f33646m = false;
                        C13301f fVar = C13301f.f33010a;
                        C24362h.m61211f(uMOAdKitError2, "akError");
                        fVar.mo40205d(true);
                        return;
                    }
                    C7557a.f23040a.mo6667d("AK_INIT: Neither LOCAL nor REMOTE Ad Rendering Templates found.");
                    C13637c.f33647n = false;
                    C13637c.f33646m = false;
                    C13301f fVar2 = C13301f.f33010a;
                    C24362h.m61211f(uMOAdKitError, "akError");
                    C13301f.f33012c = uMOAdKitError;
                    fVar2.mo40205d(false);
                    return;
                }
                return;
            default:
                if (eVar != null && ((C23569w) eVar).isCanceled()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if ((iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException)) {
                        z4 = true;
                    }
                    if (!z4) {
                        str2 = "Failed";
                    }
                    Logger logger = C7557a.f23040a;
                    StringBuilder t = C0016g.m36t("Hitting Beacon ", str2);
                    t.append(this.f44304c);
                    t.append(": Exception: ");
                    if (iOException == null) {
                        str = null;
                    } else {
                        str = iOException.getLocalizedMessage();
                    }
                    t.append(str);
                    logger.mo6667d(t.toString());
                    C12954d.m32799b(C13233c.m33333b(), 3, iOException);
                    return;
                }
                return;
        }
    }

    /* renamed from: d */
    public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
        boolean z;
        boolean z2 = true;
        switch (this.f44303b) {
            case 1:
                C24362h.m61211f(c0Var, Payload.RESPONSE);
                if (eVar != null && ((C23569w) eVar).isCanceled()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (!c0Var.mo58644v()) {
                        Logger logger = C7557a.f23040a;
                        StringBuilder J0 = C21100e.m49315J0("AK_INIT: Fetching externally hosted Ad Rendering Templates Json Failed (StatusCode: ");
                        J0.append(c0Var.f59412d);
                        J0.append(')');
                        logger.mo6667d(J0.toString());
                        UMOAdKitError uMOAdKitError = UMOAdKitError.REMOTE_AD_TEMPLATES_INVALID;
                        if (C13637c.f33647n) {
                            C7557a.f23040a.mo6672i("AK_INIT: LOCAL Ad Templates would be used for Ad Rendering as REMOTE templates looks missing or invalid.");
                            UMOAdKitError uMOAdKitError2 = UMOAdKitError.NONE;
                            C13637c.f33646m = false;
                            C13301f fVar = C13301f.f33010a;
                            C24362h.m61211f(uMOAdKitError2, "akError");
                            fVar.mo40205d(true);
                            return;
                        }
                        C7557a.f23040a.mo6667d("AK_INIT: Neither LOCAL nor REMOTE Ad Rendering Templates found.");
                        C13637c.f33647n = false;
                        C13637c.f33646m = false;
                        C13301f fVar2 = C13301f.f33010a;
                        C24362h.m61211f(uMOAdKitError, "akError");
                        C13301f.f33012c = uMOAdKitError;
                        fVar2.mo40205d(false);
                        return;
                    } else if (c0Var.f59412d == 204) {
                        C7557a.f23040a.mo6667d("AK_INIT: Hosted Ad Rendering Templates Json fetched but it is EMPTY");
                        UMOAdKitError uMOAdKitError3 = UMOAdKitError.REMOTE_AD_TEMPLATES_INVALID;
                        if (C13637c.f33647n) {
                            C7557a.f23040a.mo6672i("AK_INIT: LOCAL Ad Templates would be used for Ad Rendering as REMOTE templates looks missing or invalid.");
                            UMOAdKitError uMOAdKitError4 = UMOAdKitError.NONE;
                            C13637c.f33646m = false;
                            C13301f fVar3 = C13301f.f33010a;
                            C24362h.m61211f(uMOAdKitError4, "akError");
                            fVar3.mo40205d(true);
                            return;
                        }
                        C7557a.f23040a.mo6667d("AK_INIT: Neither LOCAL nor REMOTE Ad Rendering Templates found.");
                        C13637c.f33647n = false;
                        C13637c.f33646m = false;
                        C13301f fVar4 = C13301f.f33010a;
                        C24362h.m61211f(uMOAdKitError3, "akError");
                        C13301f.f33012c = uMOAdKitError3;
                        fVar4.mo40205d(false);
                        return;
                    } else {
                        C7557a.f23040a.mo6672i("AK_INIT: ********** Hosted Ad Rendering Templates Json fetched Successfully. **********");
                        try {
                            C23536e0 e0Var = c0Var.f59416h;
                            C21050d dVar = null;
                            if (e0Var != null) {
                                String str = this.f44304c;
                                String v = e0Var.mo58649v();
                                C13637c cVar = C13637c.f33645l;
                                C24362h.m61210e(v, "respJson");
                                AKHostedAdTemplatesData O = C13637c.m34060O(v, false);
                                if (O != null) {
                                    if (cVar.mo40522R(O, false)) {
                                        Logger logger2 = C7557a.f23040a;
                                        logger2.mo6672i("AK_INIT: Saving REMOTE Ad Rendering Templates in Local Cache, Key: " + str + '.');
                                        zza.m32115b(str, v);
                                    }
                                    dVar = C21050d.f52856a;
                                }
                                if (dVar == null) {
                                    cVar.mo40521Q(UMOAdKitError.REMOTE_AD_TEMPLATES_INVALID);
                                }
                                dVar = C21050d.f52856a;
                            }
                            if (dVar == null) {
                                UMOAdKitError uMOAdKitError5 = UMOAdKitError.REMOTE_AD_TEMPLATES_INVALID;
                                if (C13637c.f33647n) {
                                    C7557a.f23040a.mo6672i("AK_INIT: LOCAL Ad Templates would be used for Ad Rendering as REMOTE templates looks missing or invalid.");
                                    UMOAdKitError uMOAdKitError6 = UMOAdKitError.NONE;
                                    C13637c.f33646m = false;
                                    C13301f fVar5 = C13301f.f33010a;
                                    C24362h.m61211f(uMOAdKitError6, "akError");
                                    fVar5.mo40205d(true);
                                    return;
                                }
                                C7557a.f23040a.mo6667d("AK_INIT: Neither LOCAL nor REMOTE Ad Rendering Templates found.");
                                C13637c.f33647n = false;
                                C13637c.f33646m = false;
                                C13301f fVar6 = C13301f.f33010a;
                                C24362h.m61211f(uMOAdKitError5, "akError");
                                C13301f.f33012c = uMOAdKitError5;
                                fVar6.mo40205d(false);
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            Logger logger3 = C7557a.f23040a;
                            StringBuilder J02 = C21100e.m49315J0("AK_INIT: IOException while processing hosted Ad Rendering Templates Response (Exception: ");
                            J02.append(e.getLocalizedMessage());
                            J02.append(')');
                            logger3.mo6667d(J02.toString());
                            UMOAdKitError uMOAdKitError7 = UMOAdKitError.REMOTE_AD_TEMPLATES_INVALID;
                            if (C13637c.f33647n) {
                                C7557a.f23040a.mo6672i("AK_INIT: LOCAL Ad Templates would be used for Ad Rendering as REMOTE templates looks missing or invalid.");
                                UMOAdKitError uMOAdKitError8 = UMOAdKitError.NONE;
                                C13637c.f33646m = false;
                                C13301f fVar7 = C13301f.f33010a;
                                C24362h.m61211f(uMOAdKitError8, "akError");
                                fVar7.mo40205d(true);
                                return;
                            }
                            C7557a.f23040a.mo6667d("AK_INIT: Neither LOCAL nor REMOTE Ad Rendering Templates found.");
                            C13637c.f33647n = false;
                            C13637c.f33646m = false;
                            C13301f fVar8 = C13301f.f33010a;
                            C24362h.m61211f(uMOAdKitError7, "akError");
                            C13301f.f33012c = uMOAdKitError7;
                            fVar8.mo40205d(false);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                C24362h.m61211f(c0Var, Payload.RESPONSE);
                if (eVar == null || !((C23569w) eVar).isCanceled()) {
                    z2 = false;
                }
                if (!z2) {
                    if (c0Var.mo58644v()) {
                        C7557a.f23040a.mo6672i(C24362h.m61216k(this.f44304c, "Hitting Beacon Successful"));
                        return;
                    }
                    Logger logger4 = C7557a.f23040a;
                    StringBuilder J03 = C21100e.m49315J0("Hitting Beacon Failed");
                    J03.append(this.f44304c);
                    J03.append(" (StatusCode: ");
                    J03.append(c0Var.f59412d);
                    J03.append(')');
                    logger4.mo6667d(J03.toString());
                    return;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f44303b) {
            case 0:
                return C0016g.m31o(C13555b.m33972k("TodPassengerActionPinCodeAdditionalInfo{pinCode="), this.f44304c, "}");
            default:
                return super.toString();
        }
    }

    public C17118c(String str) {
        this.f44303b = 0;
        this.f44304c = str;
    }
}
