package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p241s0.C6313h;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C14136a();

    /* renamed from: b */
    public final C6313h<String, Bundle> f35362b;

    public /* synthetic */ ExtendableSavedState() {
        throw null;
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f35362b = new C6313h<>();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ExtendableSavedState{");
        k.append(Integer.toHexString(System.identityHashCode(this)));
        k.append(" states=");
        k.append(this.f35362b);
        k.append("}");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f35362b.f19969d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f35362b.mo22416h(i3);
            bundleArr[i3] = this.f35362b.mo22422l(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$a */
    public class C14136a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        public final Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        public final Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null);
        }
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f35362b = new C6313h<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f35362b.put(strArr[i], bundleArr[i]);
        }
    }
}
