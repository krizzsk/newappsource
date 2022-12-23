package com.moovit.map;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.moovit.MoovitActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import ga0.C12717o;
import o20.C18704j;

/* renamed from: com.moovit.map.h */
public abstract class C16280h<A extends MoovitActivity> extends C12717o<A> {

    /* renamed from: s */
    public Rect f42546s = null;

    /* renamed from: t */
    public final Rect f42547t = new Rect();

    /* renamed from: Z1 */
    public abstract LatLonE6 mo22567Z1();

    /* renamed from: a2 */
    public abstract void mo22568a2(MapFragment mapFragment);

    /* renamed from: b2 */
    public abstract void mo22569b2(MapFragment mapFragment);

    public final void onDestroyView() {
        super.onDestroyView();
        C18704j jVar = (C18704j) mo46751J1();
        if (jVar != null) {
            MapFragment X = jVar.mo50993X();
            C16277g x = jVar.mo50997x();
            Rect rect = this.f42546s;
            if (rect != null) {
                X.mo48647o3(rect);
                this.f42546s = null;
            }
            if (x != null) {
                x.f42540g.remove(mo22567Z1());
            }
            mo22568a2(X);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C18704j jVar = (C18704j) mo46751J1();
        if (jVar != null) {
            MapFragment X = jVar.mo50993X();
            C16277g x = jVar.mo50997x();
            LatLonE6 Z1 = mo22567Z1();
            X.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            X.mo48664z2(Z1, 19.0f);
            if (x != null) {
                x.f42540g.add(Z1);
            }
            mo22569b2(X);
        }
    }
}
