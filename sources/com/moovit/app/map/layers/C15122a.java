package com.moovit.app.map.layers;

import c00.C13722f;
import com.moovit.app.map.layers.MapLayersSettingsAdapter;

/* renamed from: com.moovit.app.map.layers.a */
public final /* synthetic */ class C15122a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f38928b;

    public /* synthetic */ C15122a(int i) {
        this.f38928b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        return (((MapLayersSettingsAdapter.UiMapLayer) obj).mapLayers & this.f38928b) != 0;
    }
}
