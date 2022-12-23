package com.moovit.ticketing.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.ticketing.protocol.PurchaseTicketIntent;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueIntent;
import m80.C12873i;

public enum UserWalletTab implements Parcelable {
    VALIDATION(C12873i.tickets_center_validation_menu_label, "validation", (int) null),
    STORED_VALUE(C12873i.tickets_center_stored_menu_label, "stored_value", new PurchaseStoredValueIntent((String) null)),
    AVAILABLE(C12873i.tickets_center_tab_title_valid, "valid", new PurchaseTicketIntent((String) null)),
    EXPIRED(C12873i.tickets_center_tab_title_expired, "expired", (int) null);
    
    public static final Parcelable.Creator<UserWalletTab> CREATOR = null;
    public final String analyticsType;
    public final PurchaseIntent purchaseIntent;
    public final int titleResId;

    /* renamed from: com.moovit.ticketing.wallet.UserWalletTab$a */
    public class C7783a implements Parcelable.Creator<UserWalletTab> {
        public final Object createFromParcel(Parcel parcel) {
            return UserWalletTab.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new UserWalletTab[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C7783a();
    }

    private UserWalletTab(int i, String str, PurchaseIntent purchaseIntent2) {
        this.titleResId = i;
        this.analyticsType = str;
        this.purchaseIntent = purchaseIntent2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
