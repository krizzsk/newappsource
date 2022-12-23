package mj0;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: mj0.d */
public final class C24398d implements C24415u {

    /* renamed from: a */
    public final /* synthetic */ int f61758a;

    public /* synthetic */ C24398d(int i) {
        this.f61758a = i;
    }

    /* renamed from: a */
    public final Object mo60538a(String str) {
        switch (this.f61758a) {
            case 0:
                return new AtomicLong(Long.valueOf(str).longValue());
            default:
                return Short.valueOf(str);
        }
    }
}
