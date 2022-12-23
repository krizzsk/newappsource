package s80;

import a30.C0068a;
import a30.C0072d;
import android.util.SparseArray;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.commons.request.ServerException;
import com.moovit.image.model.Image;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.ticketingV2.MVWizardType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p066e0.C4436j0;
import p390bm.C13643a;
import p469eo.C16846b;
import p584jl.C17885a;
import p634ln.C18247a;
import p657mn.C18406b;
import p681nn.C18577a;
import p705on.C18805l;
import p752qn.C19148f;
import p798sn.C19493a;
import p977zz.C20944i0;
import p977zz.C20964s0;

/* renamed from: s80.g */
public final class C13070g {

    /* renamed from: s80.g$a */
    public static /* synthetic */ class C13071a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32331a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVWizardType[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVWizardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32331a = r0
                com.tranzmate.moovit.protocol.ticketingV2.MVWizardType r1 = com.tranzmate.moovit.protocol.ticketingV2.MVWizardType.FLAT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32331a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVWizardType r1 = com.tranzmate.moovit.protocol.ticketingV2.MVWizardType.FILTERED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32331a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ticketingV2.MVWizardType r1 = com.tranzmate.moovit.protocol.ticketingV2.MVWizardType.STOP_TO_STOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s80.C13070g.C13071a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m33009a(C19493a aVar) {
        return C20964s0.m49102t("_", C13065d.f32318d, aVar.f49556a, Long.valueOf(C17885a.m44394D(aVar.f49565j).getTime()));
    }

    /* renamed from: b */
    public static String m33010b(C0068a aVar, C19493a aVar2) throws ServerException {
        String str = aVar2.f49573r;
        if (C20964s0.m49090h(str)) {
            synchronized (aVar) {
                C14333w2 w2Var = new C14333w2(((C13643a) ((C16846b) aVar.mo161d().f19694c).mo49505a(C13643a.class, (String) null)).mo40528a());
                aVar.mo168k(w2Var, "Failed to get LocalEnvironmentInfo - brand id");
                str = ((C18577a) w2Var.f36107c).f47287d;
            }
        }
        return str;
    }

    /* renamed from: c */
    public static long m33011c(Date date) {
        if (date != null) {
            return date.getTime();
        }
        return -1;
    }

    /* renamed from: d */
    public static TicketFare m33012d(TicketAgency ticketAgency, SparseArray<String> sparseArray, C18805l lVar) {
        String str;
        C18805l lVar2 = lVar;
        String valueOf = String.valueOf(lVar2.f47901d);
        String str2 = lVar2.f47903f;
        String str3 = lVar2.f47910m;
        C19148f fVar = lVar2.f47904g;
        CurrencyAmount currencyAmount = new CurrencyAmount(fVar.f48694a, new BigDecimal(fVar.f48695b.intValue()).movePointLeft(2));
        int max = Math.max(1, lVar2.f47902e.intValue());
        C18406b bVar = lVar2.f47905h;
        if (bVar == null) {
            str = null;
        } else {
            String str4 = bVar.f46929b;
            str = bVar.f46928a;
            if (!C20964s0.m49090h(str4)) {
                StringBuilder l = C13555b.m33973l("<b>", str4, "</b>\n");
                if (str == null) {
                    str = "";
                }
                l.append(str);
                str = l.toString();
            }
        }
        return new TicketFare(valueOf, C13065d.f32318d, str2, str3, currencyAmount, currencyAmount, max, ticketAgency, str, (Image) null, PurchaseVerificationType.CVV, sparseArray);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s80.C13063b m33013e(android.util.SparseArray<java.lang.String> r7) {
        /*
            r0 = 0
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.webkit.URLUtil.isValidUrl(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            if (r0 != 0) goto L_0x0013
            return r2
        L_0x0013:
            r1 = 2
            java.lang.Object r3 = r7.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = p977zz.C20964s0.m49090h(r3)
            r5 = -1
            if (r4 != 0) goto L_0x0035
            boolean r4 = p977zz.C20964s0.m49089g(r3)
            if (r4 != 0) goto L_0x0028
            goto L_0x0035
        L_0x0028:
            int r3 = java.lang.Integer.parseInt(r3)
            com.tranzmate.moovit.protocol.ticketingV2.MVWizardType r3 = com.tranzmate.moovit.protocol.ticketingV2.MVWizardType.findByValue(r3)
            int r3 = m33016h(r3)
            goto L_0x0036
        L_0x0035:
            r3 = -1
        L_0x0036:
            if (r3 != r5) goto L_0x0039
            return r2
        L_0x0039:
            r4 = 1
            java.lang.Object r4 = r7.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = p977zz.C20964s0.m49090h(r4)
            if (r5 == 0) goto L_0x0047
            goto L_0x0053
        L_0x0047:
            r5 = 44
            java.lang.String[] r4 = p977zz.C20964s0.m49080A(r4, r5)
            boolean r5 = mf0.C24361g.m61154X(r4)
            if (r5 == 0) goto L_0x0055
        L_0x0053:
            r4 = r2
            goto L_0x0059
        L_0x0055:
            java.util.List r4 = java.util.Arrays.asList(r4)
        L_0x0059:
            if (r3 != r1) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            return r2
        L_0x005e:
            r5 = 3
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 4
            java.lang.Object r7 = r7.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = p977zz.C20964s0.m49090h(r5)
            if (r6 == 0) goto L_0x0079
            boolean r6 = p977zz.C20964s0.m49090h(r7)
            if (r6 == 0) goto L_0x0079
            goto L_0x009c
        L_0x0079:
            boolean r6 = p977zz.C20964s0.m49089g(r5)
            if (r6 == 0) goto L_0x009c
            boolean r6 = p977zz.C20964s0.m49089g(r7)
            if (r6 != 0) goto L_0x0086
            goto L_0x009c
        L_0x0086:
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r7 = java.lang.Integer.parseInt(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            zz.i0 r6 = new zz.i0
            r6.<init>(r5, r7)
            goto L_0x009d
        L_0x009c:
            r6 = r2
        L_0x009d:
            if (r3 != r1) goto L_0x00a2
            if (r6 != 0) goto L_0x00a2
            return r2
        L_0x00a2:
            s80.b r7 = new s80.b
            r7.<init>(r0, r4, r3, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s80.C13070g.m33013e(android.util.SparseArray):s80.b");
    }

    /* renamed from: f */
    public static Ticket m33014f(C0068a aVar, TicketAgency ticketAgency, Map<C19493a, C7755c> map, C19493a aVar2) throws ServerException {
        C4436j0 j0Var;
        String str;
        String str2;
        C0072d dVar;
        C19493a aVar3 = aVar2;
        Map<String, String> map2 = aVar.f144b;
        Ticket.Status g = m33015g(aVar2);
        if (g != Ticket.Status.ACTIVE) {
            String str3 = aVar3.f49561f;
            synchronized (aVar) {
                dVar = new C0072d(aVar.mo161d().mo50524c(), str3);
            }
            j0Var = new C4436j0(dVar);
        } else {
            j0Var = null;
        }
        TicketId ticketId = new TicketId(C13065d.f32318d, ticketAgency.f23495b, aVar3.f49561f, map2);
        String str4 = aVar3.f49561f;
        String str5 = aVar3.f49564i;
        String str6 = aVar3.f49576u;
        C19148f fVar = aVar3.f49572q;
        CurrencyAmount currencyAmount = new CurrencyAmount(fVar.f48694a, new BigDecimal(fVar.f48695b.intValue()).movePointLeft(2));
        long c = m33011c(C17885a.m44394D(aVar3.f49565j));
        long c2 = m33011c(C17885a.m44394D(aVar3.f49562g));
        long c3 = m33011c(C17885a.m44394D(aVar3.f49563h));
        long c4 = m33011c(C17885a.m44446k0(aVar3.f49566k));
        long c5 = m33011c(C17885a.m44446k0(aVar3.f49567l));
        C7755c cVar = map.get(aVar2);
        C18247a aVar4 = aVar3.f49568m;
        if (aVar4 != null) {
            str = aVar4.f46553b;
        } else {
            str = null;
        }
        C18247a aVar5 = aVar3.f49570o;
        if (aVar5 != null) {
            str2 = aVar5.f46553b;
        } else {
            str2 = null;
        }
        return new Ticket(ticketId, str4, g, str5, str6, ticketAgency, currencyAmount, c, c2, c3, c4, c5, (String) null, (String) null, cVar, (Ticket.Alert) null, j0Var, str, str2, aVar3.f49556a, (String) null);
    }

    /* renamed from: g */
    public static Ticket.Status m33015g(C19493a aVar) {
        String str = aVar.f49560e;
        str.getClass();
        boolean z = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1031784143:
                if (str.equals("CANCELLED")) {
                    c = 0;
                    break;
                }
                break;
            case -591252731:
                if (str.equals("EXPIRED")) {
                    c = 1;
                    break;
                }
                break;
            case 2337004:
                if (str.equals("LIVE")) {
                    c = 2;
                    break;
                }
                break;
            case 2614205:
                if (str.equals("USED")) {
                    c = 3;
                    break;
                }
                break;
            case 74702359:
                if (str.equals("REFUNDED")) {
                    c = 4;
                    break;
                }
                break;
            case 1002248058:
                if (str.equals("BEFORE_VP")) {
                    c = 5;
                    break;
                }
                break;
            case 1925346054:
                if (str.equals("ACTIVE")) {
                    c = 6;
                    break;
                }
                break;
            case 2096142030:
                if (str.equals("PENDING_ACTIVE")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 4:
                return Ticket.Status.EXPIRED;
            case 2:
            case 7:
                if (aVar.f49555A && aVar.f49575t.intValue() > 0 && C17885a.m44446k0(aVar.f49567l) != null) {
                    z = true;
                }
                if (z) {
                    return Ticket.Status.ACTIVE;
                }
                return Ticket.Status.VALID;
            case 5:
                return Ticket.Status.NOT_YET_VALID;
            case 6:
                return Ticket.Status.ACTIVE;
            default:
                throw new IllegalStateException("failed to decode ticket status");
        }
    }

    /* renamed from: h */
    public static int m33016h(MVWizardType mVWizardType) {
        int i = C13071a.f32331a[mVWizardType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new IllegalStateException("Failed to decode Masabi wizard type: " + mVWizardType);
    }

    /* renamed from: i */
    public static SparseArray<String> m33017i(C13063b bVar) {
        MVWizardType mVWizardType;
        SparseArray<String> sparseArray = new SparseArray<>(5);
        sparseArray.put(0, bVar.f32313a);
        int i = bVar.f32315c;
        if (i == 0) {
            mVWizardType = MVWizardType.FLAT;
        } else if (i == 1) {
            mVWizardType = MVWizardType.FILTERED;
        } else if (i == 2) {
            mVWizardType = MVWizardType.STOP_TO_STOP;
        } else {
            throw new IllegalStateException(C16759e.m42349e("failed to encode Masabi wizard type: ", i));
        }
        sparseArray.put(2, String.valueOf(mVWizardType.getValue()));
        List<String> list = bVar.f32314b;
        if (list != null) {
            sparseArray.put(1, C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, list));
        }
        C20944i0<Integer, Integer> i0Var = bVar.f32316d;
        if (i0Var != null) {
            sparseArray.put(3, String.valueOf(i0Var.f52692a));
            sparseArray.put(4, String.valueOf(bVar.f32316d.f52693b));
        }
        return sparseArray;
    }
}
