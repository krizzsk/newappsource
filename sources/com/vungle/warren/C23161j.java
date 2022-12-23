package com.vungle.warren;

import ae0.C20979a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.WebView;
import be0.C21007a;
import be0.C21012c;
import be0.C21026j;
import be0.C21030l;
import be0.C21033n;
import be0.C21039p;
import be0.C21043q;
import ce0.C21103h;
import ce0.C21120u;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23157i0;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import od0.C24545c;
import od0.C24559j;
import od0.C24566m;
import od0.C24573q;
import p066e0.C4436j0;
import p090g1.C4745d;
import p359ag.C13452i;
import sd0.C24850c;
import ud0.C25024h;
import xd0.C25242a;
import xd0.C25244c;
import xd0.C25246d;
import yd0.C25286a;
import yd0.C25287b;
import yd0.C25290d;
import zd0.C25330a;
import zd0.C25337d;

/* renamed from: com.vungle.warren.j */
public final class C23161j implements C23157i0 {

    /* renamed from: k */
    public static final /* synthetic */ int f58773k = 0;

    /* renamed from: a */
    public final C25024h f58774a;

    /* renamed from: b */
    public VungleApiClient f58775b;

    /* renamed from: c */
    public C23164c f58776c;

    /* renamed from: d */
    public C23192a f58777d;

    /* renamed from: e */
    public C23252x1 f58778e;

    /* renamed from: f */
    public C24545c f58779f;

    /* renamed from: g */
    public final C23097c f58780g;

    /* renamed from: h */
    public final C24850c.C24851a f58781h;

    /* renamed from: i */
    public final ExecutorService f58782i;

    /* renamed from: j */
    public C23162a f58783j = new C23162a();

    /* renamed from: com.vungle.warren.j$a */
    public class C23162a implements C23164c.C23165a {
        public C23162a() {
        }
    }

    /* renamed from: com.vungle.warren.j$b */
    public static class C23163b extends C23164c {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: f */
        public Context f58785f;

        /* renamed from: g */
        public final AdRequest f58786g;

        /* renamed from: h */
        public final AdConfig f58787h;

        /* renamed from: i */
        public final C23157i0.C23159b f58788i;

        /* renamed from: j */
        public final Bundle f58789j = null;

        /* renamed from: k */
        public final C25024h f58790k;

        /* renamed from: l */
        public final C23097c f58791l;

        /* renamed from: m */
        public final VungleApiClient f58792m;

        /* renamed from: n */
        public final C24850c.C24851a f58793n;

        public C23163b(Context context, AdRequest adRequest, AdConfig adConfig, C23097c cVar, C23192a aVar, C23252x1 x1Var, C25024h hVar, C21033n.C21036c cVar2, C23162a aVar2, VungleApiClient vungleApiClient, C24850c.C24851a aVar3) {
            super(aVar, x1Var, aVar2);
            this.f58785f = context;
            this.f58786g = adRequest;
            this.f58787h = adConfig;
            this.f58788i = cVar2;
            this.f58790k = hVar;
            this.f58791l = cVar;
            this.f58792m = vungleApiClient;
            this.f58793n = aVar3;
        }

        /* renamed from: a */
        public final void mo58231a() {
            this.f58796c = null;
            this.f58785f = null;
        }

