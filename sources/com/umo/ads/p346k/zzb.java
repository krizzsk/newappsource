package com.umo.ads.p346k;

import bf0.C21049c;
import com.cubic.umo.auth.api.AuthManager;
import ff0.C23349c;
import gf0.C23413c;
import hi0.C23571x;
import kotlin.C23812a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;
import lf0.C24225a;
import mf0.C24362h;

/* renamed from: com.umo.ads.k.zzb */
public final class zzb {

    /* renamed from: c */
    public static final C21049c<zzb> f30809c = C23812a.m58432b(zza.f30814f);

    /* renamed from: a */
    public final AuthManager f30810a = AuthManager.f7742h.getValue();

    /* renamed from: b */
    public final MutexImpl f30811b = new MutexImpl(false);

    /* renamed from: com.umo.ads.k.zzb$a */
    public static final class C12084a {
        /* renamed from: a */
        public static zzb m32052a() {
            return zzb.f30809c.getValue();
        }
    }

    /* renamed from: com.umo.ads.k.zzb$b */
    public static abstract class C12085b {

        /* renamed from: com.umo.ads.k.zzb$b$a */
        public static final class C12086a extends C12085b {

            /* renamed from: a */
            public static final C12086a f30812a = new C12086a();
        }

        /* renamed from: com.umo.ads.k.zzb$b$b */
        public static final class C12087b extends C12085b {

            /* renamed from: a */
            public final String f30813a;

            public C12087b(String str) {
                C24362h.m61211f(str, "reqPayload");
                this.f30813a = str;
            }
        }
    }

    /* renamed from: com.umo.ads.k.zzb$zza */
    public static final class zza extends Lambda implements C24225a<zzb> {

        /* renamed from: f */
        public static final zza f30814f = new zza();

        public zza() {
            super(0);
        }

        public final Object invoke() {
            return new zzb();
        }
    }

    @C23413c(mo58554c = "com.cubic.umo.ad.network.okhttp.NetworkManager", mo58555f = "NetworkManager.kt", mo58556l = {173}, mo58557m = "buildRequest")
    /* renamed from: com.umo.ads.k.zzb$zzd */
    public static final class zzd extends ContinuationImpl {
        public C23571x.C23572a zza;
        public String zzb;
        public /* synthetic */ Object zzc;
        public final /* synthetic */ zzb zzd;
        public int zze;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zzd(zzb zzb2, C23349c<? super zzd> cVar) {
            super(cVar);
            this.zzd = zzb2;
        }

        public final Object invokeSuspend(Object obj) {
            this.zzc = obj;
            this.zze |= Integer.MIN_VALUE;
            zzb zzb2 = this.zzd;
            C21049c<zzb> cVar = zzb.f30809c;
            return zzb2.mo35787a((C12085b) null, (String) null, this);
        }
    }

    @C23413c(mo58554c = "com.cubic.umo.ad.network.okhttp.NetworkManager", mo58555f = "NetworkManager.kt", mo58556l = {180, 181}, mo58557m = "getToken")
    /* renamed from: com.umo.ads.k.zzb$zze */
    public static final class zze extends ContinuationImpl {
        public zzb zza;
        public /* synthetic */ Object zzb;
        public final /* synthetic */ zzb zzc;
        public int zzd;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zze(zzb zzb2, C23349c<? super zze> cVar) {
            super(cVar);
            this.zzc = zzb2;
        }

