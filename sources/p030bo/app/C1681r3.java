package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;

/* renamed from: bo.app.r3 */
public class C1681r3 implements C1599i {

    /* renamed from: e */
    public static final String f5969e = AppboyLogger.getBrazeLogTag(C1681r3.class);

    /* renamed from: a */
    public final Random f5970a;

    /* renamed from: b */
    public final int f5971b;

    /* renamed from: c */
    public final int f5972c;

    /* renamed from: d */
    public int f5973d;

    public C1681r3(int i) {
        this(i, (int) TimeUnit.SECONDS.toMillis(1));
    }

    /* renamed from: a */
    public int mo6152a() {
        return mo6347a(this.f5972c);
    }

    /* renamed from: b */
    public boolean mo6348b() {
        return this.f5973d != 0;
    }

    /* renamed from: c */
    public void mo6349c() {
        this.f5973d = 0;
    }

    public C1681r3(int i, int i2) {
        this.f5970a = new Random();
        this.f5973d = 0;
        this.f5971b = i;
        this.f5972c = i2;
    }

    /* renamed from: a */
    public int mo6347a(int i) {
        String str = f5969e;
        StringBuilder k = C13555b.m33972k("Computing new sleep delay. Previous sleep delay: ");
        k.append(this.f5973d);
        AppboyLogger.m5448d(str, k.toString());
        this.f5973d = Math.min(this.f5971b, m4673a(this.f5970a, i, this.f5973d * 3));
        StringBuilder k2 = C13555b.m33972k("New sleep duration: ");
        C0016g.m41y(k2, this.f5973d, " ms. Default sleep duration: ", i, " ms. Max sleep: ");
        k2.append(this.f5971b);
        k2.append(" ms.");
        AppboyLogger.m5448d(str, k2.toString());
        return this.f5973d;
    }

    /* renamed from: a */
    public static int m4673a(Random random, int i, int i2) {
        return Math.min(i, i2) + random.nextInt(Math.abs(i - i2));
    }
}
