package com.moovit.app.stopdetail;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import c00.C13717b;
import c70.C13752e;
import c70.C13753f;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.gallery.GalleryActivity;
import com.moovit.app.gallery.GalleryImageInfo;
import com.moovit.location.C16202a;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPathway;
import com.tranzmate.R;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import i30.C5271f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p453dw.C16738n;
import p543hq.C17474b;
import p824tp.C19728f;
import p858uz.C20061g;
import p906wz.C20436g;
import p977zz.C20975x0;

public class StopGalleryActivity extends GalleryActivity {

    /* renamed from: n0 */
    public static final /* synthetic */ int f39690n0 = 0;

    /* renamed from: Z */
    public ServerId f39691Z;

    /* renamed from: l0 */
    public TransitStop f39692l0;

    /* renamed from: m0 */
    public C16738n f39693m0;

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        this.f39692l0 = (TransitStop) ((C5271f) C13717b.m34256c(list)).f17402n;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        this.f39691Z = (ServerId) getIntent().getParcelableExtra("stopId");
        this.f39693m0 = C16738n.m42285w2(getSupportFragmentManager());
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        C13752e x1 = mo44548x1();
        HashSet hashSet = C19728f.f50164e;
        String simpleName = getClass().getSimpleName();
        C4776h hVar = ((C19728f) getSystemService("metro_context")).f50165a;
        C5269e eVar = new C5269e();
        C21100e.m49373x(x1, "requestContext");
        C21100e.m49373x(hVar, "metroInfo");
        eVar.mo21066a(MetroEntityType.TRANSIT_STOP, this.f39691Z);
        C5267c cVar = new C5267c(x1, simpleName, hVar, eVar);
        return new C13753f<>(cVar.mo21061O(), cVar);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareMedAccuracyInfrequentUpdates();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("stopId");
        this.f39691Z = serverId;
        m1.mo49937e(AnalyticsAttributeKey.STOP_ID, serverId);
        return m1;
    }

    /* renamed from: y2 */
    public final ArrayList mo44973y2() {
        ArrayList<StopImage> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("stopImages");
        TransitStop transitStop = this.f39692l0;
        Parcelable.Creator<GalleryImageInfo> creator = GalleryImageInfo.CREATOR;
        ArrayList arrayList = new ArrayList(parcelableArrayListExtra.size());
        for (StopImage stopImage : parcelableArrayListExtra) {
            if (C20975x0.m49118e(transitStop.f23730b, stopImage.f39696b)) {
                arrayList.add(GalleryImageInfo.m37503b(this, stopImage, transitStop));
            } else {
                List<TransitStopPathway> list = transitStop.f23739k;
                SparseArray sparseArray = new SparseArray(list.size());
                for (TransitStopPathway next : list) {
                    sparseArray.put(next.f23748b.f15142b, next);
                }
                TransitStopPathway transitStopPathway = (TransitStopPathway) sparseArray.get(stopImage.f39696b.f15142b);
                if (transitStopPathway != null) {
                    Resources resources = getResources();
                    GalleryImageInfo galleryImageInfo = r7;
                    GalleryImageInfo galleryImageInfo2 = new GalleryImageInfo(stopImage.f39697c, transitStopPathway.f23750d, resources.getString(TransitStopPathway.m17847b(transitStopPathway.f23749c)), getResources().getString(R.string.community_attribution_taken_by, new Object[]{stopImage.f39701g}), stopImage.f39698d, stopImage.f39699e, stopImage.f39700f);
                    arrayList.add(galleryImageInfo);
                } else {
                    arrayList.add(GalleryImageInfo.m37503b(this, stopImage, transitStop));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z2 */
    public final void mo44974z2() {
        this.f39693m0.mo49424y2(this, this.f39691Z);
    }
}
