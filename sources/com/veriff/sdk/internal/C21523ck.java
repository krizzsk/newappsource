package com.veriff.sdk.internal;

import android.net.NetworkInfo;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21537cs;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.veriff.sdk.internal.ck */
class C21523ck extends ThreadPoolExecutor {

    /* renamed from: com.veriff.sdk.internal.ck$a */
    public static final class C21524a extends FutureTask<C21479br> implements Comparable<C21524a> {

        /* renamed from: a */
        private final C21479br f54149a;

        public C21524a(C21479br brVar) {
            super(brVar, (Object) null);
            this.f54149a = brVar;
        }

        /* renamed from: a */
        public int compareTo(C21524a aVar) {
            C21512ci.C21519e n = this.f54149a.mo54425n();
            C21512ci.C21519e n2 = aVar.f54149a.mo54425n();
            if (n == n2) {
                return this.f54149a.f54029a - aVar.f54149a.f54029a;
            }
            return n2.ordinal() - n.ordinal();
        }
    }

    public C21523ck() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C21537cs.C21540b());
    }

    /* renamed from: a */
    public void mo54508a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            m51438a(3);
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    m51438a(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            m51438a(3);
                            return;
                        default:
                            m51438a(3);
                            return;
                    }
            }
            m51438a(2);
        } else if (type == 1 || type == 6 || type == 9) {
            m51438a(4);
        } else {
            m51438a(3);
        }
    }

    public Future<?> submit(Runnable runnable) {
        C21524a aVar = new C21524a((C21479br) runnable);
        execute(aVar);
        return aVar;
    }

    /* renamed from: a */
    private void m51438a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }
}
