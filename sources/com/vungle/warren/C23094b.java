package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.Map;
import od0.C24545c;
import od0.C24566m;
import ud0.C25024h;
import yd0.C25287b;

/* renamed from: com.vungle.warren.b */
public class C23094b implements C25287b.C25288a {

    /* renamed from: a */
    public final C23192a f58602a;

    /* renamed from: b */
    public final C23097c f58603b;

    /* renamed from: c */
    public final C25024h f58604c;

    /* renamed from: d */
    public final C23186o1 f58605d;

    /* renamed from: e */
    public final Map<String, Boolean> f58606e;

    /* renamed from: f */
    public final C23135f0 f58607f;

    /* renamed from: g */
    public final AdRequest f58608g;

    /* renamed from: h */
    public boolean f58609h;

    /* renamed from: i */
    public int f58610i = -1;

    /* renamed from: j */
    public boolean f58611j;

    /* renamed from: k */
    public C24566m f58612k;

    /* renamed from: l */
    public C24545c f58613l;

    public C23094b(AdRequest adRequest, Map<String, Boolean> map, C23135f0 f0Var, C23192a aVar, C23097c cVar, C25024h hVar, C23186o1 o1Var, C24566m mVar, C24545c cVar2) {
        this.f58608g = adRequest;
        this.f58606e = map;
        this.f58607f = f0Var;
        this.f58602a = aVar;
        this.f58603b = cVar;
        this.f58604c = hVar;
        this.f58605d = o1Var;
        this.f58612k = mVar;
        this.f58613l = cVar2;
        map.put(adRequest.mo58041f(), Boolean.TRUE);
    }

    /* renamed from: a */
    public final void mo58093a() {
        if (this.f58613l == null) {
            this.f58613l = this.f58602a.mo58277l(this.f58608g.mo58041f(), this.f58608g.mo58037c()).get();
        }
    }

    /* renamed from: b */
    public final void mo58094b(String str, VungleException vungleException) {
        mo58093a();
        if (this.f58613l == null || vungleException.mo58207a() != 27) {
            if (!(this.f58613l == null || vungleException.mo58207a() == 15 || vungleException.mo58207a() == 25 || vungleException.mo58207a() == 36)) {
                try {
                    this.f58602a.mo58290y(this.f58613l, str, 4);
                    if (this.f58612k == null) {
                        this.f58612k = (C24566m) this.f58602a.mo58281p(C24566m.class, this.f58608g.mo58041f()).get();
                    }
                    C24566m mVar = this.f58612k;
                    if (mVar != null) {
                        this.f58603b.mo58106m(mVar, mVar.mo60831a(), 0, false);
                    }
                } catch (DatabaseHelper.DBException unused) {
                    vungleException = new VungleException(26);
                }
            }
            mo58059c();
            C23135f0 f0Var = this.f58607f;
            if (f0Var != null) {
                f0Var.onError(str, vungleException);
                VungleLogger.m57029b("AdEventListener#PlayAdCallback", vungleException.getLocalizedMessage() + " :" + str);
                return;
            }
            return;
        }
        this.f58603b.mo58099d(this.f58613l.getId());
    }

