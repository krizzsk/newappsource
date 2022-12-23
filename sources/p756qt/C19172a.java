package p756qt;

import android.content.Intent;
import com.moovit.MoovitActivity;
import com.moovit.app.intro.FirstTimeUseActivityImpl;
import com.moovit.app.intro.FirstTimeUseTermsAndConditionsActivity;
import com.moovit.app.intro.getstarted.GetStartedFirstTimeUseActivity;
import com.moovit.location.C16202a;
import p373au.C13521a;
import p977zz.C20949l;

/* renamed from: qt.a */
public final /* synthetic */ class C19172a implements C16202a.C16205c, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f48754b;

    /* renamed from: c */
    public final /* synthetic */ Object f48755c;

    public /* synthetic */ C19172a(Object obj, int i) {
        this.f48755c = obj;
        this.f48754b = i;
    }

    /* renamed from: h */
    public final void mo5770h(int i, Object obj) {
        FirstTimeUseActivityImpl firstTimeUseActivityImpl = (FirstTimeUseActivityImpl) this.f48755c;
        int i2 = this.f48754b;
        MoovitActivity moovitActivity = (MoovitActivity) obj;
        int i3 = FirstTimeUseActivityImpl.f38447q0;
        firstTimeUseActivityImpl.getClass();
        GetStartedFirstTimeUseActivity.m37960B2();
        int i4 = FirstTimeUseTermsAndConditionsActivity.f38448X;
        Intent intent = new Intent(firstTimeUseActivityImpl, FirstTimeUseTermsAndConditionsActivity.class);
        intent.putExtra("type", i2);
        firstTimeUseActivityImpl.startActivity(intent);
    }

    public final boolean invoke(Object obj) {
        ((C13521a.C13525b) obj).mo40416m(((C13521a) this.f48755c).f33439h, this.f48754b);
        return false;
    }
}
