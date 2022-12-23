package com.fyber.inneractive.sdk.player.exoplayer2;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p */
public abstract class C3270p {

    /* renamed from: a */
    public static final C3270p f11753a = new C3271a();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$a */
    public class C3271a extends C3270p {
        /* renamed from: a */
        public int mo14406a() {
            return 0;
        }

        /* renamed from: a */
        public int mo14407a(Object obj) {
            return -1;
        }

        /* renamed from: a */
        public C3273c mo14410a(int i, C3273c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: b */
        public int mo14411b() {
            return 0;
        }

        /* renamed from: a */
        public C3272b mo14408a(int i, C3272b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$b */
    public static final class C3272b {

        /* renamed from: a */
        public Object f11754a;

        /* renamed from: b */
        public Object f11755b;

        /* renamed from: c */
        public int f11756c;

        /* renamed from: d */
        public long f11757d;

        /* renamed from: e */
        public long f11758e;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.p$c */
    public static final class C3273c {

        /* renamed from: a */
        public Object f11759a;

        /* renamed from: b */
        public boolean f11760b;

        /* renamed from: c */
        public int f11761c;

        /* renamed from: d */
        public int f11762d;

        /* renamed from: e */
        public long f11763e;

        /* renamed from: f */
        public long f11764f;

        /* renamed from: g */
        public long f11765g;
    }

    /* renamed from: a */
    public abstract int mo14406a();

    /* renamed from: a */
    public abstract int mo14407a(Object obj);

    /* renamed from: a */
    public abstract C3272b mo14408a(int i, C3272b bVar, boolean z);

    /* renamed from: a */
    public final C3273c mo14409a(int i, C3273c cVar) {
        return mo14410a(i, cVar, false, 0);
    }

    /* renamed from: a */
    public abstract C3273c mo14410a(int i, C3273c cVar, boolean z, long j);

    /* renamed from: b */
    public abstract int mo14411b();

    /* renamed from: c */
    public final boolean mo14412c() {
        return mo14411b() == 0;
    }
}
