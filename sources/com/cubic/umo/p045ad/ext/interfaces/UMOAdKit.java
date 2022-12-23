package com.cubic.umo.p045ad.ext.interfaces;

import ac0.C7557a;
import android.content.Context;
import androidx.annotation.Keep;
import bf0.C21050d;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.umo.ads.p343d.zza;
import com.umo.ads.p350u.zzn;
import kotlin.Metadata;
import kotlin.Result;
import lf0.C24240p;
import mf0.C24362h;
import p043ch.qos.logback.classic.Logger;
import p061d7.C4402a;
import p584jl.C17885a;
import wb0.C13233c;
import yb0.C13301f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/interfaces/UMOAdKit;", "", "Companion", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.ext.interfaces.UMOAdKit */
public final class UMOAdKit {

    /* renamed from: a */
    public static final Companion f7238a = new Companion();

    /* renamed from: b */
    public static UMOAdKit f7239b;

    /* renamed from: c */
    public static C24240p<? super UMOAdKit, ? super UMOAdKitError, C21050d> f7240c;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007R,\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/interfaces/UMOAdKit$Companion;", "", "Landroid/content/Context;", "appContext", "Ld7/a;", "adKitParams", "Lkotlin/Function2;", "Lcom/cubic/umo/ad/ext/interfaces/UMOAdKit;", "Lcom/cubic/umo/ad/ext/types/UMOAdKitError;", "Lbf0/d;", "completion", "initialize", "deInitialize", "", "getVersion", "completionHandler", "Llf0/p;", "umoAdKit", "Lcom/cubic/umo/ad/ext/interfaces/UMOAdKit;", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
    /* renamed from: com.cubic.umo.ad.ext.interfaces.UMOAdKit$Companion */
    public static final class Companion {
        /* renamed from: a */
        public static boolean m5801a() {
            if (UMOAdKit.f7239b == null || C13233c.f32846e != zzn.INITIALIZED) {
                return false;
            }
            return true;
        }

        @Keep
        public final UMOAdKitError deInitialize() {
            Object obj;
            C7557a.f23040a.mo6666c(C24362h.m61216k(" -> START", "deInitialize()"));
            UMOAdKitError uMOAdKitError = null;
            try {
                C13301f fVar = C13301f.f33010a;
                C13301f.m33524a();
                UMOAdKit.f7239b = null;
                obj = C21050d.f52856a;
            } catch (Throwable th) {
                obj = C17885a.m44400G(th);
            }
            Throwable a = Result.m58423a(obj);
            if (a != null) {
                if (a instanceof zza) {
                    UMOAdKitError.C2223a aVar = UMOAdKitError.Companion;
                    String localizedMessage = ((zza) a).getLocalizedMessage();
                    aVar.getClass();
                    uMOAdKitError = (UMOAdKitError) UMOAdKitError.map.get(localizedMessage);
                    if (uMOAdKitError == null) {
                        uMOAdKitError = UMOAdKitError.UNKNOWN;
                    }
                } else {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(a.getLocalizedMessage(), "deInitialize() failed: "));
                    uMOAdKitError = UMOAdKitError.UNKNOWN;
                }
            }
            C7557a.f23040a.mo6666c(C24362h.m61216k(" -> END", "deInitialize()"));
            if (uMOAdKitError == null) {
                return UMOAdKitError.NONE;
            }
            return uMOAdKitError;
        }

        @Keep
        public final String getVersion() {
            C7557a.f23040a.mo6666c(C24362h.m61216k(" -> START", "getVersion()"));
            String k = C24362h.m61216k("2.2.2", "getVersion(), Version: ");
            C24362h.m61211f(k, "funcName");
            C7557a.f23040a.mo6666c(C24362h.m61216k(" -> END", k));
            return "2.2.2";
        }

        @Keep
        public final void initialize(Context context, C4402a aVar, C24240p<? super UMOAdKit, ? super UMOAdKitError, C21050d> pVar) {
            Object obj;
            C24362h.m61211f(context, "appContext");
            C24362h.m61211f(aVar, "adKitParams");
            C24362h.m61211f(pVar, "completion");
            C7557a.f23040a.mo6666c(C24362h.m61216k(" -> START", "initialize()"));
            if (UMOAdKit.f7239b == null) {
                UMOAdKit.f7239b = new UMOAdKit();
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("UMOADKIT_INSTANCE: UMO Ad Kit Instance CREATED: ");
                J0.append(UMOAdKit.f7239b);
                J0.append('.');
                logger.mo6672i(J0.toString());
            }
            C13233c.f32842a = context;
            UMOAdKit.f7240c = pVar;
            try {
                C13301f.f33010a.mo40204b(aVar);
                obj = C21050d.f52856a;
            } catch (Throwable th) {
                obj = C17885a.m44400G(th);
            }
            if (!(obj instanceof Result.Failure)) {
                C21050d dVar = (C21050d) obj;
            }
            Throwable a = Result.m58423a(obj);
            if (a != null) {
                if (a instanceof zza) {
                    UMOAdKit.f7238a.getClass();
                    if (C13233c.f32846e != zzn.INITIALIZED) {
                        UMOAdKit.f7239b = null;
                    }
                    UMOAdKitError.C2223a aVar2 = UMOAdKitError.Companion;
                    String localizedMessage = ((zza) a).getLocalizedMessage();
                    aVar2.getClass();
                    UMOAdKitError uMOAdKitError = (UMOAdKitError) UMOAdKitError.map.get(localizedMessage);
                    if (uMOAdKitError == null) {
                        uMOAdKitError = UMOAdKitError.UNKNOWN;
                    }
                    pVar.invoke(null, uMOAdKitError);
                } else {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(a.getLocalizedMessage(), "initialize() failed: "));
                    UMOAdKit.f7238a.getClass();
                    if (C13233c.f32846e != zzn.INITIALIZED) {
                        UMOAdKit.f7239b = null;
                    }
                    pVar.invoke(null, UMOAdKitError.UNKNOWN);
                }
            }
            String k = C24362h.m61216k(UMOAdKit.f7239b, "initialize(), UMOAdKit: ");
            C24362h.m61211f(k, "funcName");
            C7557a.f23040a.mo6666c(C24362h.m61216k(" -> END", k));
        }
    }

    @Keep
    public static final UMOAdKitError deInitialize() {
        return f7238a.deInitialize();
    }

    @Keep
    public static final String getVersion() {
        return f7238a.getVersion();
    }

    @Keep
    public static final void initialize(Context context, C4402a aVar, C24240p<? super UMOAdKit, ? super UMOAdKitError, C21050d> pVar) {
        f7238a.initialize(context, aVar, pVar);
    }
}
