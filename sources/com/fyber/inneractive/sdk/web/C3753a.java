package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.measurement.C2820d;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3685f0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.C3725r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;
import com.fyber.inneractive.sdk.web.C3786o;
import com.fyber.inneractive.sdk.web.C3793u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p651mh.C18372c;

/* renamed from: com.fyber.inneractive.sdk.web.a */
public abstract class C3753a<L extends C3793u> implements C3761b, C3685f0.C3690e, C3762c.C3763a, C3786o.C3787a {

    /* renamed from: a */
    public boolean f12956a = false;

    /* renamed from: b */
    public C3762c f12957b;

    /* renamed from: c */
    public C3784m f12958c;

    /* renamed from: d */
    public C3785n f12959d;

    /* renamed from: e */
    public boolean f12960e;

    /* renamed from: f */
    public C3759f f12961f;

    /* renamed from: g */
    public L f12962g;

    /* renamed from: h */
    public float f12963h = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: i */
    public Rect f12964i = new Rect();

    /* renamed from: j */
    public boolean f12965j;

    /* renamed from: k */
    public boolean f12966k;

    /* renamed from: l */
    public C3758e f12967l;

    /* renamed from: m */
    public final Runnable f12968m;

    /* renamed from: n */
    public final Runnable f12969n;

    /* renamed from: o */
    public Runnable f12970o;

    /* renamed from: p */
    public long f12971p;

    /* renamed from: q */
    public long f12972q;

    /* renamed from: r */
    public AsyncTask<Void, Void, String> f12973r;

    /* renamed from: s */
    public String f12974s;

    /* renamed from: t */
    public String f12975t;

    /* renamed from: u */
    public InneractiveAdRequest f12976u;

    /* renamed from: v */
    public C2776j f12977v;

    /* renamed from: com.fyber.inneractive.sdk.web.a$a */
    public class C3754a implements Runnable {
        public C3754a() {
        }

