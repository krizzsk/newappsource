package p80;

import java.util.Map;
import q00.C19047a;
import q00.C19053d;
import r00.C19209a;
import r00.C19212d;
import r00.C19216h;

/* renamed from: p80.d */
public interface C12995d extends C19053d {

    /* renamed from: a */
    public static final C19209a f32165a;

    /* renamed from: b */
    public static final C12996a f32166b;

    /* renamed from: c */
    public static final C19212d f32167c = new C19212d("paymentWalletHistoryMaxDays", Integer.MAX_VALUE);

    /* renamed from: d */
    public static final C19209a f32168d;

    /* renamed from: e */
    public static final C19216h f32169e = new C19216h("TICKET_DETAILS_USAGE_INSTRUCTIONS_URL", (String) null);

    /* renamed from: p80.d$a */
    public class C12996a extends C19047a.C19049b<Boolean> {
        public C12996a(Boolean bool) {
            super(bool);
        }

        /* renamed from: a */
        public final Object mo39882a(Map map) throws Exception {
            boolean z;
            String str = (String) map.get("homeTabs");
            if (str == null || !str.contains("TICKETING_WALLET")) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f32165a = new C19209a("IS_TICKETING_V2_SUPPORTED", bool);
        f32166b = new C12996a(bool);
        f32168d = new C19209a("SHOULD_USE_CLEAN_TICKET_REPRESENTATION", bool);
    }
}
