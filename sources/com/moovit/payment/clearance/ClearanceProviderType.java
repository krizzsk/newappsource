package com.moovit.payment.clearance;

import android.os.Parcel;
import android.os.Parcelable;
import m50.C18326b;
import o50.C18716a;
import p50.C18881a;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import r50.C19227c;
import s50.C19431a;
import u50.C19875a;

public enum ClearanceProviderType implements Parcelable {
    SPREEDLY(new C19227c()),
    STRIPE(new C19431a()),
    CUBIC(new C18716a()),
    ICEPAY(new C18881a()),
    WUNDER(new C19875a()),
    BUCKAROO(new C18326b());
    
    public static final C19577c<ClearanceProviderType> CODER = null;
    public static final Parcelable.Creator<ClearanceProviderType> CREATOR = null;
    private final ClearanceProvider clearanceProvider;

    /* renamed from: com.moovit.payment.clearance.ClearanceProviderType$a */
    public class C16295a implements Parcelable.Creator<ClearanceProviderType> {
        public final Object createFromParcel(Parcel parcel) {
            return (ClearanceProviderType) C19612n.m46981v(parcel, ClearanceProviderType.CODER);
        }

        public final Object[] newArray(int i) {
            return new ClearanceProviderType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        ClearanceProviderType clearanceProviderType;
        ClearanceProviderType clearanceProviderType2;
        ClearanceProviderType clearanceProviderType3;
        ClearanceProviderType clearanceProviderType4;
        ClearanceProviderType clearanceProviderType5;
        ClearanceProviderType clearanceProviderType6;
        CREATOR = new C16295a();
        CODER = new C19577c<>(ClearanceProviderType.class, clearanceProviderType, clearanceProviderType2, clearanceProviderType3, clearanceProviderType4, clearanceProviderType5, clearanceProviderType6);
    }

    private ClearanceProviderType(ClearanceProvider clearanceProvider2) {
        this.clearanceProvider = clearanceProvider2;
    }

    public int describeContents() {
        return 0;
    }

    public ClearanceProvider getClearanceProvider() {
        return this.clearanceProvider;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
