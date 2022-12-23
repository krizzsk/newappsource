package com.moovit.ticketing.storedvalue;

import android.os.Parcel;
import android.os.Parcelable;
import m80.C12866b;
import m80.C12868d;
import m80.C12873i;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum StoredValueStatus implements Parcelable {
    f23469OK(C12866b.colorOnSurface, 0, 0),
    LOW_BALANCE(C12866b.colorCritical, C12868d.ic_alert_ring_16_critical, C12873i.tickets_center_stored_balance_low);
    
    public static final C19577c<StoredValueStatus> CODER = null;
    public static final Parcelable.Creator<StoredValueStatus> CREATOR = null;
    public final int colorAttrId;
    public final int iconResId;
    public final int textResId;

    /* renamed from: com.moovit.ticketing.storedvalue.StoredValueStatus$a */
    public class C7740a implements Parcelable.Creator<StoredValueStatus> {
        public final Object createFromParcel(Parcel parcel) {
            return (StoredValueStatus) C19612n.m46981v(parcel, StoredValueStatus.CODER);
        }

        public final Object[] newArray(int i) {
            return new StoredValueStatus[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        StoredValueStatus storedValueStatus;
        StoredValueStatus storedValueStatus2;
        CREATOR = new C7740a();
        CODER = new C19577c<>(StoredValueStatus.class, storedValueStatus, storedValueStatus2);
    }

    private StoredValueStatus(int i, int i2, int i3) {
        this.colorAttrId = i;
        this.iconResId = i2;
        this.textResId = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
