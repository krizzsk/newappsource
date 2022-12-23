package aa0;

import a00.C13382a;
import android.widget.TextView;
import com.moovit.commons.utils.C15780a;
import com.moovit.util.time.CongestionLevel;
import com.moovit.util.time.CongestionSource;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19746x;
import p977zz.C20941h;
import x00.C20440a;

/* renamed from: aa0.s */
public final class C7554s {

    /* renamed from: a */
    public static final C20440a f23036a = new C20440a((CharSequence) " ", (String) null);

    /* renamed from: b */
    public static final C20440a f23037b = new C20440a((CharSequence) ", ", (String) null);

    /* renamed from: aa0.s$a */
    public static /* synthetic */ class C7555a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23038a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.util.time.CongestionLevel[] r0 = com.moovit.util.time.CongestionLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23038a = r0
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.EMPTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23038a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.FEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23038a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.LOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23038a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.MED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23038a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.HIGH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23038a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.FULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23038a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.PACKED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aa0.C7554s.C7555a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m17296a(TextView textView, CongestionLevel congestionLevel, CongestionSource congestionSource) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        switch (C7555a.f23038a[congestionLevel.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i2 = C19739q.ic_crowded_low_16_on_surface_emphasis_medium;
                if (CongestionSource.PREDICTION.equals(congestionSource)) {
                    i4 = C19746x.crowdedness_line_usually_available_seats;
                } else {
                    i4 = C19746x.crowdedness_line_available_seats;
                }
                i3 = C19735m.colorOnSurfaceEmphasisMedium;
                break;
            case 4:
            case 5:
                i2 = C19739q.ic_crowded_medium_16_on_surface_emphasis_medium;
                if (CongestionSource.PREDICTION.equals(congestionSource)) {
                    i5 = C19746x.crowdedness_line_usually_standing_only;
                } else {
                    i5 = C19746x.crowdedness_line_standing_only;
                }
                i3 = C19735m.colorOnSurfaceEmphasisMedium;
                break;
            case 6:
            case 7:
                i2 = C19739q.ic_crowded_high_16_critical;
                if (CongestionSource.PREDICTION.equals(congestionSource)) {
                    i = C19746x.crowdedness_line_usually_crowded;
                } else {
                    i = C19746x.crowdedness_line_crowded;
                }
                i3 = C19735m.colorCritical;
                break;
            default:
                i2 = 0;
                i = 0;
                i3 = 0;
                break;
        }
        C15780a.m40272e(textView, i2);
        textView.setText(i);
        textView.setTextColor(C20941h.m49043f(i3, textView.getContext()));
        C13382a.m33674j(textView, textView.getContext().getString(C19746x.voiceover_line_crowdedness, new Object[]{textView.getText()}));
    }
}
