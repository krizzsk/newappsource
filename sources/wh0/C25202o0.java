package wh0;

import bi0.C21062a;
import cf0.C21132f;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: wh0.o0 */
public abstract class C25202o0 extends CoroutineDispatcher {

    /* renamed from: g */
    public static final /* synthetic */ int f63476g = 0;

    /* renamed from: d */
    public long f63477d;

    /* renamed from: e */
    public boolean f63478e;

    /* renamed from: f */
    public C21062a<C25178g0<?>> f63479f;

    /* renamed from: A */
    public final void mo61843A(C25178g0<?> g0Var) {
        C21062a<C25178g0<?>> aVar = this.f63479f;
        if (aVar == null) {
            aVar = new C21062a<>();
            this.f63479f = aVar;
        }
        Object[] objArr = aVar.f52865a;
        int i = aVar.f52867c;
        objArr[i] = g0Var;
        int length = (objArr.length - 1) & (i + 1);
        aVar.f52867c = length;
        int i2 = aVar.f52866b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            C21132f.m49431N0(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = aVar.f52865a;
            int length3 = objArr3.length;
            int i3 = aVar.f52866b;
            C21132f.m49431N0(objArr3, objArr2, length3 - i3, 0, i3, 4);
            aVar.f52865a = objArr2;
            aVar.f52866b = 0;
            aVar.f52867c = length2;
        }
    }

    /* renamed from: B */
    public final void mo61844B(boolean z) {
        long j;
        long j2 = this.f63477d;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.f63477d = j + j2;
        if (!z) {
            this.f63478e = true;
        }
    }

    /* renamed from: K */
    public final boolean mo61845K() {
        return this.f63477d >= 4294967296L;
    }

    /* renamed from: U */
    public long mo60307U() {
        return !mo61846V() ? Long.MAX_VALUE : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: wh0.g0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61846V() {
        /*
            r7 = this;
            bi0.a<wh0.g0<?>> r0 = r7.f63479f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.f52866b
            int r3 = r0.f52867c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000f
            goto L_0x001f
        L_0x000f:
            java.lang.Object[] r3 = r0.f52865a
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f52866b = r2
            if (r6 == 0) goto L_0x0028
            r4 = r6
        L_0x001f:
            wh0.g0 r4 = (wh0.C25178g0) r4
            if (r4 != 0) goto L_0x0024
            return r1
        L_0x0024:
            r4.run()
            return r5
        L_0x0028:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25202o0.mo61846V():boolean");
    }

    public void shutdown() {
    }

    /* renamed from: z */
    public final void mo61847z(boolean z) {
        long j;
        long j2 = this.f63477d;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.f63477d = j3;
        if (j3 <= 0 && this.f63478e) {
            shutdown();
        }
    }
}
