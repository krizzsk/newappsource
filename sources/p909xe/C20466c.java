package p909xe;

import com.google.firebase.heartbeatinfo.C14458a;
import com.moovit.MoovitApplication;
import com.moovit.payment.account.deposit.C25643a;
import java.util.concurrent.Callable;
import l30.C5577i;

/* renamed from: xe.c */
public final /* synthetic */ class C20466c implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f51835b;

    /* renamed from: c */
    public final /* synthetic */ Object f51836c;

    public /* synthetic */ C20466c(Object obj, int i) {
        this.f51835b = i;
        this.f51836c = obj;
    }

    public final Object call() {
        switch (this.f51835b) {
            case 0:
                C14458a aVar = (C14458a) this.f51836c;
                synchronized (aVar) {
                    aVar.f36525a.get().mo52667h(System.currentTimeMillis(), aVar.f36527c.get().mo52184a());
                }
                return null;
            case 1:
                return C5577i.m13787c(((C5577i) this.f51836c).f18277a);
            default:
                return C25643a.m64099a((MoovitApplication) ((C25643a) this.f51836c).f3907b);
        }
    }
}
