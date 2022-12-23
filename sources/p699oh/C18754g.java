package p699oh;

import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.google.android.play.core.appupdate.C14226d;
import com.iab.omid.library.fyber.adsession.AdSessionContextType;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p389bl.C13637c;
import p675nh.C18551b;
import p746qh.C19120a;
import p746qh.C19121b;
import p746qh.C19123c;
import p746qh.C19126f;
import p792sh.C19461a;
import p816th.C19680a;
import p840uh.C19912a;
import p840uh.C19913b;
import p864vh.C20133a;
import p864vh.C20134b;

/* renamed from: oh.g */
public final class C18754g extends C18749b {

    /* renamed from: a */
    public final C18751d f47710a;

    /* renamed from: b */
    public final C18750c f47711b;

    /* renamed from: c */
    public final ArrayList f47712c = new ArrayList();

    /* renamed from: d */
    public C19680a f47713d;

    /* renamed from: e */
    public AdSessionStatePublisher f47714e;

    /* renamed from: f */
    public boolean f47715f = false;

    /* renamed from: g */
    public boolean f47716g = false;

    /* renamed from: h */
    public final String f47717h;

    /* renamed from: i */
    public boolean f47718i;

    /* renamed from: j */
    public boolean f47719j;

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public C18754g(C18750c cVar, C18751d dVar) {
        AdSessionStatePublisher adSessionStatePublisher;
        this.f47711b = cVar;
        this.f47710a = dVar;
        this.f47717h = UUID.randomUUID().toString();
        this.f47713d = new C19680a((View) null);
        AdSessionContextType adSessionContextType = dVar.f47704h;
        if (adSessionContextType == AdSessionContextType.HTML || adSessionContextType == AdSessionContextType.JAVASCRIPT) {
            adSessionStatePublisher = new C19912a(dVar.f47698b);
        } else {
            adSessionStatePublisher = new C19913b(Collections.unmodifiableMap(dVar.f47700d), dVar.f47701e);
        }
        this.f47714e = adSessionStatePublisher;
        adSessionStatePublisher.mo44186a();
        C19120a.f48607c.f48608a.add(this);
        WebView h = this.f47714e.mo44193h();
        cVar.getClass();
        JSONObject jSONObject = new JSONObject();
        C19461a.m46861c(jSONObject, "impressionOwner", cVar.f47692a);
        C19461a.m46861c(jSONObject, "mediaEventsOwner", cVar.f47693b);
        C19461a.m46861c(jSONObject, "creativeType", cVar.f47695d);
        C19461a.m46861c(jSONObject, "impressionType", cVar.f47696e);
        C19461a.m46861c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(cVar.f47694c));
        C13637c.m34066c(h, "init", jSONObject);
    }

    /* renamed from: a */
    public final void mo51249a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        C19123c cVar;
        if (!this.f47716g) {
            Iterator it = this.f47712c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = (C19123c) it.next();
                if (cVar.f48614a.get() == view) {
                    break;
                }
            }
            if (cVar == null) {
                this.f47712c.add(new C19123c(view, friendlyObstructionPurpose));
            }
        }
    }

    /* renamed from: c */
    public final void mo51250c() {
        boolean z;
        if (!this.f47716g) {
            this.f47713d.clear();
            if (!this.f47716g) {
                this.f47712c.clear();
            }
            boolean z2 = true;
            this.f47716g = true;
            C13637c.m34066c(this.f47714e.mo44193h(), "finishSession", new Object[0]);
            C19120a aVar = C19120a.f48607c;
            if (aVar.f48609b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f48608a.remove(this);
            aVar.f48609b.remove(this);
            if (z) {
                if (aVar.f48609b.size() <= 0) {
                    z2 = false;
                }
                if (!z2) {
                    C19126f a = C19126f.m46285a();
                    a.getClass();
                    C20134b bVar = C20134b.f51093h;
                    bVar.getClass();
                    Handler handler = C20134b.f51095j;
                    if (handler != null) {
                        handler.removeCallbacks(C20134b.f51097l);
                        C20134b.f51095j = null;
                    }
                    bVar.f51098a.clear();
                    C20134b.f51094i.post(new C20133a(bVar));
                    C19121b bVar2 = C19121b.f48610e;
                    bVar2.f48611b = false;
                    bVar2.f48612c = false;
                    bVar2.f48613d = null;
                    C18551b bVar3 = a.f48626d;
                    bVar3.f47232a.getContentResolver().unregisterContentObserver(bVar3);
                }
            }
            this.f47714e.mo44191f();
            this.f47714e = null;
        }
    }

    /* renamed from: d */
    public final void mo51251d(View view) {
        if (!this.f47716g) {
            C14226d.m35346l0(view, "AdView is null");
            if (((View) this.f47713d.get()) != view) {
                this.f47713d = new C19680a(view);
                this.f47714e.mo44194i();
                Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(C19120a.f48607c.f48608a);
                if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                    for (T t : unmodifiableCollection) {
                        if (t != this && ((View) t.f47713d.get()) == view) {
                            t.f47713d.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo51252e() {
        boolean z;
        if (!this.f47715f) {
            this.f47715f = true;
            C19120a aVar = C19120a.f48607c;
            if (aVar.f48609b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f48609b.add(this);
            if (!z) {
                C19126f a = C19126f.m46285a();
                a.getClass();
                C19121b bVar = C19121b.f48610e;
                bVar.f48613d = a;
                bVar.f48611b = true;
                bVar.f48612c = false;
                bVar.mo51559b();
                C20134b.f51093h.getClass();
                C20134b.m47732a();
                C18551b bVar2 = a.f48626d;
                bVar2.f47236e = bVar2.mo50956a();
                bVar2.mo50957b();
                bVar2.f47232a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, bVar2);
            }
            float f = C19126f.m46285a().f48623a;
            C13637c.m34066c(this.f47714e.mo44193h(), "setDeviceVolume", Float.valueOf(f));
            this.f47714e.mo44189d(this, this.f47710a);
        }
    }
}
