package com.cubic.umo.auth.api;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.auth.api.AuthManager$getToken$3", mo58555f = "AuthManager.kt", mo58556l = {136, 136, 154, 154, 160, 160, 162, 162, 170, 170}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class AuthManager$getToken$3 extends SuspendLambda implements C24240p<C25235z, C23349c<? super String>, Object> {
    public final /* synthetic */ boolean $forceRefresh;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ AuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthManager$getToken$3(AuthManager authManager, boolean z, C23349c<? super AuthManager$getToken$3> cVar) {
        super(2, cVar);
        this.this$0 = authManager;
        this.$forceRefresh = z;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        AuthManager$getToken$3 authManager$getToken$3 = new AuthManager$getToken$3(this.this$0, this.$forceRefresh, cVar);
        authManager$getToken$3.L$0 = obj;
        return authManager$getToken$3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManager$getToken$3) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0247, code lost:
        r0.L$0 = r6;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 8;
        r6 = com.cubic.umo.auth.api.AuthManager.f7742h;
        r3 = r3.mo11604e((p096g7.C4839a) r4, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025a, code lost:
        if (r3 != r2) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x025c, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025d, code lost:
        r3 = ((p170m7.C5715b) r3).f18530b.f18532b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0263, code lost:
        if (r3 != null) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0265, code lost:
        r3 = r0.this$0;
        r4 = r3.f7744b;
        r0.L$0 = r3;
        r0.label = 9;
        r4 = r4.mo11594l("auth/realms/umo-pass/anonymous/token", kotlin.collections.C23826d.m58530U(), new p134j7.C5389b.C5391b(r4.f17708a).mo21157a(), com.cubic.umo.auth.api.model.OpenIdToken.class, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0280, code lost:
        if (r4 != r2) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0282, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0283, code lost:
        r0.L$0 = null;
        r0.label = 10;
        r5 = com.cubic.umo.auth.api.AuthManager.f7742h;
        r1 = r3.mo11604e((p096g7.C4839a) r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0292, code lost:
        if (r1 != r2) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0294, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return ((p170m7.C5715b) r1).f18530b.f18532b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return ((p170m7.C5715b) r1).f18530b.f18532b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fd, code lost:
        r0.L$0 = null;
        r0.label = 2;
        r4 = com.cubic.umo.auth.api.AuthManager.f7742h;
        r1 = r3.mo11604e((p096g7.C4839a) r5, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010a, code lost:
        if (r1 != r2) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010c, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01af, code lost:
        r0.L$0 = r5;
        r0.L$1 = null;
        r0.label = 4;
        r5 = com.cubic.umo.auth.api.AuthManager.f7742h;
        r3 = r3.mo11604e((p096g7.C4839a) r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bf, code lost:
        if (r3 != r2) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c1, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c2, code lost:
        r3 = ((p170m7.C5715b) r3).f18530b.f18532b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0211, code lost:
        r0.L$0 = r6;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 6;
        r3 = com.cubic.umo.auth.api.AuthManager.m5982b(r5, r3, (p096g7.C4839a) r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0221, code lost:
        if (r3 != r2) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0223, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0224, code lost:
        r3 = (java.lang.String) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Class<com.cubic.umo.auth.api.model.AnonymousJWT> r1 = com.cubic.umo.auth.api.model.AnonymousJWT.class
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 0
            switch(r3) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0083;
                case 2: goto L_0x007c;
                case 3: goto L_0x006d;
                case 4: goto L_0x0062;
                case 5: goto L_0x004f;
                case 6: goto L_0x0044;
                case 7: goto L_0x0031;
                case 8: goto L_0x0026;
                case 9: goto L_0x001b;
                case 10: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0014:
            p584jl.C17885a.m44475z0(r20)
            r1 = r20
            goto L_0x0295
        L_0x001b:
            java.lang.Object r3 = r0.L$0
            com.cubic.umo.auth.api.AuthManager r3 = (com.cubic.umo.auth.api.AuthManager) r3
            p584jl.C17885a.m44475z0(r20)
            r4 = r20
            goto L_0x0283
        L_0x0026:
            java.lang.Object r3 = r0.L$0
            wh0.z r3 = (wh0.C25235z) r3
            p584jl.C17885a.m44475z0(r20)
            r3 = r20
            goto L_0x025d
        L_0x0031:
            java.lang.Object r3 = r0.L$2
            com.cubic.umo.auth.api.AuthManager r3 = (com.cubic.umo.auth.api.AuthManager) r3
            java.lang.Object r5 = r0.L$1
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Object r6 = r0.L$0
            wh0.z r6 = (wh0.C25235z) r6
            p584jl.C17885a.m44475z0(r20)
            r4 = r20
            goto L_0x0247
        L_0x0044:
            java.lang.Object r3 = r0.L$0
            wh0.z r3 = (wh0.C25235z) r3
            p584jl.C17885a.m44475z0(r20)
            r3 = r20
            goto L_0x0224
        L_0x004f:
            java.lang.Object r3 = r0.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.L$1
            com.cubic.umo.auth.api.AuthManager r5 = (com.cubic.umo.auth.api.AuthManager) r5
            java.lang.Object r6 = r0.L$0
            wh0.z r6 = (wh0.C25235z) r6
            p584jl.C17885a.m44475z0(r20)
            r4 = r20
            goto L_0x0211
        L_0x0062:
            java.lang.Object r3 = r0.L$0
            wh0.z r3 = (wh0.C25235z) r3
            p584jl.C17885a.m44475z0(r20)
            r3 = r20
            goto L_0x01c2
        L_0x006d:
            java.lang.Object r3 = r0.L$1
            com.cubic.umo.auth.api.AuthManager r3 = (com.cubic.umo.auth.api.AuthManager) r3
            java.lang.Object r5 = r0.L$0
            wh0.z r5 = (wh0.C25235z) r5
            p584jl.C17885a.m44475z0(r20)
            r4 = r20
            goto L_0x01af
        L_0x007c:
            p584jl.C17885a.m44475z0(r20)
            r1 = r20
            goto L_0x010d
        L_0x0083:
            java.lang.Object r3 = r0.L$0
            com.cubic.umo.auth.api.AuthManager r3 = (com.cubic.umo.auth.api.AuthManager) r3
            p584jl.C17885a.m44475z0(r20)
            r5 = r20
            goto L_0x00fd
        L_0x008d:
            p584jl.C17885a.m44475z0(r20)
            java.lang.Object r3 = r0.L$0
            r6 = r3
            wh0.z r6 = (wh0.C25235z) r6
            com.cubic.umo.auth.api.AuthManager r3 = r0.this$0
            l7.e r3 = r3.f7747e
            java.util.ArrayList r3 = r3.mo21496c()
            com.cubic.umo.auth.api.AuthManager r5 = r0.this$0
            com.cubic.umo.auth.provider.TokenPrefsProvider r5 = r5.f7745c
            bf0.c r7 = r5.f7818a
            java.lang.Object r7 = r7.getValue()
            java.lang.String r8 = "<get-preferences>(...)"
            mf0.C24362h.m61210e(r7, r8)
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            bf0.c r5 = r5.f7819b
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r7.getString(r5, r4)
            r7 = 0
            r9 = 1
            if (r3 == 0) goto L_0x00c7
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = 0
            goto L_0x00c8
        L_0x00c7:
            r10 = 1
        L_0x00c8:
            if (r10 == 0) goto L_0x0115
            if (r5 == 0) goto L_0x0115
            com.cubic.umo.auth.api.AuthManager r3 = r0.this$0
            com.cubic.umo.auth.provider.TokenPrefsProvider r3 = r3.f7745c
            bf0.c r6 = r3.f7818a
            java.lang.Object r6 = r6.getValue()
            mf0.C24362h.m61210e(r6, r8)
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            android.content.SharedPreferences$Editor r6 = r6.edit()
            bf0.c r3 = r3.f7819b
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            android.content.SharedPreferences$Editor r3 = r6.remove(r3)
            r3.apply()
            com.cubic.umo.auth.api.AuthManager r3 = r0.this$0
            j7.a r6 = r3.f7744b
            r0.L$0 = r3
            r0.label = r9
            java.lang.Object r5 = r6.mo21156n(r5, r0)
            if (r5 != r2) goto L_0x00fd
            return r2
        L_0x00fd:
            g7.a r5 = (p096g7.C4839a) r5
            r0.L$0 = r4
            r4 = 2
            r0.label = r4
            bf0.c<com.cubic.umo.auth.api.AuthManager> r4 = com.cubic.umo.auth.api.AuthManager.f7742h
            java.lang.Object r1 = r3.mo11604e(r5, r1, r0)
            if (r1 != r2) goto L_0x010d
            return r2
        L_0x010d:
            m7.b r1 = (p170m7.C5715b) r1
            m7.c r1 = r1.f18530b
            java.lang.String r1 = r1.f18532b
            goto L_0x029d
        L_0x0115:
            r10 = -1
            if (r3 != 0) goto L_0x011b
            r8 = r4
            goto L_0x013b
        L_0x011b:
            java.util.Iterator r5 = r3.iterator()
        L_0x011f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0138
            java.lang.Object r8 = r5.next()
            r12 = r8
            m7.c r12 = (p170m7.C5716c) r12
            long r12 = r12.f18531a
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x0134
            r12 = 1
            goto L_0x0135
        L_0x0134:
            r12 = 0
        L_0x0135:
            if (r12 == 0) goto L_0x011f
            goto L_0x0139
        L_0x0138:
            r8 = r4
        L_0x0139:
            m7.c r8 = (p170m7.C5716c) r8
        L_0x013b:
            if (r8 != 0) goto L_0x0162
            if (r3 != 0) goto L_0x0141
            r8 = r4
            goto L_0x0162
        L_0x0141:
            java.util.Iterator r3 = r3.iterator()
        L_0x0145:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x015e
            java.lang.Object r5 = r3.next()
            r8 = r5
            m7.c r8 = (p170m7.C5716c) r8
            long r12 = r8.f18531a
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x015a
            r8 = 1
            goto L_0x015b
        L_0x015a:
            r8 = 0
        L_0x015b:
            if (r8 == 0) goto L_0x0145
            goto L_0x015f
        L_0x015e:
            r5 = r4
        L_0x015f:
            r8 = r5
            m7.c r8 = (p170m7.C5716c) r8
        L_0x0162:
            if (r8 != 0) goto L_0x0167
            r3 = r4
            goto L_0x0263
        L_0x0167:
            com.cubic.umo.auth.api.AuthManager r3 = r0.this$0
            boolean r5 = r0.$forceRefresh
            l7.a r12 = r3.f7748f
            long r13 = r8.f18531a
            java.lang.String r12 = r12.mo21489d(r13)
            mf0.C24362h.m61208c(r12)
            long r13 = r8.f18531a
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x017e
            r10 = 1
            goto L_0x017f
        L_0x017e:
            r10 = 0
        L_0x017f:
            if (r10 == 0) goto L_0x0183
            r11 = r1
            goto L_0x0185
        L_0x0183:
            java.lang.Class<com.cubic.umo.auth.api.model.UserJWT> r11 = com.cubic.umo.auth.api.model.UserJWT.class
        L_0x0185:
            long r13 = java.lang.System.currentTimeMillis()
            r20 = r5
            long r4 = r8.f18534d
            r16 = 60000(0xea60, double:2.9644E-319)
            long r4 = r4 - r16
            int r18 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r18 >= 0) goto L_0x0198
            r4 = 1
            goto L_0x0199
        L_0x0198:
            r4 = 0
        L_0x0199:
            r4 = r4 ^ r9
            if (r4 == 0) goto L_0x01d4
            if (r10 == 0) goto L_0x01ca
            j7.a r4 = r3.f7744b
            r0.L$0 = r6
            r0.L$1 = r3
            r5 = 3
            r0.label = r5
            java.lang.Object r4 = r4.mo21156n(r12, r0)
            if (r4 != r2) goto L_0x01ae
            return r2
        L_0x01ae:
            r5 = r6
        L_0x01af:
            g7.a r4 = (p096g7.C4839a) r4
            r0.L$0 = r5
            r5 = 0
            r0.L$1 = r5
            r5 = 4
            r0.label = r5
            bf0.c<com.cubic.umo.auth.api.AuthManager> r5 = com.cubic.umo.auth.api.AuthManager.f7742h
            java.lang.Object r3 = r3.mo11604e(r4, r1, r0)
            if (r3 != r2) goto L_0x01c2
            return r2
        L_0x01c2:
            m7.b r3 = (p170m7.C5715b) r3
            m7.c r3 = r3.f18530b
            java.lang.String r3 = r3.f18532b
            goto L_0x0263
        L_0x01ca:
            com.cubic.umo.exception.AuthenticationException r1 = new com.cubic.umo.exception.AuthenticationException
            r2 = 401(0x191, float:5.62E-43)
            java.lang.String r3 = "Refresh token has expired"
            r1.<init>(r2, r3)
            throw r1
        L_0x01d4:
            long r4 = java.lang.System.currentTimeMillis()
            long r13 = r8.f18533c
            long r13 = r13 - r16
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x01e1
            r7 = 1
        L_0x01e1:
            r4 = r7 ^ 1
            if (r4 != 0) goto L_0x01ec
            if (r20 == 0) goto L_0x01e8
            goto L_0x01ec
        L_0x01e8:
            java.lang.String r3 = r8.f18532b
            goto L_0x0263
        L_0x01ec:
            java.lang.String r4 = "auth/realms/umo-pass/client/token"
            if (r10 == 0) goto L_0x0227
            j7.a r5 = r3.f7744b
            java.lang.String r7 = r8.f18535e
            r0.L$0 = r6
            r0.L$1 = r3
            r0.L$2 = r12
            r8 = 5
            r0.label = r8
            j7.b$c r8 = new j7.b$c
            o7.a r9 = r5.f17708a
            r8.<init>(r9, r7)
            hi0.o r7 = r8.mo21157a()
            java.lang.Object r4 = r5.mo11594l(r4, kotlin.collections.C23826d.m58530U(), r7, com.cubic.umo.auth.api.model.OpenIdToken.class, r0)
            if (r4 != r2) goto L_0x020f
            return r2
        L_0x020f:
            r5 = r3
            r3 = r12
        L_0x0211:
            g7.a r4 = (p096g7.C4839a) r4
            r0.L$0 = r6
            r6 = 0
            r0.L$1 = r6
            r0.L$2 = r6
            r6 = 6
            r0.label = r6
            java.lang.Object r3 = com.cubic.umo.auth.api.AuthManager.m5982b(r5, r3, r4, r0)
            if (r3 != r2) goto L_0x0224
            return r2
        L_0x0224:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0263
        L_0x0227:
            j7.a r5 = r3.f7744b
            java.lang.String r7 = r8.f18535e
            r0.L$0 = r6
            r0.L$1 = r11
            r0.L$2 = r3
            r8 = 7
            r0.label = r8
            j7.b$c r8 = new j7.b$c
            o7.a r9 = r5.f17708a
            r8.<init>(r9, r7)
            hi0.o r7 = r8.mo21157a()
            java.lang.Object r4 = r5.mo11594l(r4, kotlin.collections.C23826d.m58530U(), r7, com.cubic.umo.auth.api.model.OpenIdToken.class, r0)
            if (r4 != r2) goto L_0x0246
            return r2
        L_0x0246:
            r5 = r11
        L_0x0247:
            g7.a r4 = (p096g7.C4839a) r4
            r0.L$0 = r6
            r6 = 0
            r0.L$1 = r6
            r0.L$2 = r6
            r6 = 8
            r0.label = r6
            bf0.c<com.cubic.umo.auth.api.AuthManager> r6 = com.cubic.umo.auth.api.AuthManager.f7742h
            java.lang.Object r3 = r3.mo11604e(r4, r5, r0)
            if (r3 != r2) goto L_0x025d
            return r2
        L_0x025d:
            m7.b r3 = (p170m7.C5715b) r3
            m7.c r3 = r3.f18530b
            java.lang.String r3 = r3.f18532b
        L_0x0263:
            if (r3 != 0) goto L_0x029c
            com.cubic.umo.auth.api.AuthManager r3 = r0.this$0
            j7.a r4 = r3.f7744b
            r0.L$0 = r3
            r5 = 9
            r0.label = r5
            j7.b$b r5 = new j7.b$b
            o7.a r6 = r4.f17708a
            r5.<init>(r6)
            hi0.o r5 = r5.mo21157a()
            java.lang.String r6 = "auth/realms/umo-pass/anonymous/token"
            java.lang.Object r4 = r4.mo11594l(r6, kotlin.collections.C23826d.m58530U(), r5, com.cubic.umo.auth.api.model.OpenIdToken.class, r0)
            if (r4 != r2) goto L_0x0283
            return r2
        L_0x0283:
            g7.a r4 = (p096g7.C4839a) r4
            r5 = 0
            r0.L$0 = r5
            r5 = 10
            r0.label = r5
            bf0.c<com.cubic.umo.auth.api.AuthManager> r5 = com.cubic.umo.auth.api.AuthManager.f7742h
            java.lang.Object r1 = r3.mo11604e(r4, r1, r0)
            if (r1 != r2) goto L_0x0295
            return r2
        L_0x0295:
            m7.b r1 = (p170m7.C5715b) r1
            m7.c r1 = r1.f18530b
            java.lang.String r1 = r1.f18532b
            goto L_0x029d
        L_0x029c:
            r1 = r3
        L_0x029d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.AuthManager$getToken$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
