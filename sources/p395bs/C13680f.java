package p395bs;

import android.view.View;
import android.widget.AdapterView;
import com.moovit.app.editing.entity.EditPathwayEntityActivity;
import com.moovit.map.C16281i;
import com.moovit.map.MarkerZoomStyle;

/* renamed from: bs.f */
public final class C13680f implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ EditPathwayEntityActivity f33713b;

    public C13680f(EditPathwayEntityActivity editPathwayEntityActivity) {
        this.f33713b = editPathwayEntityActivity;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        EditPathwayEntityActivity editPathwayEntityActivity = this.f33713b;
        int i2 = EditPathwayEntityActivity.f37982H0;
        MarkerZoomStyle j2 = C16281i.m41514j(editPathwayEntityActivity.mo44955O2(), false);
        if (j2 != null) {
            editPathwayEntityActivity.f37973y0 = true;
            editPathwayEntityActivity.mo44950M2(j2);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
