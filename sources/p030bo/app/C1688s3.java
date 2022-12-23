package p030bo.app;

import com.appboy.support.AppboyLogger;

/* renamed from: bo.app.s3 */
public abstract class C1688s3<T> {

    /* renamed from: c */
    public static final String f5988c = AppboyLogger.getBrazeLogTag(C1688s3.class);

    /* renamed from: a */
    public final Object f5989a = new Object();

    /* renamed from: b */
    public boolean f5990b = false;

    /* renamed from: a */
    public T mo6369a() {
        synchronized (this.f5989a) {
            if (this.f5990b) {
                AppboyLogger.m5451d(f5988c, "Received call to export dirty object, but the cache was already locked.", false);
                return null;
            }
            this.f5990b = true;
            T c = mo6103c();
            return c;
        }
    }

    /* renamed from: b */
    public abstract void mo6099b(T t, boolean z);

    /* renamed from: b */
    public boolean mo6371b() {
        boolean z;
        synchronized (this.f5989a) {
            z = this.f5990b;
        }
        return z;
    }

    /* renamed from: c */
    public abstract T mo6103c();

    /* renamed from: a */
    public boolean mo6370a(T t, boolean z) {
        synchronized (this.f5989a) {
            if (!this.f5990b) {
                String str = f5988c;
                AppboyLogger.m5459w(str, "Tried to confirm outboundObject [" + t + "] with success [" + z + "], but the cache wasn't locked, so not doing anything.");
                return false;
            }
            mo6099b(t, z);
            this.f5990b = false;
            synchronized (this) {
                String str2 = f5988c;
                AppboyLogger.m5457v(str2, "Notifying confirmAndUnlock listeners for cache: " + this);
                notifyAll();
            }
            return true;
        }
    }
}
