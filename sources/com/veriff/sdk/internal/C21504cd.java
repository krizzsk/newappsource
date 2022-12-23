package com.veriff.sdk.internal;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.cd */
class C21504cd extends C21489bv {

    /* renamed from: b */
    private static final String[] f54087b = {"orientation"};

    /* renamed from: com.veriff.sdk.internal.cd$a */
    public enum C21505a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: d */
        public final int f54092d;

        /* renamed from: e */
        public final int f54093e;

        /* renamed from: f */
        public final int f54094f;

        private C21505a(int i, int i2, int i3) {
            this.f54092d = i;
            this.f54093e = i2;
            this.f54094f = i3;
        }
    }

    public C21504cd(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        Uri uri = clVar.f54153d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        Bitmap bitmap;
        C21525cl clVar2 = clVar;
        ContentResolver contentResolver = this.f54055a.getContentResolver();
        int a = m51400a(contentResolver, clVar2.f54153d);
        String type = contentResolver.getType(clVar2.f54153d);
        boolean z = type != null && type.startsWith("video/");
        if (clVar.mo54515d()) {
            C21505a a2 = m51401a(clVar2.f54157h, clVar2.f54158i);
            if (!z && a2 == C21505a.FULL) {
                return new C21529cn.C21530a((Bitmap) null, abr.m50514a(mo54439b(clVar)), C21512ci.C21518d.DISK, a);
            }
            long parseId = ContentUris.parseId(clVar2.f54153d);
            BitmapFactory.Options c = C21529cn.m51463c(clVar);
            c.inJustDecodeBounds = true;
            BitmapFactory.Options options = c;
            C21529cn.m51460a(clVar2.f54157h, clVar2.f54158i, a2.f54093e, a2.f54094f, c, clVar);
            if (z) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, a2 == C21505a.FULL ? 1 : a2.f54092d, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, a2.f54092d, options);
            }
            if (bitmap != null) {
                return new C21529cn.C21530a(bitmap, (aca) null, C21512ci.C21518d.DISK, a);
            }
        }
        return new C21529cn.C21530a((Bitmap) null, abr.m50514a(mo54439b(clVar)), C21512ci.C21518d.DISK, a);
    }

    /* renamed from: a */
    public static C21505a m51401a(int i, int i2) {
        C21505a aVar = C21505a.MICRO;
        if (i <= aVar.f54093e && i2 <= aVar.f54094f) {
            return aVar;
        }
        C21505a aVar2 = C21505a.MINI;
        if (i > aVar2.f54093e || i2 > aVar2.f54094f) {
            return C21505a.FULL;
        }
        return aVar2;
    }

    /* renamed from: a */
    public static int m51400a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f54087b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
