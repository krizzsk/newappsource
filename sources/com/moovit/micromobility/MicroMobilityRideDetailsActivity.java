package com.moovit.micromobility;

import aa0.C7530f;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.commons.utils.UiUtils;
import com.moovit.map.MapFragment;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import java.util.HashSet;
import java.util.Set;
import l30.C5566a0;
import l30.C5577i;
import l30.C5585p;
import l30.C5590s;
import l30.C5591t;
import l30.C5597z;
import p130j2.C5367a;
import p578jf.C17843u;
import p578jf.C17844v;
import p801sq.C19519h;
import p824tp.C19728f;
import p853uu.C19996f;
import p977zz.C20964s0;

public class MicroMobilityRideDetailsActivity extends MoovitMicroMobilityActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f14839Y = 0;

    /* renamed from: U */
    public final C4132a f14840U = new C4132a();

    /* renamed from: X */
    public C5585p f14841X;

    /* renamed from: com.moovit.micromobility.MicroMobilityRideDetailsActivity$a */
    public class C4132a extends BroadcastReceiver {
        public C4132a() {
        }

        public final void onReceive(Context context, Intent intent) {
            MicroMobilityRideDetailsActivity microMobilityRideDetailsActivity = MicroMobilityRideDetailsActivity.this;
            int i = MicroMobilityRideDetailsActivity.f14839Y;
            microMobilityRideDetailsActivity.mo19440z2();
        }
    }

    /* renamed from: A2 */
    public final void mo19437A2() {
        boolean z;
        View findViewById = findViewById(C5597z.trip_details_group);
        TextView x2 = mo44549x2(C5597z.origin);
        TextView x22 = mo44549x2(C5597z.destination);
        if (findViewById != null && x2 != null && x22 != null) {
            int i = 0;
            if (C20964s0.m49090h(x2.getText()) || C20964s0.m49090h(x22.getText())) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C4132a aVar = this.f14840U;
        C5577i iVar = C5577i.f18275d;
        C5367a.m13473a(this).mo21148d(aVar);
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo19440z2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C5566a0.micro_mobility_ride_details_activity);
        View findViewById = findViewById(C5597z.coordinator);
        View findViewById2 = findViewById(C5597z.bottom_sheet_view);
        MapFragment mapFragment = (MapFragment) mo44529n1(C5597z.map_fragment);
        UiUtils.m40259r(findViewById, new C5590s(findViewById, findViewById2, mapFragment));
        this.f14841X = new C5585p(this, (C19728f) mo44537r1("METRO_CONTEXT"), mapFragment);
        C4132a aVar = this.f14840U;
        C5577i iVar = C5577i.f18275d;
        C5367a.m13473a(this).mo21146b(aVar, new IntentFilter("com.moovit.micromobility.action.updated"));
        mo19440z2();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("METRO_CONTEXT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo19439y2(TextView textView, LocationDescriptor locationDescriptor) {
        C7530f.m17272e(this, (C19728f) mo44537r1("METRO_CONTEXT"), locationDescriptor).addOnSuccessListener((Activity) this, new C17843u(textView, 8)).addOnFailureListener((Activity) this, (OnFailureListener) new C17844v(textView, 5)).addOnCompleteListener((Activity) this, new C19519h(this, 5));
    }

    /* renamed from: z2 */
    public final void mo19440z2() {
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("rideId");
        if (serverId != null) {
            C5577i.m13786a().mo21403d(serverId).addOnSuccessListener((Activity) this, new C19996f(this, 3)).addOnFailureListener((Activity) this, (OnFailureListener) new C5591t(this, 0));
            return;
        }
        throw new IllegalStateException("Did you use createStartingIntent(...)?");
    }
}
