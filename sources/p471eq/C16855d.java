package p471eq;

import android.view.View;
import android.view.ViewTreeObserver;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p471eq.C16851b;

/* renamed from: eq.d */
public final class C16855d implements C16851b.C16853b {

    /* renamed from: a */
    public final MoovitActivity f43853a;

    /* renamed from: b */
    public final int f43854b;

    /* renamed from: c */
    public final List<? extends C16851b> f43855c;

    /* renamed from: d */
    public final HashSet f43856d;

    /* renamed from: e */
    public C16856a f43857e = null;

    /* renamed from: eq.d$a */
    public static class C16856a implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {

        /* renamed from: b */
        public final View f43858b;

        /* renamed from: c */
        public final C16851b f43859c;

        /* renamed from: d */
        public final long f43860d;

        /* renamed from: e */
        public boolean f43861e = false;

        /* renamed from: f */
        public final Snackbar f43862f;

        public C16856a(View view, C16851b bVar, long j) {
            this.f43858b = view;
            this.f43859c = bVar;
            this.f43860d = Math.max(0, j);
            Snackbar k = Snackbar.m35158k(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, view, "");
            k.mo42224a(bVar.f43847a);
            bVar.mo49509d(k, new C16850a(bVar, 0));
            this.f43862f = k;
        }

        /* renamed from: a */
        public final void mo49526a() {
            if (!this.f43861e) {
                View view = this.f43858b;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6340g.m15076c(view)) {
                    this.f43858b.postDelayed(this, this.f43860d);
                } else {
                    UiUtils.m40259r(this.f43858b, this);
                }
            }
        }

        public final void onGlobalLayout() {
            mo49526a();
        }

        public final void run() {
            if (!this.f43861e) {
                this.f43862f.mo42259p();
            }
        }
    }

    public C16855d(MoovitActivity moovitActivity, int i, List<? extends C16851b> list) {
        C21100e.m49373x(moovitActivity, "activity");
        this.f43853a = moovitActivity;
        this.f43854b = i;
        C21100e.m49373x(list, "alertConditions");
        this.f43855c = list;
        this.f43856d = new HashSet(list.size());
        for (C16851b bVar : list) {
            bVar.f43849c = this;
        }
    }

    /* renamed from: a */
    public final void mo49523a(C16851b bVar) {
        this.f43856d.add(bVar);
        mo49525c();
    }

    /* renamed from: b */
    public final void mo49524b(C16851b bVar) {
        this.f43856d.remove(bVar);
        mo49525c();
    }

    /* renamed from: c */
    public final void mo49525c() {
        C16851b bVar;
        C16851b bVar2;
        C16856a aVar = this.f43857e;
        C16856a aVar2 = null;
        if (aVar == null) {
            bVar = null;
        } else {
            bVar = aVar.f43859c;
        }
        Iterator<? extends C16851b> it = this.f43855c.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar2 = null;
                break;
            }
            bVar2 = (C16851b) it.next();
            if (this.f43856d.contains(bVar2)) {
                break;
            }
        }
        if (bVar2 != bVar) {
            long j = 1500;
            C16856a aVar3 = this.f43857e;
            if (aVar3 != null) {
                aVar3.f43861e = true;
                aVar3.f43858b.removeCallbacks(aVar3);
                if (aVar3.f43862f.mo42227d()) {
                    aVar3.f43862f.mo42226c(3);
                }
                j = 0;
            }
            View findViewById = this.f43853a.findViewById(this.f43854b);
            if (findViewById == null) {
                findViewById = this.f43853a.findViewById(16908290);
            }
            if (findViewById != null) {
                if (bVar2 != null) {
                    aVar2 = new C16856a(findViewById, bVar2, j);
                }
                this.f43857e = aVar2;
                if (aVar2 != null) {
                    aVar2.mo49526a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to find proper parent view");
        }
    }
}
