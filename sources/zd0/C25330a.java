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
import com.braze.support.WebContentUtils;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23094b;
import com.vungle.warren.C23181n1;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import com.vungle.warren.p979ui.state.BundleOptionsState;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
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
import p359ag.C13454k;
import xd0.C25243b;
import xd0.C25247e;
import yd0.C25286a;
import yd0.C25287b;
import yd0.C25289c;

/* renamed from: zd0.a */
public final class C25330a implements C25287b, C21044r.C21046b {

    /* renamed from: A */
    public C25243b f63636A;

    /* renamed from: B */
    public final String[] f63637B;

    /* renamed from: C */
    public AtomicBoolean f63638C = new AtomicBoolean(false);

    /* renamed from: a */
    public final C4745d f63639a;

    /* renamed from: b */
    public final C24220a f63640b;

    /* renamed from: c */
    public final C21044r f63641c;

    /* renamed from: d */
    public final HashMap f63642d;

    /* renamed from: e */
    public C21096d.C21097a f63643e;

    /* renamed from: f */
    public C24566m f63644f;

    /* renamed from: g */
    public C24545c f63645g;

    /* renamed from: h */
    public C24568o f63646h;

    /* renamed from: i */
    public C23192a f63647i;

    /* renamed from: j */
    public File f63648j;

    /* renamed from: k */
    public boolean f63649k;

    /* renamed from: l */
    public boolean f63650l;

    /* renamed from: m */
    public boolean f63651m;

    /* renamed from: n */
    public C25289c f63652n;

    /* renamed from: o */
    public String f63653o = "Are you sure?";

    /* renamed from: p */
    public String f63654p = "If you exit now, you will not get your reward";

    /* renamed from: q */
    public String f63655q = "Continue";

    /* renamed from: r */
    public String f63656r = "Close";

    /* renamed from: s */
    public C25287b.C25288a f63657s;

    /* renamed from: t */
    public boolean f63658t;

    /* renamed from: u */
    public AtomicBoolean f63659u = new AtomicBoolean(false);

    /* renamed from: v */
    public AtomicBoolean f63660v = new AtomicBoolean(false);

    /* renamed from: w */
    public int f63661w;

    /* renamed from: x */
    public int f63662x;

    /* renamed from: y */
    public LinkedList<C24545c.C24546a> f63663y = new LinkedList<>();

    /* renamed from: z */
    public C25331a f63664z = new C25331a();

    /* renamed from: zd0.a$a */
    public class C25331a implements C23192a.C23207n {

        /* renamed from: a */
        public boolean f63665a = false;

        public C25331a() {
        }

        /* renamed from: a */
        public final void mo58121a() {
        }

        public final void onError() {
            if (!this.f63665a) {
                this.f63665a = true;
                C25330a.this.mo61916q(26);
                VungleLogger.m57029b(C13437d.m33705j(C25330a.class, new StringBuilder(), "#onError"), new VungleException(26).getLocalizedMessage());
                C25330a.this.mo61914o();
            }
        }
    }

    /* renamed from: zd0.a$b */
    public class C25332b implements C21096d.C21098b {

        /* renamed from: a */
        public final /* synthetic */ File f63667a;

        public C25332b(File file) {
            this.f63667a = file;
        }

        /* renamed from: a */
        public final void mo53291a(boolean z) {
            if (z) {
                C25289c cVar = C25330a.this.f63652n;
                StringBuilder k = C13555b.m33972k(WebContentUtils.FILE_URI_SCHEME_PREFIX);
                k.append(this.f63667a.getPath());
                cVar.mo53134j(k.toString());
                C25330a aVar = C25330a.this;
                aVar.f63640b.mo19956b(aVar.f63645g.mo60812i("postroll_view"));
                C25330a.this.f63651m = true;
                return;
            }
            C25330a.this.mo61916q(27);
            C25330a.this.mo61916q(10);
            VungleLogger.m57029b(C25330a.class.getSimpleName() + "#playPost", "Error Rendering Postroll");
            C25330a.this.mo61914o();
        }
    }

