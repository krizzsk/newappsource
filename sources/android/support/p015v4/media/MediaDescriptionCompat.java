package android.support.p015v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0160a();

    /* renamed from: b */
    public final String f438b;

    /* renamed from: c */
    public final CharSequence f439c;

    /* renamed from: d */
    public final CharSequence f440d;

    /* renamed from: e */
    public final CharSequence f441e;

    /* renamed from: f */
    public final Bitmap f442f;

    /* renamed from: g */
    public final Uri f443g;

    /* renamed from: h */
    public final Bundle f444h;

    /* renamed from: i */
    public final Uri f445i;

    /* renamed from: j */
    public MediaDescription f446j;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C0160a implements Parcelable.Creator<MediaDescriptionCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m276b(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f438b = str;
        this.f439c = charSequence;
        this.f440d = charSequence2;
        this.f441e = charSequence3;
        this.f442f = bitmap;
        this.f443g = uri;
        this.f444h = bundle;
        this.f445i = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p015v4.media.MediaDescriptionCompat m276b(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x0068
            int r1 = android.os.Build.VERSION.SDK_INT
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r3 = r14.getMediaId()
            java.lang.CharSequence r4 = r14.getTitle()
            java.lang.CharSequence r5 = r14.getSubtitle()
            java.lang.CharSequence r6 = r14.getDescription()
            android.graphics.Bitmap r7 = r14.getIconBitmap()
            android.net.Uri r8 = r14.getIconUri()
            android.os.Bundle r2 = r14.getExtras()
            if (r2 == 0) goto L_0x002e
            android.support.p015v4.media.session.MediaSessionCompat.m306a(r2)
            r2.isEmpty()     // Catch:{ BadParcelableException -> 0x002c }
            goto L_0x002e
        L_0x002c:
            r2 = r0
        L_0x002e:
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0039
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x003a
        L_0x0039:
            r10 = r0
        L_0x003a:
            if (r10 == 0) goto L_0x0053
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x004d
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x004d
            r9 = r0
            goto L_0x0054
        L_0x004d:
            r2.remove(r9)
            r2.remove(r11)
        L_0x0053:
            r9 = r2
        L_0x0054:
            if (r10 == 0) goto L_0x0057
            goto L_0x0060
        L_0x0057:
            r2 = 23
            if (r1 < r2) goto L_0x005f
            android.net.Uri r0 = r14.getMediaUri()
        L_0x005f:
            r10 = r0
        L_0x0060:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f446j = r14
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p015v4.media.MediaDescriptionCompat.m276b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f439c + ", " + this.f440d + ", " + this.f441e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.f446j;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f438b);
            builder.setTitle(this.f439c);
            builder.setSubtitle(this.f440d);
            builder.setDescription(this.f441e);
            builder.setIconBitmap(this.f442f);
            builder.setIconUri(this.f443g);
            Bundle bundle = this.f444h;
            if (i2 < 23 && this.f445i != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f445i);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                builder.setMediaUri(this.f445i);
            }
            mediaDescription = builder.build();
            this.f446j = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
