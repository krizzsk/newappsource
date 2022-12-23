package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.parser.moshi.C1902a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.braze.support.WebContentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p024b5.C1484f;
import p094g5.C4828w;
import p107h5.C5059g;
import si0.C24911r;
import si0.C24918x;

/* renamed from: com.airbnb.lottie.g */
public final class C1868g {

    /* renamed from: a */
    public static final HashMap f6464a = new HashMap();

    /* renamed from: b */
    public static final byte[] f6465b = {80, 75, 3, 4};

    /* renamed from: com.airbnb.lottie.g$a */
    public class C1869a implements C1899o<C1867f> {

        /* renamed from: a */
        public final /* synthetic */ String f6466a;

        public C1869a(String str) {
            this.f6466a = str;
        }

        public final void onResult(Object obj) {
            C1867f fVar = (C1867f) obj;
            C1868g.f6464a.remove(this.f6466a);
        }
    }

    /* renamed from: com.airbnb.lottie.g$b */
    public class C1870b implements C1899o<Throwable> {

        /* renamed from: a */
        public final /* synthetic */ String f6467a;

        public C1870b(String str) {
            this.f6467a = str;
        }

        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            C1868g.f6464a.remove(this.f6467a);
        }
    }

    /* renamed from: com.airbnb.lottie.g$c */
    public class C1871c implements Callable<C1904r<C1867f>> {

        /* renamed from: b */
        public final /* synthetic */ C1867f f6468b;

        public C1871c(C1867f fVar) {
            this.f6468b = fVar;
        }

        public final Object call() throws Exception {
            return new C1904r(this.f6468b);
        }
    }

    /* renamed from: a */
    public static C1906t<C1867f> m5243a(String str, Callable<C1904r<C1867f>> callable) {
        C1867f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = C1484f.f5384b.f5385a.get(str);
        }
        if (fVar != null) {
            return new C1906t<>(new C1871c(fVar), false);
        }
        if (str != null) {
            HashMap hashMap = f6464a;
            if (hashMap.containsKey(str)) {
                return (C1906t) hashMap.get(str);
            }
        }
        C1906t<C1867f> tVar = new C1906t<>(callable, false);
        if (str != null) {
            C1869a aVar = new C1869a(str);
            synchronized (tVar) {
                if (!(tVar.f6710d == null || tVar.f6710d.f6703a == null)) {
                    aVar.onResult(tVar.f6710d.f6703a);
                }
                tVar.f6707a.add(aVar);
            }
            C1870b bVar = new C1870b(str);
            synchronized (tVar) {
                if (!(tVar.f6710d == null || tVar.f6710d.f6704b == null)) {
                    bVar.onResult(tVar.f6710d.f6704b);
                }
                tVar.f6708b.add(bVar);
            }
            f6464a.put(str, tVar);
        }
        return tVar;
    }

    /* renamed from: b */
    public static C1904r<C1867f> m5244b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(WebContentUtils.ZIP_EXTENSION)) {
                if (!str.endsWith(".lottie")) {
                    return m5245c(context.getAssets().open(str), str2);
                }
            }
            return m5249g(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C1904r<>((Throwable) e);
        }
    }

    /* renamed from: c */
    public static C1904r<C1867f> m5245c(InputStream inputStream, String str) {
        try {
            C24918x c = C24911r.m62547c(C24911r.m62553i(inputStream));
            String[] strArr = JsonReader.f6647f;
            return m5246d(new C1902a(c), str, true);
        } finally {
            C5059g.m12909b(inputStream);
        }
    }

    /* renamed from: d */
    public static C1904r m5246d(C1902a aVar, String str, boolean z) {
        try {
            C1867f a = C4828w.m12158a(aVar);
            if (str != null) {
                C1484f.f5384b.f5385a.put(str, a);
            }
            C1904r rVar = new C1904r(a);
            if (z) {
                C5059g.m12909b(aVar);
            }
            return rVar;
        } catch (Exception e) {
            C1904r rVar2 = new C1904r((Throwable) e);
            if (z) {
                C5059g.m12909b(aVar);
            }
            return rVar2;
        } catch (Throwable th) {
            if (z) {
                C5059g.m12909b(aVar);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        p107h5.C5055c.f17045a.getClass();
        r6 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002e */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.C1904r<com.airbnb.lottie.C1867f> m5247e(android.content.Context r5, int r6, java.lang.String r7) {
        /*
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NotFoundException -> 0x0054 }
            java.io.InputStream r5 = r5.openRawResource(r6)     // Catch:{ NotFoundException -> 0x0054 }
            si0.q r5 = si0.C24911r.m62553i(r5)     // Catch:{ NotFoundException -> 0x0054 }
            si0.x r5 = si0.C24911r.m62547c(r5)     // Catch:{ NotFoundException -> 0x0054 }
            si0.x r6 = r5.mo61464e()     // Catch:{ Exception -> 0x002e }
            byte[] r0 = f6465b     // Catch:{ Exception -> 0x002e }
            int r1 = r0.length     // Catch:{ Exception -> 0x002e }
            r2 = 0
        L_0x0018:
            if (r2 >= r1) goto L_0x0028
            byte r3 = r0[r2]     // Catch:{ Exception -> 0x002e }
            byte r4 = r6.readByte()     // Catch:{ Exception -> 0x002e }
            if (r4 == r3) goto L_0x0025
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x002e }
            goto L_0x0035
        L_0x0025:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0028:
            r6.close()     // Catch:{ Exception -> 0x002e }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x002e }
            goto L_0x0035
        L_0x002e:
            h5.b r6 = p107h5.C5055c.f17045a     // Catch:{ NotFoundException -> 0x0054 }
            r6.getClass()     // Catch:{ NotFoundException -> 0x0054 }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x0054 }
        L_0x0035:
            boolean r6 = r6.booleanValue()     // Catch:{ NotFoundException -> 0x0054 }
            if (r6 == 0) goto L_0x004a
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x0054 }
            si0.x$a r0 = new si0.x$a     // Catch:{ NotFoundException -> 0x0054 }
            r0.<init>(r5)     // Catch:{ NotFoundException -> 0x0054 }
            r6.<init>(r0)     // Catch:{ NotFoundException -> 0x0054 }
            com.airbnb.lottie.r r5 = m5249g(r6, r7)     // Catch:{ NotFoundException -> 0x0054 }
            return r5
        L_0x004a:
            si0.x$a r6 = new si0.x$a     // Catch:{ NotFoundException -> 0x0054 }
            r6.<init>(r5)     // Catch:{ NotFoundException -> 0x0054 }
            com.airbnb.lottie.r r5 = m5245c(r6, r7)     // Catch:{ NotFoundException -> 0x0054 }
            return r5
        L_0x0054:
            r5 = move-exception
            com.airbnb.lottie.r r6 = new com.airbnb.lottie.r
            r6.<init>((java.lang.Throwable) r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C1868g.m5247e(android.content.Context, int, java.lang.String):com.airbnb.lottie.r");
    }

    /* renamed from: f */
    public static C1906t<C1867f> m5248f(Context context, String str) {
        String k = C25541a.m63881k("url_", str);
        return m5243a(k, new C1872h(context, str, k));
    }

    /* renamed from: g */
    public static C1904r<C1867f> m5249g(ZipInputStream zipInputStream, String str) {
        try {
            return m5250h(zipInputStream, str);
        } finally {
            C5059g.m12909b(zipInputStream);
        }
    }

    /* renamed from: h */
    public static C1904r<C1867f> m5250h(ZipInputStream zipInputStream, String str) {
        C1898n nVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1867f fVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    C24918x c = C24911r.m62547c(C24911r.m62553i(zipInputStream));
                    String[] strArr = JsonReader.f6647f;
                    fVar = (C1867f) m5246d(new C1902a(c), (String) null, false).f6703a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                        if (!name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (fVar == null) {
                return new C1904r<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<C1898n> it = fVar.f6452d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        nVar = null;
                        break;
                    }
                    nVar = it.next();
                    if (nVar.f6645c.equals(str2)) {
                        break;
                    }
                }
                if (nVar != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    int i = nVar.f6643a;
                    int i2 = nVar.f6644b;
                    C5059g.C5060a aVar = C5059g.f17057a;
                    if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    nVar.f6646d = bitmap;
                }
            }
            for (Map.Entry next : fVar.f6452d.entrySet()) {
                if (((C1898n) next.getValue()).f6646d == null) {
                    StringBuilder k = C13555b.m33972k("There is no image for ");
                    k.append(((C1898n) next.getValue()).f6645c);
                    return new C1904r<>((Throwable) new IllegalStateException(k.toString()));
                }
            }
            if (str != null) {
                C1484f.f5384b.f5385a.put(str, fVar);
            }
            return new C1904r<>(fVar);
        } catch (IOException e) {
            return new C1904r<>((Throwable) e);
        }
    }

    /* renamed from: i */
    public static String m5251i(int i, Context context) {
        boolean z;
        String str;
        StringBuilder k = C13555b.m33972k("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        k.append(str);
        k.append(i);
        return k.toString();
    }
}
