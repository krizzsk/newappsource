package p531he;

import android.view.View;
import c00.C13721e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.app.tod.shuttle.model.TodZoneDaySchedule;
import com.moovit.location.FusedLocationSources;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7925b;
import com.moovit.view.address.AddressInputView;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodSelectedProfile;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p596jx.C17962k;
import p644lx.C18294i;
import p664mu.C18437c;

/* renamed from: he.f0 */
public final /* synthetic */ class C17399f0 implements Continuation, C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f44816b;

    /* renamed from: c */
    public final /* synthetic */ Object f44817c;

    public /* synthetic */ C17399f0(Object obj, int i) {
        this.f44816b = i;
        this.f44817c = obj;
    }

    public Object convert(Object obj) {
        switch (this.f44816b) {
            case 0:
                C18437c.C18438a aVar = (C18437c.C18438a) obj;
                return new C18437c.C18440b((ServerId) this.f44817c, aVar.f47005b, aVar.f47007d);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                int i = C17962k.f46034B;
                ((C17962k) this.f44817c).getClass();
                int i2 = ((ServerId) entry.getKey()).f15142b;
                int intValue = ((Integer) entry.getValue()).intValue();
                MVTodSelectedProfile mVTodSelectedProfile = new MVTodSelectedProfile();
                mVTodSelectedProfile.profileId = i2;
                mVTodSelectedProfile.mo33793h();
                mVTodSelectedProfile.quantity = intValue;
                mVTodSelectedProfile.mo33795i();
                return mVTodSelectedProfile;
            case 2:
                int i3 = C18294i.f46648v;
                return C7925b.m18022j(((View) this.f44817c).getContext(), ((TodZoneDaySchedule) obj).f40451b);
            default:
                String str = (String) obj;
                int i4 = AddressInputView.f24023t;
                return new AddressInputView.C7938e(new Locale(((Locale) this.f44817c).getLanguage(), str).getDisplayCountry(), str);
        }
    }

    public Object then(Task task) {
        switch (this.f44816b) {
            case 0:
                ((CountDownLatch) this.f44817c).countDown();
                return null;
            default:
                return ((FusedLocationSources) this.f44817c).toLocationSettings(task);
        }
    }
}
