package p084f6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: f6.i */
public final class C4700i {

    /* renamed from: a */
    public final int f15969a;

    /* renamed from: b */
    public final int f15970b;

    /* renamed from: c */
    public final int f15971c;

    /* renamed from: f6.i$a */
    public static final class C4701a {

        /* renamed from: e */
        public static final int f15972e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        public final Context f15973a;

        /* renamed from: b */
        public ActivityManager f15974b;

        /* renamed from: c */
        public C4702b f15975c;

        /* renamed from: d */
        public float f15976d = ((float) f15972e);

        public C4701a(Context context) {
            this.f15973a = context;
            this.f15974b = (ActivityManager) context.getSystemService("activity");
            this.f15975c = new C4702b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f15974b.isLowRamDevice()) {
                this.f15976d = BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    /* renamed from: f6.i$b */
    public static final class C4702b {

        /* renamed from: a */
        public final DisplayMetrics f15977a;

        public C4702b(DisplayMetrics displayMetrics) {
            this.f15977a = displayMetrics;
        }
    }

    public C4700i(C4701a aVar) {
        int i;
        Context context = aVar.f15973a;
        if (aVar.f15974b.isLowRamDevice()) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        this.f15971c = i;
        ActivityManager activityManager = aVar.f15974b;
        float f = 0.4f;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : f));
        DisplayMetrics displayMetrics = aVar.f15975c.f15977a;
        float f2 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f15976d * f2);
        int round3 = Math.round(f2 * 2.0f);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.f15970b = round3;
            this.f15969a = round2;
        } else {
            float f3 = ((float) i2) / (aVar.f15976d + 2.0f);
            this.f15970b = Math.round(2.0f * f3);
            this.f15969a = Math.round(f3 * aVar.f15976d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, (long) this.f15970b);
            Formatter.formatFileSize(context, (long) this.f15969a);
            Formatter.formatFileSize(context, (long) i);
            Formatter.formatFileSize(context, (long) round);
            aVar.f15974b.getMemoryClass();
            aVar.f15974b.isLowRamDevice();
        }
    }
}
