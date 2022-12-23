package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2790s;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.display.b */
public class C2705b extends C2704a implements C2812c.C2813a {

    /* renamed from: a */
    public InneractiveAdSpot f9429a;

    /* renamed from: b */
    public C2812c f9430b;

    /* renamed from: a */
    public void mo13290a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot inneractiveAdSpot2;
        if (TextUtils.isEmpty(str) || (inneractiveAdSpot2 = InneractiveAdSpotManager.get().getSpot(str)) == null || inneractiveAdSpot2.getAdContent() == null) {
            inneractiveAdSpot2 = null;
        }
        this.f9429a = inneractiveAdSpot2;
        if (inneractiveAdSpot2 != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot2.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                C2812c fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.f9430b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    InneractiveAdSpot inneractiveAdSpot3 = this.f9429a;
                    C2790s sVar = (C2790s) fullscreenRenderer;
                    sVar.f9597a = inneractiveAdSpot3;
                    sVar.f9598b = inneractiveAdSpot3.getAdContent();
                    sVar.f9599c = inneractiveAdSpot3.getSelectedUnitController().getEventsListener();
                    sVar.f9643u.f12817a = inneractiveAdSpot3;
                    try {
                        this.f9430b.mo13351a(this, activity);
                    } catch (InneractiveUnitController.AdDisplayError e) {
                        IAlog.m9906e("Interstitial Activity: %s", e.getMessage());
                    } catch (Resources.NotFoundException e2) {
                        IAlog.m9906e("Interstitial Activity: %s", e2.getMessage());
                    }
                }
            }
        }
    }

    public void destroy() {
    }

    public void disableCloseButton() {
    }

    public void dismissAd(boolean z) {
        C2812c cVar = this.f9430b;
        if (cVar != null) {
            cVar.destroy();
            this.f9430b = null;
        }
    }

    public View getCloseButton() {
        return null;
    }

    public ViewGroup getLayout() {
        return null;
    }

    public boolean isCloseButtonDisplay() {
        return false;
    }

    public void setActivityOrientation(boolean z, Orientation orientation) {
    }

    public void showCloseButton(boolean z, int i, int i2) {
    }

    public void showCloseCountdown() {
    }

    public void updateCloseCountdown(int i) {
    }

    public boolean wasDismissedByUser() {
        return false;
    }
}
