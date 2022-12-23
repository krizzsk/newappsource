package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p986firebaseauthapi.zzwa;
import com.google.android.gms.internal.p986firebaseauthapi.zzwe;
import com.google.android.gms.internal.p986firebaseauthapi.zzza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.CopyOnWriteArrayList;
import p357ae.C13430q;
import p382be.C13589b;
import p382be.C13600h;
import p382be.C13604l;
import p382be.C13608p;
import p382be.C13610r;
import p382be.C13611s;
import p382be.C13614v;
import p460ef.C16818b;
import p743qd.C19107d;
import p956ze.C20839b;

public abstract class FirebaseAuth implements C13589b {

    /* renamed from: a */
    public C19107d f36381a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f36382b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final CopyOnWriteArrayList f36383c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public CopyOnWriteArrayList f36384d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public zzwa f36385e;

    /* renamed from: f */
    public FirebaseUser f36386f;

    /* renamed from: g */
    public final Object f36387g = new Object();

    /* renamed from: h */
    public final Object f36388h = new Object();

    /* renamed from: i */
    public String f36389i;

    /* renamed from: j */
    public final C13608p f36390j;

    /* renamed from: k */
    public final C13614v f36391k;

    /* renamed from: l */
    public final C20839b f36392l;

    /* renamed from: m */
    public C13610r f36393m;

