package p662ms;

import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.app.general.more.DrawerFragment;
import com.moovit.app.wondo.tickets.model.WondoCampaign;
import com.moovit.design.view.list.ListItemView;

/* renamed from: ms.c */
public final /* synthetic */ class C18431c implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ ListItemView f46990b;

    /* renamed from: c */
    public final /* synthetic */ boolean f46991c;

    public /* synthetic */ C18431c(ListItemView listItemView, boolean z) {
        this.f46990b = listItemView;
        this.f46991c = z;
    }

    public final void onSuccess(Object obj) {
        WondoCampaign wondoCampaign;
        int i;
        ListItemView listItemView = this.f46990b;
        boolean z = this.f46991c;
        WondoCampaign wondoCampaign2 = (WondoCampaign) obj;
        int i2 = DrawerFragment.f38045t;
        if (z) {
            wondoCampaign = null;
        } else {
            wondoCampaign = wondoCampaign2;
        }
        listItemView.setTag(wondoCampaign);
        if (wondoCampaign2 != null) {
            i = 0;
        } else {
            i = 8;
        }
        listItemView.setVisibility(i);
    }
}
