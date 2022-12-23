package com.fyber.inneractive.sdk.interfaces;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;

/* renamed from: com.fyber.inneractive.sdk.interfaces.c */
public interface C2812c extends InneractiveAdRenderer {

    /* renamed from: com.fyber.inneractive.sdk.interfaces.c$a */
    public interface C2813a {
        void destroy();

        void disableCloseButton();

        void dismissAd(boolean z);

        View getCloseButton();

        ViewGroup getLayout();

        boolean isCloseButtonDisplay();

        void setActivityOrientation(boolean z, Orientation orientation);

        void showCloseButton(boolean z, int i, int i2);

        void showCloseCountdown();

        void updateCloseCountdown(int i);

        boolean wasDismissedByUser();
    }

    /* renamed from: com.fyber.inneractive.sdk.interfaces.c$b */
    public interface C2814b {
    }

    /* renamed from: a */
    void mo13351a(C2813a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException;

    /* renamed from: a */
    void mo13352a(C2814b bVar);

    /* renamed from: b */
    void mo13353b();

    /* renamed from: c */
    void mo13575c(boolean z);

    void destroy();

    /* renamed from: m */
    void mo13355m();

    /* renamed from: o */
    void mo13578o();

    /* renamed from: s */
    void mo13579s();

    /* renamed from: u */
    boolean mo13356u();
}
