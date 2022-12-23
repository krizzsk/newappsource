package com.moovit.app.map.layers;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import p593ju.C17929e;

public final class MapLayersSettingsAdapter extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C17929e f38926g;

    /* renamed from: h */
    public final List<UiMapLayer> f38927h;

    public enum UiMapLayer {
        STATIONS(4, R.drawable.map_settings_popup_layer_stations_selector, R.string.map_settings_popup_layer_stations_space),
        BICYCLES_STATIONS(16, R.drawable.map_settings_popup_layer_bicycles_selector, R.string.map_settings_popup_layer_shared_bicycles_space),
        BICYCLES_REPAIR(2048, R.drawable.map_settings_popup_layer_bicycles_repair_selector, R.string.map_settings_popup_layer_repair_bicycles_space),
        DOCKLESS_BICYCLES(32, R.drawable.map_settings_popup_layer_dockless_bicycles_selector, R.string.map_settings_popup_layer_dockless_bicycles_space),
        KICK_SCOOTERS(64, R.drawable.map_settings_popup_layer_kick_scooters_selector, R.string.map_settings_popup_layer_kick_scooters_space),
        ELECTRIC_SCOOTERS(RecyclerView.C1119a0.FLAG_IGNORE, R.drawable.map_settings_popup_layer_scooters_selector, R.string.map_settings_popup_layer_electric_scooters_space),
        ELECTRIC_MOPEDS(256, R.drawable.map_settings_popup_layer_mopeds_selector, R.string.map_settings_popup_layer_moped_space),
        CARS(1536, R.drawable.map_settings_popup_layer_cars_selector, R.string.map_settings_popup_layer_cars_space);
        
        public final int imageResId;
        public final int mapLayers;
        public int textResId;

        private UiMapLayer(int i, int i2, int i3) {
            this.mapLayers = i;
            this.imageResId = i2;
            this.textResId = i3;
        }
    }

    public MapLayersSettingsAdapter(Context context, ArrayList arrayList) {
        this.f38926g = new C17929e(context);
        this.f38927h = arrayList;
    }

    public final int getItemCount() {
        return this.f38927h.size();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        UiMapLayer uiMapLayer = this.f38927h.get(i);
        CheckedTextView checkedTextView = (CheckedTextView) ((C12797f) a0Var).mo39639f(R.id.item);
        boolean z = false;
        checkedTextView.setCompoundDrawablesWithIntrinsicBounds(0, uiMapLayer.imageResId, 0, 0);
        checkedTextView.setText(uiMapLayer.textResId);
        C17929e eVar = this.f38926g;
        if ((eVar.mo50470a() & uiMapLayer.mapLayers) != 0) {
            z = true;
        }
        checkedTextView.setChecked(z);
        checkedTextView.setOnClickListener(new C15123b(this, uiMapLayer));
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, R.layout.map_settings_popup_list_item, viewGroup, false));
    }
}
