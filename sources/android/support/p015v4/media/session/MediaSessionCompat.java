package android.support.p015v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p015v4.media.MediaDescriptionCompat;
import p022b3.C1464d;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public final class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0167a();

        /* renamed from: b */
        public ResultReceiver f458b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C0167a implements Parcelable.Creator<ResultReceiverWrapper> {
            public final Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f458b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f458b.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0168a();

        /* renamed from: b */
        public final Object f459b = new Object();

        /* renamed from: c */
        public final Object f460c;

        /* renamed from: d */
        public C0174b f461d;

        /* renamed from: e */
        public C1464d f462e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C0168a implements Parcelable.Creator<Token> {
            public final Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null), (C0174b) null);
            }

            public final Object[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Parcelable parcelable, C0174b bVar) {
            this.f460c = parcelable;
            this.f461d = bVar;
            this.f462e = null;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f460c;
            if (obj2 != null) {
                Object obj3 = token.f460c;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f460c == null) {
                return true;
            } else {
                return false;
            }
        }

        public final int hashCode() {
            Object obj = this.f460c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f460c, i);
        }
    }

    /* renamed from: a */
    public static void m306a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0166a();

        /* renamed from: b */
        public final MediaDescriptionCompat f456b;

        /* renamed from: c */
        public final long f457c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C0166a implements Parcelable.Creator<QueueItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f456b = mediaDescriptionCompat;
                this.f457c = j;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("MediaSession.QueueItem {Description=");
            k.append(this.f456b);
            k.append(", Id=");
            return C25541a.m63884o(k, this.f457c, " }");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f456b.writeToParcel(parcel, i);
            parcel.writeLong(this.f457c);
        }

        public QueueItem(Parcel parcel) {
            this.f456b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f457c = parcel.readLong();
        }
    }
}
