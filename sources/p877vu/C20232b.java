package p877vu;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.navigation.NavigationService;
import com.tranzmate.R;
import p054d0.C4278e0;

/* renamed from: vu.b */
public class C20232b extends C15676b<MultiLegNavActivity> {

    /* renamed from: h */
    public final Handler f51334h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public final C4278e0 f51335i = new C4278e0(this, 10);

    public C20232b() {
        super(MultiLegNavActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.arrive_to_destination_dialog, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MultiLegNavActivity multiLegNavActivity = (MultiLegNavActivity) this.f40792c;
        if (multiLegNavActivity != null) {
            multiLegNavActivity.startService(NavigationService.m11309z(multiLegNavActivity, multiLegNavActivity.f39109H0, "arrive_to_dest"));
            multiLegNavActivity.finish();
        }
    }

    public final void onStart() {
        super.onStart();
        this.f51334h.postDelayed(this.f51335i, InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
    }

    public final void onStop() {
        super.onStop();
        this.f51334h.removeCallbacks(this.f51335i);
    }
}
