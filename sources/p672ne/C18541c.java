package p672ne;

import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p237r9.C6268a;
import p237r9.C6272e;
import p247s6.C6478c;
import p531he.C17421w;
import p577je.C17746a0;
import p696oe.C18730b;

/* renamed from: ne.c */
public final class C18541c {

    /* renamed from: a */
    public final double f47209a;

    /* renamed from: b */
    public final double f47210b;

    /* renamed from: c */
    public final long f47211c;

    /* renamed from: d */
    public final int f47212d;

    /* renamed from: e */
    public final ArrayBlockingQueue f47213e;

    /* renamed from: f */
    public final ThreadPoolExecutor f47214f;

    /* renamed from: g */
    public final C6272e<C17746a0> f47215g;

    /* renamed from: h */
    public final C6478c f47216h;

    /* renamed from: i */
    public int f47217i = 0;

    /* renamed from: j */
    public long f47218j = 0;

    /* renamed from: ne.c$a */
    public final class C18542a implements Runnable {

        /* renamed from: b */
        public final C17421w f47219b;

        /* renamed from: c */
        public final TaskCompletionSource<C17421w> f47220c;

        public C18542a(C17421w wVar, TaskCompletionSource taskCompletionSource) {
            this.f47219b = wVar;
            this.f47220c = taskCompletionSource;
        }

        public final void run() {
            C18541c cVar = C18541c.this;
            C17421w wVar = this.f47219b;
            TaskCompletionSource<C17421w> taskCompletionSource = this.f47220c;
            cVar.getClass();
            wVar.mo49859c();
            cVar.f47215g.mo22260b(new C6268a(wVar.mo49857a(), Priority.HIGHEST), new C18540b(0, taskCompletionSource, wVar));
            ((AtomicInteger) C18541c.this.f47216h.f20215b).set(0);
            C18541c cVar2 = C18541c.this;
            double min = Math.min(3600000.0d, Math.pow(cVar2.f47210b, (double) cVar2.mo50950a()) * (60000.0d / cVar2.f47209a));
            String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(min / 1000.0d)});
            this.f47219b.mo49859c();
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public C18541c(C6272e<C17746a0> eVar, C18730b bVar, C6478c cVar) {
        double d = bVar.f47642d;
        double d2 = bVar.f47643e;
        this.f47209a = d;
        this.f47210b = d2;
        this.f47211c = ((long) bVar.f47644f) * 1000;
        this.f47215g = eVar;
        this.f47216h = cVar;
        int i = (int) d;
        this.f47212d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f47213e = arrayBlockingQueue;
        this.f47214f = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
    }

    /* renamed from: a */
    public final int mo50950a() {
        boolean z;
        int i;
        if (this.f47218j == 0) {
            this.f47218j = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f47218j) / this.f47211c);
        if (this.f47213e.size() == this.f47212d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = Math.min(100, this.f47217i + currentTimeMillis);
        } else {
            i = Math.max(0, this.f47217i - currentTimeMillis);
        }
        if (this.f47217i != i) {
            this.f47217i = i;
            this.f47218j = System.currentTimeMillis();
        }
        return i;
    }
}
