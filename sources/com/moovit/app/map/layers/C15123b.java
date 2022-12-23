package com.moovit.app.map.layers;

import android.view.View;
import android.widget.CheckedTextView;
import com.moovit.app.map.layers.MapLayersSettingsAdapter;
import p593ju.C17929e;

/* renamed from: com.moovit.app.map.layers.b */
public final /* synthetic */ class C15123b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MapLayersSettingsAdapter f38929b;

    /* renamed from: c */
    public final /* synthetic */ MapLayersSettingsAdapter.UiMapLayer f38930c;

    public /* synthetic */ C15123b(MapLayersSettingsAdapter mapLayersSettingsAdapter, MapLayersSettingsAdapter.UiMapLayer uiMapLayer) {
        this.f38929b = mapLayersSettingsAdapter;
        this.f38930c = uiMapLayer;
    }

    public final void onClick(View view) {
        MapLayersSettingsAdapter mapLayersSettingsAdapter = this.f38929b;
        MapLayersSettingsAdapter.UiMapLayer uiMapLayer = this.f38930c;
        mapLayersSettingsAdapter.getClass();
        CheckedTextView checkedTextView = (CheckedTextView) view;
        boolean z = !checkedTextView.isChecked();
        checkedTextView.setChecked(z);
        if (z) {
            C17929e eVar = mapLayersSettingsAdapter.f38926g;
            eVar.f45995b.mo49545d(eVar.f45994a, Integer.valueOf(uiMapLayer.mapLayers | eVar.mo50470a()));
            return;
        }
        C17929e eVar2 = mapLayersSettingsAdapter.f38926g;
        eVar2.f45995b.mo49545d(eVar2.f45994a, Integer.valueOf((~uiMapLayer.mapLayers) & eVar2.mo50470a()));
    }
}
