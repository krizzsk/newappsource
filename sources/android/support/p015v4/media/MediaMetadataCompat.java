package android.support.p015v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p015v4.media.session.MediaSessionCompat;
import p241s0.C6302b;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0161a();

    /* renamed from: b */
    public final Bundle f447b;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public class C0161a implements Parcelable.Creator<MediaMetadataCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public final Object[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C6302b bVar = new C6302b();
        bVar.put("android.media.metadata.TITLE", 1);
        bVar.put("android.media.metadata.ARTIST", 1);
        bVar.put("android.media.metadata.DURATION", 0);
        bVar.put("android.media.metadata.ALBUM", 1);
        bVar.put("android.media.metadata.AUTHOR", 1);
        bVar.put("android.media.metadata.WRITER", 1);
        bVar.put("android.media.metadata.COMPOSER", 1);
        bVar.put("android.media.metadata.COMPILATION", 1);
        bVar.put("android.media.metadata.DATE", 1);
        bVar.put("android.media.metadata.YEAR", 0);
        bVar.put("android.media.metadata.GENRE", 1);
        bVar.put("android.media.metadata.TRACK_NUMBER", 0);
        bVar.put("android.media.metadata.NUM_TRACKS", 0);
        bVar.put("android.media.metadata.DISC_NUMBER", 0);
        bVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        bVar.put("android.media.metadata.ART", 2);
        bVar.put("android.media.metadata.ART_URI", 1);
        bVar.put("android.media.metadata.ALBUM_ART", 2);
        bVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        bVar.put("android.media.metadata.USER_RATING", 3);
        bVar.put("android.media.metadata.RATING", 3);
        bVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        bVar.put("android.media.metadata.DISPLAY_ICON", 2);
        bVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        bVar.put("android.media.metadata.MEDIA_ID", 1);
        bVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        bVar.put("android.media.metadata.MEDIA_URI", 1);
        bVar.put("android.media.metadata.ADVERTISEMENT", 0);
        bVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f447b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f447b);
    }
}
