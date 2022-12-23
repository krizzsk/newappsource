package i20;

import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;

/* renamed from: i20.h */
public final /* synthetic */ class C17546h implements C16202a.C16205c {

    /* renamed from: b */
    public final /* synthetic */ int f45138b;

    /* renamed from: c */
    public final /* synthetic */ LocationSettingsFixer f45139c;

    public /* synthetic */ C17546h(LocationSettingsFixer locationSettingsFixer, int i) {
        this.f45138b = i;
        this.f45139c = locationSettingsFixer;
    }

    /* renamed from: h */
    public final void mo5770h(int i, Object obj) {
        switch (this.f45138b) {
            case 0:
                this.f45139c.mo48522c((MoovitActivity) obj, (C15682c<?>) null, i, true);
                return;
            default:
                LocationSettingsFixer locationSettingsFixer = this.f45139c;
                C15682c cVar = (C15682c) obj;
                locationSettingsFixer.getClass();
                locationSettingsFixer.mo48521b(cVar.f40822c, cVar, i);
                return;
        }
    }
}
