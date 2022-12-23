package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0205a();

    /* renamed from: b */
    public final IntentSender f534b;

    /* renamed from: c */
    public final Intent f535c;

    /* renamed from: d */
    public final int f536d;

    /* renamed from: e */
    public final int f537e;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    public class C0205a implements Parcelable.Creator<IntentSenderRequest> {
        public final Object createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        public final Object[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f534b = intentSender;
        this.f535c = intent;
        this.f536d = i;
        this.f537e = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f534b, i);
        parcel.writeParcelable(this.f535c, i);
        parcel.writeInt(this.f536d);
        parcel.writeInt(this.f537e);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f534b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f535c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f536d = parcel.readInt();
        this.f537e = parcel.readInt();
    }
}
