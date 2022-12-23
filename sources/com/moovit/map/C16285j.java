package com.moovit.map;

import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import com.android.billingclient.api.C1963s;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import com.moovit.developeroptions.ExtraTileLayer;
import com.moovit.map.MapFragment;
import java.util.List;
import o20.C18696b;
import o20.C18711q;
import o20.C18713s;
import o20.C18714t;
import o20.C18715u;
import p072e6.C4565c;
import p20.C18874c;

/* renamed from: com.moovit.map.j */
public interface C16285j {
    /* renamed from: A */
    void mo48778A(boolean z);

    /* renamed from: B */
    void mo48779B(C18696b<C18713s> bVar);

    /* renamed from: C */
    float mo48780C();

    /* renamed from: D */
    void mo48781D(MapFragment.MapFollowMode mapFollowMode);

    /* renamed from: E */
    void mo48782E(boolean z);

    /* renamed from: F */
    C18711q mo48783F();

    /* renamed from: a */
    Polylon mo48784a(Rect rect);

    /* renamed from: b */
    C18874c.C18876b mo48785b();

    /* renamed from: c */
    void mo48786c(List<ExtraTileLayer> list);

    /* renamed from: d */
    void mo48787d(LatLonE6 latLonE6, float f);

    /* renamed from: e */
    void mo48788e(Object obj);

    /* renamed from: f */
    void mo48789f(C16245a aVar);

    /* renamed from: g */
    void mo48790g(int i, float f, float f2, int i2);

    float getMaxZoom();

    MapFragmentView getView();

    /* renamed from: h */
    BoxE6 mo48793h();

    boolean isReady();

    /* renamed from: j */
    void mo48795j();

    /* renamed from: k */
    void mo48796k(float f);

    /* renamed from: l */
    void mo48797l(boolean z);

    /* renamed from: m */
    void mo48798m(boolean z);

    /* renamed from: n */
    C1963s mo48799n();

    /* renamed from: o */
    LatLonE6 mo48800o();

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    /* renamed from: p */
    C18696b<C18713s> mo48808p();

    /* renamed from: q */
    void mo48809q(int i, int i2, int i3, int i4);

    /* renamed from: r */
    void mo48810r(Location location);

    /* renamed from: s */
    C18696b<C18714t> mo48811s();

    /* renamed from: t */
    void mo48812t(boolean z);

    /* renamed from: u */
    void mo48813u(C4565c cVar);

    /* renamed from: v */
    MapOverlaysLayout mo48814v();

    /* renamed from: w */
    C18696b<C18715u> mo48815w();

    /* renamed from: x */
    C18711q mo48816x(int i);

    /* renamed from: y */
    void mo48817y(boolean z);

    /* renamed from: z */
    float mo48818z();
}
