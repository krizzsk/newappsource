package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kf0.C23775c;
import mf0.C24362h;
import p009a8.C0115o;
import uh0.C25081h;

/* renamed from: com.facebook.internal.y */
public final class C2438y {

    /* renamed from: a */
    public static final C2438y f8734a = new C2438y();

    /* renamed from: b */
    public static File f8735b;

    /* renamed from: com.facebook.internal.y$a */
    public static final class C2439a {

        /* renamed from: a */
        public final UUID f8736a;

        /* renamed from: b */
        public final Bitmap f8737b;

        /* renamed from: c */
        public final Uri f8738c;

        /* renamed from: d */
        public final String f8739d;

        /* renamed from: e */
        public final String f8740e;

        /* renamed from: f */
        public boolean f8741f;

        /* renamed from: g */
        public boolean f8742g;

        public C2439a(Bitmap bitmap, Uri uri, UUID uuid) {
            String str;
            String str2;
            boolean z;
            C24362h.m61211f(uuid, "callId");
            this.f8736a = uuid;
            this.f8737b = bitmap;
            this.f8738c = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (C25081h.m62830A("content", scheme, true)) {
                    this.f8741f = true;
                    String authority = uri.getAuthority();
                    if (authority == null || C25081h.m62835F(authority, "media")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f8742g = z;
                } else if (C25081h.m62830A(AppboyFileUtils.FILE_SCHEME, uri.getScheme(), true)) {
                    this.f8742g = true;
                } else if (!C2397f0.m6293B(uri)) {
                    throw new FacebookException(C24362h.m61216k(scheme, "Unsupported scheme for media Uri : "));
                }
            } else if (bitmap != null) {
                this.f8742g = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            if (!this.f8742g) {
                str = null;
            } else {
                str = UUID.randomUUID().toString();
            }
            this.f8740e = str;
            if (!this.f8742g) {
                str2 = String.valueOf(uri);
            } else {
                int i = FacebookContentProvider.f8413b;
                str2 = C13555b.m33971j(new Object[]{"content://com.facebook.app.FacebookContentProvider", C0115o.m211b(), uuid.toString(), str}, 4, "%s%s/%s/%s", "java.lang.String.format(format, *args)");
            }
            this.f8739d = str2;
        }
    }

    /* renamed from: a */
    public static final void m6393a(List list) throws FacebookException {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        File d;
        if (!list.isEmpty()) {
            if (f8735b == null && (d = m6396d()) != null) {
                C23775c.m58350Q0(d);
            }
            File d2 = m6396d();
            if (d2 != null) {
                d2.mkdirs();
            }
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C2439a aVar = (C2439a) it.next();
                    if (aVar.f8742g) {
                        UUID uuid = aVar.f8736a;
                        String str = aVar.f8740e;
                        C24362h.m61211f(uuid, "callId");
                        File e = m6397e(uuid, true);
                        File file = null;
                        if (e != null) {
                            try {
                                file = new File(e, URLEncoder.encode(str, "UTF-8"));
                            } catch (UnsupportedEncodingException unused) {
                            }
                        }
                        if (file != null) {
                            arrayList.add(file);
                            Bitmap bitmap = aVar.f8737b;
                            if (bitmap != null) {
                                f8734a.getClass();
                                fileOutputStream2 = new FileOutputStream(file);
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                                C2397f0.m6311e(fileOutputStream2);
                            } else {
                                Uri uri = aVar.f8738c;
                                if (uri != null) {
                                    C2438y yVar = f8734a;
                                    boolean z = aVar.f8741f;
                                    yVar.getClass();
                                    fileOutputStream = new FileOutputStream(file);
                                    if (!z) {
                                        inputStream = new FileInputStream(uri.getPath());
                                    } else {
                                        inputStream = C0115o.m210a().getContentResolver().openInputStream(uri);
                                    }
                                    C2397f0.m6316j(inputStream, fileOutputStream);
                                    C2397f0.m6311e(fileOutputStream);
                                }
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                C24362h.m61216k(e2, "Got unexpected exception:");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    File file2 = (File) it2.next();
                    if (file2 != null) {
                        try {
                            file2.delete();
                        } catch (Exception unused2) {
                        }
                    }
                }
                throw new FacebookException((Throwable) e2);
            } catch (Throwable th) {
                C2397f0.m6311e(fileOutputStream2);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static final C2439a m6394b(UUID uuid, Bitmap bitmap) {
        C24362h.m61211f(uuid, "callId");
        C24362h.m61211f(bitmap, "attachmentBitmap");
        return new C2439a(bitmap, (Uri) null, uuid);
    }

    /* renamed from: c */
    public static final C2439a m6395c(UUID uuid, Uri uri) {
        C24362h.m61211f(uuid, "callId");
        C24362h.m61211f(uri, "attachmentUri");
        return new C2439a((Bitmap) null, uri, uuid);
    }

    /* renamed from: d */
    public static final synchronized File m6396d() {
        File file;
        synchronized (C2438y.class) {
            if (f8735b == null) {
                f8735b = new File(C0115o.m210a().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f8735b;
        }
        return file;
    }

    /* renamed from: e */
    public static final File m6397e(UUID uuid, boolean z) {
        C24362h.m61211f(uuid, "callId");
        if (f8735b == null) {
            return null;
        }
        File file = new File(f8735b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
