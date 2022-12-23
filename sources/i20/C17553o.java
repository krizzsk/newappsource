package i20;

import com.moovit.MoovitActivity;
import com.moovit.location.LocationSettingsFixer;
import p977zz.C20935e;
import p977zz.C20961r;

/* renamed from: i20.o */
public final /* synthetic */ class C17553o implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ LocationSettingsFixer f45152b;

    /* renamed from: c */
    public final /* synthetic */ MoovitActivity f45153c;

    public /* synthetic */ C17553o(LocationSettingsFixer locationSettingsFixer, MoovitActivity moovitActivity) {
        this.f45152b = locationSettingsFixer;
        this.f45153c = moovitActivity;
    }

    public final void invoke(Object obj) {
        LocationSettingsFixer locationSettingsFixer = this.f45152b;
        MoovitActivity moovitActivity = this.f45153c;
        locationSettingsFixer.getClass();
        if (((Integer) obj).intValue() == 0) {
            locationSettingsFixer.mo48525f(moovitActivity);
        } else {
            locationSettingsFixer.f42247a.postValue(new C20961r((Exception) new LocationSettingsFixer.LocationSettingFixerException(5)));
        }
    }
}
