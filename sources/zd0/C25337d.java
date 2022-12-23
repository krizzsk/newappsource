package zd0;

import ae0.C20979a;
import android.content.ActivityNotFoundException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import be0.C21039p;
import be0.C21044r;
import ce0.C21096d;
import ce0.C21120u;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23094b;
import com.vungle.warren.C23181n1;
import com.vungle.warren.C23223t;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import com.vungle.warren.p979ui.state.BundleOptionsState;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ld0.C24220a;
import od0.C24545c;
import od0.C24559j;
import od0.C24566m;
import od0.C24568o;
import od0.C24573q;
import p001a0.C0016g;
import p066e0.C4436j0;
import p090g1.C4745d;
import p358af.C13437d;
import p359ag.C13452i;
import p912xh.C20525a;
import p959zh.C20851d;
import sd0.C24850c;
import xd0.C25243b;
import xd0.C25247e;
import yd0.C25286a;
import yd0.C25287b;
import yd0.C25290d;
import yd0.C25291e;

/* renamed from: zd0.d */
public final class C25337d implements C25290d, C21044r.C21045a, C21044r.C21046b {

    /* renamed from: a */
    public final C4745d f63674a;

    /* renamed from: b */
    public final C24220a f63675b;

    /* renamed from: c */
    public final C24850c f63676c;

    /* renamed from: d */
    public HashMap f63677d = new HashMap();

    /* renamed from: e */
    public C21096d.C21097a f63678e;

    /* renamed from: f */
    public C23223t f63679f;

    /* renamed from: g */
    public C25287b.C25288a f63680g;

    /* renamed from: h */
    public C24545c f63681h;

    /* renamed from: i */
    public C24568o f63682i;

    /* renamed from: j */
    public final C24566m f63683j;

    /* renamed from: k */
    public C21044r f63684k;

    /* renamed from: l */
    public C23192a f63685l;

    /* renamed from: m */
    public File f63686m;

    /* renamed from: n */
    public C25291e f63687n;

    /* renamed from: o */
    public boolean f63688o;

    /* renamed from: p */
    public long f63689p;

    /* renamed from: q */
    public boolean f63690q;

    /* renamed from: r */
    public AtomicBoolean f63691r = new AtomicBoolean(false);

    /* renamed from: s */
    public AtomicBoolean f63692s = new AtomicBoolean(false);

    /* renamed from: t */
    public C25338a f63693t = new C25338a();

    /* renamed from: u */
    public C25243b f63694u;

    /* renamed from: v */
    public final String[] f63695v;

    /* renamed from: zd0.d$a */
    public class C25338a implements C23192a.C23207n {

        /* renamed from: a */
        public boolean f63696a = false;

        public C25338a() {
        }

        /* renamed from: a */
        public final void mo58121a() {
        }

        public final void onError() {
            if (!this.f63696a) {
                this.f63696a = true;
                VungleException vungleException = new VungleException(26);
                C25337d.this.mo61925p(vungleException);
                VungleLogger.m57029b(C25337d.class.getSimpleName(), vungleException.getLocalizedMessage());
                C25337d dVar = C25337d.this;
                dVar.f63687n.close();
                ((Handler) dVar.f63674a.f16031a).removeCallbacksAndMessages((Object) null);
            }
        }
    }

    /* renamed from: zd0.d$b */
    public class C25339b implements Runnable {
        public C25339b() {
        }

        public final void run() {
            ((C21039p) C25337d.this.f63684k).mo53157b(true);
        }
    }

    /* renamed from: zd0.d$c */
    public class C25340c implements Runnable {
        public C25340c() {
        }

        public final void run() {
            C25337d.this.f63687n.setVisibility(true);
        }
    }

    /* renamed from: zd0.d$d */
    public class C25341d implements PresenterAdOpenCallback {
        public C25341d() {
        }