        public final Object invokeSuspend(Object obj) {
            this.zzb = obj;
            this.zzd |= Integer.MIN_VALUE;
            zzb zzb2 = this.zzc;
            C21049c<zzb> cVar = zzb.f30809c;
            return zzb2.mo35788b(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        if (r7 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35787a(com.umo.ads.p346k.zzb.C12085b r22, java.lang.String r23, ff0.C23349c<? super hi0.C23571x> r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = r2 instanceof com.umo.ads.p346k.zzb.zzd
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.umo.ads.k.zzb$zzd r3 = (com.umo.ads.p346k.zzb.zzd) r3
            int r4 = r3.zze
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.zze = r4
            goto L_0x001e
        L_0x0019:
            com.umo.ads.k.zzb$zzd r3 = new com.umo.ads.k.zzb$zzd
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.zze
            r6 = 1
            if (r5 == 0) goto L_0x003a
            if (r5 != r6) goto L_0x0032
            java.lang.String r1 = r3.zzb
            hi0.x$a r3 = r3.zza
            p584jl.C17885a.m44475z0(r2)
            goto L_0x0138
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            p584jl.C17885a.m44475z0(r2)
            hi0.x$a r2 = new hi0.x$a
            r2.<init>()
            r5 = r23
            r2.mo58731e(r5)
            boolean r5 = r1 instanceof com.umo.ads.p346k.zzb.C12085b.C12086a
            r7 = 0
            if (r5 == 0) goto L_0x0053
            java.lang.String r1 = "GET"
            r2.mo58728b(r1, r7)
            goto L_0x0124
        L_0x0053:
            boolean r5 = r1 instanceof com.umo.ads.p346k.zzb.C12085b.C12087b
            if (r5 == 0) goto L_0x0124
            com.umo.ads.k.zzb$b$b r1 = (com.umo.ads.p346k.zzb.C12085b.C12087b) r1
            r1.getClass()
            hi0.t r5 = cc0.C7585a.f23100b
            java.lang.String r1 = r1.f30813a
            java.lang.String r8 = "<this>"
            mf0.C24362h.m61211f(r1, r8)
            java.lang.String r8 = "|"
            boolean r9 = uh0.C25081h.m62831B(r8)
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x0118
            java.util.List r9 = kotlin.text.C24179b.m60569Q(r1)
            int r1 = r1.length()
            int r10 = r9.size()
            r11 = 0
            int r10 = r10 * 0
            int r10 = r10 + r1
            lf0.l r1 = kotlin.text.C24178a.m60558w()
            int r12 = p583jk.C17875h.m44314y(r9)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r9 = r9.iterator()
            r14 = 0
        L_0x0090:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x00f2
            java.lang.Object r15 = r9.next()
            int r16 = r14 + 1
            if (r14 < 0) goto L_0x00ed
            java.lang.String r15 = (java.lang.String) r15
            if (r14 == 0) goto L_0x00a4
            if (r14 != r12) goto L_0x00ac
        L_0x00a4:
            boolean r14 = uh0.C25081h.m62831B(r15)
            if (r14 == 0) goto L_0x00ac
        L_0x00aa:
            r15 = r7
            goto L_0x00e3
        L_0x00ac:
            int r14 = r15.length()
        L_0x00b0:
            r7 = -1
            if (r11 >= r14) goto L_0x00c3
            char r17 = r15.charAt(r11)
            boolean r17 = mf0.C24361g.m61157a0(r17)
            r17 = r17 ^ 1
            if (r17 == 0) goto L_0x00c0
            goto L_0x00c4
        L_0x00c0:
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x00c3:
            r11 = -1
        L_0x00c4:
            if (r11 != r7) goto L_0x00c7
            goto L_0x00d8
        L_0x00c7:
            boolean r7 = r15.startsWith(r8, r11)
            if (r7 == 0) goto L_0x00d8
            int r11 = r11 + r6
            java.lang.String r7 = r15.substring(r11)
            java.lang.String r11 = "this as java.lang.String).substring(startIndex)"
            mf0.C24362h.m61210e(r7, r11)
            goto L_0x00d9
        L_0x00d8:
            r7 = 0
        L_0x00d9:
            if (r7 == 0) goto L_0x00e3
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x00aa
        L_0x00e3:
            if (r15 == 0) goto L_0x00e8
            r13.add(r15)
        L_0x00e8:
            r14 = r16
            r7 = 0
            r11 = 0
            goto L_0x0090
        L_0x00ed:
            p583jk.C17875h.m44294U()
            r1 = 0
            throw r1
        L_0x00f2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 124(0x7c, float:1.74E-43)
            java.lang.String r15 = "\n"
            r14 = r1
            kotlin.collections.C23825c.m58518o0(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            mf0.C24362h.m61210e(r1, r7)
            hi0.z r1 = hi0.C23521b0.m57647d(r1, r5)
            java.lang.String r5 = "POST"
            r2.mo58728b(r5, r1)
            goto L_0x0124
        L_0x0118:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "marginPrefix must be non-blank string."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0124:
            java.lang.String r1 = "Authorization"
            r3.zza = r2
            r3.zzb = r1
            r3.zze = r6
            java.lang.Object r3 = r0.mo35788b(r3)
            if (r3 != r4) goto L_0x0133
            return r4
        L_0x0133:
            r20 = r3
            r3 = r2
            r2 = r20
        L_0x0138:
            java.lang.String r2 = (java.lang.String) r2
            hi0.q$a r4 = r3.f59644c
            r4.mo58690a(r1, r2)
            hi0.x r1 = r3.mo58727a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p346k.zzb.mo35787a(com.umo.ads.k.zzb$b, java.lang.String, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35788b(ff0.C23349c<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.umo.ads.p346k.zzb.zze
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.umo.ads.k.zzb$zze r0 = (com.umo.ads.p346k.zzb.zze) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.umo.ads.k.zzb$zze r0 = new com.umo.ads.k.zzb$zze
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            com.umo.ads.k.zzb r0 = r0.zza
            p584jl.C17885a.m44475z0(r7)     // Catch:{ all -> 0x002d }
            goto L_0x0061
        L_0x002d:
            r7 = move-exception
            goto L_0x0073
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            com.umo.ads.k.zzb r2 = r0.zza
            p584jl.C17885a.m44475z0(r7)     // Catch:{ all -> 0x003d }
            goto L_0x0050
        L_0x003d:
            r7 = move-exception
            goto L_0x006f
        L_0x003f:
            p584jl.C17885a.m44475z0(r7)
            kotlinx.coroutines.sync.MutexImpl r7 = r6.f30811b     // Catch:{ all -> 0x0071 }
            r0.zza = r6     // Catch:{ all -> 0x0071 }
            r0.zzd = r4     // Catch:{ all -> 0x0071 }
            java.lang.Object r7 = r7.mo60395a(r5, r0)     // Catch:{ all -> 0x0071 }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r2 = r6
        L_0x0050:
            com.cubic.umo.auth.api.AuthManager r7 = r2.f30810a     // Catch:{ all -> 0x003d }
            r0.zza = r2     // Catch:{ all -> 0x003d }
            r0.zzd = r3     // Catch:{ all -> 0x003d }
            bf0.c<com.cubic.umo.auth.api.AuthManager> r3 = com.cubic.umo.auth.api.AuthManager.f7742h     // Catch:{ all -> 0x003d }
            r3 = 0
            java.lang.Object r7 = r7.mo11603d(r3, r0)     // Catch:{ all -> 0x003d }
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r0 = r2
        L_0x0061:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "Bearer "
            java.lang.String r7 = mf0.C24362h.m61216k(r7, r1)     // Catch:{ all -> 0x002d }
            kotlinx.coroutines.sync.MutexImpl r0 = r0.f30811b
            r0.mo60396b(r5)
            return r7
        L_0x006f:
            r0 = r2
            goto L_0x0073
        L_0x0071:
            r7 = move-exception
            r0 = r6
        L_0x0073:
            kotlinx.coroutines.sync.MutexImpl r0 = r0.f30811b
            r0.mo60396b(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p346k.zzb.mo35788b(ff0.c):java.lang.Object");
    }
}
