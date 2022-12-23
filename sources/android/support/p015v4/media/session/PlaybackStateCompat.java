package android.support.p015v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p358af.C13437d;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0171a();

    /* renamed from: b */
    public final int f468b;

    /* renamed from: c */
    public final long f469c;

    /* renamed from: d */
    public final long f470d;

    /* renamed from: e */
    public final float f471e;

    /* renamed from: f */
    public final long f472f;

    /* renamed from: g */
    public final int f473g;

    /* renamed from: h */
    public final CharSequence f474h;

    /* renamed from: i */
    public final long f475i;

    /* renamed from: j */
    public ArrayList f476j;

    /* renamed from: k */
    public final long f477k;

    /* renamed from: l */
    public final Bundle f478l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public class C0171a implements Parcelable.Creator<PlaybackStateCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f468b = i;
        this.f469c = j;
        this.f470d = j2;
        this.f471e = f;
        this.f472f = j3;
        this.f473g = 0;
        this.f474h = charSequence;
        this.f475i = j4;
        this.f476j = new ArrayList(arrayList);
        this.f477k = j5;
        this.f478l = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("PlaybackState {", "state=");
        n.append(this.f468b);
        n.append(", position=");
        n.append(this.f469c);
        n.append(", buffered position=");
        n.append(this.f470d);
        n.append(", speed=");
        n.append(this.f471e);
        n.append(", updated=");
        n.append(this.f475i);
        n.append(", actions=");
        n.append(this.f472f);
        n.append(", error code=");
        n.append(this.f473g);
        n.append(", error message=");
        n.append(this.f474h);
        n.append(", custom actions=");
        n.append(this.f476j);
        n.append(", active item id=");
        return C25541a.m63884o(n, this.f477k, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f468b);
        parcel.writeLong(this.f469c);
        parcel.writeFloat(this.f471e);
        parcel.writeLong(this.f475i);
        parcel.writeLong(this.f470d);
        parcel.writeLong(this.f472f);
        TextUtils.writeToParcel(this.f474h, parcel, i);
        parcel.writeTypedList(this.f476j);
        parcel.writeLong(this.f477k);
        parcel.writeBundle(this.f478l);
        parcel.writeInt(this.f473g);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0170a();

        /* renamed from: b */
        public final String f479b;

        /* renamed from: c */
        public final CharSequence f480c;

        /* renamed from: d */
        public final int f481d;

        /* renamed from: e */
        public final Bundle f482e;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public class C0170a implements Parcelable.Creator<CustomAction> {
            public final Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f479b = str;
            this.f480c = charSequence;
            this.f481d = i;
            this.f482e = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Action:mName='");
            k.append(this.f480c);
            k.append(", mIcon=");
            k.append(this.f481d);
            k.append(", mExtras=");
            k.append(this.f482e);
            return k.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f479b);
            TextUtils.writeToParcel(this.f480c, parcel, i);
            parcel.writeInt(this.f481d);
            parcel.writeBundle(this.f482e);
        }

        public CustomAction(Parcel parcel) {
            this.f479b = parcel.readString();
            this.f480c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f481d = parcel.readInt();
            this.f482e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f468b = parcel.readInt();
        this.f469c = parcel.readLong();
        this.f471e = parcel.readFloat();
        this.f475i = parcel.readLong();
        this.f470d = parcel.readLong();
        this.f472f = parcel.readLong();
        this.f474h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f476j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f477k = parcel.readLong();
        this.f478l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f473g = parcel.readInt();
    }
}
