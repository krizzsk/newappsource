package com.moovit.map;

import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.app.ads.mapitem.MapItemAdBottomSheetDialog;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import com.tranzmate.R;
import mf0.C24362h;
import o20.C18698d;
import o20.C18704j;
import p480ez.C16910b;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19747y;

/* renamed from: com.moovit.map.c */
public abstract class C16255c<A extends MoovitActivity> extends C15676b<A> {

    /* renamed from: j */
    public static final /* synthetic */ int f42468j = 0;

    /* renamed from: h */
    public Rect f42469h = null;

    /* renamed from: i */
    public final Rect f42470i = new Rect();

    public C16255c() {
        super(MoovitActivity.class);
        setStyle(0, C19747y.ThemeOverlay_Moovit_BottomSheetDialog_NoDim);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext(), getTheme());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C19742t.map_bottom_sheet_dialog, viewGroup, false);
        viewGroup2.setOnClickListener(new C16910b(this, 3));
        viewGroup2.setSoundEffectsEnabled(false);
        ImageView imageView = (ImageView) viewGroup2.findViewById(C19740r.handle);
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new C18698d(this, imageView));
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C19740r.container);
        View inflate = layoutInflater.inflate(R.layout.map_item_ad_bottom_sheet_dialog, viewGroup3, false);
        C24362h.m61210e(inflate, "inflater.inflate(R.layou…dialog, container, false)");
        viewGroup3.addView(inflate);
        return viewGroup2;
    }

    public void onDestroyView() {
        super.onDestroyView();
        C18704j jVar = (C18704j) mo46751J1();
        if (jVar != null) {
            MapFragment X = jVar.mo50993X();
            C16277g x = jVar.mo50997x();
            Rect rect = this.f42469h;
            if (rect != null) {
                X.mo48647o3(rect);
                this.f42469h = null;
            }
            if (x != null) {
                x.f42540g.remove((LatLonE6) ((MapItemAdBottomSheetDialog) this).f37548n.getValue());
            }
            C24362h.m61211f(X, "mapFragment");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C18704j jVar = (C18704j) mo46751J1();
        if (jVar != null) {
            MapFragment X = jVar.mo50993X();
            C16277g x = jVar.mo50997x();
            LatLonE6 latLonE6 = (LatLonE6) ((MapItemAdBottomSheetDialog) this).f37548n.getValue();
            X.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            X.mo48664z2(latLonE6, 19.0f);
            if (x != null) {
                x.f42540g.add(latLonE6);
            }
        }
    }
}
