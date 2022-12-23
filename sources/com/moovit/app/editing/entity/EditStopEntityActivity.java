package com.moovit.app.editing.entity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.editing.entity.AbstractEditEntityActivity;
import com.moovit.app.editing.transit.EditorChangeState;
import com.moovit.app.editing.transit.EditorTransitStop;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MarkerZoomStyle;
import com.tranzmate.R;
import java.util.EnumSet;
import p425cs.C16484i;
import p425cs.C16488m;

public class EditStopEntityActivity extends AbstractEditEntityActivity {

    /* renamed from: com.moovit.app.editing.entity.EditStopEntityActivity$a */
    public static /* synthetic */ class C14863a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37986a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.editing.entity.AbstractEditEntityActivity$EntityUpdateType[] r0 = com.moovit.app.editing.entity.AbstractEditEntityActivity.EntityUpdateType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37986a = r0
                com.moovit.app.editing.entity.AbstractEditEntityActivity$EntityUpdateType r1 = com.moovit.app.editing.entity.AbstractEditEntityActivity.EntityUpdateType.EDIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37986a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.editing.entity.AbstractEditEntityActivity$EntityUpdateType r1 = com.moovit.app.editing.entity.AbstractEditEntityActivity.EntityUpdateType.REMOVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.editing.entity.EditStopEntityActivity.C14863a.<clinit>():void");
        }
    }

    /* renamed from: N2 */
    public static Intent m37483N2(Context context, EditorTransitStop editorTransitStop, EditorChangeState editorChangeState) {
        Intent intent = new Intent(context, EditStopEntityActivity.class);
        intent.putExtra("extra_transit_stop", editorTransitStop);
        SparseArray<MarkerZoomStyle> c = MarkerZoomStyle.m41440c(editorTransitStop.f37999f);
        Parcelable.Creator<EditableEntityInfo> creator = EditableEntityInfo.CREATOR;
        EditableEntityInfo editableEntityInfo = new EditableEntityInfo(editorTransitStop.f37995b, editorTransitStop.f37996c, editorTransitStop.f37997d, editorTransitStop.f38000g, editorTransitStop.f38001h);
        Bundle extras = intent.getExtras();
        extras.putSparseParcelableArray("extra_entity_markers_zoom_style", c);
        intent.putExtras(extras);
        intent.putExtra("extra_entity_info", editableEntityInfo);
        intent.putExtra("extra_entity_is_new", false);
        intent.putExtra("extraEntityChangeState", editorChangeState);
        return intent;
    }

    /* renamed from: B2 */
    public final String mo44939B2() {
        return getString(R.string.edit_stop_does_not_exist_message);
    }

    /* renamed from: C2 */
    public final EnumSet<AbstractEditEntityActivity.EntityUpdateType> mo44940C2() {
        return EnumSet.of(AbstractEditEntityActivity.EntityUpdateType.EDIT, AbstractEditEntityActivity.EntityUpdateType.REMOVE);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        if (((EditorTransitStop) getIntent().getParcelableExtra("extra_transit_stop")) == null) {
            throw new IllegalStateException("edit stop can not initiated without a transit stop");
        }
    }

    /* renamed from: y2 */
    public final C13778r mo44951y2(AbstractEditEntityActivity.EntityUpdateType entityUpdateType, EditableEntityInfo editableEntityInfo) {
        int i = C14863a.f37986a[entityUpdateType.ordinal()];
        if (i == 1) {
            return new C16488m(mo44548x1(), editableEntityInfo);
        }
        if (i != 2) {
            return null;
        }
        C13752e x1 = mo44548x1();
        return new C16484i(LatLonE6.m40177j(mo44542u1()), editableEntityInfo.f37988b, x1);
    }
}
