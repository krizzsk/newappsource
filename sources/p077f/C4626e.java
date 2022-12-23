package p077f;

import android.content.Context;
import android.os.RemoteException;
import androidx.ads.identifier.AdvertisingIdNotAvailableException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p077f.C4632i;
import p088g.C4718a;
import p101h.C5012a;

/* renamed from: f.e */
public final class C4626e {

    /* renamed from: a */
    public static final ExecutorService f15845a = Executors.newCachedThreadPool();

    /* renamed from: b */
    public static final ScheduledExecutorService f15846b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public static final Object f15847c = new Object();

    /* renamed from: d */
    public static final AtomicReference<C4718a> f15848d = new AtomicReference<>((Object) null);

    /* renamed from: f.e$a */
    public static abstract class C4627a {
        /* renamed from: a */
        public abstract C4718a mo20144a();

        /* renamed from: b */
        public abstract long mo20145b();
    }

    /* renamed from: a */
    public static C4631h m11933a(Context context) throws IOException, AdvertisingIdNotAvailableException, TimeoutException, InterruptedException {
        C4631h d = m11936d();
        if (d == null) {
            synchronized (f15847c) {
                d = m11936d();
                if (d == null) {
                    C4718a aVar = new C4718a(context);
                    f15848d.set(aVar);
                    d = new C4631h(aVar, 0);
                }
            }
        }
        return d;
    }

    /* renamed from: b */
    public static C4632i m11934b(C4718a aVar) throws IOException, AdvertisingIdNotAvailableException {
        C5012a aVar2 = aVar.f16009d;
        try {
            String id = aVar2.getId();
            if (id == null || id.trim().isEmpty()) {
                throw new AdvertisingIdNotAvailableException("Advertising ID Provider does not returns an Advertising ID.");
            }
            C4632i.C4633a aVar3 = new C4632i.C4633a();
            aVar3.f15854a = id;
            String str = aVar.f16008c;
            if (str != null) {
                aVar3.f15855b = str;
                aVar3.f15856c = Boolean.valueOf(aVar2.mo20726p());
                return aVar3.mo20155a();
            }
            throw new NullPointerException("Null providerPackageName");
        } catch (RemoteException e) {
            throw new IOException("Remote exception", e);
        } catch (RuntimeException e2) {
            throw new AdvertisingIdNotAvailableException(e2);
        }
    }

    /* renamed from: c */
    public static void m11935c(C4631h hVar) {
        f15846b.schedule(new C4625d(hVar), 30, TimeUnit.SECONDS);
    }

    /* renamed from: d */
    public static C4631h m11936d() {
        C4718a aVar = f15848d.get();
        if (aVar == null) {
            return null;
        }
        long incrementAndGet = aVar.f16010e.incrementAndGet();
        if (incrementAndGet >= 0) {
            return new C4631h(aVar, incrementAndGet);
        }
        return null;
    }
}
