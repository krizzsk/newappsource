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
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p335z7.C7492a;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.ad.network.okhttp.NetworkManager$asyncGET$1", mo58555f = "NetworkManager.kt", mo58556l = {102}, mo58557m = "invokeSuspend")
/* renamed from: com.umo.ads.k.zzd */
public final class zzd extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public C23566v zza;
    public int zzb;
    public final /* synthetic */ C23566v zzc;
    public final /* synthetic */ zzb zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ C23538f zzf;

    /* renamed from: com.umo.ads.k.zzd$zza */
    public static final class zza implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ C23538f f30815b;

        @C23413c(mo58554c = "com.cubic.umo.ad.network.okhttp.NetworkManager$asyncGET$1$1$1$onFailure$1", mo58555f = "NetworkManager.kt", mo58556l = {}, mo58557m = "invokeSuspend")
        /* renamed from: com.umo.ads.k.zzd$zza$zza  reason: collision with other inner class name */
        public static final class C26270zza extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
            public final /* synthetic */ C23538f zza;
            public final /* synthetic */ C23534e zzb;
            public final /* synthetic */ IOException zzc;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26270zza(C23538f fVar, C23534e eVar, IOException iOException, C23349c<? super C26270zza> cVar) {
                super(2, cVar);
                this.zza = fVar;
                this.zzb = eVar;
                this.zzc = iOException;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                return new C26270zza(this.zza, this.zzb, this.zzc, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C26270zza) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C17885a.m44475z0(obj);
                this.zza.mo5762c(this.zzb, this.zzc);
                return C21050d.f52856a;
            }
        }

        @C23413c(mo58554c = "com.cubic.umo.ad.network.okhttp.NetworkManager$asyncGET$1$1$1$onResponse$1", mo58555f = "NetworkManager.kt", mo58556l = {}, mo58557m = "invokeSuspend")
        /* renamed from: com.umo.ads.k.zzd$zza$zzb */
        public static final class zzb extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
            public final /* synthetic */ C23538f zza;
            public final /* synthetic */ C23534e zzb;
            public final /* synthetic */ C23529c0 zzc;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public zzb(C23538f fVar, C23534e eVar, C23529c0 c0Var, C23349c<? super zzb> cVar) {
                super(2, cVar);
                this.zza = fVar;
                this.zzb = eVar;
                this.zzc = c0Var;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                return new zzb(this.zza, this.zzb, this.zzc, cVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((zzb) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C17885a.m44475z0(obj);
                this.zza.mo5763d(this.zzb, this.zzc);
                return C21050d.f52856a;
            }
        }

        public zza(C23538f fVar) {
            this.f30815b = fVar;
        }

        /* renamed from: c */
        public final void mo5762c(C23534e eVar, IOException iOException) {
            C25177g.m63218b(C7492a.f22972a, (CoroutineContext) null, new C26270zza(this.f30815b, eVar, iOException, (C23349c<? super C26270zza>) null), 3);
        }

        /* renamed from: d */
        public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
            C24362h.m61211f(eVar, "call");
            C24362h.m61211f(c0Var, Payload.RESPONSE);
            C25177g.m63218b(C7492a.f22972a, (CoroutineContext) null, new zzb(this.f30815b, eVar, c0Var, (C23349c<? super zzb>) null), 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzd(zzb zzb2, String str, C23349c cVar, C23538f fVar, C23566v vVar) {
        super(2, cVar);
        this.zzc = vVar;
        this.zzd = zzb2;
        this.zze = str;
        this.zzf = fVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new zzd(this.zzd, this.zze, cVar, this.zzf, this.zzc);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zzd) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
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
        FirebasePerfOkHttpClient.enqueue(C23569w.m57753i(vVar, (C23571x) obj, false), new zza(this.zzf));
        return C21050d.f52856a;
    }
}