    /* renamed from: n */
    public C13611s f36394n = C13611s.f33579c;

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    public interface C14443a {
        /* renamed from: a */
        void mo43273a();
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    public interface C14444b {
        /* renamed from: a */
        void mo43274a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(p743qd.C19107d r13, p956ze.C20839b r14) {
        /*
            r12 = this;
            com.google.android.gms.internal.firebase-auth-api.zzwa r0 = new com.google.android.gms.internal.firebase-auth-api.zzwa
            r0.<init>(r13)
            be.p r1 = new be.p
            r13.mo51535a()
            android.content.Context r2 = r13.f48568a
            java.lang.String r3 = r13.mo51538f()
            r1.<init>(r2, r3)
            be.v r2 = p382be.C13614v.f33582b
            be.w r3 = p382be.C13615w.f33584a
            r12.<init>()
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r12.f36382b = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r12.f36383c = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r12.f36384d = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r12.f36387g = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r12.f36388h = r4
            be.s r4 = p382be.C13611s.f33579c
            r12.f36394n = r4
            java.lang.Object r13 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            qd.d r13 = (p743qd.C19107d) r13
            r12.f36381a = r13
            java.lang.Object r13 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.firebase-auth-api.zzwa r13 = (com.google.android.gms.internal.p986firebaseauthapi.zzwa) r13
            r12.f36385e = r13
            java.lang.Object r13 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            be.p r13 = (p382be.C13608p) r13
            r12.f36390j = r13
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            be.v r0 = (p382be.C13614v) r0
            r12.f36391k = r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            be.w r0 = (p382be.C13615w) r0
            r12.f36392l = r14
            java.lang.String r14 = "type"
            android.content.SharedPreferences r0 = r13.f33575a
            java.lang.String r1 = "com.google.firebase.auth.FIREBASE_USER"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x007b
            goto L_0x0098
        L_0x007b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0097 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0097 }
            boolean r0 = r1.has(r14)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            java.lang.String r14 = r1.optString(r14)     // Catch:{ Exception -> 0x0097 }
            boolean r14 = r0.equalsIgnoreCase(r14)     // Catch:{ Exception -> 0x0097 }
            if (r14 == 0) goto L_0x0098
            com.google.firebase.auth.internal.zzx r13 = r13.mo40505a(r1)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0099
        L_0x0097:
        L_0x0098:
            r13 = r2
        L_0x0099:
            r12.f36386f = r13
            r14 = 0
            r0 = 1
            if (r13 == 0) goto L_0x00ca
            be.p r1 = r12.f36390j
            r1.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            android.content.SharedPreferences r1 = r1.f33575a
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.google.firebase.auth.internal.zzt r13 = r13.f36451c
            java.lang.String r13 = r13.f36442b
            r3[r14] = r13
            java.lang.String r13 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r13 = java.lang.String.format(r13, r3)
            java.lang.String r13 = r1.getString(r13, r2)
            if (r13 == 0) goto L_0x00c2
            com.google.android.gms.internal.firebase-auth-api.zzza r13 = com.google.android.gms.internal.p986firebaseauthapi.zzza.zzd(r13)
            goto L_0x00c3
        L_0x00c2:
            r13 = r2
        L_0x00c3:
            if (r13 == 0) goto L_0x00ca
            com.google.firebase.auth.FirebaseUser r1 = r12.f36386f
            m35915d(r12, r1, r13, r14, r14)
        L_0x00ca:
            be.v r13 = r12.f36391k
            be.o r13 = r13.f33583a
            r13.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            qd.d r13 = r12.f36381a
            r13.mo51535a()
            android.content.Context r13 = r13.f48568a
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r1, r14)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r13.getString(r1, r3)
            qd.d r3 = r12.f36381a
            r3.mo51535a()
            java.lang.String r3 = r3.f48569b
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00f8
            goto L_0x0367
        L_0x00f8:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r1 = r13.contains(r1)
            r3 = 0
            r5 = -1
            if (r1 == 0) goto L_0x0300
            java.lang.String r1 = "verifyAssertionRequest"
            java.lang.String r6 = ""
            java.lang.String r1 = r13.getString(r1, r6)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzaaa> r6 = com.google.android.gms.internal.p986firebaseauthapi.zzaaa.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromString(r1, r6)
            com.google.android.gms.internal.firebase-auth-api.zzaaa r1 = (com.google.android.gms.internal.p986firebaseauthapi.zzaaa) r1
            java.lang.String r6 = "operation"
            java.lang.String r7 = ""
            java.lang.String r6 = r13.getString(r6, r7)
            java.lang.String r7 = "tenantId"
            java.lang.String r7 = r13.getString(r7, r2)
            java.lang.String r8 = "firebaseUserUid"
            java.lang.String r9 = ""
            java.lang.String r8 = r13.getString(r8, r9)
            java.lang.String r9 = "timestamp"
            r13.getLong(r9, r3)
            if (r7 == 0) goto L_0x0140
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            java.lang.Object r3 = r12.f36388h
            monitor-enter(r3)
            r12.f36389i = r7     // Catch:{ all -> 0x013d }
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            r1.zzf(r7)
            goto L_0x0140
        L_0x013d:
            r13 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            throw r13
        L_0x0140:
            int r3 = r6.hashCode()
            r4 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r7 = 2
            if (r3 == r4) goto L_0x0169
            r4 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r3 == r4) goto L_0x015f
            r4 = 1450464913(0x56745691, float:6.7163159E13)
            if (r3 == r4) goto L_0x0155
            goto L_0x0172
        L_0x0155:
            java.lang.String r3 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0172
            r5 = 0
            goto L_0x0172
        L_0x015f:
            java.lang.String r3 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0172
            r5 = 1
            goto L_0x0172
        L_0x0169:
            java.lang.String r3 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0172
            r5 = 2
        L_0x0172:
            r3 = 17072(0x42b0, float:2.3923E-41)
            if (r5 == 0) goto L_0x026c
            if (r5 == r0) goto L_0x023f
            if (r5 == r7) goto L_0x017c
            goto L_0x02fc
        L_0x017c:
            com.google.firebase.auth.FirebaseUser r4 = r12.f36386f
            java.lang.String r4 = r4.mo43282l2()
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x02fc
            com.google.firebase.auth.FirebaseUser r7 = r12.f36386f
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m35960k2(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.firebase.auth.AuthCredential r8 = r1.mo43328j2()
            boolean r1 = r8 instanceof com.google.firebase.auth.EmailAuthCredential
            if (r1 == 0) goto L_0x0211
            com.google.firebase.auth.EmailAuthCredential r8 = (com.google.firebase.auth.EmailAuthCredential) r8
            java.lang.String r1 = r8.f36376c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r4 = "password"
            if (r1 != 0) goto L_0x01aa
            r1 = r4
            goto L_0x01ac
        L_0x01aa:
            java.lang.String r1 = "emailLink"
        L_0x01ac:
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x01d0
            com.google.android.gms.internal.firebase-auth-api.zzwa r5 = r12.f36385e
            qd.d r6 = r12.f36381a
            java.lang.String r14 = r8.f36375b
            java.lang.String r0 = r8.f36376c
            java.lang.String r9 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r10 = r7.mo43281k2()
            ae.s r11 = new ae.s
            r0 = r12
            be.e0 r0 = (p382be.C13596e0) r0
            r11.<init>(r0)
            r8 = r14
            r5.zzp(r6, r7, r8, r9, r10, r11)
            goto L_0x02fc
        L_0x01d0:
            java.lang.String r1 = r8.f36377d
            java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            java.util.Map r4 = p357ae.C13414a.f33281c
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            ae.a r4 = new ae.a     // Catch:{ IllegalArgumentException -> 0x01e2 }
            r4.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x01e2 }
            r2 = r4
            goto L_0x01e3
        L_0x01e2:
        L_0x01e3:
            if (r2 == 0) goto L_0x01f0
            java.lang.String r1 = r12.f36389i
            java.lang.String r2 = r2.f33283b
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01f0
            r14 = 1
        L_0x01f0:
            if (r14 == 0) goto L_0x0200
            com.google.android.gms.common.api.Status r14 = new com.google.android.gms.common.api.Status
            r14.<init>(r3)
            com.google.firebase.FirebaseException r14 = com.google.android.gms.internal.p986firebaseauthapi.zzwe.zza(r14)
            com.google.android.gms.tasks.Tasks.forException(r14)
            goto L_0x02fc
        L_0x0200:
            com.google.android.gms.internal.firebase-auth-api.zzwa r14 = r12.f36385e
            qd.d r0 = r12.f36381a
            ae.s r1 = new ae.s
            r2 = r12
            be.e0 r2 = (p382be.C13596e0) r2
            r1.<init>(r2)
            r14.zzn(r0, r7, r8, r1)
            goto L_0x02fc
        L_0x0211:
            boolean r14 = r8 instanceof com.google.firebase.auth.PhoneAuthCredential
            if (r14 == 0) goto L_0x022a
            com.google.android.gms.internal.firebase-auth-api.zzwa r5 = r12.f36385e
            qd.d r6 = r12.f36381a
            com.google.firebase.auth.PhoneAuthCredential r8 = (com.google.firebase.auth.PhoneAuthCredential) r8
            java.lang.String r9 = r12.f36389i
            ae.s r10 = new ae.s
            r14 = r12
            be.e0 r14 = (p382be.C13596e0) r14
            r10.<init>(r14)
            r5.zzr(r6, r7, r8, r9, r10)
            goto L_0x02fc
        L_0x022a:
            com.google.android.gms.internal.firebase-auth-api.zzwa r5 = r12.f36385e
            qd.d r6 = r12.f36381a
            java.lang.String r9 = r7.mo43281k2()
            ae.s r10 = new ae.s
            r14 = r12
            be.e0 r14 = (p382be.C13596e0) r14
            r10.<init>(r14)
            r5.zzl(r6, r7, r8, r9, r10)
            goto L_0x02fc
        L_0x023f:
            com.google.firebase.auth.FirebaseUser r14 = r12.f36386f
            java.lang.String r14 = r14.mo43282l2()
            boolean r14 = r14.equals(r8)
            if (r14 == 0) goto L_0x02fc
            com.google.firebase.auth.FirebaseUser r14 = r12.f36386f
            com.google.firebase.auth.zze r0 = com.google.firebase.auth.zze.m35960k2(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            com.google.android.gms.internal.firebase-auth-api.zzwa r1 = r12.f36385e
            qd.d r2 = r12.f36381a
            com.google.firebase.auth.AuthCredential r0 = r0.mo43328j2()
            ae.s r3 = new ae.s
            r4 = r12
            be.e0 r4 = (p382be.C13596e0) r4
            r3.<init>(r4)
            r1.zzj(r2, r14, r0, r3)
            goto L_0x02fc
        L_0x026c:
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m35960k2(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.firebase.auth.AuthCredential r1 = r1.mo43328j2()
            boolean r4 = r1 instanceof com.google.firebase.auth.EmailAuthCredential
            if (r4 == 0) goto L_0x02d9
            com.google.firebase.auth.EmailAuthCredential r1 = (com.google.firebase.auth.EmailAuthCredential) r1
            java.lang.String r4 = r1.f36377d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ r0
            if (r4 != 0) goto L_0x029d
            com.google.android.gms.internal.firebase-auth-api.zzwa r5 = r12.f36385e
            qd.d r6 = r12.f36381a
            java.lang.String r7 = r1.f36375b
            java.lang.String r14 = r1.f36376c
            java.lang.String r8 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            java.lang.String r9 = r12.f36389i
            ae.r r10 = new ae.r
            r10.<init>(r12)
            r5.zzA(r6, r7, r8, r9, r10)
            goto L_0x02fc
        L_0x029d:
            java.lang.String r4 = r1.f36377d
            java.lang.String r4 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            java.util.Map r5 = p357ae.C13414a.f33281c
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            ae.a r5 = new ae.a     // Catch:{ IllegalArgumentException -> 0x02af }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x02af }
            r2 = r5
            goto L_0x02b0
        L_0x02af:
        L_0x02b0:
            if (r2 == 0) goto L_0x02bd
            java.lang.String r4 = r12.f36389i
            java.lang.String r2 = r2.f33283b
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 != 0) goto L_0x02bd
            r14 = 1
        L_0x02bd:
            if (r14 == 0) goto L_0x02cc
            com.google.android.gms.common.api.Status r14 = new com.google.android.gms.common.api.Status
            r14.<init>(r3)
            com.google.firebase.FirebaseException r14 = com.google.android.gms.internal.p986firebaseauthapi.zzwe.zza(r14)
            com.google.android.gms.tasks.Tasks.forException(r14)
            goto L_0x02fc
        L_0x02cc:
            com.google.android.gms.internal.firebase-auth-api.zzwa r14 = r12.f36385e
            qd.d r0 = r12.f36381a
            ae.r r2 = new ae.r
            r2.<init>(r12)
            r14.zzB(r0, r1, r2)
            goto L_0x02fc
        L_0x02d9:
            boolean r14 = r1 instanceof com.google.firebase.auth.PhoneAuthCredential
            if (r14 == 0) goto L_0x02ee
            com.google.firebase.auth.PhoneAuthCredential r1 = (com.google.firebase.auth.PhoneAuthCredential) r1
            com.google.android.gms.internal.firebase-auth-api.zzwa r14 = r12.f36385e
            qd.d r0 = r12.f36381a
            java.lang.String r2 = r12.f36389i
            ae.r r3 = new ae.r
            r3.<init>(r12)
            r14.zzC(r0, r1, r2, r3)
            goto L_0x02fc
        L_0x02ee:
            com.google.android.gms.internal.firebase-auth-api.zzwa r14 = r12.f36385e
            qd.d r0 = r12.f36381a
            java.lang.String r2 = r12.f36389i
            ae.r r3 = new ae.r
            r3.<init>(r12)
            r14.zzy(r0, r1, r2, r3)
        L_0x02fc:
            p382be.C13607o.m34022a(r13)
            goto L_0x0367
        L_0x0300:
            java.lang.String r0 = "recaptchaToken"
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x033b
            java.lang.String r0 = "recaptchaToken"
            java.lang.String r1 = ""
            java.lang.String r0 = r13.getString(r0, r1)
            java.lang.String r1 = "operation"
            java.lang.String r2 = ""
            java.lang.String r1 = r13.getString(r1, r2)
            java.lang.String r2 = "timestamp"
            r13.getLong(r2, r3)
            int r2 = r1.hashCode()
            r3 = -214796028(0xfffffffff3327904, float:-1.4140065E31)
            if (r2 == r3) goto L_0x0327
            goto L_0x0330
        L_0x0327:
            java.lang.String r2 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0330
            goto L_0x0331
        L_0x0330:
            r14 = -1
        L_0x0331:
            if (r14 == 0) goto L_0x0334
            goto L_0x0337
        L_0x0334:
            com.google.android.gms.tasks.Tasks.forResult(r0)
        L_0x0337:
            p382be.C13607o.m34022a(r13)
            goto L_0x0367
        L_0x033b:
            java.lang.String r14 = "statusCode"
            boolean r14 = r13.contains(r14)
            if (r14 == 0) goto L_0x0367
            java.lang.String r14 = "statusCode"
            r0 = 17062(0x42a6, float:2.3909E-41)
            int r14 = r13.getInt(r14, r0)
            java.lang.String r0 = "statusMessage"
            java.lang.String r1 = ""
            java.lang.String r0 = r13.getString(r0, r1)
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r1.<init>((int) r14, (java.lang.String) r0)
            java.lang.String r14 = "timestamp"
            r13.getLong(r14, r3)
            p382be.C13607o.m34022a(r13)
            com.google.firebase.FirebaseException r13 = com.google.android.gms.internal.p986firebaseauthapi.zzwe.zza(r1)
            com.google.android.gms.tasks.Tasks.forException(r13)
        L_0x0367:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(qd.d, ze.b):void");
    }

    /* renamed from: c */
    public static void m35914c(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser != null) {
            firebaseUser.mo43282l2();
        }
        if (firebaseUser != null) {
            str = firebaseUser.zze();
        } else {
            str = null;
        }
        firebaseAuth.f36394n.execute(new C14445a(firebaseAuth, new C16818b(str)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:48|49|50|51|52|53) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0148 */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m35915d(com.google.firebase.auth.FirebaseAuth r15, com.google.firebase.auth.FirebaseUser r16, com.google.android.gms.internal.p986firebaseauthapi.zzza r17, boolean r18, boolean r19) {
        /*
            r0 = r15
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r16)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r17)
            com.google.firebase.auth.FirebaseUser r1 = r0.f36386f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = r16.mo43282l2()
            com.google.firebase.auth.FirebaseUser r4 = r0.f36386f
            java.lang.String r4 = r4.mo43282l2()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 != 0) goto L_0x0026
            if (r19 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            return
        L_0x0026:
            com.google.firebase.auth.FirebaseUser r4 = r0.f36386f
            if (r4 != 0) goto L_0x002d
            r1 = 1
            r4 = 1
            goto L_0x0046
        L_0x002d:
            com.google.android.gms.internal.firebase-auth-api.zzza r4 = r4.mo43287q2()
            java.lang.String r4 = r4.zze()
            java.lang.String r5 = r17.zze()
            boolean r4 = r4.equals(r5)
            r4 = r4 ^ r3
            if (r1 == 0) goto L_0x0044
            if (r4 != 0) goto L_0x0044
            r4 = 0
            goto L_0x0045
        L_0x0044:
            r4 = 1
        L_0x0045:
            r1 = r1 ^ r3
        L_0x0046:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r16)
            com.google.firebase.auth.FirebaseUser r5 = r0.f36386f
            if (r5 != 0) goto L_0x0052
            r6 = r16
            r0.f36386f = r6
            goto L_0x0097
        L_0x0052:
            r6 = r16
            java.util.List r7 = r16.mo43280j2()
            r5.mo43286p2(r7)
            boolean r5 = r16.mo43283m2()
            if (r5 != 0) goto L_0x0066
            com.google.firebase.auth.FirebaseUser r5 = r0.f36386f
            r5.mo43285o2()
        L_0x0066:
            g3.a r5 = r16.mo43279i2()
            java.lang.Object r5 = r5.f16037a
            com.google.firebase.auth.internal.zzx r5 = (com.google.firebase.auth.internal.zzx) r5
            com.google.firebase.auth.internal.zzbb r5 = r5.f36461m
            if (r5 == 0) goto L_0x008d
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r5 = r5.f36435b
            java.util.Iterator r5 = r5.iterator()
        L_0x007d:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0092
            java.lang.Object r8 = r5.next()
            com.google.firebase.auth.PhoneMultiFactorInfo r8 = (com.google.firebase.auth.PhoneMultiFactorInfo) r8
            r7.add(r8)
            goto L_0x007d
        L_0x008d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0092:
            com.google.firebase.auth.FirebaseUser r5 = r0.f36386f
            r5.mo43289s2(r7)
        L_0x0097:
            if (r18 == 0) goto L_0x01c4
            be.p r5 = r0.f36390j
            com.google.firebase.auth.FirebaseUser r7 = r0.f36386f
            r5.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.Class<com.google.firebase.auth.internal.zzx> r9 = com.google.firebase.auth.internal.zzx.class
            java.lang.Class r10 = r7.getClass()
            boolean r9 = r9.isAssignableFrom(r10)
            if (r9 == 0) goto L_0x01ae
            com.google.firebase.auth.internal.zzx r7 = (com.google.firebase.auth.internal.zzx) r7
            java.lang.String r9 = "cachedTokenState"
            java.lang.String r10 = r7.zzf()     // Catch:{ Exception -> 0x019e }
            r8.put(r9, r10)     // Catch:{ Exception -> 0x019e }
            java.lang.String r9 = "applicationName"
            qd.d r10 = r7.mo43284n2()     // Catch:{ Exception -> 0x019e }
            r10.mo51535a()     // Catch:{ Exception -> 0x019e }
            java.lang.String r10 = r10.f48569b     // Catch:{ Exception -> 0x019e }
            r8.put(r9, r10)     // Catch:{ Exception -> 0x019e }
            java.lang.String r9 = "type"
            java.lang.String r10 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r8.put(r9, r10)     // Catch:{ Exception -> 0x019e }
            java.util.List r9 = r7.f36454f     // Catch:{ Exception -> 0x019e }
            if (r9 == 0) goto L_0x011f
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Exception -> 0x019e }
            r9.<init>()     // Catch:{ Exception -> 0x019e }
            java.util.List r10 = r7.f36454f     // Catch:{ Exception -> 0x019e }
            int r11 = r10.size()     // Catch:{ Exception -> 0x019e }
            int r12 = r10.size()     // Catch:{ Exception -> 0x019e }
            r13 = 30
            if (r12 <= r13) goto L_0x0107
            com.google.android.gms.common.logging.Logger r11 = r5.f33576b     // Catch:{ Exception -> 0x019e }
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x019e }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x019e }
            r12[r2] = r14     // Catch:{ Exception -> 0x019e }
            int r14 = r10.size()     // Catch:{ Exception -> 0x019e }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x019e }
            r12[r3] = r14     // Catch:{ Exception -> 0x019e }
            java.lang.String r14 = "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"
            r11.mo65859w(r14, r12)     // Catch:{ Exception -> 0x019e }
            r11 = 30
        L_0x0107:
            r12 = 0
        L_0x0108:
            if (r12 >= r11) goto L_0x011a
            java.lang.Object r13 = r10.get(r12)     // Catch:{ Exception -> 0x019e }
            com.google.firebase.auth.internal.zzt r13 = (com.google.firebase.auth.internal.zzt) r13     // Catch:{ Exception -> 0x019e }
            java.lang.String r13 = r13.zzb()     // Catch:{ Exception -> 0x019e }
            r9.put(r13)     // Catch:{ Exception -> 0x019e }
            int r12 = r12 + 1
            goto L_0x0108
        L_0x011a:
            java.lang.String r10 = "userInfos"
            r8.put(r10, r9)     // Catch:{ Exception -> 0x019e }
        L_0x011f:
            java.lang.String r9 = "anonymous"
            boolean r10 = r7.mo43283m2()     // Catch:{ Exception -> 0x019e }
            r8.put(r9, r10)     // Catch:{ Exception -> 0x019e }
            java.lang.String r9 = "version"
            java.lang.String r10 = "2"
            r8.put(r9, r10)     // Catch:{ Exception -> 0x019e }
            com.google.firebase.auth.internal.zzz r9 = r7.f36458j     // Catch:{ Exception -> 0x019e }
            if (r9 == 0) goto L_0x014b
            java.lang.String r10 = "userMetadata"
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x019e }
            r11.<init>()     // Catch:{ Exception -> 0x019e }
            java.lang.String r12 = "lastSignInTimestamp"
            long r13 = r9.f36462b     // Catch:{ JSONException -> 0x0148 }
            r11.put(r12, r13)     // Catch:{ JSONException -> 0x0148 }
            java.lang.String r12 = "creationTimestamp"
            long r13 = r9.f36463c     // Catch:{ JSONException -> 0x0148 }
            r11.put(r12, r13)     // Catch:{ JSONException -> 0x0148 }
        L_0x0148:
            r8.put(r10, r11)     // Catch:{ Exception -> 0x019e }
        L_0x014b:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ Exception -> 0x019e }
            com.google.firebase.auth.internal.zzbb r7 = r7.f36461m     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x016d
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x019e }
            r9.<init>()     // Catch:{ Exception -> 0x019e }
            java.util.List r7 = r7.f36435b     // Catch:{ Exception -> 0x019e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x019e }
        L_0x015d:
            boolean r10 = r7.hasNext()     // Catch:{ Exception -> 0x019e }
            if (r10 == 0) goto L_0x0172
            java.lang.Object r10 = r7.next()     // Catch:{ Exception -> 0x019e }
            com.google.firebase.auth.PhoneMultiFactorInfo r10 = (com.google.firebase.auth.PhoneMultiFactorInfo) r10     // Catch:{ Exception -> 0x019e }
            r9.add(r10)     // Catch:{ Exception -> 0x019e }
            goto L_0x015d
        L_0x016d:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x019e }
            r9.<init>()     // Catch:{ Exception -> 0x019e }
        L_0x0172:
            boolean r7 = r9.isEmpty()     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x0199
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x019e }
            r7.<init>()     // Catch:{ Exception -> 0x019e }
            r10 = 0
        L_0x017e:
            int r11 = r9.size()     // Catch:{ Exception -> 0x019e }
            if (r10 >= r11) goto L_0x0194
            java.lang.Object r11 = r9.get(r10)     // Catch:{ Exception -> 0x019e }
            com.google.firebase.auth.MultiFactorInfo r11 = (com.google.firebase.auth.MultiFactorInfo) r11     // Catch:{ Exception -> 0x019e }
            org.json.JSONObject r11 = r11.toJson()     // Catch:{ Exception -> 0x019e }
            r7.put(r11)     // Catch:{ Exception -> 0x019e }
            int r10 = r10 + 1
            goto L_0x017e
        L_0x0194:
            java.lang.String r9 = "userMultiFactorInfo"
            r8.put(r9, r7)     // Catch:{ Exception -> 0x019e }
        L_0x0199:
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x019e }
            goto L_0x01af
        L_0x019e:
            r0 = move-exception
            com.google.android.gms.common.logging.Logger r1 = r5.f33576b
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Failed to turn object into JSON"
            r1.wtf(r3, r0, r2)
            com.google.android.gms.internal.firebase-auth-api.zzpz r1 = new com.google.android.gms.internal.firebase-auth-api.zzpz
            r1.<init>(r0)
            throw r1
        L_0x01ae:
            r7 = 0
        L_0x01af:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x01c4
            android.content.SharedPreferences r5 = r5.f33575a
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r8 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r5 = r5.putString(r8, r7)
            r5.apply()
        L_0x01c4:
            if (r4 == 0) goto L_0x01d5
            com.google.firebase.auth.FirebaseUser r4 = r0.f36386f
            r5 = r17
            if (r4 == 0) goto L_0x01cf
            r4.mo43288r2(r5)
        L_0x01cf:
            com.google.firebase.auth.FirebaseUser r4 = r0.f36386f
            m35914c(r15, r4)
            goto L_0x01d7
        L_0x01d5:
            r5 = r17
        L_0x01d7:
            if (r1 == 0) goto L_0x01ea
            com.google.firebase.auth.FirebaseUser r1 = r0.f36386f
            if (r1 == 0) goto L_0x01e0
            r1.mo43282l2()
        L_0x01e0:
            be.s r1 = r0.f36394n
            com.google.firebase.auth.b r4 = new com.google.firebase.auth.b
            r4.<init>(r15)
            r1.execute(r4)
        L_0x01ea:
            if (r18 == 0) goto L_0x0216
            be.p r1 = r0.f36390j
            r1.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r16)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r17)
            android.content.SharedPreferences r1 = r1.f33575a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r16.mo43282l2()
            r3[r2] = r4
            java.lang.String r2 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = r17.zzh()
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            r1.apply()
        L_0x0216:
            com.google.firebase.auth.FirebaseUser r1 = r0.f36386f
            if (r1 == 0) goto L_0x0256
            be.r r2 = r0.f36393m
            if (r2 != 0) goto L_0x022d
            qd.d r2 = r0.f36381a
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            qd.d r2 = (p743qd.C19107d) r2
            be.r r3 = new be.r
            r3.<init>(r2)
            r0.f36393m = r3
        L_0x022d:
            be.r r0 = r0.f36393m
            com.google.android.gms.internal.firebase-auth-api.zzza r1 = r1.mo43287q2()
            r0.getClass()
            if (r1 != 0) goto L_0x0239
            goto L_0x0256
        L_0x0239:
            long r2 = r1.zzb()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0245
            r2 = 3600(0xe10, double:1.7786E-320)
        L_0x0245:
            long r4 = r1.zzc()
            be.h r0 = r0.f33578a
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            long r2 = r2 + r4
            r0.f33566a = r2
            r1 = -1
            r0.f33567b = r1
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.m35915d(com.google.firebase.auth.FirebaseAuth, com.google.firebase.auth.FirebaseUser, com.google.android.gms.internal.firebase-auth-api.zzza, boolean, boolean):void");
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C19107d.m46265d().mo51536b(FirebaseAuth.class);
    }

    /* renamed from: a */
    public final Task mo43270a(boolean z) {
        return mo43272e(this.f36386f, z);
    }

    /* renamed from: b */
    public final void mo43271b() {
        Preconditions.checkNotNull(this.f36390j);
        FirebaseUser firebaseUser = this.f36386f;
        if (firebaseUser != null) {
            C13608p pVar = this.f36390j;
            Preconditions.checkNotNull(firebaseUser);
            pVar.f33575a.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.mo43282l2()})).apply();
            this.f36386f = null;
        }
        this.f36390j.f33575a.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        m35914c(this, (FirebaseUser) null);
        this.f36394n.execute(new C14446b(this));
        C13610r rVar = this.f36393m;
        if (rVar != null) {
            C13600h hVar = rVar.f33578a;
            hVar.f33568c.removeCallbacks(hVar.f33569d);
        }
    }

    /* renamed from: e */
    public final Task mo43272e(FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.forException(zzwe.zza(new Status(17495)));
        }
        zzza q2 = firebaseUser.mo43287q2();
        if (!q2.zzj() || z) {
            return this.f36385e.zzi(this.f36381a, firebaseUser, q2.zzf(), new C13430q(this));
        }
        return Tasks.forResult(C13604l.m34017a(q2.zze()));
    }

    @Keep
    public static FirebaseAuth getInstance(C19107d dVar) {
        return (FirebaseAuth) dVar.mo51536b(FirebaseAuth.class);
    }
}
