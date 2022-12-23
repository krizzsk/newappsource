package com.moovit.map.google;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MapImplType;
import o20.C18710p;
import q00.C19047a;
import s20.C19408h;

public class GoogleMapsFactory extends C18710p {
    /* renamed from: a */
    public final MapImplType mo48771a() {
        return MapImplType.GOOGLE;
    }

    /* renamed from: b */
    public final void mo48772b() {
    }

    /* renamed from: c */
    public final C16285j mo48773c(MapFragment mapFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C19047a aVar) {
        return new C19408h(mapFragment, layoutInflater, viewGroup, bundle, aVar);
    }
}