    /* renamed from: zd0.a$c */
    public class C25333c implements Runnable {
        public C25333c() {
        }

        public final void run() {
            C25330a aVar = C25330a.this;
            aVar.f63650l = true;
            if (!aVar.f63651m) {
                aVar.f63652n.mo53095m();
            }
        }
    }

    /* renamed from: zd0.a$d */
    public class C25334d implements PresenterAdOpenCallback {
        public C25334d() {
        }

        /* renamed from: a */
        public final void mo58331a(PresenterAdOpenCallback.AdOpenType adOpenType) {
            if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
                C25330a.this.mo61919t("deeplinkSuccess", (String) null);
            }
        }
    }

    public C25330a(C24545c cVar, C24566m mVar, C23192a aVar, C4745d dVar, C4436j0 j0Var, C21039p pVar, C20979a aVar2, File file, String[] strArr) {
        C24568o oVar;
        HashMap hashMap = new HashMap();
        this.f63642d = hashMap;
        this.f63645g = cVar;
        this.f63644f = mVar;
        this.f63639a = dVar;
        this.f63640b = j0Var;
        this.f63641c = pVar;
        this.f63647i = aVar;
        this.f63648j = file;
        this.f63637B = strArr;
        List<C24545c.C24546a> list = cVar.f62208g;
        if (list != null) {
            this.f63663y.addAll(list);
            Collections.sort(this.f63663y);
        }
        Class<C24559j> cls = C24559j.class;
        hashMap.put("incentivizedTextSetByPub", this.f63647i.mo58281p(cls, "incentivizedTextSetByPub").get());
        hashMap.put("consentIsImportantToVungle", this.f63647i.mo58281p(cls, "consentIsImportantToVungle").get());
        hashMap.put("configSettings", this.f63647i.mo58281p(cls, "configSettings").get());
        if (aVar2 != null) {
            String b = aVar2.mo53049b();
            if (TextUtils.isEmpty(b)) {
                oVar = null;
            } else {
                oVar = (C24568o) this.f63647i.mo58281p(C24568o.class, b).get();
            }
            if (oVar != null) {
                this.f63646h = oVar;
            }
        }
    }

    /* renamed from: b */
    public final void mo61884b(C25286a aVar, C20979a aVar2) {
        String str;
        boolean z;
        boolean z2;
        C25289c cVar = (C25289c) aVar;
        boolean z3 = false;
        this.f63660v.set(false);
        this.f63652n = cVar;
        cVar.setPresenter(this);
        C25287b.C25288a aVar3 = this.f63657s;
        if (aVar3 != null) {
            ((C23094b) aVar3).mo58095d("attach", this.f63645g.mo60808g(), this.f63644f.f62257a);
        }
        AdConfig adConfig = this.f63645g.f62224w;
        int i = adConfig.f58858a;
        if (i > 0) {
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f63649k = z;
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f63650l = z2;
        }
        int i2 = -1;
        int c = adConfig.mo58028c();
        int i3 = 6;
        if (c == 3) {
            C24545c cVar2 = this.f63645g;
            if (cVar2.f62216o > cVar2.f62217p) {
                z3 = true;
            }
            if (!z3) {
                i2 = 7;
            } else if (z3) {
                i2 = 6;
            }
            i3 = i2;
        } else if (c == 0) {
            i3 = 7;
        } else if (c != 1) {
            i3 = 4;
        }
        cVar.setOrientation(i3);
        mo61890k(aVar2);
        C24559j jVar = (C24559j) this.f63642d.get("incentivizedTextSetByPub");
        if (jVar == null) {
            str = null;
        } else {
            str = jVar.mo60826c("userID");
        }
        if (this.f63646h == null) {
            C24568o oVar = new C24568o(this.f63645g, this.f63644f, System.currentTimeMillis(), str);
            this.f63646h = oVar;
            oVar.f62280l = this.f63645g.f62194P;
            this.f63647i.mo58289x(oVar, this.f63664z, true);
        }
        if (this.f63636A == null) {
            this.f63636A = new C25243b(this.f63646h, this.f63647i, this.f63664z);
        }
        ((C21039p) this.f63641c).f52842n = this;
        C25289c cVar3 = this.f63652n;
        C24545c cVar4 = this.f63645g;
        cVar3.mo53135k(cVar4.f62220s, cVar4.f62221t);
        C25287b.C25288a aVar4 = this.f63657s;
        if (aVar4 != null) {
            ((C23094b) aVar4).mo58095d("start", (String) null, this.f63644f.f62257a);
        }
        C23181n1 b = C23181n1.m57208b();
        C13452i iVar = new C13452i();
        SessionEvent sessionEvent = SessionEvent.PLAY_AD;
        iVar.mo40349F("event", sessionEvent.toString());
        iVar.mo40347D(SessionAttribute.SUCCESS.toString(), Boolean.TRUE);
        iVar.mo40349F(SessionAttribute.EVENT_ID.toString(), this.f63645g.getId());
        b.mo58250d(new C24573q(sessionEvent, iVar));
    }

    /* renamed from: c */
    public final void mo53168c(String str, boolean z) {
        C24568o oVar = this.f63646h;
        if (oVar != null) {
            synchronized (oVar) {
                oVar.f62285q.add(str);
            }
            this.f63647i.mo58289x(this.f63646h, this.f63664z, true);
            VungleLogger.m57029b(C25330a.class.getSimpleName() + "onReceivedError", str);
        }
    }

    /* renamed from: d */
    public final boolean mo61885d() {
        if (this.f63651m) {
            mo61914o();
            return true;
        } else if (!this.f63650l) {
            return false;
        } else {
            if (!this.f63644f.f62259c || this.f63662x > 75) {
                mo61919t("video_close", (String) null);
                if (!TextUtils.isEmpty(this.f63645g.f62219r)) {
                    mo61918s();
                    return false;
                }
                mo61914o();
                return true;
            }
            String str = this.f63653o;
            String str2 = this.f63654p;
            String str3 = this.f63655q;
            String str4 = this.f63656r;
            C24559j jVar = (C24559j) this.f63642d.get("incentivizedTextSetByPub");
            if (jVar != null) {
                str = jVar.mo60826c("title");
                if (TextUtils.isEmpty(str)) {
                    str = this.f63653o;
                }
                str2 = jVar.mo60826c(GroupedInventoryCardActivity.EXTRA_BODY);
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.f63654p;
                }
                str3 = jVar.mo60826c("continue");
                if (TextUtils.isEmpty(str3)) {
                    str3 = this.f63655q;
                }
                str4 = jVar.mo60826c("close");
                if (TextUtils.isEmpty(str4)) {
                    str4 = this.f63656r;
                }
            }
            C25336c cVar = new C25336c(this);
            this.f63652n.pauseVideo();
            this.f63652n.mo53091f(str, str2, str3, str4, cVar);
            return false;
        }
    }

    /* renamed from: e */
    public final void mo61886e(BundleOptionsState bundleOptionsState) {
        String str;
        int i;
        this.f63647i.mo58289x(this.f63646h, this.f63664z, true);
        C24568o oVar = this.f63646h;
        if (oVar == null) {
            str = null;
        } else {
            str = oVar.mo60837a();
        }
        bundleOptionsState.mo58333d(str);
        bundleOptionsState.mo58335f("incentivized_sent", this.f63659u.get());
        bundleOptionsState.mo58335f("in_post_roll", this.f63651m);
        bundleOptionsState.mo58335f("is_muted_mode", this.f63649k);
        C25289c cVar = this.f63652n;
        if (cVar == null || !cVar.mo53132e()) {
            i = this.f63661w;
        } else {
            i = this.f63652n.mo53131c();
        }
        bundleOptionsState.mo58332c(i);
    }

    /* renamed from: f */
    public final void mo61887f() {
        ((C21039p) this.f63641c).mo53157b(true);
        this.f63652n.mo53099q();
    }

    /* renamed from: g */
    public final void mo61888g(int i) {
        boolean z;
        C25243b bVar = this.f63636A;
        if (!bVar.f63517d.getAndSet(true)) {
            bVar.f63514a.f62279k = System.currentTimeMillis() - bVar.f63518e;
            bVar.f63515b.mo58289x(bVar.f63514a, bVar.f63516c, true);
        }
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        this.f63652n.mo53094l();
        if (this.f63652n.mo53132e()) {
            this.f63661w = this.f63652n.mo53131c();
            this.f63652n.pauseVideo();
        }
        if (z || !z2) {
            if (this.f63651m || z2) {
                this.f63652n.mo53134j("about:blank");
            }
        } else if (!this.f63660v.getAndSet(true)) {
            String str = null;
            mo61919t("close", (String) null);
            ((Handler) this.f63639a.f16031a).removeCallbacksAndMessages((Object) null);
            C25287b.C25288a aVar = this.f63657s;
            if (aVar != null) {
                if (this.f63646h.f62291w) {
                    str = "isCTAClicked";
                }
                ((C23094b) aVar).mo58095d("end", str, this.f63644f.f62257a);
            }
        }
    }

    /* renamed from: h */
    public final void mo53169h() {
        C25289c cVar = this.f63652n;
        if (cVar != null) {
            cVar.mo53096n();
        }
        mo61920u(32);
        VungleLogger.m57029b(C13437d.m33705j(C25330a.class, new StringBuilder(), "#onRenderProcessUnresponsive"), new VungleException(32).getLocalizedMessage());
    }

    /* renamed from: i */
    public final void mo61889i(int i) {
        C21096d.C21097a aVar = this.f63643e;
        if (aVar != null) {
            C21096d.C21099c cVar = aVar.f52937a;
            int i2 = C21096d.C21099c.f52938c;
            synchronized (cVar) {
                cVar.f52940b = null;
            }
            aVar.f52937a.cancel(true);
        }
        mo61888g(i);
        this.f63652n.mo53098p(0);
    }

    /* renamed from: j */
    public final void mo53170j() {
        C25289c cVar = this.f63652n;
        if (cVar != null) {
            cVar.mo53096n();
        }
        mo61920u(31);
        VungleLogger.m57029b(C13437d.m33705j(C25330a.class, new StringBuilder(), "#onWebRenderingProcessGone"), new VungleException(31).getLocalizedMessage());
    }

    /* renamed from: k */
    public final void mo61890k(C20979a aVar) {
        if (aVar != null) {
            if (aVar.getBoolean("incentivized_sent", false)) {
                this.f63659u.set(true);
            }
            this.f63651m = aVar.getBoolean("in_post_roll", this.f63651m);
            this.f63649k = aVar.getBoolean("is_muted_mode", this.f63649k);
            this.f63661w = aVar.getInt(this.f63661w).intValue();
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
                mo61914o();
                return;
            case 2:
                mo61915p();
                mo61914o();
                return;
            default:
                VungleLogger.m57029b(C25330a.class.getSimpleName() + "#onMraidAction", "Unknown MRAID Command");
                throw new IllegalArgumentException(C25541a.m63881k("Unknown action ", str));
        }
    }

    /* renamed from: n */
    public final void mo61891n(C25287b.C25288a aVar) {
        this.f63657s = aVar;
    }

    /* renamed from: o */
    public final void mo61914o() {
        if (!this.f63638C.get()) {
            this.f63638C.set(true);
            mo61919t("close", (String) null);
            ((Handler) this.f63639a.f16031a).removeCallbacksAndMessages((Object) null);
            this.f63652n.close();
        }
    }

    /* renamed from: p */
    public final void mo61915p() {
        mo61919t("cta", "");
        try {
            this.f63640b.mo19956b(this.f63645g.mo60812i("postroll_click"));
            this.f63640b.mo19956b(this.f63645g.mo60812i("click_url"));
            this.f63640b.mo19956b(this.f63645g.mo60812i("video_click"));
            this.f63640b.mo19956b(new String[]{this.f63645g.mo60804a(true)});
            mo61919t("download", (String) null);
            String a = this.f63645g.mo60804a(false);
            if (a != null) {
                if (!a.isEmpty()) {
                    this.f63652n.mo53088b(this.f63645g.f62195Q, a, new C25247e(this.f63657s, this.f63644f), new C25334d());
                }
            }
            C25287b.C25288a aVar = this.f63657s;
            if (aVar != null) {
                ((C23094b) aVar).mo58095d("open", "adClick", this.f63644f.f62257a);
            }
        } catch (ActivityNotFoundException unused) {
            VungleLogger.m57029b(C25330a.class.getSimpleName() + "#download", "Download - Activity Not Found");
        }
    }

    /* renamed from: q */
    public final void mo61916q(int i) {
        C25287b.C25288a aVar = this.f63657s;
        if (aVar != null) {
            C23094b bVar = (C23094b) aVar;
            bVar.mo58094b(this.f63644f.f62257a, new VungleException(i));
        }
    }

    /* renamed from: r */
    public final void mo61917r(float f, int i) {
        this.f63662x = (int) ((((float) i) / f) * 100.0f);
        this.f63661w = i;
        C25243b bVar = this.f63636A;
        if (!bVar.f63517d.get()) {
            bVar.f63514a.f62279k = System.currentTimeMillis() - bVar.f63518e;
            bVar.f63515b.mo58289x(bVar.f63514a, bVar.f63516c, true);
        }
        C25287b.C25288a aVar = this.f63657s;
        if (aVar != null) {
            StringBuilder k = C13555b.m33972k("percentViewed:");
            k.append(this.f63662x);
            ((C23094b) aVar).mo58095d(k.toString(), (String) null, this.f63644f.f62257a);
        }
        C25287b.C25288a aVar2 = this.f63657s;
        if (aVar2 != null && i > 0 && !this.f63658t) {
            this.f63658t = true;
            ((C23094b) aVar2).mo58095d("adViewed", (String) null, this.f63644f.f62257a);
            String[] strArr = this.f63637B;
            if (strArr != null) {
                this.f63640b.mo19956b(strArr);
            }
        }
        mo61919t("video_viewed", String.format(Locale.ENGLISH, "%d", new Object[]{Integer.valueOf(i)}));
        if (this.f63662x == 100) {
            if (this.f63663y.peekLast() != null && this.f63663y.peekLast().mo60817f() == 100) {
                this.f63640b.mo19956b(this.f63663y.pollLast().mo60818g());
            }
            if (!TextUtils.isEmpty(this.f63645g.f62219r)) {
                mo61918s();
            } else {
                mo61914o();
            }
        }
        C24568o oVar = this.f63646h;
        oVar.f62282n = this.f63661w;
        this.f63647i.mo58289x(oVar, this.f63664z, true);
        while (this.f63663y.peek() != null && this.f63662x > this.f63663y.peek().mo60817f()) {
            this.f63640b.mo19956b(this.f63663y.poll().mo60818g());
        }
        C24559j jVar = (C24559j) this.f63642d.get("configSettings");
        if (this.f63644f.f62259c && this.f63662x > 75 && jVar != null && jVar.mo60824a("isReportIncentivizedEnabled").booleanValue() && !this.f63659u.getAndSet(true)) {
            C13452i iVar = new C13452i();
            iVar.mo40346C(new C13454k(this.f63644f.f62257a), "placement_reference_id");
            iVar.mo40346C(new C13454k(this.f63645g.f62206e), "app_id");
            iVar.mo40346C(new C13454k((Number) Long.valueOf(this.f63646h.f62276h)), "adStartTime");
            iVar.mo40346C(new C13454k(this.f63646h.f62288t), "user");
            this.f63640b.mo19957c(iVar);
        }
    }

    /* renamed from: s */
    public final void mo61918s() {
        File file = new File(this.f63648j.getPath());
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        File file2 = new File(C0016g.m31o(sb, File.separator, "index.html"));
        C25332b bVar = new C25332b(file2);
        C21120u uVar = C21096d.f52936a;
        C21096d.C21099c cVar = new C21096d.C21099c(file2, bVar);
        C21096d.C21097a aVar = new C21096d.C21097a(cVar);
        cVar.executeOnExecutor(C21096d.f52936a, new Void[0]);
        this.f63643e = aVar;
    }

    public final void start() {
        boolean z;
        int i;
        C25243b bVar = this.f63636A;
        boolean z2 = false;
        if (bVar.f63517d.getAndSet(false)) {
            bVar.f63518e = System.currentTimeMillis() - bVar.f63514a.f62279k;
        }
        if (!this.f63652n.mo53093i()) {
            mo61920u(31);
            VungleLogger.m57029b(C13437d.m33705j(C25330a.class, new StringBuilder(), "#start"), new VungleException(31).getLocalizedMessage());
            return;
        }
        this.f63652n.mo53097o();
        this.f63652n.mo53090d();
        C24559j jVar = (C24559j) this.f63642d.get("consentIsImportantToVungle");
        if (jVar == null || !jVar.mo60824a("is_country_data_protected").booleanValue() || !"unknown".equals(jVar.mo60826c("consent_status"))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C25335b bVar2 = new C25335b(this, jVar);
            jVar.mo60827d("opted_out_by_timeout", "consent_status");
            jVar.mo60827d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
            jVar.mo60827d("vungle_modal", "consent_source");
            this.f63647i.mo58289x(jVar, this.f63664z, true);
            String c = jVar.mo60826c("consent_title");
            String c2 = jVar.mo60826c("consent_message");
            String c3 = jVar.mo60826c("button_accept");
            String c4 = jVar.mo60826c("button_deny");
            this.f63652n.pauseVideo();
            this.f63652n.mo53091f(c, c2, c3, c4, bVar2);
        } else if (this.f63651m) {
            String websiteUrl = this.f63652n.getWebsiteUrl();
            if (TextUtils.isEmpty(websiteUrl) || "about:blank".equalsIgnoreCase(websiteUrl)) {
                z2 = true;
            }
            if (z2) {
                mo61918s();
            }
        } else if (!this.f63652n.mo53132e() && !this.f63652n.mo61893a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f63648j.getPath());
            this.f63652n.mo53133h(new File(C0016g.m31o(sb, File.separator, "video")), this.f63649k, this.f63661w);
            C24545c cVar = this.f63645g;
            if (this.f63644f.f62259c) {
                i = cVar.f62213l;
            } else {
                i = cVar.f62212k;
            }
            int i2 = i * 1000;
            if (i2 > 0) {
                C4745d dVar = this.f63639a;
                ((Handler) dVar.f16031a).postAtTime(new C25333c(), SystemClock.uptimeMillis() + ((long) i2));
                return;
            }
            this.f63650l = true;
            this.f63652n.mo53095m();
        }
    }

    /* renamed from: t */
    public final void mo61919t(String str, String str2) {
        if (str.equals("videoLength")) {
            int parseInt = Integer.parseInt(str2);
            C24568o oVar = this.f63646h;
            oVar.f62278j = (long) parseInt;
            this.f63647i.mo58289x(oVar, this.f63664z, true);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -840405966:
                if (str.equals("unmute")) {
                    c = 0;
                    break;
                }
                break;
            case 3363353:
                if (str.equals("mute")) {
                    c = 1;
                    break;
                }
                break;
            case 1370606900:
                if (str.equals("video_close")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                this.f63640b.mo19956b(this.f63645g.mo60812i(str));
                break;
        }
        this.f63646h.mo60838b(System.currentTimeMillis(), str, str2);
        this.f63647i.mo58289x(this.f63646h, this.f63664z, true);
    }

    /* renamed from: u */
    public final void mo61920u(int i) {
        mo61916q(i);
        String simpleName = C25330a.class.getSimpleName();
        StringBuilder k = C13555b.m33972k("WebViewException: ");
        k.append(new VungleException(i).getLocalizedMessage());
        VungleLogger.m57029b(simpleName, k.toString());
        mo61914o();
    }
}
