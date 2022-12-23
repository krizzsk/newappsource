package com.moovit.app.tod.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum TodUiState implements Parcelable {
    FUTURE_RIDE,
    ACTIVE_RIDE,
    RIDE_COMPLETED,
    PASSENGER_NOT_SHOWN,
    RIDE_CANCELLED,
    AUTONOMOUS_HEADING_PICKUP,
    AUTONOMOUS_WAITING_AT_PICKUP,
    AUTONOMOUS_HEADING_DROP_OFF,
    REMOTE_SCREEN;
    
    public static final C19577c<TodUiState> CODER = null;
    public static final Parcelable.Creator<TodUiState> CREATOR = null;

    /* renamed from: com.moovit.app.tod.bottomsheet.TodUiState$a */
    public class C15477a implements Parcelable.Creator<TodUiState> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodUiState) C19612n.m46981v(parcel, TodUiState.CODER);
        }

        public final Object[] newArray(int i) {
            return new TodUiState[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TodUiState todUiState;
        TodUiState todUiState2;
        TodUiState todUiState3;
        TodUiState todUiState4;
        TodUiState todUiState5;
        TodUiState todUiState6;
        TodUiState todUiState7;
        TodUiState todUiState8;
        TodUiState todUiState9;
        CREATOR = new C15477a();
        CODER = new C19577c<>(TodUiState.class, todUiState, todUiState6, todUiState7, null, todUiState8, null, todUiState2, todUiState3, todUiState4, todUiState5, todUiState9);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