    /* renamed from: c */
    public void mo58059c() {
        this.f58606e.remove(this.f58608g.mo58041f());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011d A[Catch:{ DBException -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122 A[Catch:{ DBException -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013b A[Catch:{ DBException -> 0x031b }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58095d(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.Class<od0.m> r4 = od0.C24566m.class
            r17.mo58093a()
            od0.c r5 = r0.f58613l
            java.lang.String r6 = "AdEventListener#PlayAdCallback"
            if (r5 != 0) goto L_0x003f
            r17.mo58059c()
            com.vungle.warren.f0 r1 = r0.f58607f
            if (r1 == 0) goto L_0x003e
            com.vungle.warren.AdRequest r2 = r0.f58608g
            java.lang.String r2 = r2.mo58041f()
            com.vungle.warren.error.VungleException r4 = new com.vungle.warren.error.VungleException
            r5 = 10
            r4.<init>((int) r5)
            r1.onError(r2, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": AD_UNABLE_TO_PLAY"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.vungle.warren.VungleLogger.m57029b(r6, r1)
        L_0x003e:
            return
        L_0x003f:
            od0.m r5 = r0.f58612k
            if (r5 != 0) goto L_0x0057
            com.vungle.warren.persistence.a r5 = r0.f58602a
            com.vungle.warren.AdRequest r7 = r0.f58608g
            java.lang.String r7 = r7.mo58041f()
            td0.e r5 = r5.mo58281p(r4, r7)
            java.lang.Object r5 = r5.get()
            od0.m r5 = (od0.C24566m) r5
            r0.f58612k = r5
        L_0x0057:
            od0.m r5 = r0.f58612k
            if (r5 != 0) goto L_0x0087
            r17.mo58059c()
            com.vungle.warren.f0 r1 = r0.f58607f
            if (r1 == 0) goto L_0x0086
            com.vungle.warren.AdRequest r2 = r0.f58608g
            java.lang.String r2 = r2.mo58041f()
            com.vungle.warren.error.VungleException r4 = new com.vungle.warren.error.VungleException
            r5 = 13
            r4.<init>((int) r5)
            r1.onError(r2, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PLACEMENT_NOT_FOUND: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.vungle.warren.VungleLogger.m57029b(r6, r1)
        L_0x0086:
            return
        L_0x0087:
            java.lang.String r5 = "start"
            boolean r5 = r1.equals(r5)     // Catch:{ DBException -> 0x031b }
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 0
            if (r5 == 0) goto L_0x014a
            com.vungle.warren.persistence.a r1 = r0.f58602a     // Catch:{ DBException -> 0x031b }
            od0.c r2 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            r1.mo58290y(r2, r3, r8)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x00b5
            r1.onAdStart(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DBException -> 0x031b }
            r1.<init>()     // Catch:{ DBException -> 0x031b }
            java.lang.String r2 = "onAdStart: "
            r1.append(r2)     // Catch:{ DBException -> 0x031b }
            r1.append(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.VungleLogger.m57028a(r6, r1)     // Catch:{ DBException -> 0x031b }
        L_0x00b5:
            r0.f58610i = r10     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.persistence.a r1 = r0.f58602a     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.AdRequest r2 = r0.f58608g     // Catch:{ DBException -> 0x031b }
            java.lang.String r2 = r2.mo58041f()     // Catch:{ DBException -> 0x031b }
            td0.e r1 = r1.mo58281p(r4, r2)     // Catch:{ DBException -> 0x031b }
            java.lang.Object r1 = r1.get()     // Catch:{ DBException -> 0x031b }
            r12 = r1
            od0.m r12 = (od0.C24566m) r12     // Catch:{ DBException -> 0x031b }
            r0.f58612k = r12     // Catch:{ DBException -> 0x031b }
            if (r12 == 0) goto L_0x00df
            com.vungle.warren.c r11 = r0.f58603b     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.AdConfig$AdSize r13 = r12.mo60831a()     // Catch:{ DBException -> 0x031b }
            r14 = 0
            com.vungle.warren.AdRequest r1 = r0.f58608g     // Catch:{ DBException -> 0x031b }
            boolean r16 = r1.mo58039e()     // Catch:{ DBException -> 0x031b }
            r11.mo58106m(r12, r13, r14, r16)     // Catch:{ DBException -> 0x031b }
        L_0x00df:
            com.vungle.warren.o1 r1 = r0.f58605d     // Catch:{ DBException -> 0x031b }
            ee0.c r2 = r1.f58863c     // Catch:{ DBException -> 0x031b }
            boolean r2 = r2.f59061a     // Catch:{ DBException -> 0x031b }
            if (r2 == 0) goto L_0x0325
            od0.c r2 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            java.lang.String r14 = r2.mo60808g()     // Catch:{ DBException -> 0x031b }
            od0.c r2 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            java.lang.String r15 = r2.mo60807f()     // Catch:{ DBException -> 0x031b }
            od0.c r2 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            java.lang.String r4 = "app_id"
            java.lang.String r2 = r2.f62206e     // Catch:{ DBException -> 0x031b }
            if (r2 == 0) goto L_0x0116
            int r5 = r2.length()     // Catch:{ DBException -> 0x031b }
            if (r5 <= r7) goto L_0x0116
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r6 = r2.substring(r7)     // Catch:{ JSONException -> 0x0116 }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x0116 }
            boolean r6 = r5.isNull(r4)     // Catch:{ JSONException -> 0x0116 }
            if (r6 == 0) goto L_0x0111
            goto L_0x0117
        L_0x0111:
            java.lang.String r9 = r5.optString(r4, r9)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x0117
        L_0x0116:
            r9 = r2
        L_0x0117:
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ DBException -> 0x031b }
            if (r2 == 0) goto L_0x0122
            java.lang.String r2 = "unknown"
            r16 = r2
            goto L_0x0124
        L_0x0122:
            r16 = r9
        L_0x0124:
            com.vungle.warren.persistence.a r2 = r1.f58861a     // Catch:{ DBException -> 0x031b }
            od0.s r4 = new od0.s     // Catch:{ DBException -> 0x031b }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ DBException -> 0x031b }
            r11 = r4
            r11.<init>(r12, r14, r15, r16)     // Catch:{ DBException -> 0x031b }
            r2.mo58288w(r4)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.persistence.a r2 = r1.f58861a     // Catch:{ DBException -> 0x031b }
            ee0.c r1 = r1.f58863c     // Catch:{ DBException -> 0x031b }
            ee0.c$a r1 = r1.f59064d     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x013d
            int r10 = r1.f59065a     // Catch:{ DBException -> 0x031b }
        L_0x013d:
            r2.getClass()     // Catch:{ DBException -> 0x031b }
            td0.m r1 = new td0.m     // Catch:{ DBException -> 0x031b }
            r1.<init>(r2, r10)     // Catch:{ DBException -> 0x031b }
            r2.mo58287v(r1)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x014a:
            java.lang.String r4 = "end"
            boolean r4 = r1.equals(r4)     // Catch:{ DBException -> 0x031b }
            r5 = 80
            java.lang.String r9 = "event"
            r11 = 1
            if (r4 == 0) goto L_0x01e2
            od0.c r1 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            r1.getClass()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.persistence.a r1 = r0.f58602a     // Catch:{ DBException -> 0x031b }
            od0.c r4 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            r1.mo58290y(r4, r3, r7)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.persistence.a r1 = r0.f58602a     // Catch:{ DBException -> 0x031b }
            od0.c r4 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            java.lang.String r4 = r4.f62206e     // Catch:{ DBException -> 0x031b }
            r1.getClass()     // Catch:{ DBException -> 0x031b }
            td0.g r7 = new td0.g     // Catch:{ DBException -> 0x031b }
            r7.<init>(r1, r3, r4)     // Catch:{ DBException -> 0x031b }
            r1.mo58287v(r7)     // Catch:{ DBException -> 0x031b }
            ud0.h r1 = r0.f58604c     // Catch:{ DBException -> 0x031b }
            ud0.g r4 = ud0.C25028k.m62740b(r10)     // Catch:{ DBException -> 0x031b }
            r1.mo58356b(r4)     // Catch:{ DBException -> 0x031b }
            r17.mo58059c()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x0325
            boolean r4 = r0.f58609h     // Catch:{ DBException -> 0x031b }
            if (r4 != 0) goto L_0x018f
            int r4 = r0.f58610i     // Catch:{ DBException -> 0x031b }
            if (r4 < r5) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r4 = 0
            goto L_0x0190
        L_0x018f:
            r4 = 1
        L_0x0190:
            if (r2 == 0) goto L_0x019b
            java.lang.String r5 = "isCTAClicked"
            boolean r2 = r2.equals(r5)     // Catch:{ DBException -> 0x031b }
            if (r2 == 0) goto L_0x019b
            r10 = 1
        L_0x019b:
            r1.onAdEnd(r3, r4, r10)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            r1.onAdEnd(r3)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.n1 r1 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ DBException -> 0x031b }
            ag.i r2 = new ag.i     // Catch:{ DBException -> 0x031b }
            r2.<init>()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.session.SessionEvent r4 = com.vungle.warren.session.SessionEvent.DID_CLOSE     // Catch:{ DBException -> 0x031b }
            java.lang.String r5 = r4.toString()     // Catch:{ DBException -> 0x031b }
            r2.mo40349F(r9, r5)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.session.SessionAttribute r5 = com.vungle.warren.session.SessionAttribute.EVENT_ID     // Catch:{ DBException -> 0x031b }
            od0.c r7 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            java.lang.String r7 = r7.getId()     // Catch:{ DBException -> 0x031b }
            java.lang.String r5 = r5.toString()     // Catch:{ DBException -> 0x031b }
            r2.mo40349F(r5, r7)     // Catch:{ DBException -> 0x031b }
            od0.q r5 = new od0.q     // Catch:{ DBException -> 0x031b }
            r5.<init>((com.vungle.warren.session.SessionEvent) r4, (p359ag.C13452i) r2)     // Catch:{ DBException -> 0x031b }
            r1.mo58250d(r5)     // Catch:{ DBException -> 0x031b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DBException -> 0x031b }
            r1.<init>()     // Catch:{ DBException -> 0x031b }
            java.lang.String r2 = "onAdEnd: "
            r1.append(r2)     // Catch:{ DBException -> 0x031b }
            r1.append(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.VungleLogger.m57028a(r6, r1)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x01e2:
            od0.m r4 = r0.f58612k     // Catch:{ DBException -> 0x031b }
            boolean r4 = r4.f62259c     // Catch:{ DBException -> 0x031b }
            java.lang.String r7 = "onAdRewarded: "
            if (r4 == 0) goto L_0x023e
            java.lang.String r4 = "successfulView"
            boolean r4 = r1.equals(r4)     // Catch:{ DBException -> 0x031b }
            if (r4 == 0) goto L_0x023e
            r0.f58609h = r11     // Catch:{ DBException -> 0x031b }
            boolean r1 = r0.f58611j     // Catch:{ DBException -> 0x031b }
            if (r1 != 0) goto L_0x0325
            r0.f58611j = r11     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x0325
            r1.onAdRewarded(r3)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.n1 r1 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ DBException -> 0x031b }
            ag.i r2 = new ag.i     // Catch:{ DBException -> 0x031b }
            r2.<init>()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.session.SessionEvent r4 = com.vungle.warren.session.SessionEvent.REWARDED     // Catch:{ DBException -> 0x031b }
            java.lang.String r5 = r4.toString()     // Catch:{ DBException -> 0x031b }
            r2.mo40349F(r9, r5)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.session.SessionAttribute r5 = com.vungle.warren.session.SessionAttribute.EVENT_ID     // Catch:{ DBException -> 0x031b }
            od0.c r8 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            java.lang.String r8 = r8.getId()     // Catch:{ DBException -> 0x031b }
            java.lang.String r5 = r5.toString()     // Catch:{ DBException -> 0x031b }
            r2.mo40349F(r5, r8)     // Catch:{ DBException -> 0x031b }
            od0.q r5 = new od0.q     // Catch:{ DBException -> 0x031b }
            r5.<init>((com.vungle.warren.session.SessionEvent) r4, (p359ag.C13452i) r2)     // Catch:{ DBException -> 0x031b }
            r1.mo58250d(r5)     // Catch:{ DBException -> 0x031b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DBException -> 0x031b }
            r1.<init>()     // Catch:{ DBException -> 0x031b }
            r1.append(r7)     // Catch:{ DBException -> 0x031b }
            r1.append(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.VungleLogger.m57028a(r6, r1)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x023e:
            java.lang.String r4 = "percentViewed"
            boolean r4 = r1.startsWith(r4)     // Catch:{ DBException -> 0x031b }
            if (r4 == 0) goto L_0x02ab
            od0.m r4 = r0.f58612k     // Catch:{ DBException -> 0x031b }
            boolean r4 = r4.f62259c     // Catch:{ DBException -> 0x031b }
            if (r4 == 0) goto L_0x02ab
            java.lang.String r2 = ":"
            java.lang.String[] r1 = r1.split(r2)     // Catch:{ DBException -> 0x031b }
            int r2 = r1.length     // Catch:{ DBException -> 0x031b }
            if (r2 != r8) goto L_0x025d
            r1 = r1[r11]     // Catch:{ DBException -> 0x031b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ DBException -> 0x031b }
            r0.f58610i = r1     // Catch:{ DBException -> 0x031b }
        L_0x025d:
            boolean r1 = r0.f58611j     // Catch:{ DBException -> 0x031b }
            if (r1 != 0) goto L_0x0325
            int r1 = r0.f58610i     // Catch:{ DBException -> 0x031b }
            if (r1 < r5) goto L_0x0325
            r0.f58611j = r11     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x0325
            r1.onAdRewarded(r3)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.n1 r1 = com.vungle.warren.C23181n1.m57208b()     // Catch:{ DBException -> 0x031b }
            ag.i r2 = new ag.i     // Catch:{ DBException -> 0x031b }
            r2.<init>()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.session.SessionEvent r4 = com.vungle.warren.session.SessionEvent.REWARDED     // Catch:{ DBException -> 0x031b }
            java.lang.String r5 = r4.toString()     // Catch:{ DBException -> 0x031b }
            r2.mo40349F(r9, r5)     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.session.SessionAttribute r5 = com.vungle.warren.session.SessionAttribute.EVENT_ID     // Catch:{ DBException -> 0x031b }
            od0.c r8 = r0.f58613l     // Catch:{ DBException -> 0x031b }
            java.lang.String r8 = r8.getId()     // Catch:{ DBException -> 0x031b }
            java.lang.String r5 = r5.toString()     // Catch:{ DBException -> 0x031b }
            r2.mo40349F(r5, r8)     // Catch:{ DBException -> 0x031b }
            od0.q r5 = new od0.q     // Catch:{ DBException -> 0x031b }
            r5.<init>((com.vungle.warren.session.SessionEvent) r4, (p359ag.C13452i) r2)     // Catch:{ DBException -> 0x031b }
            r1.mo58250d(r5)     // Catch:{ DBException -> 0x031b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DBException -> 0x031b }
            r1.<init>()     // Catch:{ DBException -> 0x031b }
            r1.append(r7)     // Catch:{ DBException -> 0x031b }
            r1.append(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.VungleLogger.m57028a(r6, r1)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x02ab:
            java.lang.String r4 = "open"
            boolean r4 = r4.equals(r1)     // Catch:{ DBException -> 0x031b }
            if (r4 == 0) goto L_0x02fb
            com.vungle.warren.f0 r4 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            if (r4 == 0) goto L_0x02fb
            java.lang.String r1 = "adClick"
            boolean r1 = r1.equals(r2)     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x02d9
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            r1.onAdClick(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DBException -> 0x031b }
            r1.<init>()     // Catch:{ DBException -> 0x031b }
            java.lang.String r2 = "onAdClick: "
            r1.append(r2)     // Catch:{ DBException -> 0x031b }
            r1.append(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.VungleLogger.m57028a(r6, r1)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x02d9:
            java.lang.String r1 = "adLeftApplication"
            boolean r1 = r1.equals(r2)     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x0325
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            r1.onAdLeftApplication(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DBException -> 0x031b }
            r1.<init>()     // Catch:{ DBException -> 0x031b }
            java.lang.String r2 = "onAdLeftApplication: "
            r1.append(r2)     // Catch:{ DBException -> 0x031b }
            r1.append(r3)     // Catch:{ DBException -> 0x031b }
            java.lang.String r1 = r1.toString()     // Catch:{ DBException -> 0x031b }
            com.vungle.warren.VungleLogger.m57028a(r6, r1)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x02fb:
            java.lang.String r4 = "adViewed"
            boolean r4 = r4.equals(r1)     // Catch:{ DBException -> 0x031b }
            if (r4 == 0) goto L_0x030b
            com.vungle.warren.f0 r4 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            if (r4 == 0) goto L_0x030b
            r4.onAdViewed(r3)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x030b:
            java.lang.String r4 = "attach"
            boolean r1 = r4.equals(r1)     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x0325
            com.vungle.warren.f0 r1 = r0.f58607f     // Catch:{ DBException -> 0x031b }
            if (r1 == 0) goto L_0x0325
            r1.creativeId(r2)     // Catch:{ DBException -> 0x031b }
            goto L_0x0325
        L_0x031b:
            com.vungle.warren.error.VungleException r1 = new com.vungle.warren.error.VungleException
            r2 = 26
            r1.<init>((int) r2)
            r0.mo58094b(r3, r1)
        L_0x0325:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C23094b.mo58095d(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
