package com.veriff.sdk.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.veriff.sdk.internal.cs */
final class C21537cs {

    /* renamed from: a */
    public static final StringBuilder f54217a = new StringBuilder();

    /* renamed from: b */
    private static final abl f54218b = abl.m50461a("RIFF");

    /* renamed from: c */
    private static final abl f54219c = abl.m50461a("WEBP");

    /* renamed from: com.veriff.sdk.internal.cs$a */
    public static class C21539a extends Thread {
        public C21539a(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.veriff.sdk.internal.cs$b */
    public static class C21540b implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new C21539a(runnable);
        }
    }

    /* renamed from: a */
    public static int m51493a(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: b */
    public static boolean m51509b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public static boolean m51511c(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m51508b(Context context) {
        ActivityManager activityManager = (ActivityManager) m51497a(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7);
    }

    /* renamed from: a */
    public static <T> T m51498a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static void m51503a() {
        if (!m51509b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: a */
    public static String m51499a(C21479br brVar) {
        return m51500a(brVar, "");
    }

    /* renamed from: b */
    public static boolean m51510b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: a */
    public static String m51500a(C21479br brVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C21476bp i = brVar.mo54420i();
        if (i != null) {
            sb.append(i.f54009b.mo54512a());
        }
        List<C21476bp> k = brVar.mo54422k();
        if (k != null) {
            int size = k.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || i != null) {
                    sb.append(", ");
                }
                sb.append(k.get(i2).f54009b.mo54512a());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m51505a(String str, String str2, String str3) {
        m51506a(str, str2, str3, "");
    }

    /* renamed from: a */
    public static void m51506a(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }

    /* renamed from: a */
    public static String m51501a(C21525cl clVar) {
        StringBuilder sb = f54217a;
        String a = m51502a(clVar, sb);
        sb.setLength(0);
        return a;
    }

    /* renamed from: a */
    public static String m51502a(C21525cl clVar, StringBuilder sb) {
        String str = clVar.f54155f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(clVar.f54155f);
        } else {
            Uri uri = clVar.f54153d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(clVar.f54154e);
            }
        }
        sb.append(10);
        if (clVar.f54163n != BitmapDescriptorFactory.HUE_RED) {
            sb.append("rotation:");
            sb.append(clVar.f54163n);
            if (clVar.f54166q) {
                sb.append('@');
                sb.append(clVar.f54164o);
                sb.append('x');
                sb.append(clVar.f54165p);
            }
            sb.append(10);
        }
        if (clVar.mo54515d()) {
            sb.append("resize:");
            sb.append(clVar.f54157h);
            sb.append('x');
            sb.append(clVar.f54158i);
            sb.append(10);
        }
        if (clVar.f54159j) {
            sb.append("centerCrop:");
            sb.append(clVar.f54160k);
            sb.append(10);
        } else if (clVar.f54161l) {
            sb.append("centerInside");
            sb.append(10);
        }
        List<C21536cr> list = clVar.f54156g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(clVar.f54156g.get(i).mo54550a());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static File m51496a(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @TargetApi(18)
    /* renamed from: a */
    public static long m51494a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: a */
    public static <T> T m51497a(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: a */
    public static boolean m51507a(abk abk) throws IOException {
        return abk.mo53862a(0, f54218b) && abk.mo53862a(8, f54219c);
    }

    /* renamed from: a */
    public static int m51492a(Resources resources, C21525cl clVar) throws FileNotFoundException {
        Uri uri;
        int i = clVar.f54154e;
        if (i != 0 || (uri = clVar.f54153d) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = clVar.f54153d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder k = C13555b.m33972k("No path segments: ");
                k.append(clVar.f54153d);
                throw new FileNotFoundException(k.toString());
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder k2 = C13555b.m33972k("Last path segment is not a resource ID: ");
                    k2.append(clVar.f54153d);
                    throw new FileNotFoundException(k2.toString());
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                StringBuilder k3 = C13555b.m33972k("More than two path segments: ");
                k3.append(clVar.f54153d);
                throw new FileNotFoundException(k3.toString());
            }
        } else {
            StringBuilder k4 = C13555b.m33972k("No package provided: ");
            k4.append(clVar.f54153d);
            throw new FileNotFoundException(k4.toString());
        }
    }

    /* renamed from: a */
    public static Resources m51495a(Context context, C21525cl clVar) throws FileNotFoundException {
        Uri uri;
        if (clVar.f54154e != 0 || (uri = clVar.f54153d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder k = C13555b.m33972k("Unable to obtain resources for package: ");
                k.append(clVar.f54153d);
                throw new FileNotFoundException(k.toString());
            }
        } else {
            StringBuilder k2 = C13555b.m33972k("No package provided: ");
            k2.append(clVar.f54153d);
            throw new FileNotFoundException(k2.toString());
        }
    }

    /* renamed from: a */
    public static void m51504a(Looper looper) {
        C215381 r0 = new Handler(looper) {
            public void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }
}
