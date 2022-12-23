package q80;

import android.util.SparseArray;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import c00.C13733n;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.EventLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.ticketing.purchase.cart.CartInfo;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegMissingFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegPurchasableFare;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.ticketingV2.MVFilter;
import com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLeg;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLineLeg;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n10.C18505b;
import p241s0.C6302b;
import p241s0.C6307g;
import p543hq.C17478e;
import p641lu.C18277b;
import p714ow.C18847a;
import p80.C12989a;
import p80.C12991b;
import p810sz.C19617r;
import p826tr.C19752b;
import p977zz.C20944i0;
import p977zz.C20964s0;

/* renamed from: q80.y */
public final class C13036y {

    /* renamed from: a */
    public static final C19617r f32248a;

    /* renamed from: q80.y$a */
    public static /* synthetic */ class C13037a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32249a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f32250b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f32251c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f32252d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f32253e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f32254f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f32255g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f32256h;

        /* renamed from: i */
        public static final /* synthetic */ int[] f32257i;

        /* renamed from: j */
        public static final /* synthetic */ int[] f32258j;

        /* JADX WARNING: Can't wrap try/catch for region: R(75:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|(2:47|48)|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|(2:85|86)|87|89|90|(2:91|92)|93|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(76:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|(2:85|86)|87|89|90|(2:91|92)|93|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(78:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|86|87|89|90|(2:91|92)|93|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(79:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|86|87|89|90|(2:91|92)|93|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|86|87|89|90|(2:91|92)|93|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(81:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|86|87|89|90|(2:91|92)|93|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(83:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|86|87|89|90|(2:91|92)|93|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(85:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|86|87|89|90|91|92|93|95|96|97|98|100) */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00bb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0105 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x010f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0123 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x013e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0148 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0152 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0188 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01a3 */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32258j = r0
                r1 = 1
                com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType r2 = com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType.INFO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32258j     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType r3 = com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType.POSITIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f32258j     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType r4 = com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType.ALERT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f32258j     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType r5 = com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType.CRITICAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities[] r4 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f32257i = r4
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r5 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.TICKETS_FLAT_PURCHASE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f32257i     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r5 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.STORED_VALUE_PURCHASE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f32257i     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r5 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.STORED_VALUE_AUTOLOAD     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = f32257i     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r5 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.TICKETS_JOURNEY_PURCHASE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                r4 = 5
                int[] r5 = f32257i     // Catch:{ NoSuchFieldError -> 0x006d }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r6 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.SPLIT_FARE_PAYMENTS     // Catch:{ NoSuchFieldError -> 0x006d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                r5 = 6
                int[] r6 = f32257i     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.PROVIDER_LEVEL_VALIDATION_INFO     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r6 = f32257i     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.OFFLINE_MODE     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r6 = f32257i     // Catch:{ NoSuchFieldError -> 0x008f }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities.PURCHASE_PAYMENT_ACCOUNT_SENSITIVE     // Catch:{ NoSuchFieldError -> 0x008f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r8 = 8
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                com.tranzmate.moovit.protocol.ticketingV2.MVFilterSelectionPresentationType[] r6 = com.tranzmate.moovit.protocol.ticketingV2.MVFilterSelectionPresentationType.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f32256h = r6
                com.tranzmate.moovit.protocol.ticketingV2.MVFilterSelectionPresentationType r7 = com.tranzmate.moovit.protocol.ticketingV2.MVFilterSelectionPresentationType.Indicators     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                int[] r6 = f32256h     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.tranzmate.moovit.protocol.ticketingV2.MVFilterSelectionPresentationType r7 = com.tranzmate.moovit.protocol.ticketingV2.MVFilterSelectionPresentationType.Cards     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueStatus[] r6 = com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueStatus.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f32255g = r6
                com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueStatus r7 = com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueStatus.f29111OK     // Catch:{ NoSuchFieldError -> 0x00bb }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bb }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00bb }
            L_0x00bb:
                int[] r6 = f32255g     // Catch:{ NoSuchFieldError -> 0x00c5 }
                com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueStatus r7 = com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueStatus.LOW_BALANCE     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert[] r6 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f32254f = r6
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert.EXPIRING     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                int[] r6 = f32254f     // Catch:{ NoSuchFieldError -> 0x00e0 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert.PASSBOOK_LOW_TRIP     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                int[] r6 = f32254f     // Catch:{ NoSuchFieldError -> 0x00ea }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketAlert.PURCHASE_FAILURE     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x00ea }
            L_0x00ea:
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus[] r6 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f32253e = r6
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus.NOT_YET_VALID     // Catch:{ NoSuchFieldError -> 0x00fb }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00fb }
            L_0x00fb:
                int[] r6 = f32253e     // Catch:{ NoSuchFieldError -> 0x0105 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus.PURCHASED     // Catch:{ NoSuchFieldError -> 0x0105 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0105 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0105 }
            L_0x0105:
                int[] r6 = f32253e     // Catch:{ NoSuchFieldError -> 0x010f }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus.AUTO_ACTIVE     // Catch:{ NoSuchFieldError -> 0x010f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x010f }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x010f }
            L_0x010f:
                int[] r6 = f32253e     // Catch:{ NoSuchFieldError -> 0x0119 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                int[] r6 = f32253e     // Catch:{ NoSuchFieldError -> 0x0123 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0123 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0123 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0123 }
            L_0x0123:
                int[] r4 = f32253e     // Catch:{ NoSuchFieldError -> 0x012d }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus r6 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatus.ISSUING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x012d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x012d }
                r4[r6] = r5     // Catch:{ NoSuchFieldError -> 0x012d }
            L_0x012d:
                com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat[] r4 = com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f32252d = r4
                com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat r5 = com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat.BASE64_IMAGE     // Catch:{ NoSuchFieldError -> 0x013e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x013e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x013e }
            L_0x013e:
                int[] r4 = f32252d     // Catch:{ NoSuchFieldError -> 0x0148 }
                com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat r5 = com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat.AZTEC     // Catch:{ NoSuchFieldError -> 0x0148 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0148 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0148 }
            L_0x0148:
                int[] r4 = f32252d     // Catch:{ NoSuchFieldError -> 0x0152 }
                com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat r5 = com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat.CODE_128     // Catch:{ NoSuchFieldError -> 0x0152 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0152 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0152 }
            L_0x0152:
                int[] r2 = f32252d     // Catch:{ NoSuchFieldError -> 0x015c }
                com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat r4 = com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat.QR_CODE     // Catch:{ NoSuchFieldError -> 0x015c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryLegFareType[] r2 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryLegFareType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32251c = r2
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryLegFareType r3 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryLegFareType.PURCHASABLE     // Catch:{ NoSuchFieldError -> 0x016d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x016d }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x016d }
            L_0x016d:
                int[] r2 = f32251c     // Catch:{ NoSuchFieldError -> 0x0177 }
                com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryLegFareType r3 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryLegFareType.INCLUDED     // Catch:{ NoSuchFieldError -> 0x0177 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0177 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0177 }
            L_0x0177:
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType[] r2 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32250b = r2
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType.NONE     // Catch:{ NoSuchFieldError -> 0x0188 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0188 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0188 }
            L_0x0188:
                int[] r2 = f32250b     // Catch:{ NoSuchFieldError -> 0x0192 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType.CVV     // Catch:{ NoSuchFieldError -> 0x0192 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0192 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0192 }
            L_0x0192:
                com.moovit.ticketing.providers.TicketingEngine[] r2 = com.moovit.ticketing.providers.TicketingEngine.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32249a = r2
                com.moovit.ticketing.providers.TicketingEngine r3 = com.moovit.ticketing.providers.TicketingEngine.MASABI     // Catch:{ NoSuchFieldError -> 0x01a3 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a3 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x01a3 }
            L_0x01a3:
                int[] r1 = f32249a     // Catch:{ NoSuchFieldError -> 0x01ad }
                com.moovit.ticketing.providers.TicketingEngine r2 = com.moovit.ticketing.providers.TicketingEngine.XIMEDES     // Catch:{ NoSuchFieldError -> 0x01ad }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ad }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x01ad }
            L_0x01ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q80.C13036y.C13037a.<clinit>():void");
        }
    }

    /* renamed from: q80.y$b */
    public static class C13038b implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final ArrayList f32259b = new ArrayList();

        /* renamed from: c */
        public final ArrayList f32260c = new ArrayList();

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo39911c(TaxiLeg taxiLeg) {
            return null;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            mo39923o(multiTransitLinesLeg.mo48440b());
            return null;
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object mo39913e(WalkLeg walkLeg) {
            return null;
        }

        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return null;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return null;
        }

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ Object mo39916h(CarpoolLeg carpoolLeg) {
            return null;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ Object mo39917i(BicycleLeg bicycleLeg) {
            return null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ Object mo39918j(EventLeg eventLeg) {
            return null;
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return null;
        }

        /* renamed from: l */
        public final /* bridge */ /* synthetic */ Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return null;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return null;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ Object mo39922n(TransitLineLeg transitLineLeg) {
            mo39923o(transitLineLeg);
            return null;
        }

        /* renamed from: o */
        public final Void mo39923o(TransitLineLeg transitLineLeg) {
            this.f32259b.add(transitLineLeg);
            ArrayList arrayList = this.f32260c;
            long j = transitLineLeg.f42108b.f23901b;
            long j2 = transitLineLeg.f42109c.f23901b;
            int i = transitLineLeg.f42110d.getServerId().f15142b;
            int i2 = transitLineLeg.mo48332W().f23649d.f15142b;
            int i3 = transitLineLeg.mo48334e2().f23649d.f15142b;
            MVPurchaseItineraryLineLeg mVPurchaseItineraryLineLeg = new MVPurchaseItineraryLineLeg();
            mVPurchaseItineraryLineLeg.startTime = j;
            mVPurchaseItineraryLineLeg.mo32669p();
            mVPurchaseItineraryLineLeg.endTime = j2;
            mVPurchaseItineraryLineLeg.mo32666l();
            mVPurchaseItineraryLineLeg.lineId = i;
            mVPurchaseItineraryLineLeg.mo32667m();
            mVPurchaseItineraryLineLeg.originStopId = i2;
            mVPurchaseItineraryLineLeg.mo32668o();
            mVPurchaseItineraryLineLeg.destinationStopId = i3;
            mVPurchaseItineraryLineLeg.mo32665k();
            MVPurchaseItineraryLeg mVPurchaseItineraryLeg = new MVPurchaseItineraryLeg();
            mVPurchaseItineraryLeg.setField_ = MVPurchaseItineraryLeg._Fields.LINE_LEG;
            mVPurchaseItineraryLeg.value_ = mVPurchaseItineraryLineLeg;
            arrayList.add(mVPurchaseItineraryLeg);
            return null;
        }

        /* renamed from: p */
        public final /* bridge */ /* synthetic */ Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return null;
        }

        /* renamed from: q */
        public final /* bridge */ /* synthetic */ Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return null;
        }

        /* renamed from: r */
        public final /* bridge */ /* synthetic */ Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TicketItineraryLegPurchasableFare.C7706b bVar = TicketItineraryLegPurchasableFare.f23401d;
        C21100e.m49373x(bVar, "writer");
        hashMap.put(TicketItineraryLegPurchasableFare.class, new C20944i0(1, bVar));
        hashMap2.put(1, bVar);
        TicketItineraryLegMissingFare.C7704b bVar2 = TicketItineraryLegMissingFare.f23399c;
        C21100e.m49373x(bVar2, "writer");
        hashMap.put(TicketItineraryLegMissingFare.class, new C20944i0(2, bVar2));
        hashMap2.put(2, bVar2);
        f32248a = new C19617r(hashMap, hashMap2);
    }

    /* renamed from: a */
    public static IdentityHashMap m32949a(Iterable iterable, C13733n nVar, C13733n nVar2, C13733n nVar3, C13721e eVar) throws Exception {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C6302b bVar = new C6302b();
        C6302b bVar2 = new C6302b();
        for (Object next : iterable) {
            String str = (String) nVar.convert(next);
            if (!C20964s0.m49090h(str)) {
                identityHashMap.put(next, str);
                if (!bVar.containsKey(str)) {
                    bVar.put(str, (String) nVar2.convert(next));
                }
                CollectionHashMap.ArrayListHashMap arrayListHashMap = (CollectionHashMap.ArrayListHashMap) bVar2.getOrDefault(str, null);
                if (arrayListHashMap == null) {
                    arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
                    bVar2.put(str, arrayListHashMap);
                }
                arrayListHashMap.mo47001a((Ticket.Status) nVar3.convert(next), (TicketId) eVar.convert(next));
            }
        }
        C6302b bVar3 = new C6302b(bVar2.f19969d);
        Iterator it = ((C6307g.C6309b) bVar2.entrySet()).iterator();
        while (true) {
            C6307g.C6311d dVar = (C6307g.C6311d) it;
            if (!dVar.hasNext()) {
                break;
            }
            dVar.next();
            Map.Entry entry = dVar;
            String str2 = (String) entry.getKey();
            C7755c cVar = new C7755c(str2, (String) bVar.getOrDefault(str2, null), (Map) entry.getValue());
            if (cVar.f23536d > 1) {
                bVar3.put(str2, cVar);
            }
        }
        IdentityHashMap identityHashMap2 = new IdentityHashMap(bVar2.f19969d);
        for (Object next2 : iterable) {
            String str3 = (String) identityHashMap.get(next2);
            if (str3 != null) {
                identityHashMap2.put(next2, (C7755c) bVar3.getOrDefault(str3, null));
            }
        }
        return identityHashMap2;
    }

    /* renamed from: b */
    public static PurchaseFilters m32950b(List<MVFilter> list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (MVFilter next : list) {
            arrayList.add(next.title);
            arrayList2.add(next.value);
        }
        return new PurchaseFilters(arrayList, arrayList2);
    }

    /* renamed from: c */
    public static CartInfo m32951c(MVPurchaseCartInfo mVPurchaseCartInfo) {
        return new CartInfo(mVPurchaseCartInfo.cartContextId, m32957i(mVPurchaseCartInfo.verificationType), C13720d.m34273c(mVPurchaseCartInfo.cartItems, (C13722f) null, new C17478e(19)), C13749c.m34318d(mVPurchaseCartInfo.totalPrice));
    }

    /* renamed from: d */
    public static MediaTicketReceiptContent m32952d(MVMediaTicketReceiptContent mVMediaTicketReceiptContent) {
        String str;
        String str2 = mVMediaTicketReceiptContent.frontUrl;
        if (mVMediaTicketReceiptContent.mo32439f()) {
            str = mVMediaTicketReceiptContent.backUrl;
        } else {
            str = null;
        }
        return new MediaTicketReceiptContent(str2, str, (byte[]) null, (byte[]) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: com.moovit.ticketing.purchase.filter.PurchaseFilters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: com.moovit.ticketing.ticket.TicketAgency} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v7, types: [com.moovit.ticketing.purchase.filter.PurchaseFilters] */
    /* JADX WARNING: type inference failed for: r8v18, types: [com.moovit.ticketing.ticket.TicketAgency] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.ticketing.purchase.PurchaseStep m32953e(android.content.Context r21, p80.C12991b r22, java.lang.String r23, java.lang.String r24, com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep r25) throws com.moovit.commons.request.BadResponseException {
        /*
            r0 = r22
            r1 = r25
            F r2 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.MASSABI
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000e
            r6 = 1
            goto L_0x000f
        L_0x000e:
            r6 = 0
        L_0x000f:
            if (r6 == 0) goto L_0x005a
            if (r2 != r3) goto L_0x003d
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseMassabiStep r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseMassabiStep) r1
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketClinetEngine r2 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketClinetEngine.MASABI
            int r2 = r2.getValue()
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r2)
            java.lang.String r2 = r1.agencyKey
            com.moovit.ticketing.ticket.TicketAgency r7 = m32958j(r0, r3, r2)
            com.moovit.ticketing.purchase.massabi.PurchaseMasabiStep r0 = new com.moovit.ticketing.purchase.massabi.PurchaseMasabiStep
            java.util.List<java.lang.String> r8 = r1.selectionKeys
            com.tranzmate.moovit.protocol.ticketingV2.MVWizardType r2 = r1.wizardType
            int r9 = s80.C13070g.m33016h(r2)
            java.lang.String r10 = r1.url
            r4 = r0
            r5 = r23
            r6 = r24
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x003d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'massabi' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x005a:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.FARE_SELECTION
            if (r2 != r3) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            r7 = 4
            r8 = 0
            if (r6 == 0) goto L_0x00c1
            if (r2 != r3) goto L_0x00a4
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareSelectionStep r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareSelectionStep) r1
            boolean r2 = r1.mo32851h()
            if (r2 == 0) goto L_0x0075
            java.lang.String r2 = r1.metroLevelHeaderMessage
            r13 = r2
            goto L_0x0076
        L_0x0075:
            r13 = r8
        L_0x0076:
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare> r2 = r1.fares
            hw.e r3 = new hw.e
            r3.<init>(r0, r7)
            java.util.ArrayList r12 = c00.C13720d.m34273c(r2, r8, r3)
            boolean r0 = r1.mo32849f()
            if (r0 == 0) goto L_0x008f
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVFilter> r0 = r1.appliedFilters
            com.moovit.ticketing.purchase.filter.PurchaseFilters r0 = m32950b(r0)
            r14 = r0
            goto L_0x0090
        L_0x008f:
            r14 = r8
        L_0x0090:
            boolean r0 = r1.mo32853i()
            if (r0 == 0) goto L_0x0098
            java.lang.String r8 = r1.title
        L_0x0098:
            r15 = r8
            com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep r0 = new com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep
            r9 = r0
            r10 = r23
            r11 = r24
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x00a4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'fareSelection' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c1:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.FILTER_SELECTION
            if (r2 != r3) goto L_0x00c7
            r6 = 1
            goto L_0x00c8
        L_0x00c7:
            r6 = 0
        L_0x00c8:
            r9 = 2
            if (r6 == 0) goto L_0x0183
            if (r2 != r3) goto L_0x0166
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilterListSelectionStep r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilterListSelectionStep) r1
            java.lang.String r2 = r1.type
            com.tranzmate.moovit.protocol.ticketingV2.MVFilterSelectionPresentationType r3 = r1.presentationType
            int[] r4 = q80.C13036y.C13037a.f32256h
            int r6 = r3.ordinal()
            r4 = r4[r6]
            if (r4 == r5) goto L_0x00fb
            if (r4 != r9) goto L_0x00e4
            com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep$FilterPresentationType r3 = com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep.FilterPresentationType.CARDS
            goto L_0x00fd
        L_0x00e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to decode filter presentation type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fb:
            com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep$FilterPresentationType r3 = com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep.FilterPresentationType.INDICATORS
        L_0x00fd:
            r18 = r3
            boolean r3 = r1.mo32590o()
            if (r3 == 0) goto L_0x0109
            java.lang.String r3 = r1.title
            r13 = r3
            goto L_0x010a
        L_0x0109:
            r13 = r8
        L_0x010a:
            boolean r3 = r1.mo32586j()
            if (r3 == 0) goto L_0x0114
            java.lang.String r3 = r1.messageHeader
            r14 = r3
            goto L_0x0115
        L_0x0114:
            r14 = r8
        L_0x0115:
            boolean r3 = r1.mo32587k()
            if (r3 == 0) goto L_0x0123
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r3 = r1.messageImage
            com.moovit.image.model.Image r3 = com.moovit.image.C16028g.m40829g(r3)
            r15 = r3
            goto L_0x0124
        L_0x0123:
            r15 = r8
        L_0x0124:
            boolean r3 = r1.mo32585i()
            if (r3 == 0) goto L_0x012f
            java.lang.String r3 = r1.message
            r16 = r3
            goto L_0x0131
        L_0x012f:
            r16 = r8
        L_0x0131:
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilter> r3 = r1.filters
            wt.e r4 = new wt.e
            r5 = 16
            r4.<init>(r5)
            java.util.ArrayList r19 = c00.C13720d.m34273c(r3, r8, r4)
            boolean r3 = r1.mo32589m()
            if (r3 == 0) goto L_0x0157
            boolean r3 = r1.mo32582g()
            if (r3 == 0) goto L_0x0157
            int r3 = r1.providerId
            com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
            r4.<init>(r3)
            java.lang.String r1 = r1.agencyKey
            com.moovit.ticketing.ticket.TicketAgency r8 = m32958j(r0, r4, r1)
        L_0x0157:
            r20 = r8
            com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep r0 = new com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep
            r10 = r0
            r11 = r23
            r12 = r24
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x0166:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'filterSelection' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0183:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.SUGGESTED_FARES
            if (r2 != r3) goto L_0x0189
            r6 = 1
            goto L_0x018a
        L_0x0189:
            r6 = 0
        L_0x018a:
            if (r6 == 0) goto L_0x01d1
            if (r2 != r3) goto L_0x01b4
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStep r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStep) r1
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareRef> r2 = r1.suggestedFares
            b0.m r3 = new b0.m
            r3.<init>(r0, r7)
            java.util.ArrayList r0 = c00.C13720d.m34273c(r2, r8, r3)
            c50.a r2 = new c50.a
            r3 = r21
            r2.<init>(r3, r5)
            java.util.ArrayList r0 = c00.C13723g.m34282c(r0, r2)
            com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStep r2 = new com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStep
            java.lang.String r1 = r1.title
            r5 = r23
            r6 = r24
            r2.<init>(r5, r6, r1, r0)
            return r2
        L_0x01b4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'suggestedFares' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x01d1:
            r5 = r23
            r6 = r24
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_FARE
            if (r2 != r3) goto L_0x01db
            r7 = 1
            goto L_0x01dc
        L_0x01db:
            r7 = 0
        L_0x01dc:
            if (r7 == 0) goto L_0x022a
            if (r2 != r3) goto L_0x020d
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareStep r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareStep) r1
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare r2 = r1.fare
            com.moovit.ticketing.purchase.fare.TicketFare r0 = m32954f(r0, r2)
            boolean r2 = r1.mo32563f()
            if (r2 == 0) goto L_0x01f8
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVFilter> r2 = r1.appliedFilters
            com.moovit.ticketing.purchase.filter.PurchaseFilters r2 = m32950b(r2)
            r7 = r2
            goto L_0x01f9
        L_0x01f8:
            r7 = r8
        L_0x01f9:
            boolean r2 = r1.mo32564g()
            if (r2 == 0) goto L_0x0201
            java.lang.String r8 = r1.discountContextId
        L_0x0201:
            com.moovit.ticketing.purchase.fare.PurchaseFareStep r1 = new com.moovit.ticketing.purchase.fare.PurchaseFareStep
            r3 = r1
            r4 = r23
            r5 = r24
            r6 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x020d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'purchaseFare' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x022a:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_TYPE_SELECTION
            if (r2 != r3) goto L_0x0230
            r7 = 1
            goto L_0x0231
        L_0x0230:
            r7 = 0
        L_0x0231:
            r10 = 24
            if (r7 == 0) goto L_0x027b
            if (r2 != r3) goto L_0x025e
            java.lang.Object r0 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTypeSelectionStep r0 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTypeSelectionStep) r0
            boolean r1 = r0.mo32904g()
            if (r1 == 0) goto L_0x0244
            java.lang.String r1 = r0.title
            goto L_0x0245
        L_0x0244:
            r1 = r8
        L_0x0245:
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseType> r2 = r0.types
            com.facebook.appevents.l r3 = new com.facebook.appevents.l
            r3.<init>(r10)
            java.util.ArrayList r8 = c00.C13720d.m34273c(r2, r8, r3)
            java.lang.String r7 = r0.agencyKey
            com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStep r0 = new com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStep
            r3 = r0
            r4 = r23
            r5 = r24
            r6 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x025e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'purchaseTypeSelection' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x027b:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.STORED_VALUE_SELECTION
            if (r2 != r3) goto L_0x0281
            r7 = 1
            goto L_0x0282
        L_0x0281:
            r7 = 0
        L_0x0282:
            if (r7 == 0) goto L_0x031b
            if (r2 != r3) goto L_0x02fe
            java.lang.Object r0 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStep r0 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStep) r0
            boolean r1 = r0.mo32791l()
            if (r1 == 0) goto L_0x0293
            java.lang.String r1 = r0.title
            goto L_0x0294
        L_0x0293:
            r1 = r8
        L_0x0294:
            boolean r2 = r0.mo32790k()
            if (r2 == 0) goto L_0x029e
            java.lang.String r2 = r0.subtitle
            r7 = r2
            goto L_0x029f
        L_0x029e:
            r7 = r8
        L_0x029f:
            int r2 = r0.providerId
            com.moovit.network.model.ServerId r9 = new com.moovit.network.model.ServerId
            r9.<init>(r2)
            java.lang.String r2 = r0.agencyKey
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAmount> r3 = r0.amounts
            d0.q r4 = new d0.q
            r10 = 23
            r4.<init>(r10)
            java.util.ArrayList r10 = c00.C13720d.m34273c(r3, r8, r4)
            boolean r3 = r0.mo32786h()
            if (r3 == 0) goto L_0x02c3
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r3 = r0.currentBalance
            com.moovit.util.CurrencyAmount r3 = c70.C13749c.m34318d(r3)
            r11 = r3
            goto L_0x02c4
        L_0x02c3:
            r11 = r8
        L_0x02c4:
            boolean r3 = r0.mo32788i()
            if (r3 == 0) goto L_0x02e9
            com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueOtherAmount r3 = r0.otherAmount
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r4 = r3.minimumPrice
            com.moovit.util.CurrencyAmount r4 = c70.C13749c.m34318d(r4)
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r12 = r3.maximumPrice
            com.moovit.util.CurrencyAmount r12 = c70.C13749c.m34318d(r12)
            java.lang.String r13 = r3.name
            boolean r14 = r3.mo32962f()
            if (r14 == 0) goto L_0x02e2
            java.lang.String r8 = r3.explanation
        L_0x02e2:
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount r3 = new com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount
            r3.<init>(r4, r12, r13, r8)
            r12 = r3
            goto L_0x02ea
        L_0x02e9:
            r12 = r8
        L_0x02ea:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType r0 = r0.verifacationType
            com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType r13 = m32957i(r0)
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep r0 = new com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep
            r3 = r0
            r4 = r23
            r5 = r24
            r6 = r1
            r8 = r9
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x02fe:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'storedValueSelection' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x031b:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.ITINERARY_LEG_SELECTION
            if (r2 != r3) goto L_0x0321
            r7 = 1
            goto L_0x0322
        L_0x0321:
            r7 = 0
        L_0x0322:
            if (r7 == 0) goto L_0x0372
            if (r2 != r3) goto L_0x0355
            java.lang.Object r0 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionStep r0 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionStep) r0
            boolean r1 = r0.mo32647h()
            if (r1 == 0) goto L_0x0333
            java.lang.String r1 = r0.title
            goto L_0x0334
        L_0x0333:
            r1 = r8
        L_0x0334:
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionLegFare> r2 = r0.legs
            vs.e r3 = new vs.e
            r3.<init>(r10)
            java.util.ArrayList r2 = c00.C13720d.m34273c(r2, r8, r3)
            boolean r3 = r0.mo32646g()
            if (r3 == 0) goto L_0x0347
            java.lang.String r8 = r0.message
        L_0x0347:
            r7 = r8
            com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStep r0 = new com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStep
            r3 = r0
            r4 = r23
            r5 = r24
            r6 = r1
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x0355:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'itineraryLegSelection' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0372:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r3 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_ITINERARY
            if (r2 != r3) goto L_0x0378
            r7 = 1
            goto L_0x0379
        L_0x0378:
            r7 = 0
        L_0x0379:
            if (r7 == 0) goto L_0x03d1
            if (r2 != r3) goto L_0x03b4
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryStep r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryStep) r1
            java.lang.String r4 = r1.paymentContext
            java.lang.String r2 = r1.itineraryId
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryFare> r3 = r1.fares
            tu.g r7 = new tu.g
            r7.<init>(r0, r9)
            java.util.ArrayList r9 = c00.C13720d.m34273c(r3, r8, r7)
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType r0 = r1.verificationType
            com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType r10 = m32957i(r0)
            boolean r0 = r1.mo32690f()
            if (r0 == 0) goto L_0x03a2
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVFilter> r0 = r1.appliedFilters
            com.moovit.ticketing.purchase.filter.PurchaseFilters r8 = m32950b(r0)
        L_0x03a2:
            r11 = r8
            java.lang.String r12 = r1.discountContextId
            java.lang.String r13 = r1.paymentDescription
            com.moovit.ticketing.purchase.itinerary.PurchaseItineraryStep r0 = new com.moovit.ticketing.purchase.itinerary.PurchaseItineraryStep
            r7 = 0
            r3 = r0
            r5 = r23
            r6 = r24
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x03b4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'purchaseItinerary' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x03d1:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_STORED_VALUE
            if (r2 != r0) goto L_0x03d7
            r3 = 1
            goto L_0x03d8
        L_0x03d7:
            r3 = 0
        L_0x03d8:
            if (r3 == 0) goto L_0x043e
            if (r2 != r0) goto L_0x0421
            java.lang.Object r0 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueStep r0 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueStep) r0
            int r1 = r0.providerId
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            java.lang.String r7 = r0.agencyKey
            com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAmount r1 = r0.amount
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r3 = r1.amount
            com.moovit.util.CurrencyAmount r3 = c70.C13749c.m34318d(r3)
            java.lang.String r4 = r1.name
            boolean r9 = r1.mo32944g()
            if (r9 == 0) goto L_0x03fc
            java.lang.String r9 = r1.explanation
            goto L_0x03fd
        L_0x03fc:
            r9 = r8
        L_0x03fd:
            boolean r1 = r1.isDefault
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount r10 = new com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount
            r10.<init>(r3, r4, r9, r1)
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType r1 = r0.verificationType
            com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType r9 = m32957i(r1)
            boolean r1 = r0.mo32806h()
            if (r1 == 0) goto L_0x0412
            java.lang.String r8 = r0.discountContextId
        L_0x0412:
            r0 = r8
            com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueStep r1 = new com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueStep
            r3 = r1
            r4 = r23
            r5 = r24
            r6 = r2
            r8 = r10
            r10 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x0421:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'purchaseStoredValue' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x043e:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_CART_STEP
            if (r2 != r0) goto L_0x0443
            r4 = 1
        L_0x0443:
            if (r4 == 0) goto L_0x047e
            if (r2 != r0) goto L_0x0461
            java.lang.Object r0 = r1.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartStep r0 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartStep) r0
            java.lang.String r1 = r0.paymentContext
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartInfo r2 = r0.cartInfo
            com.moovit.ticketing.purchase.cart.CartInfo r7 = m32951c(r2)
            java.lang.String r8 = r0.discountContextId
            com.moovit.ticketing.purchase.cart.PurchaseCartStep r0 = new com.moovit.ticketing.purchase.cart.PurchaseCartStep
            r3 = r0
            r4 = r23
            r5 = r24
            r6 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x0461:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'purchaseCartStep' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.m28269l(r1)
            java.lang.String r1 = r1.f63355a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x047e:
            com.moovit.commons.request.BadResponseException r0 = new com.moovit.commons.request.BadResponseException
            java.lang.String r1 = "No result step exist"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q80.C13036y.m32953e(android.content.Context, p80.b, java.lang.String, java.lang.String, com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep):com.moovit.ticketing.purchase.PurchaseStep");
    }

    /* renamed from: f */
    public static TicketFare m32954f(C12991b bVar, MVTicketingFare mVTicketingFare) {
        String str;
        CurrencyAmount currencyAmount;
        String str2;
        Image image;
        String str3 = mVTicketingFare.f29253id;
        ServerId serverId = new ServerId(mVTicketingFare.providerId);
        String str4 = mVTicketingFare.name;
        if (mVTicketingFare.mo33169j()) {
            str = mVTicketingFare.fareDescription;
        } else {
            str = null;
        }
        CurrencyAmount d = C13749c.m34318d(mVTicketingFare.price);
        if (mVTicketingFare.mo33170k()) {
            currencyAmount = C13749c.m34318d(mVTicketingFare.fullPrice);
        } else {
            currencyAmount = d;
        }
        int max = Math.max(1, mVTicketingFare.quantityLimit);
        TicketAgency j = m32958j(bVar, serverId, mVTicketingFare.agencyKey);
        if (mVTicketingFare.mo33177s()) {
            str2 = mVTicketingFare.warningMessage;
        } else {
            str2 = null;
        }
        if (mVTicketingFare.mo33168i()) {
            image = C16028g.m40829g(mVTicketingFare.attributionImage);
        } else {
            image = null;
        }
        return new TicketFare(str3, serverId, str4, str, d, currencyAmount, max, j, str2, image, m32957i(mVTicketingFare.verifacationType), (SparseArray<String>) null);
    }

    /* renamed from: g */
    public static Ticket.Status m32955g(MVTicketStatus mVTicketStatus) {
        switch (C13037a.f32253e[mVTicketStatus.ordinal()]) {
            case 1:
                return Ticket.Status.NOT_YET_VALID;
            case 2:
                return Ticket.Status.VALID;
            case 3:
                return Ticket.Status.VALID_AUTO_ACTIVATE;
            case 4:
                return Ticket.Status.ACTIVE;
            case 5:
                return Ticket.Status.EXPIRED;
            case 6:
                return Ticket.Status.ISSUING_IN_PROGRESS;
            default:
                throw new IllegalStateException("failed to decode ticket status");
        }
    }

    /* renamed from: h */
    public static ArrayList m32956h(C12991b bVar, List list) {
        return C13720d.m34273c(list, (C13722f) null, new C13035x(0, bVar, m32949a(list, new C18505b(5), new C18277b(5), new C18847a(6), new C19752b(21))));
    }

    /* renamed from: i */
    public static PurchaseVerificationType m32957i(MVPurchaseVerifacationType mVPurchaseVerifacationType) {
        int i = C13037a.f32250b[mVPurchaseVerifacationType.ordinal()];
        if (i == 1) {
            return PurchaseVerificationType.NONE;
        }
        if (i == 2) {
            return PurchaseVerificationType.CVV;
        }
        throw new BadResponseException("Unknown verification type: " + mVPurchaseVerifacationType);
    }

    /* renamed from: j */
    public static TicketAgency m32958j(C12991b bVar, ServerId serverId, String str) throws BadResponseException {
        C12989a a = bVar.mo39880a(serverId, str);
        if (a != null) {
            return a.f32150b;
        }
        throw new BadResponseException("Unknown agency: providerId=" + serverId + ", agencyKey=" + str);
    }
}
