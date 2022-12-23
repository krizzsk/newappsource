package p277ub;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: ub.w */
public final class C6809w implements C6782g {

    /* renamed from: b */
    public static final ArrayList f21062b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f21063a;

    /* renamed from: ub.w$a */
    public static final class C6810a {

        /* renamed from: a */
        public Message f21064a;

        /* renamed from: a */
        public final void mo23023a() {
            Message message = this.f21064a;
            message.getClass();
            message.sendToTarget();
            this.f21064a = null;
            ArrayList arrayList = C6809w.f21062b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public C6809w(Handler handler) {
        this.f21063a = handler;
    }

    /* renamed from: b */
    public static C6810a m16064b() {
        C6810a aVar;
        ArrayList arrayList = f21062b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                aVar = new C6810a();
            } else {
                aVar = (C6810a) arrayList.remove(arrayList.size() - 1);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final C6810a mo23021a(int i, Object obj) {
        C6810a b = m16064b();
        b.f21064a = this.f21063a.obtainMessage(i, obj);
        return b;
    }

    /* renamed from: c */
    public final boolean mo23022c(int i) {
        return this.f21063a.sendEmptyMessage(i);
    }
}
