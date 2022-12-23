package p644lx;

import android.text.format.DateUtils;
import c00.C13722f;
import com.moovit.app.tod.shuttle.model.TodZoneDaySchedule;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.util.time.C7925b;
import com.tranzmate.moovit.protocol.search.MVSearchResponseItem;
import com.tranzmate.moovit.protocol.search.MVSearchResultType;
import h90.C12739a;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import s60.C19435b;

/* renamed from: lx.g */
public final /* synthetic */ class C18292g implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f46644b;

    public /* synthetic */ C18292g(int i) {
        this.f46644b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        boolean z;
        switch (this.f46644b) {
            case 0:
                int i = C18294i.f46648v;
                long j = ((TodZoneDaySchedule) obj).f40451b;
                SimpleDateFormat simpleDateFormat = C7925b.f23934a;
                return DateUtils.isToday(j);
            case 1:
                int i2 = C19435b.f49435u;
                return !((PaymentProfile) obj).f42833g.isEmpty();
            case 2:
                return MVSearchResultType.STOP.equals(((MVSearchResponseItem) obj).type);
            default:
                C12739a aVar = (C12739a) obj;
                aVar.getClass();
                if (BigDecimal.ZERO.compareTo(aVar.f31469c.f23845c) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                return !z;
        }
    }
}
