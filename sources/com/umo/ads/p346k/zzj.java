package com.umo.ads.p346k;

import bf0.C21050d;
import com.amazonaws.http.HttpHeader;
import com.appsflyer.internal.referrer.Payload;
import com.cubic.umo.auth.api.AuthManager;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import ff0.C23349c;
import gf0.C23413c;
import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23538f;
import hi0.C23566v;
import hi0.C23569w;
import hi0.C23571x;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.MutexImpl;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.ad.network.okhttp.NetworkManager$getConfig$1", mo58555f = "NetworkManager.kt", mo58556l = {37, 39}, mo58557m = "invokeSuspend")
/* renamed from: com.umo.ads.k.zzj */
public final class zzj extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public String zza;
    public int zzb;
    public final /* synthetic */ zzb zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ C23566v zze;
    public final /* synthetic */ C23538f zzf;

    /* renamed from: com.umo.ads.k.zzj$a */
    public static final class C12089a implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ C23538f f30818b;

        public C12089a(C23538f fVar) {
            this.f30818b = fVar;
        }

        /* renamed from: c */
        public final void mo5762c(C23534e eVar, IOException iOException) {
            C24362h.m61211f(eVar, "call");
            C24362h.m61211f(iOException, "e");
            this.f30818b.mo5762c(eVar, iOException);
        }

        /* renamed from: d */
        public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
            C24362h.m61211f(eVar, "call");
            C24362h.m61211f(c0Var, Payload.RESPONSE);
            this.f30818b.mo5763d(eVar, c0Var);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzj(zzb zzb2, String str, C23349c cVar, C23538f fVar, C23566v vVar) {
        super(2, cVar);
        this.zzc = zzb2;
        this.zzd = str;
        this.zze = vVar;
        this.zzf = fVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new zzj(this.zzc, this.zzd, cVar, this.zzf, this.zze);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zzj) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.zzb;
        if (i == 0) {
            C17885a.m44475z0(obj);
            MutexImpl mutexImpl = this.zzc.f30811b;
            this.zzb = 1;
            if (mutexImpl.mo60395a((Object) null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else if (i == 2) {
            str = this.zza;
            try {
                C17885a.m44475z0(obj);
                String k = C24362h.m61216k(obj, str);
                C23571x.C23572a aVar = new C23571x.C23572a();
                aVar.mo58731e(this.zzd);
                aVar.f59644c.mo58690a(HttpHeader.AUTHORIZATION, k);
                C23571x a = aVar.mo58727a();
                C23566v vVar = this.zze;
                vVar.getClass();
                FirebasePerfOkHttpClient.enqueue(C23569w.m57753i(vVar, a, false), new C12089a(this.zzf));
                this.zzc.f30811b.mo60396b((Object) null);
                return C21050d.f52856a;
            } catch (Throwable th) {
                this.zzc.f30811b.mo60396b((Object) null);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AuthManager authManager = this.zzc.f30810a;
        this.zza = "Bearer ";
        this.zzb = 2;
        Object d = authManager.mo11603d(true, this);
        if (d == coroutineSingletons) {
            return coroutineSingletons;
        }
        str = "Bearer ";
        obj = d;
        String k2 = C24362h.m61216k(obj, str);
        C23571x.C23572a aVar2 = new C23571x.C23572a();
        aVar2.mo58731e(this.zzd);
        aVar2.f59644c.mo58690a(HttpHeader.AUTHORIZATION, k2);
        C23571x a2 = aVar2.mo58727a();
        C23566v vVar2 = this.zze;
        vVar2.getClass();
        FirebasePerfOkHttpClient.enqueue(C23569w.m57753i(vVar2, a2, false), new C12089a(this.zzf));
        this.zzc.f30811b.mo60396b((Object) null);
        return C21050d.f52856a;
    }
}
