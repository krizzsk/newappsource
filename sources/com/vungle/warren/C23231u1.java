package com.vungle.warren;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import be0.C21033n;
import ce0.C21095c;
import ce0.C21114p;
import ce0.C21121v;
import ce0.C21122w;
import com.vungle.warren.AdConfig;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.ViewUtility;
import od0.C24573q;
import p359ag.C13452i;

/* renamed from: com.vungle.warren.u1 */
public final class C23231u1 extends RelativeLayout {

    /* renamed from: m */
    public static final /* synthetic */ int f58953m = 0;

    /* renamed from: b */
    public String f58954b;

    /* renamed from: c */
    public int f58955c;

    /* renamed from: d */
    public int f58956d;

    /* renamed from: e */
    public boolean f58957e;

    /* renamed from: f */
    public boolean f58958f;

    /* renamed from: g */
    public C21033n f58959g;

    /* renamed from: h */
    public C23170k f58960h;

    /* renamed from: i */
    public C23135f0 f58961i;

    /* renamed from: j */
    public C21114p f58962j;

    /* renamed from: k */
    public C23232a f58963k = new C23232a();

    /* renamed from: l */
    public C23233b f58964l = new C23233b();

    /* renamed from: com.vungle.warren.u1$a */
    public class C23232a implements Runnable {
        public C23232a() {
        }

        public final void run() {
            int i = C23231u1.f58953m;
            C23231u1 u1Var = C23231u1.this;
            u1Var.f58958f = true;
            C23179n.m57203a(u1Var.f58954b, u1Var.f58960h, new C21121v(u1Var.f58964l));
        }
    }

    /* renamed from: com.vungle.warren.u1$b */
    public class C23233b implements C23258z {
        public C23233b() {
        }

        public final void onAdLoad(String str) {
            int i = C23231u1.f58953m;
            C23231u1 u1Var = C23231u1.this;
            if (u1Var.f58958f && (!u1Var.f58957e)) {
                u1Var.f58958f = false;
                u1Var.mo58322a(false);
                C23231u1 u1Var2 = C23231u1.this;
                C21033n bannerViewInternal = Vungle.getBannerViewInternal(u1Var2.f58954b, (AdMarkup) null, new AdConfig(u1Var2.f58960h), C23231u1.this.f58961i);
                if (bannerViewInternal != null) {
                    C23231u1 u1Var3 = C23231u1.this;
                    u1Var3.f58959g = bannerViewInternal;
                    u1Var3.mo58323b();
                    return;
                }
                onError(C23231u1.this.f58954b, new VungleException(10));
                VungleLogger.m57029b(C23231u1.class.getSimpleName() + "#loadAdCallback; onAdLoad", "VungleBannerView is null");
            }
        }

        public final void onError(String str, VungleException vungleException) {
            int i = C23231u1.f58953m;
            vungleException.getLocalizedMessage();
            if (C23231u1.this.getVisibility() == 0) {
                C23231u1 u1Var = C23231u1.this;
                if (!u1Var.f58957e) {
                    u1Var.f58962j.mo53316a();
                }
            }
        }
    }

    static {
        Class<C23231u1> cls = C23231u1.class;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23231u1(Context context, String str, int i, C23170k kVar, C23138g0 g0Var) {
        super(context);
        boolean z;
        Context context2 = context;
        String str2 = str;
        C23170k kVar2 = kVar;
        long currentTimeMillis = System.currentTimeMillis();
        VungleLogger.m57031d("ttDownloadContext", String.format("Creating banner ad, id = %1$s, at: %2$d", new Object[]{str2, Long.valueOf(currentTimeMillis)}));
        this.f58954b = str2;
        this.f58960h = kVar2;
        AdConfig.AdSize a = kVar.mo58261a();
        this.f58961i = g0Var;
        this.f58956d = ViewUtility.m57276a(a.getHeight(), context2);
        this.f58955c = ViewUtility.m57276a(a.getWidth(), context2);
        C23181n1 b = C23181n1.m57208b();
        b.getClass();
        if (kVar2.f58860c) {
            C13452i iVar = new C13452i();
            SessionEvent sessionEvent = SessionEvent.MUTE;
            iVar.mo40349F("event", sessionEvent.toString());
            SessionAttribute sessionAttribute = SessionAttribute.MUTED;
            if ((kVar2.f58858a & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            iVar.mo40347D(sessionAttribute.toString(), Boolean.valueOf(z));
            b.mo58250d(new C24573q(sessionEvent, iVar));
        }
        this.f58959g = Vungle.getBannerViewInternal(str2, C21095c.m49293a((String) null), new AdConfig(kVar2), this.f58961i);
        this.f58962j = new C21114p(((long) i) * 1000, new C21122w(this.f58963k));
        VungleLogger.m57031d("ttDownloadContext", String.format("Banner ad created, id = %1$s, elapsed time: %2$dms", new Object[]{str2, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
    }

    /* renamed from: a */
    public final void mo58322a(boolean z) {
        synchronized (this) {
            C21114p pVar = this.f58962j;
            synchronized (pVar) {
                pVar.removeMessages(0);
                pVar.removeCallbacks(pVar.f52969d);
                pVar.f52967b = 0;
                pVar.f52966a = 0;
            }
            C21033n nVar = this.f58959g;
            if (nVar != null) {
                nVar.mo53150r(z);
                this.f58959g = null;
                removeAllViews();
            }
        }
    }

    /* renamed from: b */
    public final void mo58323b() {
        if (getVisibility() == 0) {
            C21033n nVar = this.f58959g;
            if (nVar != null) {
                if (nVar.getParent() != this) {
                    addView(nVar, this.f58955c, this.f58956d);
                }
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.f58956d;
                    layoutParams.width = this.f58955c;
                    requestLayout();
                }
                this.f58962j.mo53316a();
            } else if (!this.f58957e) {
                this.f58958f = true;
                C23179n.m57203a(this.f58954b, this.f58960h, new C21121v(this.f58964l));
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo58323b();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo58322a(true);
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        setAdVisibility(z);
    }

    public final void onWindowFocusChanged(boolean z) {
        setAdVisibility(z);
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        setAdVisibility(z);
    }

    public void setAdVisibility(boolean z) {
        if (!z || !(!this.f58957e)) {
            C21114p pVar = this.f58962j;
            synchronized (pVar) {
                if (pVar.hasMessages(0)) {
                    pVar.f52967b = (System.currentTimeMillis() - pVar.f52966a) + pVar.f52967b;
                    pVar.removeMessages(0);
                    pVar.removeCallbacks(pVar.f52969d);
                }
            }
        } else {
            this.f58962j.mo53316a();
        }
        C21033n nVar = this.f58959g;
        if (nVar != null) {
            nVar.setAdVisibility(z);
        }
    }
}
