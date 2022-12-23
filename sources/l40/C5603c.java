package l40;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.CompressUtils;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import p824tp.C19731i;
import p824tp.C19746x;
import p906wz.C20431c;
import p977zz.C20944i0;
import p977zz.C20978z;
import u00.C19815e;

/* renamed from: l40.c */
public final class C5603c implements Callable<Boolean> {

    /* renamed from: j */
    public static final Object f18340j = new Object();

    /* renamed from: k */
    public static final int[] f18341k = {3887, 1327, 1295, 192};

    /* renamed from: b */
    public final Context f18342b;

    /* renamed from: c */
    public final ServerId f18343c;

    /* renamed from: d */
    public final long f18344d;

    /* renamed from: e */
    public final String f18345e;

    /* renamed from: f */
    public final int f18346f;

    /* renamed from: g */
    public final CompressUtils.CompressionMode f18347g;

    /* renamed from: h */
    public final boolean f18348h;

    /* renamed from: i */
    public final Object[] f18349i;

    /* renamed from: l40.c$a */
    public static /* synthetic */ class C5604a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18350a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.commons.utils.CompressUtils$CompressionMode[] r0 = com.moovit.commons.utils.CompressUtils.CompressionMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18350a = r0
                com.moovit.commons.utils.CompressUtils$CompressionMode r1 = com.moovit.commons.utils.CompressUtils.CompressionMode.GZIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18350a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.commons.utils.CompressUtils$CompressionMode r1 = com.moovit.commons.utils.CompressUtils.CompressionMode.LZMA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l40.C5603c.C5604a.<clinit>():void");
        }
    }

    public C5603c(Context context, ServerId serverId, long j, String str, int i, boolean z) {
        boolean z2;
        CompressUtils.CompressionMode compressionMode;
        String str2;
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f18342b = context.getApplicationContext();
        C21100e.m49373x(serverId, "metroId");
        this.f18343c = serverId;
        this.f18345e = str;
        this.f18344d = j;
        this.f18346f = i;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && !activityManager.isLowRamDevice() && Runtime.getRuntime().availableProcessors() >= 2 && ((float) activityManager.getLargeMemoryClass()) * 0.25f >= 10.0f) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            z2 = !memoryInfo.lowMemory;
        } else {
            z2 = false;
        }
        if (z2) {
            compressionMode = CompressUtils.CompressionMode.LZMA;
        } else {
            compressionMode = CompressUtils.CompressionMode.GZIP;
        }
        this.f18347g = compressionMode;
        this.f18348h = z;
        Object[] objArr = new Object[2];
        this.f18349i = objArr;
        CompressUtils.C15760a aVar = CompressUtils.f41008a;
        int i2 = CompressUtils.C15761b.f41009a[compressionMode.ordinal()];
        if (i2 == 2) {
            str2 = ".gzip";
        } else if (i2 != 3) {
            str2 = ".identity";
        } else {
            str2 = ".lzma";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(C13749c.m34339y(context).getValue());
    }

    /* renamed from: c */
    public static Uri.Builder m13818c(Context context, ServerId serverId, long j, CompressUtils.CompressionMode compressionMode) {
        String str;
        Uri.Builder appendEncodedPath = C20431c.m48016z(C19746x.server_path_cdn_offline_base_path, context).buildUpon().appendEncodedPath("V1").appendEncodedPath(serverId.mo19751c()).appendEncodedPath(Long.toString(j));
        int i = C5604a.f18350a[compressionMode.ordinal()];
        if (i == 1) {
            str = "GZIP";
        } else if (i == 2) {
            str = "LZMA";
        } else {
            throw new IllegalStateException("Unsupported compression mode: " + compressionMode);
        }
        return appendEncodedPath.appendEncodedPath(str);
    }

    /* renamed from: a */
    public final ArrayList mo21427a(int i) {
        boolean z;
        Uri uri;
        Uri uri2;
        ArrayList arrayList = new ArrayList();
        int[] iArr = f18341k;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < 4) {
                int i3 = iArr[i2];
                if ((i & i3) != i3) {
                    z2 = false;
                }
                if (z2) {
                    if (i3 == 192) {
                        uri2 = mo21430d().buildUpon().appendEncodedPath(mo21432f("dynamic%1$s")).build();
                    } else if (i3 == 1295) {
                        uri2 = mo21431e().buildUpon().appendEncodedPath(mo21432f("metro_entities%1$s")).build();
                    } else if (i3 == 1327) {
                        uri2 = mo21431e().buildUpon().appendEncodedPath(mo21432f("graph%1$s")).build();
                    } else if (i3 == 3887) {
                        uri2 = mo21431e().buildUpon().appendEncodedPath(mo21432f("static%1$s")).build();
                    } else {
                        StringBuilder k = C13555b.m33972k("Unknown optimized file types mask: ");
                        k.append(Integer.toBinaryString(i3));
                        throw new ApplicationBugException(k.toString());
                    }
                    arrayList.add(new C20944i0(Integer.valueOf(i3), uri2));
                    i &= ~i3;
                }
                i2++;
            } else {
                int[] iArr2 = GtfsConfiguration.f15145f;
                for (int i4 = 0; i4 < 12; i4++) {
                    int i5 = iArr2[i4];
                    if ((i & i5) == i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (i5 == 1) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("metro%1$s")).build();
                        } else if (i5 == 2) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("lines%1$s")).build();
                        } else if (i5 == 4) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("stops%1$s")).build();
                        } else if (i5 == 8) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("patterns%1$s")).build();
                        } else if (i5 == 16) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("images_%2$d%1$s")).build();
                        } else if (i5 == 32) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("walks%1$s")).build();
                        } else if (i5 == 64) {
                            uri = mo21430d().buildUpon().appendEncodedPath(mo21432f("services%1$s")).build();
                        } else if (i5 == 128) {
                            uri = mo21430d().buildUpon().appendEncodedPath(mo21432f("trips%1$s")).build();
                        } else if (i5 == 256) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("bicycle_stops%1$s")).build();
                        } else if (i5 == 512) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("shapes%1$s")).build();
                        } else if (i5 == 1024) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("frequencies%1$s")).build();
                        } else if (i5 == 2048) {
                            uri = mo21431e().buildUpon().appendEncodedPath(mo21432f("shape_segments%1$s")).build();
                        } else {
                            throw new ApplicationBugException(C16759e.m42349e("Unknown file type: ", i5));
                        }
                        arrayList.add(new C20944i0(Integer.valueOf(i5), uri));
                        i &= ~i5;
                    }
                }
                return arrayList;
            }
        }
    }

    /* renamed from: b */
    public final Boolean call() throws Exception {
        int i;
        synchronized (f18340j) {
            C19815e d = C19731i.m47197a(this.f18342b).mo52084b(this.f18343c, this.f18344d).mo51802d();
            if (this.f18348h) {
                i = this.f18346f;
            } else {
                i = this.f18346f;
                int[] iArr = GtfsConfiguration.f15145f;
                for (int i2 = 0; i2 < 12; i2++) {
                    int i3 = iArr[i2];
                    if (d.mo52120l(i3, this.f18342b)) {
                        i &= ~i3;
                    }
                }
            }
            ArrayList a = mo21427a(i);
            if (!a.isEmpty()) {
                File j = d.mo52118j(this.f18342b, true);
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    C20944i0 i0Var = (C20944i0) it.next();
                    int intValue = ((Integer) i0Var.f52692a).intValue();
                    Uri uri = (Uri) i0Var.f52693b;
                    File file = new File(j, uri.getLastPathSegment());
                    file.getName();
                    if (C20978z.m49126b(uri, file) || !d.mo52120l(intValue, this.f18342b)) {
                        file.getName();
                        CompressUtils.m40226a(file, j, this.f18347g);
                    }
                    d.mo52122n(intValue, this.f18342b);
                }
            }
        }
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public final Uri mo21430d() {
        return m13818c(this.f18342b, this.f18343c, this.f18344d, this.f18347g).appendEncodedPath("W").build();
    }

    /* renamed from: e */
    public final Uri mo21431e() {
        Uri.Builder appendEncodedPath = m13818c(this.f18342b, this.f18343c, this.f18344d, this.f18347g).appendEncodedPath("S");
        String str = this.f18345e;
        if (str != null) {
            appendEncodedPath.appendEncodedPath(str);
        }
        return appendEncodedPath.build();
    }

    /* renamed from: f */
    public final String mo21432f(String str) {
        return String.format(Locale.ENGLISH, str, this.f18349i);
    }
}
