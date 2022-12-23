package p273u6;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.C2131j;
import p260t6.C6598d;
import p285v6.C6869d;

/* renamed from: u6.g */
public final class C6716g<Z> extends C6710c<Z> {

    /* renamed from: f */
    public static final Handler f20808f = new Handler(Looper.getMainLooper(), new C6717a());

    /* renamed from: e */
    public final C2131j f20809e;

    /* renamed from: u6.g$a */
    public class C6717a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            C6716g gVar = (C6716g) message.obj;
            gVar.f20809e.mo10873o(gVar);
            return true;
        }
    }

    public C6716g(C2131j jVar) {
        this.f20809e = jVar;
    }

    /* renamed from: d */
    public final void mo22005d(Drawable drawable) {
    }

    /* renamed from: h */
    public final void mo10887h(Z z, C6869d<? super Z> dVar) {
        C6598d dVar2 = this.f20798d;
        if (dVar2 != null && dVar2.mo11029e()) {
            f20808f.obtainMessage(1, this).sendToTarget();
        }
    }
}
