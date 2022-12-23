package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0204a();

    /* renamed from: b */
    public final int f528b;

    /* renamed from: c */
    public final Intent f529c;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    public class C0204a implements Parcelable.Creator<ActivityResult> {
        public final Object createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        public final Object[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f528b = i;
        this.f529c = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("ActivityResult{resultCode=");
        int i = this.f528b;
        if (i == -1) {
            str = "RESULT_OK";
        } else if (i != 0) {
            str = String.valueOf(i);
        } else {
            str = "RESULT_CANCELED";
        }
        k.append(str);
        k.append(", data=");
        k.append(this.f529c);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f528b);
        if (this.f529c == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f529c;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f528b = parcel.readInt();
        this.f529c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
