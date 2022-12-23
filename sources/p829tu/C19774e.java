package p829tu;

import com.moovit.app.tod.C15462b;
import com.moovit.app.tod.model.TodRide;
import com.moovit.util.time.Time;
import java.util.Comparator;
import p977zz.C20975x0;

/* renamed from: tu.e */
public final /* synthetic */ class C19774e implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f50265b;

    /* renamed from: c */
    public final /* synthetic */ long f50266c;

    public /* synthetic */ C19774e(long j, int i) {
        this.f50265b = i;
        this.f50266c = j;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f50265b) {
            case 0:
                long j = this.f50266c;
                return Long.compare(Math.abs(j - ((Time) obj).mo24631g()), Math.abs(j - ((Time) obj2).mo24631g()));
            default:
                long j2 = this.f50266c;
                int i = C15462b.f40053x;
                return C20975x0.m49115b(Math.abs(j2 - ((TodRide) obj).f40265c), Math.abs(j2 - ((TodRide) obj2).f40265c));
        }
    }
}
