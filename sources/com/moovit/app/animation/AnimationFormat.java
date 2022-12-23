package com.moovit.app.animation;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum AnimationFormat implements Parcelable {
    LOTTIE;
    
    public static final C19577c<AnimationFormat> CODER = null;
    public static final Parcelable.Creator<AnimationFormat> CREATOR = null;

    /* renamed from: com.moovit.app.animation.AnimationFormat$a */
    public class C14769a implements Parcelable.Creator<AnimationFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (AnimationFormat) C19612n.m46981v(parcel, AnimationFormat.CODER);
        }

        public final Object[] newArray(int i) {
            return new AnimationFormat[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        AnimationFormat animationFormat;
        CREATOR = new C14769a();
        CODER = new C19577c<>(AnimationFormat.class, animationFormat);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
