package com.veriff.sdk.views.camera;

import com.veriff.sdk.internal.C21620fa;
import com.veriff.sdk.internal.C21625ff;
import com.veriff.sdk.internal.C21636fm;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C22046na;
import com.veriff.sdk.internal.C22660wl;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22667wr;
import com.veriff.sdk.views.camera.g$c;
import java.io.File;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.util.C24446b;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.views.camera.i */
public class C22872i implements C22667wr {

    /* renamed from: a */
    private static final C24465j f58052a = C24465j.m61536a(C22872i.class);

    /* renamed from: b */
    private final C21645fu f58053b;

    /* renamed from: c */
    private final Set<C22832ag> f58054c = EnumSet.noneOf(C22832ag.class);

    /* renamed from: d */
    private final C21636fm f58055d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final g$c f58056e;

    /* renamed from: f */
    private final g$a f58057f;

    /* renamed from: g */
    private final C21620fa f58058g;

    /* renamed from: h */
    private final C24446b f58059h;

    /* renamed from: i */
    private final C21789ix f58060i;

    /* renamed from: j */
    private long f58061j;

    /* renamed from: k */
    private boolean f58062k = false;

    /* renamed from: l */
    private boolean f58063l = false;

    /* renamed from: m */
    private boolean f58064m = false;

