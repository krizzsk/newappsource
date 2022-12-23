package com.moovit.app.itinerary.schedule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c70.C13752e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.location.C16202a;
import com.tranzmate.R;
import ja0.C12793c;
import java.util.HashSet;
import o00.C18681n;
import p484ff.C16978i0;
import p824tp.C19728f;
import p858uz.C20061g;
import p971zt.C20891a;

public class ItineraryScheduleActivity extends MoovitAppActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f38618Z = 0;

    /* renamed from: U */
    public C20891a f38619U;

    /* renamed from: X */
    public Itinerary f38620X;

    /* renamed from: Y */
    public int f38621Y;

    /* renamed from: y2 */
    public static Intent m38143y2(MoovitAppActivity moovitAppActivity, Itinerary itinerary, int i) {
        Intent intent = new Intent(moovitAppActivity, ItineraryScheduleActivity.class);
        intent.putExtra("itinerary", itinerary);
        intent.putExtra("waitLegIndex", i);
        return intent;
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f38619U.mo23803d();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.itineray_schedule_activity);
        Intent intent = getIntent();
        this.f38620X = (Itinerary) intent.getParcelableExtra("itinerary");
        int intExtra = intent.getIntExtra("waitLegIndex", -1);
        this.f38621Y = intExtra;
        if (this.f38620X == null || intExtra == -1) {
            throw new IllegalStateException("Did you use ItineraryScheduleActivity.createStartIntent(...)");
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        sparseIntArray.put(1, R.drawable.divider_horizontal);
        sparseIntArray.put(2, R.drawable.divider_horizontal);
        sparseIntArray.put(3, R.drawable.divider_horizontal);
        recyclerView.mo4593g(new C18681n(this, sparseIntArray, false), -1);
        recyclerView.setAdapter(new C12793c());
        C20891a aVar = new C20891a(this, this);
        this.f38619U = aVar;
        aVar.mo49466h(this.f38620X);
        mo45326z2();
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo44542u1());
        hVar.mo44745a(2, this.f38620X.mo48290c().mo48334e2().mo24310d());
        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.ITINERARY_SCHEDULE_SCREEN_BANNER, hVar);
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        this.f38619U.mo23804e();
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: z2 */
    public final void mo45326z2() {
        C13752e x1 = mo44548x1();
        HashSet hashSet = C19728f.f50164e;
        Tasks.call(MoovitExecutors.COMPUTATION, new C15065a(x1, (C19728f) getSystemService("metro_context"), this.f38620X, this.f38621Y, this.f38619U.f43661l)).addOnCompleteListener((Activity) this, new C16978i0(this, 1));
    }
}