        public final Object doInBackground(Object[] objArr) {
            boolean z;
            boolean z2;
            Void[] voidArr = (Void[]) objArr;
            try {
                Pair<C24545c, C24566m> b = mo58234b(this.f58786g, this.f58789j);
                C24545c cVar = (C24545c) b.first;
                boolean z3 = true;
                if (cVar.f62204c != 1) {
                    int i = C23161j.f58773k;
                    return new C23167e(new VungleException(10));
                }
                C24566m mVar = (C24566m) b.second;
                C23097c cVar2 = this.f58791l;
                cVar2.getClass();
                if (cVar.f62192N != 1) {
                    z = false;
                } else {
                    z = cVar2.mo58103i(cVar);
                }
                if (!z) {
                    int i2 = C23161j.f58773k;
                    return new C23167e(new VungleException(10));
                }
                C24559j jVar = (C24559j) this.f58794a.mo58281p(C24559j.class, "configSettings").get();
                if (jVar == null || !jVar.mo60824a("isAdDownloadOptEnabled").booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 && !cVar.f62201Y) {
                    List r = this.f58794a.mo58283r(cVar.getId());
                    if (!r.isEmpty()) {
                        cVar.mo60813j(r);
                        try {
                            this.f58794a.mo58288w(cVar);
                        } catch (DatabaseHelper.DBException unused) {
                            int i3 = C23161j.f58773k;
                        }
                    }
                }
                C4436j0 j0Var = new C4436j0((Object) this.f58790k);
                C21039p pVar = new C21039p(cVar, mVar, ((C21103h) C23236v0.m57280a(this.f58785f).mo58350c(C21103h.class)).mo53302g());
                File file = this.f58794a.mo58279n(cVar.getId()).get();
                if (file == null || !file.isDirectory()) {
                    int i4 = C23161j.f58773k;
                    return new C23167e(new VungleException(26));
                } else if ("mrec".equals(cVar.f62185G) && this.f58787h.mo58261a() != AdConfig.AdSize.VUNGLE_MREC) {
                    int i5 = C23161j.f58773k;
                    return new C23167e(new VungleException(28));
                } else if (mVar.f62265i == 0) {
                    return new C23167e(new VungleException(10));
                } else {
                    AdConfig adConfig = this.f58787h;
                    if (adConfig == null) {
                        cVar.f62224w = new AdConfig();
                    } else {
                        cVar.f62224w = adConfig;
                    }
                    try {
                        this.f58794a.mo58288w(cVar);
                        C24850c.C24851a aVar = this.f58793n;
                        if (!this.f58792m.f58582s || !cVar.f62186H) {
                            z3 = false;
                        }
                        aVar.getClass();
                        C24850c cVar3 = new C24850c(z3);
                        pVar.f52843o = cVar3;
                        return new C23167e((C21007a) null, new C25337d(cVar, mVar, this.f58794a, new C4745d(8), j0Var, pVar, (C20979a) null, file, cVar3, this.f58786g.mo58038d()), pVar);
                    } catch (DatabaseHelper.DBException unused2) {
                        return new C23167e(new VungleException(26));
                    }
                }
            } catch (VungleException e) {
                return new C23167e(e);
            }
        }

