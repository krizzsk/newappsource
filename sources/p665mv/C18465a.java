package p665mv;

import android.os.Parcelable;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.image.model.ResourceImage;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.ridesharing.model.Event;
import p693nz.C18659h;
import p824tp.C19739q;
import p927xw.C20637f;

/* renamed from: mv.a */
public final /* synthetic */ class C18465a implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f47058a;

    /* renamed from: b */
    public final /* synthetic */ Object f47059b;

    /* renamed from: c */
    public final /* synthetic */ Parcelable f47060c;

    public /* synthetic */ C18465a(Object obj, Parcelable parcelable, int i) {
        this.f47058a = i;
        this.f47059b = obj;
        this.f47060c = parcelable;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f47058a) {
            case 0:
                EventDetailActivity eventDetailActivity = (EventDetailActivity) this.f47059b;
                Event event = (Event) this.f47060c;
                eventDetailActivity.f39276r0.mo48609E2();
                eventDetailActivity.f39276r0.mo48646o2(event, event, new MarkerZoomStyle(new ResourceImage(C19739q.ic_map_pin_36_secondary, new String[0])));
                eventDetailActivity.f39276r0.mo48663x2(event.f42916g);
                return;
            default:
                C18659h<String, Polyline> hVar = C20637f.f52176u;
                ((C20637f) this.f47059b).mo52816a((BoxE6) this.f47060c);
                return;
        }
    }
}
