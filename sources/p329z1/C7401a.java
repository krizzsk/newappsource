package p329z1;

import android.view.Choreographer;
import java.util.ArrayList;
import p241s0.C6313h;

/* renamed from: z1.a */
public final class C7401a {

    /* renamed from: g */
    public static final ThreadLocal<C7401a> f22770g = new ThreadLocal<>();

    /* renamed from: a */
    public final C6313h<C7403b, Long> f22771a = new C6313h<>();

    /* renamed from: b */
    public final ArrayList<C7403b> f22772b = new ArrayList<>();

    /* renamed from: c */
    public final C7402a f22773c = new C7402a();

    /* renamed from: d */
    public C7405d f22774d;

    /* renamed from: e */
    public long f22775e = 0;

    /* renamed from: f */
    public boolean f22776f = false;

    /* renamed from: z1.a$a */
    public class C7402a {
        public C7402a() {
        }
    }

    /* renamed from: z1.a$b */
    public interface C7403b {
        /* renamed from: a */
        boolean mo23634a(long j);
    }

    /* renamed from: z1.a$c */
    public static abstract class C7404c {

        /* renamed from: a */
        public final C7402a f22778a;

        public C7404c(C7402a aVar) {
            this.f22778a = aVar;
        }
    }

    /* renamed from: z1.a$d */
    public static class C7405d extends C7404c {

        /* renamed from: b */
        public final Choreographer f22779b = Choreographer.getInstance();

        /* renamed from: c */
        public final C7406a f22780c = new C7406a();

        /* renamed from: z1.a$d$a */
        public class C7406a implements Choreographer.FrameCallback {
            public C7406a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doFrame(long r11) {
                /*
                    r10 = this;
                    z1.a$d r11 = p329z1.C7401a.C7405d.this
                    z1.a$a r11 = r11.f22778a
                    z1.a r12 = p329z1.C7401a.this
                    long r0 = android.os.SystemClock.uptimeMillis()
                    r12.f22775e = r0
                    z1.a r12 = p329z1.C7401a.this
                    long r0 = r12.f22775e
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r4 = 0
                    r5 = 0
                L_0x0016:
                    java.util.ArrayList<z1.a$b> r6 = r12.f22772b
                    int r6 = r6.size()
                    if (r5 >= r6) goto L_0x004d
                    java.util.ArrayList<z1.a$b> r6 = r12.f22772b
                    java.lang.Object r6 = r6.get(r5)
                    z1.a$b r6 = (p329z1.C7401a.C7403b) r6
                    if (r6 != 0) goto L_0x0029
                    goto L_0x004a
                L_0x0029:
                    s0.h<z1.a$b, java.lang.Long> r7 = r12.f22771a
                    r8 = 0
                    java.lang.Object r7 = r7.getOrDefault(r6, r8)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L_0x0035
                    goto L_0x0042
                L_0x0035:
                    long r7 = r7.longValue()
                    int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r9 >= 0) goto L_0x0044
                    s0.h<z1.a$b, java.lang.Long> r7 = r12.f22771a
                    r7.remove(r6)
                L_0x0042:
                    r7 = 1
                    goto L_0x0045
                L_0x0044:
                    r7 = 0
                L_0x0045:
                    if (r7 == 0) goto L_0x004a
                    r6.mo23634a(r0)
                L_0x004a:
                    int r5 = r5 + 1
                    goto L_0x0016
                L_0x004d:
                    boolean r0 = r12.f22776f
                    if (r0 == 0) goto L_0x006b
                    java.util.ArrayList<z1.a$b> r0 = r12.f22772b
                    int r0 = r0.size()
                L_0x0057:
                    int r0 = r0 + -1
                    if (r0 < 0) goto L_0x0069
                    java.util.ArrayList<z1.a$b> r1 = r12.f22772b
                    java.lang.Object r1 = r1.get(r0)
                    if (r1 != 0) goto L_0x0057
                    java.util.ArrayList<z1.a$b> r1 = r12.f22772b
                    r1.remove(r0)
                    goto L_0x0057
                L_0x0069:
                    r12.f22776f = r4
                L_0x006b:
                    z1.a r12 = p329z1.C7401a.this
                    java.util.ArrayList<z1.a$b> r12 = r12.f22772b
                    int r12 = r12.size()
                    if (r12 <= 0) goto L_0x008d
                    z1.a r11 = p329z1.C7401a.this
                    z1.a$d r12 = r11.f22774d
                    if (r12 != 0) goto L_0x0084
                    z1.a$d r12 = new z1.a$d
                    z1.a$a r0 = r11.f22773c
                    r12.<init>(r0)
                    r11.f22774d = r12
                L_0x0084:
                    z1.a$d r11 = r11.f22774d
                    android.view.Choreographer r12 = r11.f22779b
                    z1.a$d$a r11 = r11.f22780c
                    r12.postFrameCallback(r11)
                L_0x008d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p329z1.C7401a.C7405d.C7406a.doFrame(long):void");
            }
        }

        public C7405d(C7402a aVar) {
            super(aVar);
        }
    }
}
