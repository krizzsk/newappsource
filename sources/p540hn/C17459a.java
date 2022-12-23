package p540hn;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.error.ConvertedErrorException;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p364al.C13483d;
import p364al.C13487h;
import p561ik.C17618a;
import p583jk.C17873f;
import p725pj.C18926a;
import p728pm.C18933a;
import p798sn.C19493a;
import p798sn.C19494b;
import p821tm.C19707k;
import p821tm.C19708l;
import p891wk.C20362q;
import p962zk.C20872a;

/* renamed from: hn.a */
public final class C17459a implements C13483d {

    /* renamed from: a */
    public final C19708l f44957a;

    /* renamed from: b */
    public final C19707k f44958b;

    /* renamed from: c */
    public final C18933a f44959c;

    /* renamed from: d */
    public final C17873f f44960d;

    /* renamed from: hn.a$a */
    public static /* synthetic */ class C17460a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44961a;

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
                f44961a = r0
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.LIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44961a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.LIVE_UNUSABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44961a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44961a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.BEFORE_VP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44961a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f44961a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.REFUNDED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f44961a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.USED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f44961a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p540hn.C17459a.C17460a.<clinit>():void");
        }
    }

    public C17459a(C19708l lVar, C19707k kVar, C18933a aVar, C17873f fVar) {
        this.f44957a = lVar;
        this.f44958b = kVar;
        this.f44959c = aVar;
        this.f44960d = fVar;
    }

    /* renamed from: C */
    public final C13487h<C19494b> mo40394C() {
        C13487h<C20872a> a = this.f44957a.mo52057a();
        if (a.mo40399a()) {
            return mo49921a(a.f33366b);
        }
        List<C20362q> list = ((C20872a) a.f33365a).f52608a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C13487h<List<C19493a>> a2 = this.f44958b.mo52056a(list);
        if (a2.mo40399a()) {
            return mo49921a(a2.f33366b);
        }
        for (C19493a aVar : (List) a2.f33365a) {
            switch (C17460a.f44961a[TicketState.parse(aVar.f49560e).ordinal()]) {
                case 1:
                case 2:
                    arrayList.add(aVar);
                    break;
                case 3:
                    arrayList2.add(aVar);
                    break;
                case 4:
                    arrayList3.add(aVar);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    arrayList4.add(aVar);
                    break;
            }
        }
        try {
            C18933a aVar2 = this.f44959c;
            aVar2.getClass();
            Date date = new Date(aVar2.mo51447a().f51531d);
            Collections.emptyList();
            Collections.emptyList();
            Collections.emptyList();
            Collections.emptyList();
            return new C13487h<>(new C19494b(arrayList2, arrayList, arrayList3, arrayList4, date), (C18926a) null);
        } catch (ConvertedErrorException e) {
            this.f44960d.getClass();
            return mo49921a(C17873f.m44275b(e));
        }
    }

    /* renamed from: a */
    public final C13487h<C19494b> mo49921a(C18926a aVar) {
        return new C13487h<>(null, new C17618a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS)));
    }
}
