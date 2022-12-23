package p888wh;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p888wh.C20335b;

/* renamed from: wh.c */
public final class C20338c implements C20335b.C20336a {

    /* renamed from: a */
    public final ThreadPoolExecutor f51501a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    public final ArrayDeque<C20335b> f51502b = new ArrayDeque<>();

    /* renamed from: c */
    public C20335b f51503c = null;

    /* renamed from: a */
    public final void mo52549a() {
        C20335b poll = this.f51502b.poll();
        this.f51503c = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f51501a, new Object[0]);
        }
    }
}
