package aa0;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.moovit.MoovitApplication;

/* renamed from: aa0.m */
public final class C7541m {

    /* renamed from: a */
    public final C7542a f23020a = new C7542a();

    /* renamed from: b */
    public final Handler f23021b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final SharedPreferences f23022c;

    /* renamed from: d */
    public final String f23023d;

    /* renamed from: e */
    public int f23024e;

    /* renamed from: f */
    public long f23025f;

    /* renamed from: aa0.m$a */
    public class C7542a implements Runnable {
        public C7542a() {
        }

        public final void run() {
            SharedPreferences.Editor edit = C7541m.this.f23022c.edit();
            C7541m mVar = C7541m.this;
            edit.putInt(mVar.f23023d, mVar.f23024e);
            edit.apply();
        }
    }

    public C7541m(String str) {
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        this.f23023d = str;
        SharedPreferences sharedPreferences = moovitApplication.getSharedPreferences(str, 0);
        this.f23022c = sharedPreferences;
        this.f23024e = sharedPreferences.getInt(str, 0);
        this.f23025f = 0;
    }

    /* renamed from: a */
    public final synchronized int mo23805a() {
        int i;
        int i2;
        i = this.f23024e;
        if (i == Integer.MAX_VALUE) {
            i2 = 0;
        } else {
            i2 = i + 1;
        }
        this.f23024e = i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f23025f > 1000) {
            this.f23025f = uptimeMillis;
            this.f23021b.postDelayed(this.f23020a, 1000);
        }
        return i;
    }
}
