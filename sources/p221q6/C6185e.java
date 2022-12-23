package p221q6;

import android.content.Context;
import com.bumptech.glide.C2131j;
import p221q6.C6182c;

/* renamed from: q6.e */
public final class C6185e implements C6182c {

    /* renamed from: b */
    public final Context f19576b;

    /* renamed from: c */
    public final C6182c.C6183a f19577c;

    public C6185e(Context context, C2131j.C2134c cVar) {
        this.f19576b = context.getApplicationContext();
        this.f19577c = cVar;
    }

    public final void onDestroy() {
    }

    public final void onStart() {
        C6199p a = C6199p.m14774a(this.f19576b);
        C6182c.C6183a aVar = this.f19577c;
        synchronized (a) {
            a.f19601b.add(aVar);
            if (!a.f19602c) {
                if (!a.f19601b.isEmpty()) {
                    a.f19602c = a.f19600a.mo22206b();
                }
            }
        }
    }

    public final void onStop() {
        C6199p a = C6199p.m14774a(this.f19576b);
        C6182c.C6183a aVar = this.f19577c;
        synchronized (a) {
            a.f19601b.remove(aVar);
            if (a.f19602c) {
                if (a.f19601b.isEmpty()) {
                    a.f19600a.mo22205a();
                    a.f19602c = false;
                }
            }
        }
    }
}
