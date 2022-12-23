package p304x;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.moovit.app.linedetail.p416ui.C15101a;
import p977zz.C20949l;

/* renamed from: x.t1 */
public final /* synthetic */ class C7105t1 implements CallbackToFutureAdapter.C0674b, C20949l {

    /* renamed from: b */
    public final /* synthetic */ boolean f22091b;

    /* renamed from: c */
    public final /* synthetic */ Object f22092c;

    public /* synthetic */ C7105t1(Object obj, boolean z) {
        this.f22092c = obj;
        this.f22091b = z;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        C7115w1 w1Var = (C7115w1) this.f22092c;
        boolean z = this.f22091b;
        w1Var.f22113d.execute(new C7111v1(w1Var, aVar, z));
        return "enableTorch: " + z;
    }

    public final boolean invoke(Object obj) {
        C15101a aVar = (C15101a) this.f22092c;
        ((C15101a.C15108g) obj).mo45425w0(aVar.f38817G, this.f22091b, aVar.f38826P);
        return false;
    }
}