        /* renamed from: a */
        public final void mo58331a(PresenterAdOpenCallback.AdOpenType adOpenType) {
            if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
                C25337d.this.mo61927r("deeplinkSuccess", (String) null);
            }
        }
    }

    /* renamed from: zd0.d$e */
    public class C25342e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f63701b;

        public C25342e(String str) {
            this.f63701b = str;
        }

        public final void run() {
            C25337d.this.mo61924o(new VungleException(this.f63701b));
        }
    }

    public C25337d(C24545c cVar, C24566m mVar, C23192a aVar, C4745d dVar, C4436j0 j0Var, C21039p pVar, C20979a aVar2, File file, C24850c cVar2, String[] strArr) {
        C24568o oVar;
        this.f63681h = cVar;
        this.f63685l = aVar;
        this.f63683j = mVar;
        this.f63674a = dVar;
        this.f63675b = j0Var;
        this.f63684k = pVar;
        this.f63686m = file;
        this.f63676c = cVar2;
        this.f63695v = strArr;
        Class<C24559j> cls = C24559j.class;
        this.f63677d.put("incentivizedTextSetByPub", aVar.mo58281p(cls, "incentivizedTextSetByPub").get());
        this.f63677d.put("consentIsImportantToVungle", this.f63685l.mo58281p(cls, "consentIsImportantToVungle").get());
        this.f63677d.put("configSettings", this.f63685l.mo58281p(cls, "configSettings").get());
        if (aVar2 != null) {
            String b = aVar2.mo53049b();
            if (TextUtils.isEmpty(b)) {
                oVar = null;
            } else {
                oVar = (C24568o) this.f63685l.mo58281p(C24568o.class, b).get();
            }
            if (oVar != null) {
                this.f63682i = oVar;
            }
        }
        if (cVar.f62200X) {
            this.f63679f = new C23223t(cVar, j0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r10.f58946b != Integer.MIN_VALUE) goto L_0x0050;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61894a(android.view.MotionEvent r10) {
        /*
            r9 = this;
            com.vungle.warren.t r0 = r9.f63679f
            if (r0 == 0) goto L_0x0107
            od0.c r1 = r0.f58940a
            boolean r1 = r1.f62200X
            if (r1 != 0) goto L_0x000c
            goto L_0x0107
        L_0x000c:
            com.vungle.warren.t$a r1 = r0.f58942c
            if (r1 != 0) goto L_0x0017
            com.vungle.warren.t$a r1 = new com.vungle.warren.t$a
            r1.<init>()
            r0.f58942c = r1
        L_0x0017:
            int r1 = r10.getAction()
            if (r1 == 0) goto L_0x00f4
            r2 = 1
            if (r1 == r2) goto L_0x0022
            goto L_0x0107
        L_0x0022:
            com.vungle.warren.t$a r1 = r0.f58942c
            com.vungle.warren.t$b r3 = new com.vungle.warren.t$b
            float r4 = r10.getX()
            int r4 = (int) r4
            float r10 = r10.getY()
            int r10 = (int) r10
            r3.<init>(r4, r10)
            r1.f58944b = r3
            com.vungle.warren.t$a r10 = r0.f58942c
            com.vungle.warren.t$b r1 = r10.f58943a
            int r3 = r1.f58945a
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r3 == r4) goto L_0x004f
            int r1 = r1.f58946b
            if (r1 == r4) goto L_0x004f
            com.vungle.warren.t$b r10 = r10.f58944b
            int r1 = r10.f58945a
            if (r1 == r4) goto L_0x004f
            int r10 = r10.f58946b
            if (r10 == r4) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x0107
            ld0.a r10 = r0.f58941b
            if (r10 == 0) goto L_0x0107
            od0.c r10 = r0.f58940a
            java.lang.String r1 = "video.clickCoordinates"
            java.lang.String[] r10 = r10.mo60812i(r1)
            if (r10 == 0) goto L_0x0107
            int r1 = r10.length
            if (r1 != 0) goto L_0x0065
            goto L_0x0107
        L_0x0065:
            int r1 = r0.mo58320b()
            int r2 = r0.mo58319a()
            int r3 = r0.mo58320b()
            int r4 = r0.mo58319a()
        L_0x0075:
            int r6 = r10.length
            if (r5 >= r6) goto L_0x00ee
            r6 = r10[r5]
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0081
            goto L_0x00eb
        L_0x0081:
            java.lang.String r7 = com.vungle.warren.C23223t.f58932d
            java.lang.String r8 = java.lang.Integer.toString(r1)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = com.vungle.warren.C23223t.f58933e
            java.lang.String r8 = java.lang.Integer.toString(r2)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = com.vungle.warren.C23223t.f58934f
            java.lang.String r8 = java.lang.Integer.toString(r3)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = com.vungle.warren.C23223t.f58935g
            java.lang.String r8 = java.lang.Integer.toString(r4)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = com.vungle.warren.C23223t.f58936h
            com.vungle.warren.t$a r8 = r0.f58942c
            com.vungle.warren.t$b r8 = r8.f58943a
            int r8 = r8.f58945a
            java.lang.String r8 = java.lang.Integer.toString(r8)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = com.vungle.warren.C23223t.f58937i
            com.vungle.warren.t$a r8 = r0.f58942c
            com.vungle.warren.t$b r8 = r8.f58943a
            int r8 = r8.f58946b
            java.lang.String r8 = java.lang.Integer.toString(r8)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = com.vungle.warren.C23223t.f58938j
            com.vungle.warren.t$a r8 = r0.f58942c
            com.vungle.warren.t$b r8 = r8.f58944b
            int r8 = r8.f58945a
            java.lang.String r8 = java.lang.Integer.toString(r8)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            java.lang.String r7 = com.vungle.warren.C23223t.f58939k
            com.vungle.warren.t$a r8 = r0.f58942c
            com.vungle.warren.t$b r8 = r8.f58944b
            int r8 = r8.f58946b
            java.lang.String r8 = java.lang.Integer.toString(r8)
            java.lang.String r6 = r6.replaceAll(r7, r8)
            r10[r5] = r6
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x0075
        L_0x00ee:
            ld0.a r0 = r0.f58941b
            r0.mo19956b(r10)
            goto L_0x0107
        L_0x00f4:
            com.vungle.warren.t$a r0 = r0.f58942c
            com.vungle.warren.t$b r1 = new com.vungle.warren.t$b
            float r2 = r10.getX()
            int r2 = (int) r2
            float r10 = r10.getY()
            int r10 = (int) r10
            r1.<init>(r2, r10)
            r0.f58943a = r1
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zd0.C25337d.mo61894a(android.view.MotionEvent):void");
    }

    /* renamed from: b */
    public final void mo61884b(C25286a aVar, C20979a aVar2) {
        String str;
        int i;
        boolean z;
        boolean z2;
        C25291e eVar = (C25291e) aVar;
        boolean z3 = false;
        this.f63692s.set(false);
        this.f63687n = eVar;
        eVar.setPresenter(this);
        C25287b.C25288a aVar3 = this.f63680g;
        if (aVar3 != null) {
            ((C23094b) aVar3).mo58095d("attach", this.f63681h.mo60808g(), this.f63683j.f62257a);
        }
        C24850c cVar = this.f63676c;
        if (cVar.f62847a && C20525a.f51915a.f51917a) {
            cVar.f62848b = true;
        }
        AdConfig adConfig = this.f63681h.f62224w;
        int i2 = adConfig.f58858a;
        if (i2 > 0) {
            if ((i2 & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f63688o = z2;
        }
        int i3 = -1;
        int c = adConfig.mo58028c();
        int i4 = 6;
        if (c == 3) {
            C24545c cVar2 = this.f63681h;
            if (cVar2.f62216o > cVar2.f62217p) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i3 = 7;
            } else if (z) {
                i3 = 6;
            }
            i4 = i3;
        } else if (c == 0) {
            i4 = 7;
        } else if (c != 1) {
            i4 = 4;
        }
        eVar.setOrientation(i4);
        C21039p pVar = (C21039p) this.f63684k;
        pVar.f52833e = this;
        pVar.f52842n = this;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63686m.getPath());
        String str2 = File.separator;
        File file = new File(new File(C0016g.m31o(sb, str2, "template")).getParent());
        File file2 = new File(file.getPath() + str2 + "index.html");
        C25344f fVar = new C25344f(this, file2);
        C21120u uVar = C21096d.f52936a;
        C21096d.C21099c cVar3 = new C21096d.C21099c(file2, fVar);
        C21096d.C21097a aVar4 = new C21096d.C21097a(cVar3);
        cVar3.executeOnExecutor(C21096d.f52936a, new Void[0]);
        this.f63678e = aVar4;
        C24559j jVar = (C24559j) this.f63677d.get("incentivizedTextSetByPub");
        if (jVar != null) {
            String c2 = jVar.mo60826c("title");
            String c3 = jVar.mo60826c(GroupedInventoryCardActivity.EXTRA_BODY);
            String c4 = jVar.mo60826c("continue");
            String c5 = jVar.mo60826c("close");
            C24545c cVar4 = this.f63681h;
            cVar4.getClass();
            if (!TextUtils.isEmpty(c2)) {
                cVar4.f62183E.put("INCENTIVIZED_TITLE_TEXT", c2);
            }
            if (!TextUtils.isEmpty(c3)) {
                cVar4.f62183E.put("INCENTIVIZED_BODY_TEXT", c3);
            }
            if (!TextUtils.isEmpty(c4)) {
                cVar4.f62183E.put("INCENTIVIZED_CONTINUE_TEXT", c4);
            }
            if (!TextUtils.isEmpty(c5)) {
                cVar4.f62183E.put("INCENTIVIZED_CLOSE_TEXT", c5);
            }
        }
        if (jVar == null) {
            str = null;
        } else {
            str = jVar.mo60826c("userID");
        }
        if (this.f63682i == null) {
            C24568o oVar = new C24568o(this.f63681h, this.f63683j, System.currentTimeMillis(), str);
            this.f63682i = oVar;
            oVar.f62280l = this.f63681h.f62194P;
            this.f63685l.mo58289x(oVar, this.f63693t, true);
        }
        if (this.f63694u == null) {
            this.f63694u = new C25243b(this.f63682i, this.f63685l, this.f63693t);
        }
        C24559j jVar2 = (C24559j) this.f63677d.get("consentIsImportantToVungle");
        if (jVar2 != null) {
            if (jVar2.mo60824a("is_country_data_protected").booleanValue() && "unknown".equals(jVar2.mo60826c("consent_status"))) {
                z3 = true;
            }
            C21044r rVar = this.f63684k;
            String c6 = jVar2.mo60826c("consent_title");
            String c7 = jVar2.mo60826c("consent_message");
            String c8 = jVar2.mo60826c("button_accept");
            String c9 = jVar2.mo60826c("button_deny");
            C21039p pVar2 = (C21039p) rVar;
            pVar2.f52834f = z3;
            pVar2.f52837i = c6;
            pVar2.f52838j = c7;
            pVar2.f52839k = c8;
            pVar2.f52840l = c9;
            if (z3) {
                jVar2.mo60827d("opted_out_by_timeout", "consent_status");
                jVar2.mo60827d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
                jVar2.mo60827d("vungle_modal", "consent_source");
                this.f63685l.mo58289x(jVar2, this.f63693t, true);
            }
        }
        C24545c cVar5 = this.f63681h;
        if (this.f63683j.f62259c) {
            i = cVar5.f62213l;
        } else {
            i = cVar5.f62212k;
        }
        int i5 = i * 1000;
        if (i5 > 0) {
            ((Handler) this.f63674a.f16031a).postAtTime(new C25343e(this), SystemClock.uptimeMillis() + ((long) i5));
        } else {
            this.f63688o = true;
        }
        this.f63687n.mo53142g();
        C25287b.C25288a aVar5 = this.f63680g;
        if (aVar5 != null) {
            ((C23094b) aVar5).mo58095d("start", (String) null, this.f63683j.f62257a);
        }
        C23181n1 b = C23181n1.m57208b();
        C13452i iVar = new C13452i();
        SessionEvent sessionEvent = SessionEvent.PLAY_AD;
        iVar.mo40349F("event", sessionEvent.toString());
        iVar.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.TRUE);
        iVar.mo40349F(SessionAttribute.EVENT_ID.toString(), this.f63681h.getId());
        b.mo58250d(new C24573q(sessionEvent, iVar));
    }

    /* renamed from: c */
    public final void mo53168c(String str, boolean z) {
        if (this.f63682i != null && !TextUtils.isEmpty(str)) {
            C24568o oVar = this.f63682i;
            synchronized (oVar) {
                oVar.f62285q.add(str);
            }
            this.f63685l.mo58289x(this.f63682i, this.f63693t, true);
        }
        VungleLogger.m57029b(C25337d.class.getSimpleName() + "#onReceivedError", str);
        if (z) {
            mo61925p(new VungleException(38));
            this.f63687n.close();
            ((Handler) this.f63674a.f16031a).removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: d */
    public final boolean mo61885d() {
        if (!this.f63688o) {
            return false;
        }
        this.f63687n.mo53134j("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        return false;
    }

    /* renamed from: e */
    public final void mo61886e(BundleOptionsState bundleOptionsState) {
        this.f63685l.mo58289x(this.f63682i, this.f63693t, true);
        bundleOptionsState.mo58333d(this.f63682i.mo60837a());
        bundleOptionsState.mo58335f("incentivized_sent", this.f63691r.get());
    }

    /* renamed from: f */
    public final void mo61887f() {
        this.f63687n.mo53142g();
        ((C21039p) this.f63684k).mo53157b(true);
    }

    /* renamed from: g */
    public final void mo61888g(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f63687n.mo53094l();
        mo61895l(false);
        if (!z && z2 && !this.f63692s.getAndSet(true)) {
            C21044r rVar = this.f63684k;
            String str = null;
            if (rVar != null) {
                ((C21039p) rVar).f52833e = null;
            }
            if (z3) {
                mo61927r("mraidCloseByApi", (String) null);
            }
            this.f63685l.mo58289x(this.f63682i, this.f63693t, true);
            C25287b.C25288a aVar = this.f63680g;
            if (aVar != null) {
                if (this.f63682i.f62291w) {
                    str = "isCTAClicked";
                }
                ((C23094b) aVar).mo58095d("end", str, this.f63683j.f62257a);
            }
        }
    }

    /* renamed from: h */
    public final void mo53169h() {
        VungleException vungleException = new VungleException(32);
        mo61924o(vungleException);
        VungleLogger.m57029b(C13437d.m33705j(C25337d.class, new StringBuilder(), "#onRenderProcessUnresponsive"), vungleException.getLocalizedMessage());
    }

    /* renamed from: i */
    public final void mo61889i(int i) {
        long j;
        C20851d dVar;
        C21096d.C21097a aVar = this.f63678e;
        if (aVar != null) {
            C21096d.C21099c cVar = aVar.f52937a;
            int i2 = C21096d.C21099c.f52938c;
            synchronized (cVar) {
                cVar.f52940b = null;
            }
            aVar.f52937a.cancel(true);
        }
        mo61888g(i);
        ((C21039p) this.f63684k).f52843o = null;
        C24850c cVar2 = this.f63676c;
        if (!cVar2.f62848b || (dVar = cVar2.f62849c) == null) {
            j = 0;
        } else {
            dVar.mo52975w();
            j = C24850c.f62846d;
        }
        cVar2.f62848b = false;
        cVar2.f62849c = null;
        this.f63687n.mo53098p(j);
    }

    /* renamed from: j */
    public final void mo53170j() {
        mo61924o(new VungleException(31));
        VungleLogger.m57029b(C13437d.m33705j(C25337d.class, new StringBuilder(), "onWebRenderingProcessGone"), new VungleException(31).getLocalizedMessage());
    }

    /* renamed from: k */
    public final void mo61890k(C20979a aVar) {
        if (aVar != null) {
            boolean z = aVar.getBoolean("incentivized_sent", false);
            if (z) {
                this.f63691r.set(z);
            }
            if (this.f63682i == null) {
                this.f63687n.close();
                VungleLogger.m57029b(C25337d.class.getSimpleName() + "#restoreFromSave", "The advertisement was not started and cannot be restored.");
            }
        }
    }

    /* renamed from: l */
    public final void mo61895l(boolean z) {
        C21039p pVar = (C21039p) this.f63684k;
        pVar.f52841m = Boolean.valueOf(z);
        pVar.mo53157b(false);
        if (z) {
            C25243b bVar = this.f63694u;
            if (bVar.f63517d.getAndSet(false)) {
                bVar.f63518e = System.currentTimeMillis() - bVar.f63514a.f62279k;
                return;
            }
            return;
        }
        C25243b bVar2 = this.f63694u;
        if (!bVar2.f63517d.getAndSet(true)) {
            bVar2.f63514a.f62279k = System.currentTimeMillis() - bVar2.f63518e;
            bVar2.f63515b.mo58289x(bVar2.f63514a, bVar2.f63516c, true);
        }
    }

    /* renamed from: m */
    public final void mo61870m(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -314498168:
                if (str.equals("privacy")) {
                    c = 0;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 1;
                    break;
                }
                break;
            case 1427818632:
                if (str.equals("download")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return;
            case 1:
                this.f63687n.close();
                ((Handler) this.f63674a.f16031a).removeCallbacksAndMessages((Object) null);
                return;
            case 2:
                mo61927r("cta", "");
                try {
                    this.f63675b.mo19956b(new String[]{this.f63681h.mo60804a(true)});
                    C24545c cVar = this.f63681h;
                    this.f63687n.mo53088b(cVar.f62195Q, cVar.mo60804a(false), new C25247e(this.f63680g, this.f63683j), new C25345g(this));
                    return;
                } catch (ActivityNotFoundException unused) {
                    VungleLogger.m57029b(C25337d.class.getSimpleName() + "#download", "Download - Activity Not Found");
                    return;
                }
            default:
                throw new IllegalArgumentException(C25541a.m63881k("Unknown action ", str));
        }
    }

    /* renamed from: n */
    public final void mo61891n(C25287b.C25288a aVar) {
        this.f63680g = aVar;
    }

    /* renamed from: o */
    public final void mo61924o(VungleException vungleException) {
        C25291e eVar = this.f63687n;
        if (eVar != null) {
            eVar.mo53096n();
        }
        String j = C13437d.m33705j(C25337d.class, new StringBuilder(), "#handleWebViewException");
        StringBuilder k = C13555b.m33972k("WebViewException: ");
        k.append(vungleException.getLocalizedMessage());
        VungleLogger.m57029b(j, k.toString());
        mo61925p(vungleException);
        this.f63687n.close();
        ((Handler) this.f63674a.f16031a).removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: p */
    public final void mo61925p(VungleException vungleException) {
        C25287b.C25288a aVar = this.f63680g;
        if (aVar != null) {
            ((C23094b) aVar).mo58094b(this.f63683j.f62257a, vungleException);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61926q(java.lang.String r21, p359ag.C13452i r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r21.getClass()
            int r4 = r21.hashCode()
            java.lang.String r5 = "useCustomPrivacy"
            java.lang.String r6 = "openNonMraid"
            java.lang.String r7 = "successfulView"
            java.lang.String r8 = "open"
            switch(r4) {
                case -1912374177: goto L_0x00a1;
                case -1422950858: goto L_0x0096;
                case -735200587: goto L_0x008b;
                case -660787472: goto L_0x0080;
                case -511324706: goto L_0x0075;
                case -418575596: goto L_0x006c;
                case -348095344: goto L_0x0063;
                case 3417674: goto L_0x005a;
                case 3566511: goto L_0x004d;
                case 94756344: goto L_0x003f;
                case 96784904: goto L_0x0031;
                case 1614272768: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x00aa
        L_0x0023:
            java.lang.String r4 = "useCustomClose"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x002d
            goto L_0x00aa
        L_0x002d:
            r4 = 11
            goto L_0x00ab
        L_0x0031:
            java.lang.String r4 = "error"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x003b
            goto L_0x00aa
        L_0x003b:
            r4 = 10
            goto L_0x00ab
        L_0x003f:
            java.lang.String r4 = "close"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0049
            goto L_0x00aa
        L_0x0049:
            r4 = 9
            goto L_0x00ab
        L_0x004d:
            java.lang.String r4 = "tpat"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0057
            goto L_0x00aa
        L_0x0057:
            r4 = 8
            goto L_0x00ab
        L_0x005a:
            boolean r4 = r0.equals(r8)
            if (r4 != 0) goto L_0x0061
            goto L_0x00aa
        L_0x0061:
            r4 = 7
            goto L_0x00ab
        L_0x0063:
            boolean r4 = r0.equals(r5)
            if (r4 != 0) goto L_0x006a
            goto L_0x00aa
        L_0x006a:
            r4 = 6
            goto L_0x00ab
        L_0x006c:
            boolean r4 = r0.equals(r6)
            if (r4 != 0) goto L_0x0073
            goto L_0x00aa
        L_0x0073:
            r4 = 5
            goto L_0x00ab
        L_0x0075:
            java.lang.String r4 = "openPrivacy"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x007e
            goto L_0x00aa
        L_0x007e:
            r4 = 4
            goto L_0x00ab
        L_0x0080:
            java.lang.String r4 = "consentAction"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0089
            goto L_0x00aa
        L_0x0089:
            r4 = 3
            goto L_0x00ab
        L_0x008b:
            java.lang.String r4 = "actionWithValue"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0094
            goto L_0x00aa
        L_0x0094:
            r4 = 2
            goto L_0x00ab
        L_0x0096:
            java.lang.String r4 = "action"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x009f
            goto L_0x00aa
        L_0x009f:
            r4 = 1
            goto L_0x00ab
        L_0x00a1:
            boolean r4 = r0.equals(r7)
            if (r4 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r4 = 0
            goto L_0x00ab
        L_0x00aa:
            r4 = -1
        L_0x00ab:
            java.lang.String r9 = "user"
            java.lang.String r10 = "adStartTime"
            java.lang.String r11 = "app_id"
            java.lang.String r12 = "placement_reference_id"
            java.lang.String r13 = "isReportIncentivizedEnabled"
            java.lang.String r14 = "Unknown value "
            java.lang.String r15 = "configSettings"
            r16 = r7
            java.lang.String r7 = "url"
            r17 = r3
            java.lang.String r3 = "gone"
            r18 = r9
            java.lang.String r9 = "event"
            r19 = r10
            r10 = 0
            switch(r4) {
                case 0: goto L_0x03ed;
                case 1: goto L_0x03eb;
                case 2: goto L_0x02c0;
                case 3: goto L_0x0282;
                case 4: goto L_0x026a;
                case 5: goto L_0x020d;
                case 6: goto L_0x01ba;
                case 7: goto L_0x020d;
                case 8: goto L_0x01a5;
                case 9: goto L_0x0190;
                case 10: goto L_0x013e;
                case 11: goto L_0x00e9;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<zd0.d> r2 = zd0.C25337d.class
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = "#processCommand"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Unknown MRAID Command"
            com.vungle.warren.VungleLogger.m57029b(r0, r2)
            r0 = 0
            return r0
        L_0x00e9:
            java.lang.String r0 = "sdkCloseButton"
            ag.g r0 = r2.mo40351I(r0)
            java.lang.String r0 = r0.mo40326B()
            r0.getClass()
            int r2 = r0.hashCode()
            r4 = -1901805651(0xffffffff8ea4bfad, float:-4.06137E-30)
            if (r2 == r4) goto L_0x011e
            r4 = 3178655(0x30809f, float:4.454244E-39)
            if (r2 == r4) goto L_0x0115
            r3 = 466743410(0x1bd1f072, float:3.4731534E-22)
            if (r2 == r3) goto L_0x010a
            goto L_0x0126
        L_0x010a:
            java.lang.String r2 = "visible"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0113
            goto L_0x0126
        L_0x0113:
            r2 = 2
            goto L_0x0129
        L_0x0115:
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L_0x011c
            goto L_0x0126
        L_0x011c:
            r2 = 1
            goto L_0x0129
        L_0x011e:
            java.lang.String r2 = "invisible"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0128
        L_0x0126:
            r2 = -1
            goto L_0x0129
        L_0x0128:
            r2 = 0
        L_0x0129:
            if (r2 == 0) goto L_0x013c
            r3 = 1
            if (r2 == r3) goto L_0x013c
            r3 = 2
            if (r2 != r3) goto L_0x0132
            goto L_0x013c
        L_0x0132:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = p379.C25541a.m63881k(r14, r0)
            r2.<init>(r0)
            throw r2
        L_0x013c:
            r0 = 1
            return r0
        L_0x013e:
            r0 = 1
            java.lang.String r3 = "code"
            java.lang.String r2 = p389bl.C13641g.m34123k(r2, r3, r10)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            od0.c r4 = r1.f63681h
            java.lang.String r4 = r4.mo60808g()
            r3[r0] = r4
            java.lang.String r0 = "%s Creative Id: %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            od0.o r3 = r1.f63682i
            if (r3 == 0) goto L_0x017a
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x017a
            od0.o r3 = r1.f63682i
            monitor-enter(r3)
            java.util.ArrayList r4 = r3.f62285q     // Catch:{ all -> 0x0177 }
            r4.add(r2)     // Catch:{ all -> 0x0177 }
            monitor-exit(r3)
            com.vungle.warren.persistence.a r2 = r1.f63685l
            od0.o r3 = r1.f63682i
            zd0.d$a r4 = r1.f63693t
            r5 = 1
            r2.mo58289x(r3, r4, r5)
            goto L_0x017a
        L_0x0177:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x017a:
            zd0.d$e r2 = new zd0.d$e
            r2.<init>(r0)
            boolean r0 = ce0.C21118s.m49418a()
            if (r0 == 0) goto L_0x0189
            r2.run()
            goto L_0x018e
        L_0x0189:
            android.os.Handler r0 = ce0.C21118s.f52984a
            r0.post(r2)
        L_0x018e:
            r0 = 1
            return r0
        L_0x0190:
            java.lang.String r0 = "mraidClose"
            r1.mo61927r(r0, r10)
            yd0.e r0 = r1.f63687n
            r0.close()
            g1.d r0 = r1.f63674a
            java.lang.Object r0 = r0.f16031a
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacksAndMessages(r10)
            r0 = 1
            return r0
        L_0x01a5:
            r0 = 1
            ag.g r2 = r2.mo40351I(r9)
            java.lang.String r2 = r2.mo40326B()
            ld0.a r3 = r1.f63675b
            od0.c r4 = r1.f63681h
            java.lang.String[] r2 = r4.mo60812i(r2)
            r3.mo19956b(r2)
            return r0
        L_0x01ba:
            ag.g r0 = r2.mo40351I(r5)
            java.lang.String r0 = r0.mo40326B()
            r0.getClass()
            int r2 = r0.hashCode()
            r4 = 3178655(0x30809f, float:4.454244E-39)
            if (r2 == r4) goto L_0x01ef
            r3 = 3569038(0x36758e, float:5.001287E-39)
            if (r2 == r3) goto L_0x01e4
            r3 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r2 == r3) goto L_0x01d9
            goto L_0x01f5
        L_0x01d9:
            java.lang.String r2 = "false"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x01e2
            goto L_0x01f5
        L_0x01e2:
            r2 = 2
            goto L_0x01f8
        L_0x01e4:
            java.lang.String r2 = "true"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x01ed
            goto L_0x01f5
        L_0x01ed:
            r2 = 1
            goto L_0x01f8
        L_0x01ef:
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L_0x01f7
        L_0x01f5:
            r2 = -1
            goto L_0x01f8
        L_0x01f7:
            r2 = 0
        L_0x01f8:
            if (r2 == 0) goto L_0x020b
            r3 = 1
            if (r2 == r3) goto L_0x020b
            r3 = 2
            if (r2 != r3) goto L_0x0201
            goto L_0x020b
        L_0x0201:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = p379.C25541a.m63881k(r14, r0)
            r2.<init>(r0)
            throw r2
        L_0x020b:
            r0 = 1
            return r0
        L_0x020d:
            java.lang.String r3 = "download"
            r1.mo61927r(r3, r10)
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x021e
            java.lang.String r0 = "mraidOpen"
            r1.mo61927r(r0, r10)
            goto L_0x0229
        L_0x021e:
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0229
            java.lang.String r0 = "nonMraidOpen"
            r1.mo61927r(r0, r10)
        L_0x0229:
            od0.c r0 = r1.f63681h
            java.lang.String r0 = r0.f62195Q
            ag.g r2 = r2.mo40351I(r7)
            java.lang.String r2 = r2.mo40326B()
            if (r0 == 0) goto L_0x023d
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0246
        L_0x023d:
            if (r2 == 0) goto L_0x0259
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0246
            goto L_0x0259
        L_0x0246:
            yd0.e r3 = r1.f63687n
            xd0.e r4 = new xd0.e
            yd0.b$a r5 = r1.f63680g
            od0.m r6 = r1.f63683j
            r4.<init>(r5, r6)
            zd0.d$d r5 = new zd0.d$d
            r5.<init>()
            r3.mo53088b(r0, r2, r4, r5)
        L_0x0259:
            yd0.b$a r0 = r1.f63680g
            if (r0 == 0) goto L_0x0268
            od0.m r2 = r1.f63683j
            java.lang.String r2 = r2.f62257a
            com.vungle.warren.b r0 = (com.vungle.warren.C23094b) r0
            java.lang.String r3 = "adClick"
            r0.mo58095d(r8, r3, r2)
        L_0x0268:
            r0 = 1
            return r0
        L_0x026a:
            r0 = 1
            ag.g r2 = r2.mo40351I(r7)
            java.lang.String r2 = r2.mo40326B()
            yd0.e r3 = r1.f63687n
            xd0.e r4 = new xd0.e
            yd0.b$a r5 = r1.f63680g
            od0.m r6 = r1.f63683j
            r4.<init>(r5, r6)
            r3.mo53088b(r10, r2, r4, r10)
            return r0
        L_0x0282:
            java.util.HashMap r0 = r1.f63677d
            java.lang.String r3 = "consentIsImportantToVungle"
            java.lang.Object r0 = r0.get(r3)
            od0.j r0 = (od0.C24559j) r0
            if (r0 != 0) goto L_0x0293
            od0.j r0 = new od0.j
            r0.<init>(r3)
        L_0x0293:
            ag.g r2 = r2.mo40351I(r9)
            java.lang.String r2 = r2.mo40326B()
            java.lang.String r3 = "consent_status"
            r0.mo60827d(r2, r3)
            java.lang.String r2 = "vungle_modal"
            java.lang.String r3 = "consent_source"
            r0.mo60827d(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "timestamp"
            r0.mo60827d(r2, r3)
            com.vungle.warren.persistence.a r2 = r1.f63685l
            zd0.d$a r3 = r1.f63693t
            r4 = 1
            r2.mo58289x(r0, r3, r4)
            return r4
        L_0x02c0:
            ag.g r0 = r2.mo40351I(r9)
            java.lang.String r0 = r0.mo40326B()
            java.lang.String r3 = "value"
            ag.g r2 = r2.mo40351I(r3)
            java.lang.String r2 = r2.mo40326B()
            od0.o r3 = r1.f63682i
            long r4 = java.lang.System.currentTimeMillis()
            r3.mo60838b(r4, r0, r2)
            com.vungle.warren.persistence.a r3 = r1.f63685l
            od0.o r4 = r1.f63682i
            zd0.d$a r5 = r1.f63693t
            r6 = 1
            r3.mo58289x(r4, r5, r6)
            java.lang.String r3 = "videoViewed"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x03c3
            r3 = 0
            float r4 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x02f3 }
            goto L_0x02f4
        L_0x02f3:
            r4 = 0
        L_0x02f4:
            yd0.b$a r5 = r1.f63680g
            if (r5 == 0) goto L_0x0317
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0317
            boolean r3 = r1.f63690q
            if (r3 != 0) goto L_0x0317
            r3 = 1
            r1.f63690q = r3
            od0.m r3 = r1.f63683j
            java.lang.String r3 = r3.f62257a
            com.vungle.warren.b r5 = (com.vungle.warren.C23094b) r5
            java.lang.String r6 = "adViewed"
            r5.mo58095d(r6, r10, r3)
            java.lang.String[] r3 = r1.f63695v
            if (r3 == 0) goto L_0x0317
            ld0.a r5 = r1.f63675b
            r5.mo19956b(r3)
        L_0x0317:
            long r5 = r1.f63689p
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x03c3
            float r3 = (float) r5
            float r4 = r4 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r3
            int r3 = (int) r4
            if (r3 <= 0) goto L_0x03a4
            yd0.b$a r4 = r1.f63680g
            if (r4 == 0) goto L_0x033b
            java.lang.String r5 = "percentViewed:"
            java.lang.String r5 = p379.C16759e.m42349e(r5, r3)
            od0.m r6 = r1.f63683j
            java.lang.String r6 = r6.f62257a
            com.vungle.warren.b r4 = (com.vungle.warren.C23094b) r4
            r4.mo58095d(r5, r10, r6)
        L_0x033b:
            java.util.HashMap r4 = r1.f63677d
            java.lang.Object r4 = r4.get(r15)
            od0.j r4 = (od0.C24559j) r4
            od0.m r5 = r1.f63683j
            boolean r5 = r5.f62259c
            if (r5 == 0) goto L_0x03a4
            r5 = 75
            if (r3 <= r5) goto L_0x03a4
            if (r4 == 0) goto L_0x03a4
            java.lang.Boolean r3 = r4.mo60824a(r13)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x03a4
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f63691r
            r4 = 1
            boolean r3 = r3.getAndSet(r4)
            if (r3 != 0) goto L_0x03a4
            ag.i r3 = new ag.i
            r3.<init>()
            ag.k r4 = new ag.k
            od0.m r5 = r1.f63683j
            java.lang.String r5 = r5.f62257a
            r4.<init>((java.lang.String) r5)
            r3.mo40346C(r4, r12)
            ag.k r4 = new ag.k
            od0.c r5 = r1.f63681h
            java.lang.String r5 = r5.f62206e
            r4.<init>((java.lang.String) r5)
            r3.mo40346C(r4, r11)
            ag.k r4 = new ag.k
            od0.o r5 = r1.f63682i
            long r5 = r5.f62276h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.<init>((java.lang.Number) r5)
            r5 = r19
            r3.mo40346C(r4, r5)
            ag.k r4 = new ag.k
            od0.o r5 = r1.f63682i
            java.lang.String r5 = r5.f62288t
            r4.<init>((java.lang.String) r5)
            r6 = r18
            r3.mo40346C(r4, r6)
            ld0.a r4 = r1.f63675b
            r4.mo19957c(r3)
        L_0x03a4:
            xd0.b r3 = r1.f63694u
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f63517d
            boolean r4 = r4.get()
            if (r4 != 0) goto L_0x03c3
            od0.o r4 = r3.f63514a
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r3.f63518e
            long r5 = r5 - r7
            r4.f62279k = r5
            com.vungle.warren.persistence.a r4 = r3.f63515b
            od0.o r5 = r3.f63514a
            com.vungle.warren.persistence.a$n r3 = r3.f63516c
            r6 = 1
            r4.mo58289x(r5, r3, r6)
        L_0x03c3:
            java.lang.String r3 = "videoLength"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x03df
            long r4 = java.lang.Long.parseLong(r2)
            r1.f63689p = r4
            r1.mo61927r(r3, r2)
            zd0.d$b r0 = new zd0.d$b
            r0.<init>()
            r2 = r17
            r2.post(r0)
            goto L_0x03e1
        L_0x03df:
            r2 = r17
        L_0x03e1:
            zd0.d$c r0 = new zd0.d$c
            r0.<init>()
            r2.post(r0)
            r0 = 1
            return r0
        L_0x03eb:
            r0 = 1
            return r0
        L_0x03ed:
            r6 = r18
            r5 = r19
            yd0.b$a r0 = r1.f63680g
            if (r0 == 0) goto L_0x0400
            od0.m r2 = r1.f63683j
            java.lang.String r2 = r2.f62257a
            com.vungle.warren.b r0 = (com.vungle.warren.C23094b) r0
            r3 = r16
            r0.mo58095d(r3, r10, r2)
        L_0x0400:
            java.util.HashMap r0 = r1.f63677d
            java.lang.Object r0 = r0.get(r15)
            od0.j r0 = (od0.C24559j) r0
            od0.m r2 = r1.f63683j
            boolean r2 = r2.f62259c
            if (r2 == 0) goto L_0x0461
            if (r0 == 0) goto L_0x0461
            java.lang.Boolean r0 = r0.mo60824a(r13)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0461
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f63691r
            r2 = 1
            boolean r0 = r0.getAndSet(r2)
            if (r0 != 0) goto L_0x0461
            ag.i r0 = new ag.i
            r0.<init>()
            ag.k r2 = new ag.k
            od0.m r3 = r1.f63683j
            java.lang.String r3 = r3.f62257a
            r2.<init>((java.lang.String) r3)
            r0.mo40346C(r2, r12)
            ag.k r2 = new ag.k
            od0.c r3 = r1.f63681h
            java.lang.String r3 = r3.f62206e
            r2.<init>((java.lang.String) r3)
            r0.mo40346C(r2, r11)
            ag.k r2 = new ag.k
            od0.o r3 = r1.f63682i
            long r3 = r3.f62276h
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.<init>((java.lang.Number) r3)
            r0.mo40346C(r2, r5)
            ag.k r2 = new ag.k
            od0.o r3 = r1.f63682i
            java.lang.String r3 = r3.f62288t
            r2.<init>((java.lang.String) r3)
            r0.mo40346C(r2, r6)
            ld0.a r2 = r1.f63675b
            r2.mo19957c(r0)
        L_0x0461:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zd0.C25337d.mo61926q(java.lang.String, ag.i):boolean");
    }

    /* renamed from: r */
    public final void mo61927r(String str, String str2) {
        if (str.equals("videoLength")) {
            long parseLong = Long.parseLong(str2);
            this.f63689p = parseLong;
            C24568o oVar = this.f63682i;
            oVar.f62278j = parseLong;
            this.f63685l.mo58289x(oVar, this.f63693t, true);
            return;
        }
        this.f63682i.mo60838b(System.currentTimeMillis(), str, str2);
        this.f63685l.mo58289x(this.f63682i, this.f63693t, true);
    }

    public final void start() {
        if (!this.f63687n.mo53093i()) {
            mo61925p(new VungleException(31));
            this.f63687n.close();
            ((Handler) this.f63674a.f16031a).removeCallbacksAndMessages((Object) null);
            return;
        }
        this.f63687n.mo53097o();
        this.f63687n.mo53090d();
        mo61895l(true);
    }
}
