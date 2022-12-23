package com.veriff.sdk.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mf0.C24361g;

public final class FocusMeteringAction {
    private final long mAutoCancelDurationInMillis;
    private final List<MeteringPoint> mMeteringPointsAe;
    private final List<MeteringPoint> mMeteringPointsAf;
    private final List<MeteringPoint> mMeteringPointsAwb;

    public static class Builder {
        public long mAutoCancelDurationInMillis = InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS;
        public final List<MeteringPoint> mMeteringPointsAe = new ArrayList();
        public final List<MeteringPoint> mMeteringPointsAf = new ArrayList();
        public final List<MeteringPoint> mMeteringPointsAwb = new ArrayList();

        public Builder(MeteringPoint meteringPoint, int i) {
            addPoint(meteringPoint, i);
        }

        public Builder addPoint(MeteringPoint meteringPoint, int i) {
            boolean z;
            boolean z2 = false;
            if (meteringPoint != null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61177o(z, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z2 = true;
            }
            C24361g.m61177o(z2, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.mMeteringPointsAf.add(meteringPoint);
            }
            if ((i & 2) != 0) {
                this.mMeteringPointsAe.add(meteringPoint);
            }
            if ((i & 4) != 0) {
                this.mMeteringPointsAwb.add(meteringPoint);
            }
            return this;
        }

        public FocusMeteringAction build() {
            return new FocusMeteringAction(this);
        }
    }

    public FocusMeteringAction(Builder builder) {
        this.mMeteringPointsAf = Collections.unmodifiableList(builder.mMeteringPointsAf);
        this.mMeteringPointsAe = Collections.unmodifiableList(builder.mMeteringPointsAe);
        this.mMeteringPointsAwb = Collections.unmodifiableList(builder.mMeteringPointsAwb);
        this.mAutoCancelDurationInMillis = builder.mAutoCancelDurationInMillis;
    }

    public long getAutoCancelDurationInMillis() {
        return this.mAutoCancelDurationInMillis;
    }

    public List<MeteringPoint> getMeteringPointsAe() {
        return this.mMeteringPointsAe;
    }

    public List<MeteringPoint> getMeteringPointsAf() {
        return this.mMeteringPointsAf;
    }

    public List<MeteringPoint> getMeteringPointsAwb() {
        return this.mMeteringPointsAwb;
    }

    public boolean isAutoCancelEnabled() {
        return this.mAutoCancelDurationInMillis > 0;
    }
}
