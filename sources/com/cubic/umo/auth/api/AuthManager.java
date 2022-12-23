package com.cubic.umo.auth.api;

import android.util.Base64;
import bf0.C21049c;
import bi0.C21065d;
import com.cubic.umo.Environment;
import com.cubic.umo.auth.CubicAuth;
import com.cubic.umo.auth.api.model.AnonymousJWT;
import com.cubic.umo.auth.api.model.OpenIdToken;
import com.cubic.umo.auth.api.model.UserJWT;
import com.cubic.umo.auth.database.AuthDatabase;
import com.cubic.umo.auth.provider.ProviderFactory;
import com.cubic.umo.auth.provider.TokenPrefsProvider;
import com.cubic.umo.auth.provider.TokenProvider;
import com.cubic.umo.exception.AuthenticationException;
import com.squareup.moshi.C8017o;
import ff0.C23349c;
import kotlin.C23812a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C24179b;
import kotlinx.coroutines.sync.MutexImpl;
import mf0.C24362h;
import p096g7.C4839a;
import p134j7.C5388a;
import p147k7.C5520a;
import p158l7.C5631a;
import p158l7.C5635e;
import p170m7.C5714a;
import p170m7.C5715b;
import p170m7.C5716c;
import p196o7.C6009a;
import p335z7.C7492a;
import p389bl.C13637c;
import p583jk.C17884p;
import uh0.C25072a;
import wh0.C25177g;
import wh0.C25184i0;

public final class AuthManager {

    /* renamed from: h */
    public static final C21049c<AuthManager> f7742h = C23812a.m58432b(AuthManager$Companion$sInstance$2.f7750f);

    /* renamed from: a */
    public TokenProvider f7743a;

    /* renamed from: b */
    public final C5388a f7744b;

    /* renamed from: c */
    public final TokenPrefsProvider f7745c;

    /* renamed from: d */
    public final C21065d f7746d = C13637c.m34064a(C17884p.m44356a().mo53082y(C25184i0.f63459a));

    /* renamed from: e */
    public C5635e f7747e;

    /* renamed from: f */
    public C5631a f7748f;

    /* renamed from: g */
    public final MutexImpl f7749g = new MutexImpl(false);

    public AuthManager(C6009a aVar, Environment environment) {
        this.f7744b = new C5388a(aVar, environment);
        C21049c cVar = CubicAuth.f7726a;
        this.f7747e = ((AuthDatabase) cVar.getValue()).mo11613m();
        this.f7748f = ((AuthDatabase) cVar.getValue()).mo11612l();
        this.f7745c = (TokenPrefsProvider) ProviderFactory.f7816a.getValue();
    }

