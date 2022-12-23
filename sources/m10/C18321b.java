package m10;

import android.content.Context;
import f00.C16919g;
import java.util.concurrent.TimeUnit;

/* renamed from: m10.b */
public final class C18321b {

    /* renamed from: a */
    public static final C16919g.C16920a f46723a = new C16919g.C16920a("visited_change_metro", false);

    /* renamed from: b */
    public static final C16919g.C16920a f46724b = new C16919g.C16920a("visited_itinerary", false);

    /* renamed from: c */
    public static final C16919g.C16920a f46725c = new C16919g.C16920a("clicked_lineview_change_direction", false);

    /* renamed from: d */
    public static final C16919g.C16920a f46726d = new C16919g.C16920a("clicked_lineview_report", false);

    /* renamed from: e */
    public static final C16919g.C16924e f46727e = new C16919g.C16924e("lineview_visiting_times", 0);

    /* renamed from: f */
    public static final C16919g.C16925f f46728f = new C16919g.C16925f("last_seen_genie_coach_mark_time", 0);

    /* renamed from: g */
    public static final long f46729g = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a */
    public static boolean m45096a(Context context) {
        if (System.currentTimeMillis() - f46728f.mo19759a(context.getSharedPreferences("genies_prefs", 0)).longValue() < f46729g) {
            return true;
        }
        return false;
    }
}
