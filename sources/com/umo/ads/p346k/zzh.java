package com.umo.ads.p346k;

import bf0.C21049c;
import bf0.C21050d;
import com.appsflyer.internal.referrer.Payload;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.umo.ads.p346k.zzb;
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
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.ad.network.okhttp.NetworkManager$getAdTemplates$1", mo58555f = "NetworkManager.kt", mo58556l = {73}, mo58557m = "invokeSuspend")
/* renamed from: com.umo.ads.k.zzh */
public final class zzh extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public C23566v zza;
    public int zzb;
    public final /* synthetic */ C23566v zzc;
    public final /* synthetic */ zzb zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ C23538f zzf;

    /* renamed from: com.umo.ads.k.zzh$a */
    public static final class C12088a implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ C23538f f30817b;

        public C12088a(C23538f fVar) {
            this.f30817b = fVar;
        }

        /* renamed from: c */
        public final void mo5762c(C23534e eVar, IOException iOException) {
            this.f30817b.mo5762c(eVar, iOException);
        }

        /* renamed from: d */
        public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
            C24362h.m61211f(eVar, "call");
            C24362h.m61211f(c0Var, Payload.RESPONSE);
            this.f30817b.mo5763d(eVar, c0Var);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzh(zzb zzb2, String str, C23349c cVar, C23538f fVar, C23566v vVar) {
        super(2, cVar);
        this.zzc = vVar;
        this.zzd = zzb2;
        this.zze = str;
        this.zzf = fVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new zzh(this.zzd, this.zze, cVar, this.zzf, this.zzc);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zzh) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C23566v vVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.zzb;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C23566v vVar2 = this.zzc;
            zzb zzb2 = this.zzd;
            String str = this.zze;
            this.zza = vVar2;
            this.zzb = 1;
            C21049c<zzb> cVar = zzb.f30809c;
            Object a = zzb2.mo35787a(zzb.C12085b.C12086a.f30812a, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            vVar = vVar2;
            obj = a;
        } else if (i == 1) {
            vVar = this.zza;
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vVar.getClass();
        FirebasePerfOkHttpClient.enqueue(C23569w.m57753i(vVar, (C23571x) obj, false), new C12088a(this.zzf));
        return C21050d.f52856a;
    }
}
