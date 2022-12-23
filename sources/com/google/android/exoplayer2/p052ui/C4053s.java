package com.google.android.exoplayer2.p052ui;

import android.view.View;
import com.google.android.exoplayer2.p052ui.StyledPlayerControlView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.moovit.GooglePlayServicesUnavailableActivity;
import p713ov.C18841h;
import p977zz.C20935e;

/* renamed from: com.google.android.exoplayer2.ui.s */
public final /* synthetic */ class C4053s implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f14504b;

    /* renamed from: c */
    public final /* synthetic */ int f14505c;

    /* renamed from: d */
    public final /* synthetic */ Object f14506d;

    public /* synthetic */ C4053s(int i, int i2, Object obj) {
        this.f14504b = i2;
        this.f14506d = obj;
        this.f14505c = i;
    }

    public final void onClick(View view) {
        switch (this.f14504b) {
            case 0:
                StyledPlayerControlView.C4012d dVar = (StyledPlayerControlView.C4012d) this.f14506d;
                int i = this.f14505c;
                if (i != dVar.f14367i) {
                    StyledPlayerControlView.this.setPlaybackSpeed(((float) dVar.f14366h[i]) / 100.0f);
                }
                StyledPlayerControlView.this.f14291B0.dismiss();
                return;
            case 1:
                GooglePlayServicesUnavailableActivity googlePlayServicesUnavailableActivity = (GooglePlayServicesUnavailableActivity) this.f14506d;
                int i2 = this.f14505c;
                int i3 = GooglePlayServicesUnavailableActivity.f37289X;
                googlePlayServicesUnavailableActivity.getClass();
                GoogleApiAvailability.getInstance().showErrorDialogFragment(googlePlayServicesUnavailableActivity, i2, 1001);
                return;
            default:
                C18841h.C18843b bVar = (C18841h.C18843b) this.f14506d;
                int i4 = this.f14505c;
                int i5 = bVar.f47976j;
                if (i5 != -1) {
                    bVar.notifyItemChanged(i5);
                }
                bVar.f47976j = i4;
                bVar.notifyItemChanged(i4);
                C20935e<C18841h.C18843b> eVar = bVar.f47977k;
                if (eVar != null) {
                    eVar.invoke(bVar);
                    return;
                }
                return;
        }
    }
}
