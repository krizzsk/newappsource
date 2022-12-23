package com.moovit.app.intro.onboarding;

import android.os.Parcel;
import android.os.Parcelable;

public class OnboardingPage implements Parcelable {
    public static final Parcelable.Creator<OnboardingPage> CREATOR = new C15024a();

    /* renamed from: b */
    public final int f38469b;

    /* renamed from: c */
    public final int f38470c;

    /* renamed from: d */
    public final int f38471d;

    /* renamed from: e */
    public final int f38472e;

    /* renamed from: com.moovit.app.intro.onboarding.OnboardingPage$a */
    public class C15024a implements Parcelable.Creator<OnboardingPage> {
        public final Object createFromParcel(Parcel parcel) {
            return new OnboardingPage(parcel);
        }

        public final Object[] newArray(int i) {
            return new OnboardingPage[i];
        }
    }

    public OnboardingPage(Parcel parcel) {
        this.f38469b = parcel.readInt();
        this.f38470c = parcel.readInt();
        this.f38471d = parcel.readInt();
        this.f38472e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f38469b);
        parcel.writeInt(this.f38470c);
        parcel.writeInt(this.f38471d);
        parcel.writeInt(this.f38472e);
    }
}
