package p314xa;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import p314xa.C7186e;

/* renamed from: xa.d */
public final class C7185d extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C7186e f22283a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7185d(C7186e eVar, Looper looper) {
        super(looper);
        this.f22283a = eVar;
    }

    public final void handleMessage(Message message) {
        C7186e.C7187a aVar;
        C7186e eVar = this.f22283a;
        eVar.getClass();
        int i = message.what;
        if (i == 0) {
            aVar = (C7186e.C7187a) message.obj;
            try {
                eVar.f22286a.queueInputBuffer(aVar.f22293a, aVar.f22294b, aVar.f22295c, aVar.f22297e, aVar.f22298f);
            } catch (RuntimeException e) {
                eVar.f22289d.set(e);
            }
        } else if (i != 1) {
            if (i != 2) {
                eVar.f22289d.set(new IllegalStateException(String.valueOf(message.what)));
            } else {
                eVar.f22290e.mo53185a();
            }
            aVar = null;
        } else {
            aVar = (C7186e.C7187a) message.obj;
            int i2 = aVar.f22293a;
            int i3 = aVar.f22294b;
            MediaCodec.CryptoInfo cryptoInfo = aVar.f22296d;
            long j = aVar.f22297e;
            int i4 = aVar.f22298f;
            try {
                if (eVar.f22291f) {
                    synchronized (C7186e.f22285i) {
                        eVar.f22286a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                    }
                } else {
                    eVar.f22286a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
            } catch (RuntimeException e2) {
                eVar.f22289d.set(e2);
            }
        }
        if (aVar != null) {
            ArrayDeque<C7186e.C7187a> arrayDeque = C7186e.f22284h;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
