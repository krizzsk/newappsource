package b50;

import androidx.lifecycle.C0989a;
import com.moovit.MoovitApplication;
import com.moovit.payment.account.deposit.C25643a;
import java.math.BigDecimal;
import java.util.concurrent.Callable;
import w50.C20283g;

/* renamed from: b50.f */
public final /* synthetic */ class C25549f implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f63805b;

    /* renamed from: c */
    public final /* synthetic */ C0989a f63806c;

    public /* synthetic */ C25549f(C0989a aVar, int i) {
        this.f63805b = i;
        this.f63806c = aVar;
    }

    public final Object call() {
        switch (this.f63805b) {
            case 0:
                return C25643a.m64099a((MoovitApplication) ((C25643a) this.f63806c).f3907b);
            default:
                BigDecimal bigDecimal = C20283g.f51427r;
                return C20283g.m47846f((MoovitApplication) ((C20283g) this.f63806c).f3907b);
        }
    }
}