        public void run() {
            IAlog.m9905d("Removing clicked state after timeout", new Object[0]);
            C3753a.this.mo15414d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$b */
    public class C3755b implements Runnable {
        public C3755b() {
        }

        public void run() {
            C3753a aVar = C3753a.this;
            if (aVar.f12966k) {
                IAlog.m9902a("No user web action detected for : %s blocking.", aVar.f12967l);
                C3753a aVar2 = C3753a.this;
                String c = aVar2.f12967l.mo15426c();
                String a = C3753a.this.f12967l.mo15424a();
                L l = aVar2.f12962g;
                if (l != null) {
                    l.mo13917a(c, a);
                }
                IAlog.m9900a(1, (Exception) null, "AD_AUTO_CLICK_DETECTED", new Object[0]);
                C3753a.this.f12967l.mo15425b();
                C3753a.this.mo15414d();
            } else {
                IAlog.m9902a("User web action detected for: %s", aVar.f12967l);
                C3753a.this.f12967l.mo15427d();
            }
            C3753a.this.f12967l = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$c */
    public class C3756c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        public final /* synthetic */ String f12980a;

        /* renamed from: b */
        public final /* synthetic */ String f12981b;

        /* renamed from: c */
        public final /* synthetic */ String f12982c;

        /* renamed from: d */
        public final /* synthetic */ String f12983d;

        public C3756c(String str, String str2, String str3, String str4) {
            this.f12980a = str;
            this.f12981b = str2;
            this.f12982c = str3;
            this.f12983d = str4;
        }

        public Object doInBackground(Object[] objArr) {
            String str;
            boolean z;
            Void[] voidArr = (Void[]) objArr;
            long currentTimeMillis = System.currentTimeMillis();
            C3753a aVar = C3753a.this;
            String str2 = this.f12980a;
            String str3 = this.f12981b;
            String str4 = this.f12982c;
            IAmraidWebViewController iAmraidWebViewController = (IAmraidWebViewController) aVar;
            iAmraidWebViewController.getClass();
            System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            String str5 = null;
            if (TextUtils.isEmpty(str2)) {
                IAlog.m9902a("loadHtml called with an empty HTML!", new Object[0]);
            } else {
                sb.append("<html><head>");
                sb.append("<link rel=\"icon\" href=\"data:,\">");
                if (iAmraidWebViewController.f12795Y) {
                    String c = C3707l.m9969c("ia_js_load_monitor.txt");
                    if (!TextUtils.isEmpty(c)) {
                        sb.append(c);
                    }
                }
                sb.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager = IAConfigManager.f9202J;
                boolean a = iAConfigManager.f9234v.f9337b.mo13273a("use_js_inline", false);
                if (!a || iAConfigManager.f9209F.f9163b == null) {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js\"></script>");
                } else {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(iAConfigManager.f9209F.f9163b);
                    sb.append("</script>");
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                }
                sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script>");
                sb.append("</head>");
                sb.append("<style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str4)) {
                    sb.append(str4);
                }
                sb.append("</style>");
                sb.append("<body id=\"iaBody\">");
                if (iAmraidWebViewController.f12799c0) {
                    C3764d.C3771g gVar = iAmraidWebViewController.f12998B;
                    if (gVar == null || !gVar.equals(C3764d.C3771g.INTERSTITIAL)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (!a || iAConfigManager.f9209F.f9164c == null) {
                            sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        } else {
                            sb.append("<style type=\"text/css\">");
                            sb.append(iAConfigManager.f9209F.f9164c);
                            sb.append("</style>");
                        }
                        if (!a || iAConfigManager.f9209F.f9165d == null) {
                            sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        } else {
                            sb.append("<script type=\"text/javascript\">");
                            sb.append(iAConfigManager.f9209F.f9165d);
                            sb.append("</script>");
                        }
                    }
                }
                String c2 = C3707l.m9969c("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(c2)) {
                    C16530d.m42019l(sb, "<div id='iaScriptBr' style='display:none;'>", c2, "</div>");
                    if (IAlog.f12814a >= 2) {
                        sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb.append(str2);
                sb.append("</body></html>");
                C2816a aVar2 = iAmraidWebViewController.f13020w;
                if (aVar2 != null) {
                    str5 = sb.toString();
                    C2820d dVar = (C2820d) aVar2;
                    if (!TextUtils.isEmpty(dVar.f9681b)) {
                        String str6 = dVar.f9681b;
                        Pattern pattern = C18372c.f46840a;
                        String str7 = "<script type=\"text/javascript\">" + str6 + "</script>";
                        C14226d.m35348n0(str5, "HTML is null or empty");
                        ArrayList arrayList = new ArrayList();
                        int length = str5.length();
                        int i = 0;
                        while (i < length) {
                            int indexOf = str5.indexOf("<!--", i);
                            if (indexOf >= 0) {
                                int indexOf2 = str5.indexOf("-->", indexOf);
                                int[] iArr = new int[2];
                                if (indexOf2 >= 0) {
                                    iArr[0] = indexOf;
                                    iArr[1] = indexOf2;
                                    arrayList.add(iArr);
                                    i = indexOf2 + 3;
                                } else {
                                    iArr[0] = indexOf;
                                    iArr[1] = length;
                                    arrayList.add(iArr);
                                }
                            }
                            i = length;
                        }
                        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance(Integer.TYPE, new int[]{0, 2}));
                        StringBuilder sb2 = new StringBuilder(str7.length() + str5.length() + 16);
                        if (!C18372c.m45234b(str5, sb2, C18372c.f46841b, str7, iArr2) && !C18372c.m45233a(str5, sb2, C18372c.f46840a, str7, iArr2) && !C18372c.m45234b(str5, sb2, C18372c.f46843d, str7, iArr2) && !C18372c.m45233a(str5, sb2, C18372c.f46842c, str7, iArr2) && !C18372c.m45234b(str5, sb2, C18372c.f46845f, str7, iArr2) && !C18372c.m45233a(str5, sb2, C18372c.f46844e, str7, iArr2) && !C18372c.m45233a(str5, sb2, C18372c.f46846g, str7, iArr2)) {
                            str = C25541a.m63881k(str7, str5);
                        } else {
                            str = sb2.toString();
                        }
                        str5 = str;
                    }
                } else {
                    str5 = sb.toString();
                }
            }
            C3753a aVar3 = C3753a.this;
            aVar3.getClass();
            IAlog.m9902a("%sbuild html string took %d msec", IAlog.m9899a((Object) aVar3), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return str5;
        }

        public void onPostExecute(Object obj) {
            String str;
            String str2 = (String) obj;
            if (C3725r.m9983a()) {
                str = UrlPrivacyValidator.HTTP_SCHEME;
            } else {
                str = UrlPrivacyValidator.HTTPS_SCHEME;
            }
            if (!TextUtils.isEmpty(str2) && !isCancelled()) {
                C3753a.this.f12973r = null;
                if (!TextUtils.isEmpty(this.f12983d)) {
                    C3753a aVar = C3753a.this;
                    StringBuilder k = C13555b.m33972k(str);
                    k.append(this.f12983d);
                    aVar.f12974s = k.toString();
                } else {
                    C3753a.this.f12974s = C25541a.m63881k(str, "wv.inner-active.mobi/");
                }
                C3753a aVar2 = C3753a.this;
                C3762c cVar = aVar2.f12957b;
                if (cVar != null) {
                    cVar.loadDataWithBaseURL(aVar2.f12974s, str2, "text/html", "utf-8", (String) null);
                    C3753a.this.f12975t = str2;
                    return;
                }
                InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                C3759f fVar = aVar2.f12961f;
                if (fVar != null) {
                    fVar.mo13539a(aVar2, inneractiveErrorCode);
                }
                aVar2.mo15410a(true);
            } else if (!isCancelled()) {
                C3753a aVar3 = C3753a.this;
                InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                C3759f fVar2 = aVar3.f12961f;
                if (fVar2 != null) {
                    fVar2.mo13539a(aVar3, inneractiveErrorCode2);
                }
                aVar3.mo15410a(true);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$d */
    public class C3757d implements Runnable {
        public C3757d() {
        }

        public void run() {
            C3753a aVar = C3753a.this;
            AsyncTask<Void, Void, String> asyncTask = aVar.f12973r;
            if (asyncTask != null) {
                asyncTask.cancel(true);
                aVar.f12973r = null;
            }
            IAlog.m9902a("%sonLoadTimeout after %d msec", IAlog.m9899a((Object) aVar), Long.valueOf(aVar.f12971p));
            aVar.mo15408a(InneractiveErrorCode.LOAD_TIMEOUT);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$e */
    public interface C3758e {
        /* renamed from: a */
        String mo15424a();

        /* renamed from: b */
        void mo15425b();

        /* renamed from: c */
        String mo15426c();

        /* renamed from: d */
        void mo15427d();
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$f */
    public interface C3759f {
        /* renamed from: a */
        void mo13538a(C3753a aVar);

        /* renamed from: a */
        void mo13539a(C3753a aVar, InneractiveErrorCode inneractiveErrorCode);
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$g */
    public class C3760g implements C3758e {

        /* renamed from: a */
        public String f12986a;

        /* renamed from: b */
        public C3721p0 f12987b;

        public C3760g(String str, C3721p0 p0Var) {
            this.f12987b = p0Var;
            this.f12986a = str;
        }

        /* renamed from: a */
        public String mo15424a() {
            return null;
        }

        /* renamed from: b */
        public void mo15425b() {
        }

        /* renamed from: c */
        public String mo15426c() {
            return "open";
        }

        /* renamed from: d */
        public void mo15427d() {
            C3753a aVar = C3753a.this;
            String str = this.f12986a;
            C3721p0 p0Var = this.f12987b;
            L l = aVar.f12962g;
            if (l != null) {
                C3677d0.C3680c cVar = l.mo13910a(str, p0Var).f12835a;
            }
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("action: open url: ");
            k.append(this.f12986a);
            return k.toString();
        }
    }

    public C3753a(Context context, boolean z, boolean z2) {
        this.f12966k = z;
        this.f12957b = mo15406a(context);
        this.f12960e = z2;
        this.f12969n = new C3754a();
        this.f12968m = new C3755b();
    }

    /* renamed from: a */
    public void mo15409a(String str, String str2, String str3, String str4, C3759f fVar, long j) {
        this.f12961f = fVar;
        this.f12971p = j;
        try {
            mo15412b();
            C3756c cVar = new C3756c(str2, str3, str4, str);
            this.f12973r = cVar;
            cVar.executeOnExecutor(C3714n.f12901a, new Void[0]);
            mo15415e();
        } catch (Throwable unused) {
            mo15408a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
    }

    /* renamed from: a */
    public abstract void mo15410a(boolean z);

    /* renamed from: b */
    public abstract void mo15412b();

    /* renamed from: c */
    public void mo15413c() {
        this.f12957b.setTapListener(this);
    }

    /* renamed from: d */
    public void mo15414d() {
        IAlog.m9902a("IAWebViewController resetClick()", new Object[0]);
        Runnable runnable = this.f12969n;
        if (runnable != null) {
            C3714n.f12902b.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f12968m;
        if (runnable2 != null) {
            C3714n.f12902b.removeCallbacks(runnable2);
        }
        this.f12965j = false;
    }

    /* renamed from: e */
    public final void mo15415e() {
        IAlog.m9902a("IAWebViewController: Starting load timeout with %d", Long.valueOf(this.f12971p));
        this.f12972q = System.currentTimeMillis();
        C3757d dVar = new C3757d();
        this.f12970o = dVar;
        C3714n.f12902b.postDelayed(dVar, this.f12971p);
    }

    public void setAdContent(C2776j jVar) {
        this.f12977v = jVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f12976u = inneractiveAdRequest;
    }

    public void setListener(L l) {
        this.f12962g = l;
    }

    /* renamed from: a */
    public C3762c mo15405a() {
        return this.f12957b;
    }

    /* renamed from: a */
    public void mo15407a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C3762c cVar = this.f12957b;
        if (cVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(cVar, layoutParams);
            } else {
                viewGroup.addView(cVar);
            }
            C3685f0.C3689d.f12862a.mo15349a(viewGroup.getContext(), (View) this.f12957b, (C3685f0.C3690e) this);
            this.f12957b.setTapListener(this);
        }
    }

    /* renamed from: a */
    public C3762c mo15406a(Context context) {
        return new C3762c(context);
    }

    /* renamed from: a */
    public final void mo15408a(InneractiveErrorCode inneractiveErrorCode) {
        C3759f fVar = this.f12961f;
        if (fVar != null) {
            fVar.mo13539a(this, inneractiveErrorCode);
        }
        mo15410a(true);
    }

    /* renamed from: a */
    public void mo15280a(View view, float f, Rect rect) {
        if (f != this.f12963h || !rect.equals(this.f12964i)) {
            this.f12963h = f;
            this.f12964i.set(rect);
            C3762c cVar = this.f12957b;
            if (cVar != null) {
                cVar.mo15430a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo15411a(C3758e eVar) {
        IAlog.m9905d("IAWebViewController Web view click detected", new Object[0]);
        if (this.f12965j) {
            IAlog.m9905d("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            eVar.mo15427d();
            mo15414d();
            return true;
        }
        if (this.f12966k) {
            IAlog.m9905d("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            Runnable runnable = this.f12968m;
            if (runnable != null) {
                C3714n.f12902b.removeCallbacks(runnable);
            }
            this.f12967l = eVar;
            if (this.f12968m != null) {
                C3714n.f12902b.postDelayed(this.f12968m, (long) IAConfigManager.f9202J.f9234v.f9337b.mo13271a("click_timeout", 1000, 1000));
            }
        } else {
            Runnable runnable2 = this.f12968m;
            if (runnable2 != null) {
                C3714n.f12902b.removeCallbacks(runnable2);
            }
            this.f12967l = null;
            eVar.mo15427d();
        }
        return false;
    }
}
