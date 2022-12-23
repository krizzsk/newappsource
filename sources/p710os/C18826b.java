package p710os;

import com.moovit.app.general.settings.map.MapSettingsActivity;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.design.view.list.ListItemView;
import p593ju.C17929e;

/* renamed from: os.b */
public final /* synthetic */ class C18826b implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ MapSettingsActivity f47933a;

    /* renamed from: b */
    public final /* synthetic */ C17929e f47934b;

    /* renamed from: c */
    public final /* synthetic */ int f47935c;

    /* renamed from: d */
    public final /* synthetic */ ListItemView f47936d;

    public /* synthetic */ C18826b(MapSettingsActivity mapSettingsActivity, C17929e eVar, int i, ListItemView listItemView) {
        this.f47933a = mapSettingsActivity;
        this.f47934b = eVar;
        this.f47935c = i;
        this.f47936d = listItemView;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        MapSettingsActivity mapSettingsActivity = this.f47933a;
        C17929e eVar = this.f47934b;
        int i = this.f47935c;
        ListItemView listItemView = this.f47936d;
        int i2 = MapSettingsActivity.f38056U;
        mapSettingsActivity.getClass();
        if (z) {
            eVar.f45995b.mo49545d(eVar.f45994a, Integer.valueOf(eVar.mo50470a() | i));
        } else {
            eVar.f45995b.mo49545d(eVar.f45994a, Integer.valueOf(eVar.mo50470a() & (~i)));
        }
        mapSettingsActivity.mo45003y2(listItemView);
    }
}
