package com.p341rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: com.rd.draw.data.PositionSavedState */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new C7985a();

    /* renamed from: b */
    public int f24198b;

    /* renamed from: c */
    public int f24199c;

    /* renamed from: d */
    public int f24200d;

    /* renamed from: com.rd.draw.data.PositionSavedState$a */
    public static class C7985a implements Parcelable.Creator<PositionSavedState> {
        public final Object createFromParcel(Parcel parcel) {
            return new PositionSavedState(parcel);
        }

        public final Object[] newArray(int i) {
            return new PositionSavedState[i];
        }
    }

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f24198b);
        parcel.writeInt(this.f24199c);
        parcel.writeInt(this.f24200d);
    }

    public PositionSavedState(Parcel parcel) {
        super(parcel);
        this.f24198b = parcel.readInt();
        this.f24199c = parcel.readInt();
        this.f24200d = parcel.readInt();
    }
}
