package p959zh;

import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import ci0.C21211f;
import com.iab.omid.library.vungle.adsession.AdSessionContextType;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p361ai.C13465a;
import p361ai.C13466b;
import p361ai.C13471f;
import p407ci.C13836a;
import p439di.C16669a;
import p463ei.C16827a;
import p463ei.C16828b;
import p487fi.C17018a;
import p487fi.C17019b;
import p583jk.C17884p;
import p626lf.C18201b;
import p936yh.C20729b;

/* renamed from: zh.d */
public final class C20851d extends C21211f {

    /* renamed from: b */
    public final C20849b f52591b;

    /* renamed from: c */
    public final ArrayList f52592c = new ArrayList();

    /* renamed from: d */
    public C16669a f52593d;

    /* renamed from: e */
    public AdSessionStatePublisher f52594e;

    /* renamed from: f */
    public boolean f52595f = false;

    /* renamed from: g */
    public boolean f52596g = false;

    /* renamed from: h */
    public final String f52597h;

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public C20851d(C20848a aVar, C20849b bVar) {
        AdSessionStatePublisher adSessionStatePublisher;
        this.f52591b = bVar;
        this.f52597h = UUID.randomUUID().toString();
        this.f52593d = new C16669a((View) null);
        AdSessionContextType adSessionContextType = bVar.f52590h;
        if (adSessionContextType == AdSessionContextType.HTML || adSessionContextType == AdSessionContextType.JAVASCRIPT) {
            adSessionStatePublisher = new C16827a(bVar.f52584b);
        } else {
            adSessionStatePublisher = new C16828b(Collections.unmodifiableMap(bVar.f52586d), bVar.f52587e);
        }
        this.f52594e = adSessionStatePublisher;
        adSessionStatePublisher.mo44199a();
        C13465a.f33332c.f33333a.add(this);
        WebView g = this.f52594e.mo44205g();
        JSONObject jSONObject = new JSONObject();
        C13836a.m34520c(jSONObject, "impressionOwner", aVar.f52578a);
        C13836a.m34520c(jSONObject, "mediaEventsOwner", aVar.f52579b);
        C13836a.m34520c(jSONObject, "creativeType", aVar.f52581d);
        C13836a.m34520c(jSONObject, "impressionType", aVar.f52582e);
        C13836a.m34520c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(aVar.f52580c));
        C17884p.m44358b(g, "init", jSONObject);
    }

    /* renamed from: w */
    public final void mo52975w() {
        boolean z;
        if (!this.f52596g) {
            this.f52593d.clear();
            if (!this.f52596g) {
                this.f52592c.clear();
            }
            boolean z2 = true;
            this.f52596g = true;
            C17884p.m44358b(this.f52594e.mo44205g(), "finishSession", new Object[0]);
            C13465a aVar = C13465a.f33332c;
            if (aVar.f33334b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f33333a.remove(this);
            aVar.f33334b.remove(this);
            if (z) {
                if (aVar.f33334b.size() <= 0) {
                    z2 = false;
                }
                if (!z2) {
                    C13471f a = C13471f.m33792a();
                    a.getClass();
                    C17019b bVar = C17019b.f44140g;
                    bVar.getClass();
                    Handler handler = C17019b.f44142i;
                    if (handler != null) {
                        handler.removeCallbacks(C17019b.f44144k);
                        C17019b.f44142i = null;
                    }
                    bVar.f44145a.clear();
                    C17019b.f44141h.post(new C17018a(bVar));
                    C13466b bVar2 = C13466b.f33335e;
                    bVar2.f33336b = false;
                    bVar2.f33337c = false;
                    bVar2.f33338d = null;
                    C20729b bVar3 = a.f33347d;
                    bVar3.f52328a.getContentResolver().unregisterContentObserver(bVar3);
                }
            }
            this.f52594e.mo44203e();
            this.f52594e = null;
        }
    }

    /* renamed from: x */
    public final void mo52976x(View view) {
        if (!this.f52596g) {
            C18201b.m44912h(view, "AdView is null");
            if (((View) this.f52593d.get()) != view) {
                this.f52593d = new C16669a(view);
                this.f52594e.mo44206h();
                Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(C13465a.f33332c.f33333a);
                if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                    for (T t : unmodifiableCollection) {
                        if (t != this && ((View) t.f52593d.get()) == view) {
                            t.f52593d.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo52977y() {
        boolean z;
        if (!this.f52595f) {
            this.f52595f = true;
            C13465a aVar = C13465a.f33332c;
            if (aVar.f33334b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f33334b.add(this);
            if (!z) {
                C13471f a = C13471f.m33792a();
                a.getClass();
                C13466b bVar = C13466b.f33335e;
                bVar.f33338d = a;
                bVar.f33336b = true;
                bVar.f33337c = false;
                bVar.mo40375b();
                C17019b.f44140g.getClass();
                C17019b.m42874a();
                C20729b bVar2 = a.f33347d;
                bVar2.f52332e = bVar2.mo52879a();
                bVar2.mo52880b();
                bVar2.f52328a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, bVar2);
            }
            float f = C13471f.m33792a().f33344a;
            C17884p.m44358b(this.f52594e.mo44205g(), "setDeviceVolume", Float.valueOf(f));
            this.f52594e.mo44201c(this, this.f52591b);
        }
    }
}
