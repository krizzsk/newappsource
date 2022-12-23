package p060d6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: d6.n */
public final class C4399n {

    /* renamed from: a */
    public boolean f15451a;

    /* renamed from: b */
    public final Handler f15452b = new Handler(Looper.getMainLooper(), new C4400a());

    /* renamed from: d6.n$a */
    public static final class C4400a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C4397l) message.obj).mo10979a();
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo19912a(C4397l<?> lVar, boolean z) {
        if (!this.f15451a) {
            if (!z) {
                this.f15451a = true;
                lVar.mo10979a();
                this.f15451a = false;
            }
        }
        this.f15452b.obtainMessage(1, lVar).sendToTarget();
    }
}
