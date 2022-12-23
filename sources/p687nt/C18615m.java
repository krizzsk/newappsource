package p687nt;

import android.app.Activity;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.map.MapFragment;
import com.moovit.transit.LocationDescriptor;
import j20.C17706c;
import j20.C17708e;
import p244s3.C6442q;
import p687nt.C18604l;
import p824tp.C19728f;

/* renamed from: nt.m */
public final /* synthetic */ class C18615m implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ C18604l.C18613i f47420a;

    /* renamed from: b */
    public final /* synthetic */ MoovitActivity f47421b;

    /* renamed from: c */
    public final /* synthetic */ C19728f f47422c;

    /* renamed from: d */
    public final /* synthetic */ MapFragment f47423d;

    /* renamed from: e */
    public final /* synthetic */ LocationDescriptor f47424e;

    public /* synthetic */ C18615m(C18604l.C18613i iVar, MoovitActivity moovitActivity, C19728f fVar, MapFragment mapFragment, LocationDescriptor locationDescriptor) {
        this.f47420a = iVar;
        this.f47421b = moovitActivity;
        this.f47422c = fVar;
        this.f47423d = mapFragment;
        this.f47424e = locationDescriptor;
    }

    /* renamed from: a */
    public final void mo21406a() {
        C18604l.C18613i iVar = this.f47420a;
        MoovitActivity moovitActivity = this.f47421b;
        C19728f fVar = this.f47422c;
        MapFragment mapFragment = this.f47423d;
        LocationDescriptor locationDescriptor = this.f47424e;
        iVar.getClass();
        Tasks.call(MoovitExecutors.f37327IO, new C17708e(moovitActivity, fVar, locationDescriptor, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnSuccessListener((Activity) moovitActivity, new C6442q(1, iVar, locationDescriptor));
        mapFragment.mo48641l3(MapFragment.MapFollowMode.NONE, false);
        mapFragment.mo48664z2(locationDescriptor.mo24310d(), mapFragment.f42368n.getMaxZoom());
        ViewPager viewPager = C18604l.this.f47379E;
        if (viewPager != null) {
            viewPager.setCurrentLogicalItem(0);
        }
        C18604l.this.f47381G.setTag(locationDescriptor);
    }
}
