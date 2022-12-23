package p511gi;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p511gi.C17192b;

/* renamed from: gi.c */
public final class C17195c implements C17192b.C17193a {

    /* renamed from: a */
    public final ThreadPoolExecutor f44439a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    public final ArrayDeque<C17192b> f44440b = new ArrayDeque<>();

    /* renamed from: c */
    public C17192b f44441c = null;

    /* renamed from: a */
    public final void mo49776a() {
        C17192b poll = this.f44440b.poll();
        this.f44441c = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f44439a, new Object[0]);
        }
    }
}
