package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p003a2.C0046a;
import p003a2.C0047b;

/* renamed from: androidx.emoji2.text.i */
public final class C0848i {

    /* renamed from: d */
    public static final ThreadLocal<C0046a> f3514d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f3515a;

    /* renamed from: b */
    public final C0857n f3516b;

    /* renamed from: c */
    public volatile int f3517c = 0;

    public C0848i(C0857n nVar, int i) {
        this.f3516b = nVar;
        this.f3515a = i;
    }

    /* renamed from: a */
    public final int mo3627a(int i) {
        C0046a c = mo3629c();
        int a = c.mo24a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c.f51b;
        int i2 = a + c.f50a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* renamed from: b */
    public final int mo3628b() {
        C0046a c = mo3629c();
        int a = c.mo24a(16);
        if (a == 0) {
            return 0;
        }
        int i = a + c.f50a;
        return c.f51b.getInt(c.f51b.getInt(i) + i);
    }

    /* renamed from: c */
    public final C0046a mo3629c() {
        ThreadLocal<C0046a> threadLocal = f3514d;
        C0046a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C0046a();
            threadLocal.set(aVar);
        }
        C0047b bVar = this.f3516b.f3540a;
        int i = this.f3515a;
        int a = bVar.mo24a(6);
        if (a != 0) {
            int i2 = a + bVar.f50a;
            int i3 = (i * 4) + bVar.f51b.getInt(i2) + i2 + 4;
            aVar.mo25b(bVar.f51b.getInt(i3) + i3, bVar.f51b);
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0046a c = mo3629c();
        int a = c.mo24a(4);
        if (a != 0) {
            i = c.f51b.getInt(a + c.f50a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int b = mo3628b();
        for (int i2 = 0; i2 < b; i2++) {
            sb.append(Integer.toHexString(mo3627a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
