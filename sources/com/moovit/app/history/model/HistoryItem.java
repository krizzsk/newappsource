package com.moovit.app.history.model;

import android.os.Parcelable;

public interface HistoryItem extends Parcelable {

    /* renamed from: com.moovit.app.history.model.HistoryItem$a */
    public interface C14912a<T> {
        /* renamed from: D */
        T mo40412D(TripPlanHistoryItem tripPlanHistoryItem);

        /* renamed from: e1 */
        T mo40413e1(OfflineTripPlanHistoryItem offlineTripPlanHistoryItem);
    }

    /* renamed from: Z1 */
    <T> T mo45080Z1(C14912a<T> aVar);

    long getCreationTime();

    String getId();

    boolean isExpired();
}
