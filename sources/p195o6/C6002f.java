package p195o6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2129i;
import com.bumptech.glide.C2131j;
import java.util.ArrayList;
import p007a6.C0082a;
import p007a6.C0087e;
import p025b6.C1495h;
import p060d6.C4385f;
import p072e6.C4566d;
import p133j6.C5387b;
import p260t6.C6602g;
import p273u6.C6710c;
import p285v6.C6869d;
import p298w6.C7000d;

/* renamed from: o6.f */
public final class C6002f {

    /* renamed from: a */
    public final C0082a f19174a;

    /* renamed from: b */
    public final Handler f19175b;

    /* renamed from: c */
    public final ArrayList f19176c = new ArrayList();

    /* renamed from: d */
    public final C2131j f19177d;

    /* renamed from: e */
    public final C4566d f19178e;

    /* renamed from: f */
    public boolean f19179f;

    /* renamed from: g */
    public boolean f19180g;

    /* renamed from: h */
    public C2129i<Bitmap> f19181h;

    /* renamed from: i */
    public C6003a f19182i;

    /* renamed from: j */
    public boolean f19183j;

    /* renamed from: k */
    public C6003a f19184k;

    /* renamed from: l */
    public Bitmap f19185l;

    /* renamed from: m */
    public C1495h<Bitmap> f19186m;

    /* renamed from: n */
    public C6003a f19187n;

    /* renamed from: o */
    public int f19188o;

    /* renamed from: p */
    public int f19189p;

    /* renamed from: q */
    public int f19190q;

    /* renamed from: o6.f$a */
    public static class C6003a extends C6710c<Bitmap> {

        /* renamed from: e */
        public final Handler f19191e;

        /* renamed from: f */
        public final int f19192f;

        /* renamed from: g */
        public final long f19193g;

        /* renamed from: h */
        public Bitmap f19194h;

        public C6003a(Handler handler, int i, long j) {
            this.f19191e = handler;
            this.f19192f = i;
            this.f19193g = j;
        }

        /* renamed from: d */
        public final void mo22005d(Drawable drawable) {
            this.f19194h = null;
        }

        /* renamed from: h */
        public final void mo10887h(Object obj, C6869d dVar) {
            this.f19194h = (Bitmap) obj;
            this.f19191e.sendMessageAtTime(this.f19191e.obtainMessage(1, this), this.f19193g);
        }
    }

    /* renamed from: o6.f$b */
    public interface C6004b {
        /* renamed from: a */
        void mo21985a();
    }

    /* renamed from: o6.f$c */
    public class C6005c implements Handler.Callback {
        public C6005c() {
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C6002f.this.mo22003b((C6003a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C6002f.this.f19177d.mo10873o((C6003a) message.obj);
                return false;
            }
        }
    }

    public C6002f(C2116c cVar, C0087e eVar, int i, int i2, C5387b bVar, Bitmap bitmap) {
        C4566d dVar = cVar.f6882c;
        Context baseContext = cVar.f6884e.getBaseContext();
        C2131j f = C2116c.m5521c(baseContext).mo22193f(baseContext);
        Context baseContext2 = cVar.f6884e.getBaseContext();
        C2129i<Bitmap> N = C2116c.m5521c(baseContext2).mo22193f(baseContext2).mo10870l().mo10857a(((C6602g) ((C6602g) ((C6602g) new C6602g().mo22726i(C4385f.f15421b)).mo22720K()).mo22715F(true)).mo22737v(i, i2));
        this.f19177d = f;
        Handler handler = new Handler(Looper.getMainLooper(), new C6005c());
        this.f19178e = dVar;
        this.f19175b = handler;
        this.f19181h = N;
        this.f19174a = eVar;
        mo22004c(bVar, bitmap);
    }

    /* renamed from: a */
    public final void mo22002a() {
        if (this.f19179f && !this.f19180g) {
            C6003a aVar = this.f19187n;
            if (aVar != null) {
                this.f19187n = null;
                mo22003b(aVar);
                return;
            }
            this.f19180g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f19174a.mo185d());
            this.f19174a.mo182b();
            this.f19184k = new C6003a(this.f19175b, this.f19174a.mo186e(), uptimeMillis);
            this.f19181h.mo10857a((C6602g) new C6602g().mo22713D(new C7000d(Double.valueOf(Math.random())))).mo10855Y(this.f19174a).mo10848R(this.f19184k);
        }
    }

    /* renamed from: b */
    public final void mo22003b(C6003a aVar) {
        this.f19180g = false;
        if (this.f19183j) {
            this.f19175b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f19179f) {
            this.f19187n = aVar;
        } else {
            if (aVar.f19194h != null) {
                Bitmap bitmap = this.f19185l;
                if (bitmap != null) {
                    this.f19178e.mo20086d(bitmap);
                    this.f19185l = null;
                }
                C6003a aVar2 = this.f19182i;
                this.f19182i = aVar;
                int size = this.f19176c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C6004b) this.f19176c.get(size)).mo21985a();
                }
                if (aVar2 != null) {
                    this.f19175b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            mo22002a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [b6.h, java.lang.Object, b6.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22004c(p025b6.C1495h<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            p584jl.C17885a.m44458r(r4)
            r3.f19186m = r4
            p584jl.C17885a.m44458r(r5)
            r3.f19185l = r5
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r3.f19181h
            t6.g r1 = new t6.g
            r1.<init>()
            r2 = 1
            t6.a r4 = r1.mo22717H(r4, r2)
            com.bumptech.glide.i r4 = r0.mo10857a(r4)
            r3.f19181h = r4
            int r4 = p311x6.C7176l.m16783c(r5)
            r3.f19188o = r4
            int r4 = r5.getWidth()
            r3.f19189p = r4
            int r4 = r5.getHeight()
            r3.f19190q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p195o6.C6002f.mo22004c(b6.h, android.graphics.Bitmap):void");
    }
}
