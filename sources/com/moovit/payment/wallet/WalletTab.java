package com.moovit.payment.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import v40.C25754i;

public enum WalletTab implements Parcelable {
    VALID(C25754i.tickets_center_tab_rides, "valid"),
    EXPIRED(C25754i.tickets_center_tab_title_expired, "expired");
    
    public static final Parcelable.Creator<WalletTab> CREATOR = null;
    public final String analyticsType;
    public final int titleResId;

    /* renamed from: com.moovit.payment.wallet.WalletTab$a */
    public class C16412a implements Parcelable.Creator<WalletTab> {
        public final Object createFromParcel(Parcel parcel) {
            return WalletTab.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new WalletTab[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C16412a();
    }

    private WalletTab(int i, String str) {
        this.titleResId = i;
        C21100e.m49373x(str, "analyticsType");
        this.analyticsType = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