    /* renamed from: com.veriff.sdk.views.camera.i$1 */
    public static /* synthetic */ class C228731 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58065a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.internal.iy[] r0 = com.veriff.sdk.internal.C21791iy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58065a = r0
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_PASSPORT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_FRONT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_ID_CARD_FRONT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_FRONT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_DRIVERS_LICENSE_BACK_AFTER_BARCODE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_ID_CARD_BACK     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PHOTO_OF_RESIDENCE_PERMIT_BACK     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_PASSPORT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_DRIVERS_LICENSE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_ID_CARD     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f58065a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.veriff.sdk.internal.iy r1 = com.veriff.sdk.internal.C21791iy.TAKE_PORTRAIT_WITH_RESIDENCE_PERMIT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.C22872i.C228731.<clinit>():void");
        }
    }

    /* renamed from: com.veriff.sdk.views.camera.i$a */
    public class C22874a implements Runnable {

        /* renamed from: b */
        private final C21625ff.C21626a f58067b;

        public C22874a(C21625ff.C21626a aVar) {
            this.f58067b = aVar;
        }

        public void run() {
            C22872i iVar = C22872i.this;
            iVar.m56340a(iVar.f58056e.mo57719i());
            this.f58067b.mo54900a();
        }
    }

    public C22872i(g$c g_c, g$a g_a, C21636fm fmVar, C21620fa faVar, C21645fu fuVar, C24446b bVar, C21789ix ixVar) {
        this.f58056e = g_c;
        this.f58057f = g_a;
        this.f58055d = fmVar;
        this.f58058g = faVar;
        this.f58053b = fuVar;
        this.f58059h = bVar;
        this.f58060i = ixVar;
    }

    /* renamed from: b */
    private void m56341b(C22832ag agVar) {
        if (this.f58054c.add(agVar)) {
            this.f58053b.mo54921a(agVar.mo57637a());
            this.f58056e.mo57713a((Collection<C22832ag>) this.f58054c);
            m56343m();
        }
    }

    /* renamed from: l */
    private void m56342l() {
        this.f58053b.mo54921a(C21716gg.m52879a());
    }

    /* renamed from: m */
    private void m56343m() {
        if (this.f58064m || this.f58062k) {
            this.f58056e.mo57712a(g$c.C22870a.DISABLED);
        } else if (!this.f58054c.isEmpty()) {
            this.f58056e.mo57712a(g$c.C22870a.SHOOTING_DISABLED);
        } else {
            this.f58056e.mo57712a(g$c.C22870a.ENABLED);
        }
    }

    /* renamed from: n */
    private void m56344n() {
        this.f58055d.mo54893a(500, new C22874a(C21625ff.f54627a.mo54898a()));
    }

    /* renamed from: o */
    private void m56345o() {
        f58052a.mo60705d("firstPhotoCapturingFailed()");
        if (this.f58062k) {
            mo57734f();
            this.f58056e.mo57716g();
        }
    }

    /* renamed from: p */
    private void m56346p() {
        f58052a.mo60705d("secondPhotoCapturingFailed()");
        if (this.f58062k) {
            mo57734f();
            this.f58056e.mo57716g();
        }
    }

    /* renamed from: q */
    private C24422b m56347q() {
        return this.f58057f.mo57699b().mo57021e();
    }

    /* renamed from: c */
    public void mo57731c() {
        this.f58064m = true;
        m56343m();
    }

    /* renamed from: d */
    public void mo57732d() {
        f58052a.mo60705d("noCameraDeviceFound(), ending auth flow");
        this.f58056e.mo57709a(50);
    }

    /* renamed from: e */
    public void mo57733e() {
        f58052a.mo60705d("onTakePicturePressed()");
        this.f58053b.mo54921a(C21716gg.m52897a(m56347q().mo60569a(), this.f58060i, this.f58059h.mo60662a(this.f58061j)));
        this.f58062k = true;
        m56343m();
        C22661wm b = this.f58057f.mo57699b();
        this.f58056e.mo57711a(new C22660wl(false, true, b.mo57022f()), b.mo57023g());
    }

    /* renamed from: f */
    public void mo57734f() {
        this.f58062k = false;
        m56343m();
    }

    /* renamed from: g */
    public void mo57735g() {
        C24422b q = m56347q();
        f58052a.mo60705d("onInfoPressed(), opening tutorial for current step");
        this.f58063l = true;
        switch (C228731.f58065a[q.mo60569a().ordinal()]) {
            case 1:
                this.f58053b.mo54921a(C21716gg.m52966v());
                break;
            case 2:
                this.f58053b.mo54921a(C21716gg.m52970z());
                break;
            case 3:
            case 4:
            case 5:
                this.f58053b.mo54921a(C21716gg.m52967w());
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                this.f58053b.mo54921a(C21716gg.m52968x());
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                this.f58053b.mo54921a(C21716gg.m52969y());
                break;
        }
        this.f58056e.mo57720j();
        this.f58056e.mo57714a(true);
    }

    /* renamed from: h */
    public void mo57736h() {
        f58052a.mo60705d("onClickedAwayFromSheet(), closing sheet");
        this.f58056e.mo57721k();
        this.f58056e.mo57714a(false);
    }

    /* renamed from: i */
    public void mo57737i() {
        f58052a.mo60705d("onSheetCollapsed()");
        this.f58063l = false;
        this.f58056e.mo57714a(false);
    }

    /* renamed from: j */
    public boolean mo57738j() {
        f58052a.mo60705d("onBackButtonPressed(), showing cancel dialog");
        if (!this.f58063l) {
            return false;
        }
        this.f58056e.mo57721k();
        this.f58056e.mo57714a(false);
        return true;
    }

    /* renamed from: k */
    public void mo57739k() {
        this.f58056e.mo57710a(m56347q().mo60569a(), C21719gi.CLOSE_BUTTON);
    }

    /* renamed from: a */
    public void mo56242a() {
        C24465j jVar = f58052a;
        jVar.mo60705d("View created, getting permissions");
        if (!this.f58058g.mo56418k()) {
            this.f58053b.mo54921a(C21716gg.m52955k());
            this.f58056e.mo57715f_();
        } else if (this.f58057f.mo57700c() && this.f58057f.mo57701d() && !this.f58058g.mo56419l()) {
            this.f58053b.mo54921a(C21716gg.m52955k());
            this.f58056e.mo57717g_();
        } else if (!this.f58058g.mo54892a()) {
            jVar.mo60705d("Camera missing, closing SDK");
            this.f58056e.mo57709a(50);
        } else {
            jVar.mo60705d("Camera available, initializing");
            m56342l();
        }
    }

    /* renamed from: b */
    public void mo57729b() {
        this.f58064m = false;
        m56343m();
    }

    /* renamed from: b */
    public void mo57730b(C22660wl wlVar) {
        if (wlVar.mo57007b()) {
            m56345o();
        } else {
            m56346p();
        }
    }

    /* renamed from: a */
    public void mo57725a(float f, int i) {
        if (!this.f58057f.mo57702e() || i < 1) {
            return;
        }
        if (((double) f) < this.f58057f.mo57707j()) {
            m56341b(C22832ag.LOW_LIGHT);
        } else {
            m56338a(C22832ag.LOW_LIGHT);
        }
    }

    /* renamed from: a */
    private void m56338a(C22832ag agVar) {
        if (this.f58054c.remove(agVar)) {
            if (agVar.mo57638b() != null) {
                this.f58053b.mo54921a(agVar.mo57638b());
            }
            this.f58056e.mo57713a((Collection<C22832ag>) this.f58054c);
            m56343m();
        }
    }

    /* renamed from: a */
    public void mo57728a(C24422b bVar) {
        this.f58061j = this.f58059h.mo60661a();
        this.f58056e.mo57722l();
        if (!this.f58057f.mo57703f()) {
            return;
        }
        if (bVar.mo60569a().mo55484c()) {
            m56341b(C22832ag.NO_PERSON);
            return;
        }
        m56338a(C22832ag.NO_PERSON);
        m56338a(C22832ag.MULTIPLE_PERSONS);
    }

    /* renamed from: a */
    public void mo57724a(float f, float f2) {
        f58052a.mo60705d("onFrameClicked(), focusing picture");
        this.f58056e.mo57708a(f, f2);
    }

    /* renamed from: a */
    public void mo57726a(C22660wl wlVar) {
        f58052a.mo60705d(String.format("photoCaptured(%b)", new Object[]{Boolean.valueOf(wlVar.mo57006a())}));
        if (this.f58062k && wlVar.mo57007b()) {
            m56344n();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m56340a(boolean z) {
        C22661wm b = this.f58057f.mo57699b();
        this.f58056e.mo57711a(new C22660wl(z, false, b.mo57024h()), b.mo57025i());
    }

    /* renamed from: a */
    public void mo57727a(C22660wl wlVar, File file) {
        C24465j jVar = f58052a;
        StringBuilder k = C13555b.m33972k("photoFileReady(");
        k.append(wlVar.mo57008c());
        k.append(")");
        jVar.mo60705d(k.toString());
        C22661wm b = this.f58057f.mo57699b();
        this.f58057f.mo57697a(new C22046na(this.f58057f.mo57699b().mo57012a(), file, wlVar.mo57008c(), true, wlVar.mo57007b(), wlVar.mo57007b() && this.f58057f.mo57704g(), this.f58057f.mo57705h(), this.f58057f.mo57706i()));
        this.f58053b.mo54921a(C21716gg.m52942d(wlVar.mo57008c()));
        m56337a(b);
    }

    /* renamed from: a */
    private void m56337a(C22661wm wmVar) {
        String f = wmVar.mo57022f();
        String h = wmVar.mo57024h();
        if (this.f58057f.mo57698a(f, h) && this.f58057f.mo57696a(f) != null) {
            this.f58056e.mo57718h();
        }
    }
}