    /* renamed from: a */
    public static final C5716c m5981a(AuthManager authManager, C5714a aVar, OpenIdToken openIdToken) {
        C5716c cVar;
        AuthManager authManager2 = authManager;
        C5714a aVar2 = aVar;
        OpenIdToken openIdToken2 = openIdToken;
        C5716c b = authManager2.f7747e.mo21495b(aVar2.f18517a);
        long currentTimeMillis = System.currentTimeMillis();
        long j = (((long) openIdToken2.f7765b) * 1000) + currentTimeMillis;
        long j2 = currentTimeMillis + (((long) openIdToken2.f7766c) * 1000);
        if (b == null) {
            cVar = null;
        } else {
            String str = openIdToken2.f7764a;
            String str2 = openIdToken2.f7767d;
            String str3 = openIdToken2.f7768e;
            long j3 = b.f18531a;
            C24362h.m61211f(str, "accessToken");
            C24362h.m61211f(str2, "refreshToken");
            C24362h.m61211f(str3, "tokenType");
            cVar = new C5716c(j3, str, j, j2, str2, str3);
            authManager2.f7747e.mo21497d(cVar);
        }
        if (cVar != null) {
            return cVar;
        }
        C5716c cVar2 = new C5716c(aVar2.f18517a, openIdToken2.f7764a, j, j2, openIdToken2.f7767d, openIdToken2.f7768e);
        authManager2.f7747e.mo21494a(cVar2);
        return cVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m5982b(com.cubic.umo.auth.api.AuthManager r8, java.lang.String r9, p096g7.C4839a r10, ff0.C23349c r11) {
        /*
            r8.getClass()
            java.lang.Class<com.cubic.umo.auth.api.model.AnonymousJWT> r0 = com.cubic.umo.auth.api.model.AnonymousJWT.class
            boolean r1 = r11 instanceof com.cubic.umo.auth.api.AuthManager$refreshGuestToken$1
            if (r1 == 0) goto L_0x0018
            r1 = r11
            com.cubic.umo.auth.api.AuthManager$refreshGuestToken$1 r1 = (com.cubic.umo.auth.api.AuthManager$refreshGuestToken$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001d
        L_0x0018:
            com.cubic.umo.auth.api.AuthManager$refreshGuestToken$1 r1 = new com.cubic.umo.auth.api.AuthManager$refreshGuestToken$1
            r1.<init>(r8, r11)
        L_0x001d:
            java.lang.Object r11 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x004e
            if (r3 == r7) goto L_0x0046
            if (r3 == r6) goto L_0x0042
            if (r3 == r5) goto L_0x003e
            if (r3 != r4) goto L_0x0036
            p584jl.C17885a.m44475z0(r11)
            goto L_0x009e
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            p584jl.C17885a.m44475z0(r11)
            goto L_0x006c
        L_0x0042:
            p584jl.C17885a.m44475z0(r11)
            goto L_0x008e
        L_0x0046:
            java.lang.Object r8 = r1.L$0
            com.cubic.umo.auth.api.AuthManager r8 = (com.cubic.umo.auth.api.AuthManager) r8
            p584jl.C17885a.m44475z0(r11)
            goto L_0x0080
        L_0x004e:
            p584jl.C17885a.m44475z0(r11)
            boolean r11 = r10 instanceof p096g7.C4839a.C4840a
            if (r11 == 0) goto L_0x0095
            r11 = r10
            g7.a$a r11 = (p096g7.C4839a.C4840a) r11
            int r11 = r11.f16261a
            r3 = 400(0x190, float:5.6E-43)
            if (r11 == r3) goto L_0x0073
            r3 = 401(0x191, float:5.62E-43)
            if (r11 != r3) goto L_0x0063
            goto L_0x0073
        L_0x0063:
            r1.label = r5
            java.lang.Object r11 = r8.mo11604e(r10, r0, r1)
            if (r11 != r2) goto L_0x006c
            goto L_0x00a5
        L_0x006c:
            m7.b r11 = (p170m7.C5715b) r11
            m7.c r8 = r11.f18530b
            java.lang.String r8 = r8.f18532b
            goto L_0x00a4
        L_0x0073:
            j7.a r10 = r8.f7744b
            r1.L$0 = r8
            r1.label = r7
            java.lang.Object r11 = r10.mo21156n(r9, r1)
            if (r11 != r2) goto L_0x0080
            goto L_0x00a5
        L_0x0080:
            g7.a r11 = (p096g7.C4839a) r11
            r9 = 0
            r1.L$0 = r9
            r1.label = r6
            java.lang.Object r11 = r8.mo11604e(r11, r0, r1)
            if (r11 != r2) goto L_0x008e
            goto L_0x00a5
        L_0x008e:
            m7.b r11 = (p170m7.C5715b) r11
            m7.c r8 = r11.f18530b
            java.lang.String r8 = r8.f18532b
            goto L_0x00a4
        L_0x0095:
            r1.label = r4
            java.lang.Object r11 = r8.mo11604e(r10, r0, r1)
            if (r11 != r2) goto L_0x009e
            goto L_0x00a5
        L_0x009e:
            m7.b r11 = (p170m7.C5715b) r11
            m7.c r8 = r11.f18530b
            java.lang.String r8 = r8.f18532b
        L_0x00a4:
            r2 = r8
        L_0x00a5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.AuthManager.m5982b(com.cubic.umo.auth.api.AuthManager, java.lang.String, g7.a, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11602c(java.lang.String r10, ff0.C23349c<? super p170m7.C5716c> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.cubic.umo.auth.api.AuthManager$authenticateCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.cubic.umo.auth.api.AuthManager$authenticateCode$1 r0 = (com.cubic.umo.auth.api.AuthManager$authenticateCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.auth.api.AuthManager$authenticateCode$1 r0 = new com.cubic.umo.auth.api.AuthManager$authenticateCode$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r8 = 2
            if (r1 == 0) goto L_0x003b
            if (r1 == r2) goto L_0x0033
            if (r1 != r8) goto L_0x002b
            p584jl.C17885a.m44475z0(r11)
            goto L_0x00b3
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            java.lang.Object r10 = r0.L$0
            com.cubic.umo.auth.api.AuthManager r10 = (com.cubic.umo.auth.api.AuthManager) r10
            p584jl.C17885a.m44475z0(r11)
            goto L_0x00a3
        L_0x003b:
            p584jl.C17885a.m44475z0(r11)
            j7.a r1 = r9.f7744b
            r0.L$0 = r9
            r0.label = r2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            o7.a r2 = r1.f17708a
            java.lang.String r2 = r2.f19202a
            r11.append(r2)
            r2 = 58
            r11.append(r2)
            o7.a r2 = r1.f17708a
            java.lang.String r2 = r2.f19203b
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            java.nio.charset.Charset r2 = uh0.C25072a.f63272a
            byte[] r11 = r11.getBytes(r2)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            mf0.C24362h.m61210e(r11, r3)
            byte[] r11 = android.util.Base64.encode(r11, r8)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r4 = new java.lang.String
            java.lang.String r5 = "encodedClientData"
            mf0.C24362h.m61210e(r11, r5)
            r4.<init>(r11, r2)
            java.lang.String r11 = "Basic "
            java.lang.String r11 = mf0.C24362h.m61216k(r4, r11)
            java.lang.String r2 = "Authorization"
            r3.<init>(r2, r11)
            java.util.Map r3 = p389bl.C13637c.m34046A(r3)
            j7.b$a r11 = new j7.b$a
            o7.a r2 = r1.f17708a
            r11.<init>(r2, r10)
            hi0.o r4 = r11.mo21157a()
            java.lang.Class<com.cubic.umo.auth.api.model.OpenIdToken> r5 = com.cubic.umo.auth.api.model.OpenIdToken.class
            java.lang.String r2 = "auth/realms/umo-pass/client/token"
            r6 = r0
            java.lang.Object r11 = r1.mo11594l(r2, r3, r4, r5, r6)
            if (r11 != r7) goto L_0x00a2
            return r7
        L_0x00a2:
            r10 = r9
        L_0x00a3:
            g7.a r11 = (p096g7.C4839a) r11
            java.lang.Class<com.cubic.umo.auth.api.model.UserJWT> r1 = com.cubic.umo.auth.api.model.UserJWT.class
            r2 = 0
            r0.L$0 = r2
            r0.label = r8
            java.lang.Object r11 = r10.mo11604e(r11, r1, r0)
            if (r11 != r7) goto L_0x00b3
            return r7
        L_0x00b3:
            m7.b r11 = (p170m7.C5715b) r11
            m7.c r10 = r11.f18530b
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.AuthManager.mo11602c(java.lang.String, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060 A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d A[Catch:{ all -> 0x002f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11603d(boolean r8, ff0.C23349c<? super java.lang.String> r9) throws com.cubic.umo.exception.AuthenticationException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.cubic.umo.auth.api.AuthManager$getToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.cubic.umo.auth.api.AuthManager$getToken$1 r0 = (com.cubic.umo.auth.api.AuthManager$getToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.cubic.umo.auth.api.AuthManager$getToken$1 r0 = new com.cubic.umo.auth.api.AuthManager$getToken$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.L$0
            com.cubic.umo.auth.api.AuthManager r8 = (com.cubic.umo.auth.api.AuthManager) r8
            p584jl.C17885a.m44475z0(r9)     // Catch:{ all -> 0x002f }
            goto L_0x0080
        L_0x002f:
            r9 = move-exception
            goto L_0x0086
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            boolean r8 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            com.cubic.umo.auth.api.AuthManager r2 = (com.cubic.umo.auth.api.AuthManager) r2
            p584jl.C17885a.m44475z0(r9)     // Catch:{ all -> 0x0045 }
            r9 = r8
            r8 = r2
            goto L_0x005b
        L_0x0045:
            r8 = move-exception
            goto L_0x008b
        L_0x0047:
            p584jl.C17885a.m44475z0(r9)
            kotlinx.coroutines.sync.MutexImpl r9 = r7.f7749g     // Catch:{ all -> 0x0089 }
            r0.L$0 = r7     // Catch:{ all -> 0x0089 }
            r0.Z$0 = r8     // Catch:{ all -> 0x0089 }
            r0.label = r4     // Catch:{ all -> 0x0089 }
            java.lang.Object r9 = r9.mo60395a(r5, r0)     // Catch:{ all -> 0x0089 }
            if (r9 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r9 = r8
            r8 = r7
        L_0x005b:
            com.cubic.umo.auth.provider.TokenProvider r2 = r8.f7743a     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            com.cubic.umo.auth.model.Token r2 = r2.getToken()     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x007e
        L_0x0066:
            bi0.d r2 = r8.f7746d     // Catch:{ all -> 0x002f }
            kotlin.coroutines.CoroutineContext r2 = r2.f52870b     // Catch:{ all -> 0x002f }
            com.cubic.umo.auth.api.AuthManager$getToken$3 r6 = new com.cubic.umo.auth.api.AuthManager$getToken$3     // Catch:{ all -> 0x002f }
            if (r9 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            r6.<init>(r8, r4, r5)     // Catch:{ all -> 0x002f }
            r0.L$0 = r8     // Catch:{ all -> 0x002f }
            r0.label = r3     // Catch:{ all -> 0x002f }
            java.lang.Object r9 = wh0.C25177g.m63221e(r2, r6, r0)     // Catch:{ all -> 0x002f }
            if (r9 != r1) goto L_0x0080
            return r1
        L_0x007e:
            java.lang.String r9 = r2.f7804b     // Catch:{ all -> 0x002f }
        L_0x0080:
            kotlinx.coroutines.sync.MutexImpl r8 = r8.f7749g
            r8.mo60396b(r5)
            return r9
        L_0x0086:
            r2 = r8
            r8 = r9
            goto L_0x008b
        L_0x0089:
            r8 = move-exception
            r2 = r7
        L_0x008b:
            kotlinx.coroutines.sync.MutexImpl r9 = r2.f7749g
            r9.mo60396b(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.AuthManager.mo11603d(boolean, ff0.c):java.lang.Object");
    }

    /* renamed from: e */
    public final <T extends C5520a> Object mo11604e(C4839a<OpenIdToken> aVar, Class<T> cls, C23349c<? super C5715b> cVar) throws AuthenticationException {
        if (aVar instanceof C4839a.C4841b) {
            C4839a.C4841b bVar = (C4839a.C4841b) aVar;
            byte[] decode = Base64.decode((String) C24179b.m60577Y(((OpenIdToken) bVar.f16263a).f7764a, new String[]{"."}, 0, 6).get(1), 2);
            C24362h.m61210e(decode, "decodedBytes");
            C5520a aVar2 = (C5520a) new C8017o(new C8017o.C8018a()).mo25080a(cls).mo25049b(new String(decode, C25072a.f63272a));
            if (aVar2 != null) {
                if (aVar2 instanceof AnonymousJWT) {
                    return C25177g.m63221e(C7492a.f22973b.f52870b, new AuthManager$saveJwt$2(this, (AnonymousJWT) aVar2, (OpenIdToken) bVar.f16263a, (C23349c<? super AuthManager$saveJwt$2>) null), cVar);
                }
                if (aVar2 instanceof UserJWT) {
                    return C25177g.m63221e(C7492a.f22973b.f52870b, new AuthManager$saveJwt$4(this, (UserJWT) aVar2, (OpenIdToken) bVar.f16263a, (C23349c<? super AuthManager$saveJwt$4>) null), cVar);
                }
            }
            throw new AuthenticationException(500, (String) null);
        } else if (aVar instanceof C4839a.C4840a) {
            throw new AuthenticationException(((C4839a.C4840a) aVar).f16261a, (String) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
