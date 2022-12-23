package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.flow.C2808z;
import com.fyber.inneractive.sdk.renderers.C3641m;
import java.lang.ref.WeakReference;

public class InneractiveAdViewVideoContentController extends C2808z {
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        if (inneractiveAdSpot.getAdContent() instanceof C2807y) {
            return true;
        }
        return false;
    }

    public void pauseVideo() {
    }

    public void playVideo() {
    }

    public void setControlledRenderer(C3641m mVar) {
        new WeakReference(mVar);
    }
}
