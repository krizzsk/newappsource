package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/internal/FacebookInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class FacebookInitProvider extends ContentProvider {
    static {
        Class<FacebookInitProvider> cls = FacebookInitProvider.class;
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

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onCreate() {
        /*
            r2 = this;
            android.content.Context r0 = r2.getContext()     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x0013
            a8.o r1 = p009a8.C0115o.f331a     // Catch:{ Exception -> 0x001f }
            java.lang.Class<a8.o> r1 = p009a8.C0115o.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x001f }
            p009a8.C0115o.m221l(r0)     // Catch:{ all -> 0x0010 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0010:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x001f }
            throw r0     // Catch:{ Exception -> 0x001f }
        L_0x0013:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x001f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x001f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x001f }
            throw r1     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FacebookInitProvider.onCreate():boolean");
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