        public final void onPostExecute(Object obj) {
            C23157i0.C23159b bVar;
            C23167e eVar = (C23167e) obj;
            super.mo58235c(eVar);
            if (!isCancelled() && (bVar = this.f58788i) != null) {
                Pair pair = new Pair((C25290d) eVar.f58813b, eVar.f58815d);
                VungleException vungleException = eVar.f58814c;
                C21033n.C21036c cVar = (C21033n.C21036c) bVar;
                C21033n nVar = C21033n.this;
                nVar.f52820g = null;
                if (vungleException != null) {
                    C25287b.C25288a aVar = nVar.f52817d;
                    if (aVar != null) {
                        ((C23094b) aVar).mo58094b(nVar.f52818e.mo58041f(), vungleException);
                        return;
                    }
                    return;
                }
                nVar.f52815b = (C25290d) pair.first;
                nVar.setWebViewClient((C21039p) pair.second);
                C21033n nVar2 = C21033n.this;
                nVar2.f52815b.mo61891n(nVar2.f52817d);
                C21033n nVar3 = C21033n.this;
                nVar3.f52815b.mo61884b(nVar3, (C20979a) null);
                C21033n nVar4 = C21033n.this;
                nVar4.getClass();
                C21043q.m49209a(nVar4);
                nVar4.addJavascriptInterface(new C25244c(nVar4.f52815b), "Android");
                nVar4.getSettings().setMediaPlaybackRequiresUserGesture(false);
                if (C21033n.this.f52821h.get() != null) {
                    C21033n nVar5 = C21033n.this;
                    nVar5.setAdVisibility(nVar5.f52821h.get().booleanValue());
                }
                ViewGroup.LayoutParams layoutParams = C21033n.this.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                }
            }
        }
    }

    /* renamed from: com.vungle.warren.j$c */
    public static abstract class C23164c extends AsyncTask<Void, Void, C23167e> {

        /* renamed from: a */
        public final C23192a f58794a;

        /* renamed from: b */
        public final C23252x1 f58795b;

        /* renamed from: c */
        public C23165a f58796c;

        /* renamed from: d */
        public AtomicReference<C24545c> f58797d = new AtomicReference<>();

        /* renamed from: e */
        public AtomicReference<C24566m> f58798e = new AtomicReference<>();

        /* renamed from: com.vungle.warren.j$c$a */
        public interface C23165a {
        }

        public C23164c(C23192a aVar, C23252x1 x1Var, C23162a aVar2) {
            this.f58794a = aVar;
            this.f58795b = x1Var;
            this.f58796c = aVar2;
        }

        /* renamed from: a */
        public abstract void mo58231a();

        /* renamed from: b */
        public final Pair<C24545c, C24566m> mo58234b(AdRequest adRequest, Bundle bundle) throws VungleException {
            C24545c cVar;
            boolean isInitialized = this.f58795b.isInitialized();
            Boolean bool = Boolean.FALSE;
            if (!isInitialized) {
                C23181n1 b = C23181n1.m57208b();
                C13452i iVar = new C13452i();
                SessionEvent sessionEvent = SessionEvent.PLAY_AD;
                iVar.mo40349F("event", sessionEvent.toString());
                iVar.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                b.mo58250d(new C24573q(sessionEvent, iVar));
                throw new VungleException(9);
            } else if (adRequest == null || TextUtils.isEmpty(adRequest.mo58041f())) {
                C23181n1 b2 = C23181n1.m57208b();
                C13452i iVar2 = new C13452i();
                SessionEvent sessionEvent2 = SessionEvent.PLAY_AD;
                iVar2.mo40349F("event", sessionEvent2.toString());
                iVar2.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                b2.mo58250d(new C24573q(sessionEvent2, iVar2));
                throw new VungleException(10);
            } else {
                C24566m mVar = (C24566m) this.f58794a.mo58281p(C24566m.class, adRequest.mo58041f()).get();
                if (mVar == null) {
                    int i = C23161j.f58773k;
                    C23181n1 b3 = C23181n1.m57208b();
                    C13452i iVar3 = new C13452i();
                    SessionEvent sessionEvent3 = SessionEvent.PLAY_AD;
                    iVar3.mo40349F("event", sessionEvent3.toString());
                    iVar3.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                    b3.mo58250d(new C24573q(sessionEvent3, iVar3));
                    throw new VungleException(13);
                } else if (!mVar.mo60833c() || adRequest.mo58037c() != null) {
                    this.f58798e.set(mVar);
                    if (bundle == null) {
                        cVar = this.f58794a.mo58277l(adRequest.mo58041f(), adRequest.mo58037c()).get();
                    } else {
                        String string = bundle.getString("ADV_FACTORY_ADVERTISEMENT");
                        if (!TextUtils.isEmpty(string)) {
                            cVar = (C24545c) this.f58794a.mo58281p(C24545c.class, string).get();
                        } else {
                            cVar = null;
                        }
                    }
                    if (cVar != null) {
                        this.f58797d.set(cVar);
                        File file = this.f58794a.mo58279n(cVar.getId()).get();
                        if (file != null && file.isDirectory()) {
                            return new Pair<>(cVar, mVar);
                        }
                        int i2 = C23161j.f58773k;
                        C23181n1 b4 = C23181n1.m57208b();
                        C13452i iVar4 = new C13452i();
                        SessionEvent sessionEvent4 = SessionEvent.PLAY_AD;
                        iVar4.mo40349F("event", sessionEvent4.toString());
                        iVar4.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                        SessionAttribute sessionAttribute = SessionAttribute.EVENT_ID;
                        iVar4.mo40349F(sessionAttribute.toString(), cVar.getId());
                        b4.mo58250d(new C24573q(sessionEvent4, iVar4));
                        throw new VungleException(26);
                    }
                    C23181n1 b5 = C23181n1.m57208b();
                    C13452i iVar5 = new C13452i();
                    SessionEvent sessionEvent5 = SessionEvent.PLAY_AD;
                    iVar5.mo40349F("event", sessionEvent5.toString());
                    iVar5.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                    b5.mo58250d(new C24573q(sessionEvent5, iVar5));
                    throw new VungleException(10);
                } else {
                    C23181n1 b6 = C23181n1.m57208b();
                    C13452i iVar6 = new C13452i();
                    SessionEvent sessionEvent6 = SessionEvent.PLAY_AD;
                    iVar6.mo40349F("event", sessionEvent6.toString());
                    iVar6.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                    b6.mo58250d(new C24573q(sessionEvent6, iVar6));
                    throw new VungleException(36);
                }
            }
        }

        /* renamed from: c */
        public void mo58235c(C23167e eVar) {
            super.onPostExecute(eVar);
            C23165a aVar = this.f58796c;
            if (aVar != null) {
                C24566m mVar = this.f58798e.get();
                C23161j.this.f58779f = this.f58797d.get();
            }
        }
    }

    /* renamed from: com.vungle.warren.j$d */
    public static class C23166d extends C23164c {

        /* renamed from: f */
        public final C23097c f58799f;
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: g */
        public C21012c f58800g;
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: h */
        public Context f58801h;

        /* renamed from: i */
        public final AdRequest f58802i;

        /* renamed from: j */
        public final C20979a f58803j;

        /* renamed from: k */
        public final C23157i0.C23158a f58804k;

        /* renamed from: l */
        public final Bundle f58805l;

        /* renamed from: m */
        public final C25024h f58806m;

        /* renamed from: n */
        public final VungleApiClient f58807n;

        /* renamed from: o */
        public final C25242a f58808o;

        /* renamed from: p */
        public final C25246d f58809p;

        /* renamed from: q */
        public C24545c f58810q;

        /* renamed from: r */
        public final C24850c.C24851a f58811r;

        public C23166d(Context context, C23097c cVar, AdRequest adRequest, C23192a aVar, C23252x1 x1Var, C25024h hVar, VungleApiClient vungleApiClient, C21012c cVar2, C20979a aVar2, AdActivity.C23063b bVar, AdActivity.C23062a aVar3, AdActivity.C23064c cVar3, C23162a aVar4, Bundle bundle, C24850c.C24851a aVar5) {
            super(aVar, x1Var, aVar4);
            this.f58802i = adRequest;
            this.f58800g = cVar2;
            this.f58803j = aVar2;
            this.f58801h = context;
            this.f58804k = cVar3;
            this.f58805l = bundle;
            this.f58806m = hVar;
            this.f58807n = vungleApiClient;
            this.f58809p = bVar;
            this.f58808o = aVar3;
            this.f58799f = cVar;
            this.f58811r = aVar5;
        }

        /* renamed from: a */
        public final void mo58231a() {
            this.f58796c = null;
            this.f58801h = null;
            this.f58800g = null;
        }

        public final Object doInBackground(Object[] objArr) {
            boolean z;
            boolean z2;
            C23167e eVar;
            int i;
            Void[] voidArr = (Void[]) objArr;
            Class<C24559j> cls = C24559j.class;
            try {
                Pair<C24545c, C24566m> b = mo58234b(this.f58802i, this.f58805l);
                C24545c cVar = (C24545c) b.first;
                this.f58810q = cVar;
                C24566m mVar = (C24566m) b.second;
                C23097c cVar2 = this.f58799f;
                cVar2.getClass();
                boolean z3 = true;
                if (cVar != null && ((i = cVar.f62192N) == 1 || i == 2)) {
                    z = cVar2.mo58103i(cVar);
                } else {
                    z = false;
                }
                if (!z) {
                    int i2 = C23161j.f58773k;
                    return new C23167e(new VungleException(10));
                }
                int i3 = mVar.f62265i;
                if (i3 == 4) {
                    return new C23167e(new VungleException(41));
                }
                if (i3 != 0) {
                    return new C23167e(new VungleException(29));
                }
                C4436j0 j0Var = new C4436j0((Object) this.f58806m);
                C24559j jVar = (C24559j) this.f58794a.mo58281p(cls, "appId").get();
                if (jVar != null && !TextUtils.isEmpty(jVar.mo60826c("appId"))) {
                    jVar.mo60826c("appId");
                }
                C24559j jVar2 = (C24559j) this.f58794a.mo58281p(cls, "configSettings").get();
                if (jVar2 == null || !jVar2.mo60824a("isAdDownloadOptEnabled").booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    C24545c cVar3 = this.f58810q;
                    if (!cVar3.f62201Y) {
                        List r = this.f58794a.mo58283r(cVar3.getId());
                        if (!r.isEmpty()) {
                            this.f58810q.mo60813j(r);
                            try {
                                this.f58794a.mo58288w(this.f58810q);
                            } catch (DatabaseHelper.DBException unused) {
                                int i4 = C23161j.f58773k;
                            }
                        }
                    }
                }
                C21039p pVar = new C21039p(this.f58810q, mVar, ((C21103h) C23236v0.m57280a(this.f58801h).mo58350c(C21103h.class)).mo53302g());
                File file = this.f58794a.mo58279n(this.f58810q.getId()).get();
                if (file == null || !file.isDirectory()) {
                    int i5 = C23161j.f58773k;
                    return new C23167e(new VungleException(26));
                }
                C24545c cVar4 = this.f58810q;
                int i6 = cVar4.f62204c;
                if (i6 == 0) {
                    C24545c cVar5 = cVar4;
                    eVar = new C23167e(new C21026j(this.f58801h, this.f58800g, this.f58809p, this.f58808o), new C25330a(cVar5, mVar, this.f58794a, new C4745d(8), j0Var, pVar, this.f58803j, file, this.f58802i.mo58038d()), pVar);
                } else if (i6 != 1) {
                    return new C23167e(new VungleException(10));
                } else {
                    C24850c.C24851a aVar = this.f58811r;
                    if (!this.f58807n.f58582s || !cVar4.f62186H) {
                        z3 = false;
                    }
                    aVar.getClass();
                    C24850c cVar6 = new C24850c(z3);
                    pVar.f52843o = cVar6;
                    eVar = new C23167e(new C21030l(this.f58801h, this.f58800g, this.f58809p, this.f58808o), new C25337d(this.f58810q, mVar, this.f58794a, new C4745d(8), j0Var, pVar, this.f58803j, file, cVar6, this.f58802i.mo58038d()), pVar);
                }
                return eVar;
            } catch (VungleException e) {
                return new C23167e(e);
            }
        }

        public final void onPostExecute(Object obj) {
            C23157i0.C23158a aVar;
            C23167e eVar = (C23167e) obj;
            super.mo58235c(eVar);
            if (!isCancelled() && (aVar = this.f58804k) != null) {
                if (eVar.f58814c != null) {
                    int i = C23161j.f58773k;
                    ((AdActivity.C23064c) aVar).mo58027a(new Pair((Object) null, (Object) null), eVar.f58814c);
                    return;
                }
                C21012c cVar = this.f58800g;
                C21039p pVar = eVar.f58815d;
                C25244c cVar2 = new C25244c(eVar.f58813b);
                WebView webView = cVar.f52776f;
                if (webView != null) {
                    C21043q.m49209a(webView);
                    cVar.f52776f.setWebViewClient(pVar);
                    cVar.f52776f.addJavascriptInterface(cVar2, "Android");
                }
                ((AdActivity.C23064c) this.f58804k).mo58027a(new Pair(eVar.f58812a, eVar.f58813b), eVar.f58814c);
            }
        }
    }

    public C23161j(C23097c cVar, C23252x1 x1Var, C23192a aVar, VungleApiClient vungleApiClient, C25024h hVar, C24850c.C24851a aVar2, C21120u uVar) {
        this.f58778e = x1Var;
        this.f58777d = aVar;
        this.f58775b = vungleApiClient;
        this.f58774a = hVar;
        this.f58780g = cVar;
        this.f58781h = aVar2;
        this.f58782i = uVar;
    }

    /* renamed from: a */
    public final void mo58227a(Context context, AdRequest adRequest, C21012c cVar, C20979a aVar, AdActivity.C23062a aVar2, AdActivity.C23063b bVar, Bundle bundle, AdActivity.C23064c cVar2) {
        C23164c cVar3 = this.f58776c;
        if (cVar3 != null) {
            cVar3.cancel(true);
            this.f58776c.mo58231a();
        }
        C23166d dVar = new C23166d(context, this.f58780g, adRequest, this.f58777d, this.f58778e, this.f58774a, this.f58775b, cVar, aVar, bVar, aVar2, cVar2, this.f58783j, bundle, this.f58781h);
        this.f58776c = dVar;
        dVar.executeOnExecutor(this.f58782i, new Void[0]);
    }

    /* renamed from: b */
    public final void mo58228b(Context context, AdRequest adRequest, AdConfig adConfig, C21033n.C21036c cVar) {
        C23164c cVar2 = this.f58776c;
        if (cVar2 != null) {
            cVar2.cancel(true);
            this.f58776c.mo58231a();
        }
        C23163b bVar = new C23163b(context, adRequest, adConfig, this.f58780g, this.f58777d, this.f58778e, this.f58774a, cVar, this.f58783j, this.f58775b, this.f58781h);
        this.f58776c = bVar;
        bVar.executeOnExecutor(this.f58782i, new Void[0]);
    }

    /* renamed from: c */
    public final void mo58229c(Bundle bundle) {
        C24545c cVar = this.f58779f;
        bundle.putString("ADV_FACTORY_ADVERTISEMENT", cVar == null ? null : cVar.getId());
    }

    public final void destroy() {
        C23164c cVar = this.f58776c;
        if (cVar != null) {
            cVar.cancel(true);
            this.f58776c.mo58231a();
        }
    }

    /* renamed from: com.vungle.warren.j$e */
    public static class C23167e {

        /* renamed from: a */
        public C25286a f58812a;

        /* renamed from: b */
        public C25287b f58813b;

        /* renamed from: c */
        public VungleException f58814c;

        /* renamed from: d */
        public C21039p f58815d;

        public C23167e(VungleException vungleException) {
            this.f58814c = vungleException;
        }

        public C23167e(C21007a aVar, C25287b bVar, C21039p pVar) {
            this.f58812a = aVar;
            this.f58813b = bVar;
            this.f58815d = pVar;
        }
    }
}
