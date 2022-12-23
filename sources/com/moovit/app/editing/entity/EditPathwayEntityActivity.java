package com.moovit.app.editing.entity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import c70.C13778r;
import com.moovit.app.editing.entity.AbstractEditEntityActivity;
import com.moovit.app.editing.transit.EditorTransitStopPathway;
import com.moovit.design.view.list.ListItemView;
import com.moovit.map.C16281i;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.TransitStopPathway;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.EnumSet;
import m00.C18310d;
import p395bs.C13680f;
import p425cs.C16476a;
import p425cs.C16482g;
import p425cs.C16486k;
import p824tp.C19739q;

public class EditPathwayEntityActivity extends AbstractEditEntityActivity {

    /* renamed from: H0 */
    public static final /* synthetic */ int f37982H0 = 0;

    /* renamed from: F0 */
    public EditorTransitStopPathway f37983F0;

    /* renamed from: G0 */
    public Spinner f37984G0;

    /* renamed from: com.moovit.app.editing.entity.EditPathwayEntityActivity$a */
    public static /* synthetic */ class C14861a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37985a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.editing.entity.AbstractEditEntityActivity$EntityUpdateType[] r0 = com.moovit.app.editing.entity.AbstractEditEntityActivity.EntityUpdateType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37985a = r0
                com.moovit.app.editing.entity.AbstractEditEntityActivity$EntityUpdateType r1 = com.moovit.app.editing.entity.AbstractEditEntityActivity.EntityUpdateType.EDIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37985a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.editing.entity.AbstractEditEntityActivity$EntityUpdateType r1 = com.moovit.app.editing.entity.AbstractEditEntityActivity.EntityUpdateType.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37985a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.editing.entity.AbstractEditEntityActivity$EntityUpdateType r1 = com.moovit.app.editing.entity.AbstractEditEntityActivity.EntityUpdateType.REMOVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.editing.entity.EditPathwayEntityActivity.C14861a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.editing.entity.EditPathwayEntityActivity$b */
    public static class C14862b extends C18310d<Integer, ListItemView, Void> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14862b(Context context) {
            super(context, R.layout.spinner_list_item, R.layout.spinner_list_item_dropdown, Arrays.asList(new Integer[]{3, 1, 2}));
            Parcelable.Creator<TransitStopPathway> creator = TransitStopPathway.CREATOR;
        }

        /* renamed from: d */
        public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
            int i2;
            ListItemView listItemView = (ListItemView) view;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            Parcelable.Creator<TransitStopPathway> creator = TransitStopPathway.CREATOR;
            if (intValue == 1) {
                i2 = C19739q.ic_pathway_entrance_16_on_surface_emphasis_high;
            } else if (intValue == 2) {
                i2 = C19739q.ic_pathway_exit_16_on_surface_emphasis_high;
            } else if (intValue != 3) {
                i2 = 0;
            } else {
                i2 = C19739q.ic_pathway_both_16_on_surface_emphasis_high;
            }
            listItemView.setIcon(i2);
            listItemView.setText(TransitStopPathway.m17847b(num.intValue()));
        }
    }

    /* renamed from: N2 */
    public static Intent m37473N2(Context context, EditorTransitStopPathway editorTransitStopPathway, boolean z) {
        Intent intent = new Intent(context, EditPathwayEntityActivity.class);
        intent.putExtra("extra_transit_stop_pathway", editorTransitStopPathway);
        MarkerZoomStyle j = C16281i.m41514j(editorTransitStopPathway.f23749c, false);
        Parcelable.Creator<EditableEntityInfo> creator = EditableEntityInfo.CREATOR;
        EditableEntityInfo editableEntityInfo = new EditableEntityInfo(editorTransitStopPathway.f23748b, editorTransitStopPathway.f23750d, editorTransitStopPathway.f23751e, editorTransitStopPathway.f38005i, editorTransitStopPathway.f38006j);
        intent.putExtra("extra_entity_marker_zoom_style", j);
        intent.putExtra("extra_entity_info", editableEntityInfo);
        intent.putExtra("extra_entity_is_new", z);
        intent.putExtra("extraEntityChangeState", (Parcelable) null);
        return intent;
    }

    /* renamed from: B2 */
    public final String mo44939B2() {
        return getString(R.string.edit_stop_pathway_does_not_exist_message);
    }

    /* renamed from: C2 */
    public final EnumSet<AbstractEditEntityActivity.EntityUpdateType> mo44940C2() {
        return EnumSet.of(AbstractEditEntityActivity.EntityUpdateType.EDIT, AbstractEditEntityActivity.EntityUpdateType.ADD, AbstractEditEntityActivity.EntityUpdateType.REMOVE);
    }

    /* renamed from: D2 */
    public final void mo44941D2() {
        if (this.f37971w0) {
            getSupportActionBar().mo800v(R.string.add_stop_pathway_activity_title);
        }
    }

    /* renamed from: F2 */
    public final boolean mo44943F2() {
        if (mo44944G2(false) || mo44955O2() != this.f37983F0.f23749c) {
            return true;
        }
        return false;
    }

    /* renamed from: O2 */
    public final int mo44955O2() {
        return ((Integer) this.f37984G0.getSelectedItem()).intValue();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        EditorTransitStopPathway editorTransitStopPathway = (EditorTransitStopPathway) getIntent().getParcelableExtra("extra_transit_stop_pathway");
        this.f37983F0 = editorTransitStopPathway;
        if (editorTransitStopPathway != null) {
            Spinner spinner = (Spinner) findViewById(R.id.type_picker);
            this.f37984G0 = spinner;
            spinner.setAdapter(new C14862b(this));
            this.f37984G0.setOnItemSelectedListener(new C13680f(this));
            return;
        }
        throw new IllegalStateException("edit stop pathway can not initiated without a transit stop pathway");
    }

    /* renamed from: y2 */
    public final C13778r mo44951y2(AbstractEditEntityActivity.EntityUpdateType entityUpdateType, EditableEntityInfo editableEntityInfo) {
        int i = C14861a.f37985a[entityUpdateType.ordinal()];
        if (i == 1) {
            return new C16486k(mo44548x1(), editableEntityInfo, mo44955O2());
        }
        if (i == 2) {
            return new C16476a(mo44548x1(), editableEntityInfo, mo44955O2());
        }
        if (i != 3) {
            return null;
        }
        return new C16482g(editableEntityInfo.f37988b, mo44548x1());
    }

    /* renamed from: z2 */
    public final View mo44952z2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.edit_stop_pathway_extra_view_layout, viewGroup, false);
    }
}
