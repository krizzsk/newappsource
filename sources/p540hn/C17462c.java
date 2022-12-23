package p540hn;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.error.ConvertedErrorException;
import java.util.Date;
import p364al.C13483d;
import p364al.C13487h;
import p561ik.C17618a;
import p583jk.C17873f;
import p725pj.C18926a;
import p728pm.C18933a;
import p798sn.C19495c;
import p821tm.C19708l;
import p891wk.C20362q;
import p962zk.C20872a;

/* renamed from: hn.c */
public final class C17462c implements C13483d {

    /* renamed from: a */
    public final C19708l f44964a;

    /* renamed from: b */
    public final C18933a f44965b;

    /* renamed from: c */
    public final C17873f f44966c;

    /* renamed from: hn.c$a */
    public static /* synthetic */ class C17463a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44967a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.masabi.justride.sdk.internal.models.ticket.TicketState[] r0 = com.masabi.justride.sdk.internal.models.ticket.TicketState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44967a = r0
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.LIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44967a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.LIVE_UNUSABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44967a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44967a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.BEFORE_VP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44967a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f44967a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.REFUNDED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f44967a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.USED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f44967a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p540hn.C17462c.C17463a.<clinit>():void");
        }
    }

    public C17462c(C19708l lVar, C18933a aVar, C17873f fVar) {
        this.f44964a = lVar;
        this.f44965b = aVar;
        this.f44966c = fVar;
    }

    /* renamed from: C */
    public final C13487h<C19495c> mo40394C() {
        C13487h<C20872a> a = this.f44964a.mo52057a();
        boolean a2 = a.mo40399a();
        Integer valueOf = Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        if (a2) {
            return new C13487h<>(null, new C17618a(a.f33366b, valueOf));
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (C20362q qVar : ((C20872a) a.f33365a).f52608a) {
            switch (C17463a.f44967a[qVar.f51582D.ordinal()]) {
                case 1:
                case 2:
                    i2++;
                    break;
                case 3:
                    i++;
                    break;
                case 4:
                    i3++;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    i4++;
                    break;
            }
        }
        int i5 = ((C20872a) a.f33365a).f52609b;
        try {
            C18933a aVar = this.f44965b;
            aVar.getClass();
            return new C13487h<>(new C19495c(i, i2, i3, i4, i5, new Date(aVar.mo51447a().f51531d)), (C18926a) null);
        } catch (ConvertedErrorException e) {
            this.f44966c.getClass();
            return new C13487h<>(null, new C17618a(C17873f.m44275b(e), valueOf));
        }
    }
}
