package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2438y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.text.C24179b;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/FacebookContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class FacebookContentProvider extends ContentProvider {

    /* renamed from: b */
    public static final /* synthetic */ int f8413b = 0;

    static {
        Class<FacebookContentProvider> cls = FacebookContentProvider.class;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        C24362h.m61211f(uri, "uri");
        return 0;
    }

    public final String getType(Uri uri) {
        C24362h.m61211f(uri, "uri");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        C24362h.m61211f(uri, "uri");
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Pair pair;
        C24362h.m61211f(uri, "uri");
        C24362h.m61211f(str, "mode");
        File file = null;
        try {
            String path = uri.getPath();
            if (path != null) {
                String substring = path.substring(1);
                C24362h.m61210e(substring, "(this as java.lang.String).substring(startIndex)");
                Object[] array = C24179b.m60577Y(substring, new String[]{"/"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    String str2 = strArr[0];
                    String str3 = strArr[1];
                    if ("..".contentEquals(str2) || "..".contentEquals(str3)) {
                        throw new Exception();
                    }
                    pair = new Pair(UUID.fromString(str2), str3);
                    if (pair != null) {
                        try {
                            C2438y yVar = C2438y.f8734a;
                            UUID uuid = (UUID) pair.first;
                            String str4 = (String) pair.second;
                            if (C2397f0.m6292A(str4) || uuid == null) {
                                throw new FileNotFoundException();
                            }
                            File e = C2438y.m6397e(uuid, false);
                            if (e != null) {
                                try {
                                    file = new File(e, URLEncoder.encode(str4, "UTF-8"));
                                } catch (UnsupportedEncodingException unused) {
                                }
                            }
                            if (file != null) {
                                return ParcelFileDescriptor.open(file, 268435456);
                            }
                            throw new FileNotFoundException();
                        } catch (IOException unused2) {
                            throw new FileNotFoundException();
                        } catch (FileNotFoundException e2) {
                            C24362h.m61216k(e2, "Got unexpected exception:");
                            throw e2;
                        }
                    } else {
                        throw new FileNotFoundException();
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (Exception unused3) {
            pair = null;
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C24362h.m61211f(uri, "uri");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C24362h.m61211f(uri, "uri");
        return 0;
    }
}
