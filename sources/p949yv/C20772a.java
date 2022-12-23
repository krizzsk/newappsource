package p949yv;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import com.moovit.app.share.ShareEntityLink;
import com.moovit.itinerary.model.Itinerary;
import p122i7.C5297a;
import p977zz.C20961r;

/* renamed from: yv.a */
public final class C20772a extends C0989a {

    /* renamed from: c */
    public final C1043v<Itinerary> f52413c;

    /* renamed from: d */
    public final C1040t<C20961r<ShareEntityLink>> f52414d;

    public C20772a(Application application) {
        super(application);
        C1043v<Itinerary> vVar = new C1043v<>();
        this.f52413c = vVar;
        C1040t<C20961r<ShareEntityLink>> tVar = new C1040t<>();
        this.f52414d = tVar;
        tVar.addSource(vVar, new C5297a(this, 2));
    }
}
