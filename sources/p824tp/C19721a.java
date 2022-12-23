package p824tp;

import android.content.ComponentName;
import androidx.appcompat.app.AppCompatActivity;
import com.moovit.app.home.HomeActivity;
import com.tranzmate.moovit.protocol.users.MVPhoneOsTypes;
import p567iq.C17635b;

/* renamed from: tp.a */
public final class C19721a {

    /* renamed from: a */
    public final Class<? extends AppCompatActivity> f50150a;

    /* renamed from: b */
    public final ComponentName f50151b;

    /* renamed from: c */
    public final String f50152c = "5.108.1.564";

    /* renamed from: d */
    public final int f50153d = 564;

    /* renamed from: e */
    public final String f50154e = "moovitWorld";

    /* renamed from: f */
    public final String f50155f = "moovit_2751703405";

    /* renamed from: g */
    public final String f50156g = "moovit";

    /* renamed from: h */
    public final int f50157h;

    /* renamed from: i */
    public final int f50158i;

    /* renamed from: j */
    public final int f50159j;

    public C19721a(C17635b bVar, int i) {
        Class<HomeActivity> cls = HomeActivity.class;
        bVar.getPackageName();
        this.f50150a = cls;
        this.f50151b = new ComponentName(bVar, cls);
        this.f50157h = i;
        this.f50158i = 1;
        this.f50159j = MVPhoneOsTypes.Android.getValue();
    }
}
