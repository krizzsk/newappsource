package android.support.p015v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0162a();

    /* renamed from: b */
    public final int f448b;

    /* renamed from: c */
    public final float f449c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public class C0162a implements Parcelable.Creator<RatingCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f448b = i;
        this.f449c = f;
    }

    public final int describeContents() {
        return this.f448b;
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("Rating:style=");
        k.append(this.f448b);
        k.append(" rating=");
        float f = this.f449c;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        k.append(str);
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f448b);
        parcel.writeFloat(this.f449c);
    }
}
