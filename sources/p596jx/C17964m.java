package p596jx;

import android.content.Context;
import android.location.Location;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.moovit.app.animation.AnimationPlayer;
import com.moovit.app.taxi.providers.TaxiAnimationConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.taxi.providers.TaxiTripPlanConfig;
import com.moovit.app.tod.model.TodJourneyStatus;
import com.moovit.app.tod.model.TodPassengerActionRequiredInfoType;
import com.moovit.app.tod.model.TodPassengerPinCodeActionInfo;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.app.tod.model.TodRideVehicleAC;
import com.moovit.app.tod.model.TodRideVehicleAudio;
import com.moovit.app.tod.model.TodRideVehicleColorBar;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.Color;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerAction;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoData;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerButtonSpec;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerListItemSpec;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerPinCodeActionInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerQrCodeActionInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerScreen;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRide;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideJourneyInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPoint;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicle;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleRealTimeInfo;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0112l;
import p066e0.C4454r0;
import p330z2.C7442r;
import p502fx.C17117b;
import p502fx.C17120e;
import p502fx.C17122g;
import p502fx.C17123h;
import p551hy.C17517b;
import p559ii.C17601a;
import p821tm.C19694a;
import p875vs.C20228e;
import p977zz.C20952m0;
import p977zz.C20975x0;

/* renamed from: jx.m */
public final class C17964m {

    /* renamed from: jx.m$a */
    public static /* synthetic */ class C17965a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46041a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46042b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46043c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f46044d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f46045e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f46046f;

        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|(2:59|60)|61|63|64|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|(2:59|60)|61|63|64|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|63|64|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(67:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|63|64|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Can't wrap try/catch for region: R(69:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|(2:17|18)|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Can't wrap try/catch for region: R(70:0|1|2|3|5|6|7|9|10|11|13|14|15|16|(2:17|18)|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(2:47|48)|49|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x010f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0135 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x013f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0153 */
        static {
            /*
                com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType[] r0 = com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46046f = r0
                r1 = 1
                com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType r2 = com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f46046f     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType r3 = com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType.QR_CODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f46046f     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType r4 = com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequiredInfoType.PIN_CODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.moovit.app.tod.model.TodRideVehicleAction[] r3 = com.moovit.app.tod.model.TodRideVehicleAction.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46045e = r3
                com.moovit.app.tod.model.TodRideVehicleAction r4 = com.moovit.app.tod.model.TodRideVehicleAction.COLOR_BAR     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f46045e     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.app.tod.model.TodRideVehicleAction r4 = com.moovit.app.tod.model.TodRideVehicleAction.AC     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f46045e     // Catch:{ NoSuchFieldError -> 0x004d }
                com.moovit.app.tod.model.TodRideVehicleAction r4 = com.moovit.app.tod.model.TodRideVehicleAction.AUDIO     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                r3 = 4
                int[] r4 = f46045e     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.moovit.app.tod.model.TodRideVehicleAction r5 = com.moovit.app.tod.model.TodRideVehicleAction.BEEP     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                r4 = 5
                int[] r5 = f46045e     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.moovit.app.tod.model.TodRideVehicleAction r6 = com.moovit.app.tod.model.TodRideVehicleAction.FLASH     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction[] r5 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f46044d = r5
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction.COLOR_BAR     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r5 = f46044d     // Catch:{ NoSuchFieldError -> 0x007e }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction.AC     // Catch:{ NoSuchFieldError -> 0x007e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r5 = f46044d     // Catch:{ NoSuchFieldError -> 0x0088 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction.AUDIO     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r5 = f46044d     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction.BEEP     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r5 = f46044d     // Catch:{ NoSuchFieldError -> 0x009c }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction.FLASH     // Catch:{ NoSuchFieldError -> 0x009c }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType[] r5 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f46043c = r5
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType.PrePickup     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r5 = f46043c     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType.Pickup     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r5 = f46043c     // Catch:{ NoSuchFieldError -> 0x00c1 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType.Ride     // Catch:{ NoSuchFieldError -> 0x00c1 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c1 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x00c1 }
            L_0x00c1:
                int[] r5 = f46043c     // Catch:{ NoSuchFieldError -> 0x00cb }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPointType.DropOff     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus[] r5 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f46042b = r5
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                int[] r5 = f46042b     // Catch:{ NoSuchFieldError -> 0x00e6 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.HEADING_PICKUP     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                int[] r5 = f46042b     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.APPROACHING_PICKUP     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r5 = f46042b     // Catch:{ NoSuchFieldError -> 0x00fa }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.ARRIVED_PICKUP     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                int[] r5 = f46042b     // Catch:{ NoSuchFieldError -> 0x0104 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.HEADING_DROP_OFF     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                r5 = 6
                int[] r6 = f46042b     // Catch:{ NoSuchFieldError -> 0x010f }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus r7 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.APPROACHING_DROP_OFF     // Catch:{ NoSuchFieldError -> 0x010f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x010f }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x010f }
            L_0x010f:
                int[] r6 = f46042b     // Catch:{ NoSuchFieldError -> 0x011a }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus r7 = com.tranzmate.moovit.protocol.tod.passenger.MVTodJourneyStatus.ARRIVED_DROP_OFF     // Catch:{ NoSuchFieldError -> 0x011a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x011a }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x011a }
            L_0x011a:
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus[] r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f46041a = r6
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus r7 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus.FUTURE     // Catch:{ NoSuchFieldError -> 0x012b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x012b }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x012b }
            L_0x012b:
                int[] r1 = f46041a     // Catch:{ NoSuchFieldError -> 0x0135 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus r6 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0135 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0135 }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0135 }
            L_0x0135:
                int[] r0 = f46041a     // Catch:{ NoSuchFieldError -> 0x013f }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x013f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x013f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x013f }
            L_0x013f:
                int[] r0 = f46041a     // Catch:{ NoSuchFieldError -> 0x0149 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0149 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0149 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0149 }
            L_0x0149:
                int[] r0 = f46041a     // Catch:{ NoSuchFieldError -> 0x0153 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus.NO_SHOW     // Catch:{ NoSuchFieldError -> 0x0153 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0153 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0153 }
            L_0x0153:
                int[] r0 = f46041a     // Catch:{ NoSuchFieldError -> 0x015d }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideStatus.DECLINED     // Catch:{ NoSuchFieldError -> 0x015d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015d }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x015d }
            L_0x015d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p596jx.C17964m.C17965a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static TodRide m44594a(Context context, MVTodRide mVTodRide) {
        TodRideVehicle todRideVehicle;
        String str;
        String str2;
        boolean z;
        TaxiProvider taxiProvider;
        TaxiTripPlanConfig taxiTripPlanConfig;
        Image image;
        Integer num;
        AnimationPlayer animationPlayer;
        long j;
        long j2;
        TaxiProvider c;
        TaxiAnimationConfig taxiAnimationConfig;
        int i;
        TaxiProvider c2;
        Context context2 = context;
        MVTodRide mVTodRide2 = mVTodRide;
        ServerId serverId = new ServerId(mVTodRide2.taxiProviderId);
        String str3 = mVTodRide2.rideId;
        long j3 = mVTodRide2.orderTime;
        TodRideStatus e = m44598e(mVTodRide2.status);
        TodRideJourney b = m44595b(mVTodRide2.journeyInfo);
        if (mVTodRide.mo33677y()) {
            todRideVehicle = m44599f(context2, mVTodRide2.vehicle, serverId);
        } else {
            todRideVehicle = null;
        }
        CurrencyAmount d = C13749c.m34318d(mVTodRide2.price);
        if (mVTodRide.mo33675v()) {
            str = mVTodRide2.supportPhoneNumber;
        } else {
            str = null;
        }
        int i2 = mVTodRide2.numOfPassengers;
        boolean z2 = mVTodRide2.isAccessible;
        TaxiProvidersManager b2 = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b2 == null || (c2 = b2.mo46163c(serverId)) == null) {
            str2 = null;
        } else {
            str2 = c2.f39969d;
        }
        Image c3 = m44596c(context2, serverId);
        if (todRideVehicle == null || !todRideVehicle.f40308h) {
            z = false;
        } else {
            z = true;
        }
        TaxiProvidersManager b3 = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b3 != null) {
            taxiProvider = b3.mo46163c(serverId);
        } else {
            taxiProvider = null;
        }
        if (taxiProvider != null) {
            taxiTripPlanConfig = taxiProvider.f39977l;
        } else {
            taxiTripPlanConfig = null;
        }
        if (taxiTripPlanConfig != null) {
            image = taxiTripPlanConfig.f39993g;
        } else {
            image = null;
        }
        if (image == null) {
            if (z) {
                i = R.drawable.img_map_autonomous_vehicle;
            } else {
                i = R.drawable.img_map_vehicle;
            }
            image = new ResourceImage(i, new String[0]);
        }
        if (mVTodRide.mo33670r()) {
            num = Integer.valueOf(mVTodRide2.rating);
        } else {
            num = null;
        }
        boolean z3 = mVTodRide2.canRate;
        boolean z4 = z2;
        String str4 = str2;
        long j4 = mVTodRide2.reservationLockTime;
        boolean z5 = mVTodRide2.isReservation;
        AnimationPlayer animationPlayer2 = AnimationPlayer.f37589d;
        boolean z6 = z5;
        TaxiProvidersManager b4 = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b4 == null || (c = b4.mo46163c(serverId)) == null || (taxiAnimationConfig = c.f39981p) == null) {
            animationPlayer = animationPlayer2;
        } else {
            animationPlayer = taxiAnimationConfig.f39921d;
        }
        boolean z7 = mVTodRide2.paymentIssue;
        if (mVTodRide.mo33659g()) {
            j = j4;
            j2 = mVTodRide2.dropOffTime;
        } else {
            j = j4;
            j2 = -1;
        }
        return new TodRide(str3, j3, e, b, todRideVehicle, d, str, i2, z4, str4, c3, image, num, z3, j, z6, animationPlayer, z7, j2);
    }

    /* renamed from: b */
    public static TodRideJourney m44595b(MVTodRideJourneyInfo mVTodRideJourneyInfo) {
        LocationDescriptor locationDescriptor;
        LocationDescriptor locationDescriptor2;
        long j;
        long j2;
        LocationDescriptor j3 = C13749c.m34324j(mVTodRideJourneyInfo.origin, (MVLocationSourceType) null);
        if (mVTodRideJourneyInfo.mo33687j()) {
            locationDescriptor = C13749c.m34324j(mVTodRideJourneyInfo.pickup, (MVLocationSourceType) null);
        } else {
            locationDescriptor = null;
        }
        if (mVTodRideJourneyInfo.mo33684h()) {
            locationDescriptor2 = C13749c.m34324j(mVTodRideJourneyInfo.dropoff, (MVLocationSourceType) null);
        } else {
            locationDescriptor2 = null;
        }
        LocationDescriptor j4 = C13749c.m34324j(mVTodRideJourneyInfo.destination, (MVLocationSourceType) null);
        if (mVTodRideJourneyInfo.mo33688k()) {
            j = (long) mVTodRideJourneyInfo.pickupWalkingTime;
        } else {
            j = -1;
        }
        if (mVTodRideJourneyInfo.mo33683g()) {
            j2 = (long) mVTodRideJourneyInfo.destinationWalkingTime;
        } else {
            j2 = -1;
        }
        return new TodRideJourney(j3, locationDescriptor, locationDescriptor2, j4, j, j2);
    }

    /* renamed from: c */
    public static Image m44596c(Context context, ServerId serverId) {
        TaxiProvidersManager b = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b == null) {
            return new ResourceImage(R.drawable.ic_transit_type_bus_24_on_surface, new String[0]);
        }
        TaxiProvider c = b.mo46163c(serverId);
        if (c == null) {
            return new ResourceImage(R.drawable.ic_transit_type_bus_24_on_surface, new String[0]);
        }
        return c.f39971f;
    }

    /* renamed from: d */
    public static C17122g m44597d(Context context, MVTodRideRealTimeInfo mVTodRideRealTimeInfo) {
        Location location;
        TodJourneyStatus todJourneyStatus;
        long j;
        int i;
        long j2;
        long j3;
        C17117b bVar;
        C7442r rVar;
        boolean z;
        C19694a aVar;
        TodRide todRide;
        TodRide todRide2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        String str6;
        String str7;
        boolean z2;
        int i3;
        TodRideVehicleColorBar todRideVehicleColorBar;
        TodRideVehicleAC todRideVehicleAC;
        TodRideVehicleAudio todRideVehicleAudio;
        Image image;
        TodPassengerActionRequiredInfoType todPassengerActionRequiredInfoType;
        C17517b bVar2;
        String str8;
        boolean z3;
        C17601a aVar2;
        boolean z4;
        TodPassengerPinCodeActionInfo todPassengerPinCodeActionInfo;
        String str9;
        String str10;
        Image image2;
        LatLonE6 h;
        MVTodRideRealTimeInfo mVTodRideRealTimeInfo2 = mVTodRideRealTimeInfo;
        MVGpsLocation mVGpsLocation = mVTodRideRealTimeInfo2.location;
        C20952m0<Integer> m0Var = C13749c.f33838a;
        if (mVGpsLocation == null || (h = C13749c.m34322h(mVGpsLocation.latlon)) == null) {
            location = null;
        } else {
            Location location2 = new Location("moovit_server");
            location2.setLatitude(h.mo46922k());
            location2.setLongitude(h.mo46926o());
            if (mVGpsLocation.mo26187k()) {
                location2.setTime(mVGpsLocation.timestamp);
            }
            if (mVGpsLocation.mo26181f()) {
                location2.setAccuracy((float) mVGpsLocation.accuracy);
            }
            if (mVGpsLocation.mo26183h()) {
                location2.setBearing((float) mVGpsLocation.bearing);
            }
            if (mVGpsLocation.mo26186j()) {
                location2.setSpeed((float) mVGpsLocation.speed);
            }
            if (mVGpsLocation.mo26182g()) {
                location2.setAltitude(mVGpsLocation.altitude);
            }
            location = location2;
        }
        if (location != null) {
            String str11 = mVTodRideRealTimeInfo2.rideId;
            TodRideStatus e = m44598e(mVTodRideRealTimeInfo2.rideStatus);
            MVTodJourneyStatus mVTodJourneyStatus = mVTodRideRealTimeInfo2.journeyStatus;
            if (mVTodJourneyStatus == null) {
                todJourneyStatus = TodJourneyStatus.HEADING_PICKUP;
            } else {
                switch (C17965a.f46042b[mVTodJourneyStatus.ordinal()]) {
                    case 1:
                    case 2:
                        todJourneyStatus = TodJourneyStatus.HEADING_PICKUP;
                        break;
                    case 3:
                        todJourneyStatus = TodJourneyStatus.ARRIVING_PICKUP;
                        break;
                    case 4:
                        todJourneyStatus = TodJourneyStatus.ARRIVED_PICKUP;
                        break;
                    case 5:
                        todJourneyStatus = TodJourneyStatus.HEADING_DROP_OFF;
                        break;
                    case 6:
                        todJourneyStatus = TodJourneyStatus.ARRIVING_DROP_OFF;
                        break;
                    case 7:
                        todJourneyStatus = TodJourneyStatus.ARRIVED_DROP_OFF;
                        break;
                    default:
                        throw new IllegalStateException("Unknown ride status: " + mVTodJourneyStatus);
                }
            }
            TodJourneyStatus todJourneyStatus2 = todJourneyStatus;
            long j4 = -1;
            if (mVTodRideRealTimeInfo.mo33713l()) {
                j = mVTodRideRealTimeInfo2.pickTime;
            } else {
                j = -1;
            }
            if (mVTodRideRealTimeInfo.mo33707g()) {
                j4 = mVTodRideRealTimeInfo2.dropOffTime;
            }
            long j5 = j4;
            List<MVTodRideWayPoint> list = mVTodRideRealTimeInfo2.futureWayPoints;
            C4454r0 r0Var = new C4454r0(8);
            List<MVTodRideWayPoint> list2 = mVTodRideRealTimeInfo2.futureWayPoints;
            if (list2 == null) {
                i = 0;
            } else {
                i = list2.size();
            }
            ArrayList arrayList = new ArrayList(i);
            C13720d.m34276f(list, (C13722f) null, r0Var, arrayList);
            if (mVTodRideRealTimeInfo.mo33714m()) {
                MVTodPassengerAction mVTodPassengerAction = mVTodRideRealTimeInfo2.requiredPassengerAction;
                String str12 = mVTodPassengerAction.actionId;
                MVTodPassengerButtonSpec mVTodPassengerButtonSpec = mVTodPassengerAction.buttonSpec;
                String str13 = mVTodPassengerButtonSpec.cta;
                if (mVTodPassengerButtonSpec.mo33581h()) {
                    image = C16028g.m40829g(mVTodPassengerButtonSpec.icon);
                } else {
                    image = null;
                }
                C17120e eVar = new C17120e(str13, image, mVTodPassengerButtonSpec.disabled);
                MVTodPassengerActionRequiredInfoType mVTodPassengerActionRequiredInfoType = mVTodPassengerAction.requiredInfoType;
                int i4 = C17965a.f46046f[mVTodPassengerActionRequiredInfoType.ordinal()];
                if (i4 == 1) {
                    todPassengerActionRequiredInfoType = TodPassengerActionRequiredInfoType.NONE;
                } else if (i4 == 2) {
                    todPassengerActionRequiredInfoType = TodPassengerActionRequiredInfoType.QR_CODE;
                } else if (i4 == 3) {
                    todPassengerActionRequiredInfoType = TodPassengerActionRequiredInfoType.PIN_CODE;
                } else {
                    throw new IllegalStateException("Unknown passenger action required info type: " + mVTodPassengerActionRequiredInfoType);
                }
                TodPassengerActionRequiredInfoType todPassengerActionRequiredInfoType2 = todPassengerActionRequiredInfoType;
                if (mVTodPassengerAction.mo33536i()) {
                    MVTodPassengerActionRequiredInfoData mVTodPassengerActionRequiredInfoData = mVTodPassengerAction.requiredInfoData;
                    F f = mVTodPassengerActionRequiredInfoData.setField_;
                    F f2 = MVTodPassengerActionRequiredInfoData._Fields.QR_CODE;
                    if (f == f2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        j3 = j5;
                        aVar2 = null;
                    } else if (f == f2) {
                        MVTodPassengerQrCodeActionInfo mVTodPassengerQrCodeActionInfo = (MVTodPassengerQrCodeActionInfo) mVTodPassengerActionRequiredInfoData.value_;
                        String str14 = mVTodPassengerQrCodeActionInfo.title;
                        if (mVTodPassengerQrCodeActionInfo.mo33607g()) {
                            j3 = j5;
                            str10 = mVTodPassengerQrCodeActionInfo.instructions;
                        } else {
                            j3 = j5;
                            str10 = null;
                        }
                        if (mVTodPassengerQrCodeActionInfo.mo33606f()) {
                            image2 = C16028g.m40829g(mVTodPassengerQrCodeActionInfo.icon);
                        } else {
                            image2 = null;
                        }
                        aVar2 = new C17601a(image2, str14, str10);
                    } else {
                        StringBuilder k = C13555b.m33972k("Cannot get field 'qrCode' because union is currently set to ");
                        k.append(MVTodPassengerActionRequiredInfoData.m29198k((MVTodPassengerActionRequiredInfoData._Fields) mVTodPassengerActionRequiredInfoData.setField_).f63355a);
                        throw new RuntimeException(k.toString());
                    }
                    F f3 = mVTodPassengerActionRequiredInfoData.setField_;
                    F f4 = MVTodPassengerActionRequiredInfoData._Fields.PIN_CODE;
                    if (f3 == f4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        j2 = j;
                        todPassengerPinCodeActionInfo = null;
                    } else if (f3 == f4) {
                        MVTodPassengerPinCodeActionInfo mVTodPassengerPinCodeActionInfo = (MVTodPassengerPinCodeActionInfo) mVTodPassengerActionRequiredInfoData.value_;
                        int i5 = mVTodPassengerPinCodeActionInfo.numberOfDigits;
                        String str15 = mVTodPassengerPinCodeActionInfo.title;
                        String str16 = mVTodPassengerPinCodeActionInfo.cta;
                        if (mVTodPassengerPinCodeActionInfo.mo33597g()) {
                            str9 = mVTodPassengerPinCodeActionInfo.instructions;
                        } else {
                            str9 = null;
                        }
                        j2 = j;
                        todPassengerPinCodeActionInfo = new TodPassengerPinCodeActionInfo(i5, str15, str16, str9);
                    } else {
                        StringBuilder k2 = C13555b.m33972k("Cannot get field 'pinCode' because union is currently set to ");
                        k2.append(MVTodPassengerActionRequiredInfoData.m29198k((MVTodPassengerActionRequiredInfoData._Fields) mVTodPassengerActionRequiredInfoData.setField_).f63355a);
                        throw new RuntimeException(k2.toString());
                    }
                    bVar2 = new C17517b(6, aVar2, todPassengerPinCodeActionInfo);
                } else {
                    j2 = j;
                    j3 = j5;
                    bVar2 = null;
                }
                C17517b bVar3 = bVar2;
                if (mVTodPassengerAction.mo33534h()) {
                    str8 = mVTodPassengerAction.instructions;
                } else {
                    str8 = null;
                }
                bVar = new C17117b(str12, eVar, todPassengerActionRequiredInfoType2, bVar3, str8);
            } else {
                j2 = j;
                j3 = j5;
                bVar = null;
            }
            if (mVTodRideRealTimeInfo.mo33719s()) {
                MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = mVTodRideRealTimeInfo2.vehicleRealTimeInfo;
                List<String> list3 = mVTodVehicleRealTimeInfo.vehicleActions;
                C20228e eVar2 = new C20228e(9);
                List<String> list4 = mVTodVehicleRealTimeInfo.vehicleActions;
                if (list4 == null) {
                    i3 = 0;
                } else {
                    i3 = list4.size();
                }
                ArrayList arrayList2 = new ArrayList(i3);
                C13720d.m34276f(list3, (C13722f) null, eVar2, arrayList2);
                if (mVTodVehicleRealTimeInfo.mo33910h()) {
                    todRideVehicleColorBar = new TodRideVehicleColorBar(new Color(mVTodVehicleRealTimeInfo.colorBar.color));
                } else {
                    todRideVehicleColorBar = null;
                }
                if (mVTodVehicleRealTimeInfo.mo33908f()) {
                    MVTodVehicleAC mVTodVehicleAC = mVTodVehicleRealTimeInfo.f29686ac;
                    todRideVehicleAC = new TodRideVehicleAC(mVTodVehicleAC.fanLevel, (float) mVTodVehicleAC.temperature, mVTodVehicleAC.enabled);
                } else {
                    todRideVehicleAC = null;
                }
                if (mVTodVehicleRealTimeInfo.mo33909g()) {
                    todRideVehicleAudio = new TodRideVehicleAudio(mVTodVehicleRealTimeInfo.audio.playing);
                } else {
                    todRideVehicleAudio = null;
                }
                rVar = new C7442r(arrayList2, todRideVehicleColorBar, todRideVehicleAC, todRideVehicleAudio);
            } else {
                rVar = null;
            }
            boolean z5 = mVTodRideRealTimeInfo2.destinationChangeAllowed;
            if (mVTodRideRealTimeInfo.mo33715o()) {
                MVTodPassengerScreen mVTodPassengerScreen = mVTodRideRealTimeInfo2.requiredPassengerScreen;
                String str17 = mVTodPassengerScreen.screenId;
                if (mVTodPassengerScreen.mo33630m()) {
                    str = mVTodPassengerScreen.title;
                } else {
                    str = null;
                }
                String str18 = str;
                if (mVTodPassengerScreen.mo33629l()) {
                    str2 = mVTodPassengerScreen.subtitle;
                } else {
                    str2 = null;
                }
                String str19 = str2;
                if (mVTodPassengerScreen.mo33627j()) {
                    str3 = mVTodPassengerScreen.lottieImageUrl;
                } else {
                    str3 = null;
                }
                String str20 = str3;
                if (mVTodPassengerScreen.mo33623g()) {
                    str4 = mVTodPassengerScreen.imageSubtitle;
                } else {
                    str4 = null;
                }
                String str21 = str4;
                if (mVTodPassengerScreen.mo33626i()) {
                    str5 = mVTodPassengerScreen.listItemsTitle;
                } else {
                    str5 = null;
                }
                String str22 = str5;
                List<MVTodPassengerListItemSpec> list5 = mVTodPassengerScreen.listItems;
                C0112l lVar = new C0112l(5);
                z = z5;
                List<MVTodPassengerListItemSpec> list6 = mVTodPassengerScreen.listItems;
                if (list6 == null) {
                    i2 = 0;
                } else {
                    i2 = list6.size();
                }
                ArrayList arrayList3 = new ArrayList(i2);
                todRide = null;
                C13720d.m34276f(list5, (C13722f) null, lVar, arrayList3);
                if (mVTodPassengerScreen.mo33622f()) {
                    str6 = mVTodPassengerScreen.actionId;
                } else {
                    str6 = null;
                }
                if (bVar != null) {
                    str7 = bVar.f44298a;
                } else {
                    str7 = null;
                }
                if ((str6 == null || bVar == null || C20975x0.m49118e(str6, str7)) && (str6 == null || bVar != null)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    aVar = new C19694a(str17, str18, str19, str20, str21, str22, arrayList3, bVar);
                } else {
                    throw new BadResponseException(String.format("TodPassengerAction.actionId (%1$s) and TodPassengerScreen.actionId (%2$s) must be identical!", new Object[]{str7, str6}));
                }
            } else {
                z = z5;
                todRide = null;
                aVar = null;
            }
            if (mVTodRideRealTimeInfo.mo33718r()) {
                todRide2 = m44594a(context, mVTodRideRealTimeInfo2.rideUpdate);
            } else {
                todRide2 = todRide;
            }
            return new C17122g(str11, e, todJourneyStatus2, location, j2, j3, new C17123h(arrayList), bVar, rVar, z, aVar, todRide2);
        }
        throw new BadResponseException("Missing vehicle location!");
    }

    /* renamed from: e */
    public static TodRideStatus m44598e(MVTodRideStatus mVTodRideStatus) {
        switch (C17965a.f46041a[mVTodRideStatus.ordinal()]) {
            case 1:
                return TodRideStatus.FUTURE;
            case 2:
                return TodRideStatus.ACTIVE;
            case 3:
                return TodRideStatus.CANCELLED;
            case 4:
                return TodRideStatus.COMPLETED;
            case 5:
                return TodRideStatus.PASSENGER_NOT_SHOWN;
            case 6:
                return TodRideStatus.DECLINED;
            default:
                throw new IllegalStateException("Unknown ride status: " + mVTodRideStatus);
        }
    }

    /* renamed from: f */
    public static TodRideVehicle m44599f(Context context, MVTodVehicle mVTodVehicle, ServerId serverId) {
        Image image;
        TaxiProvider c;
        String str = mVTodVehicle.licencePlate;
        String str2 = mVTodVehicle.driverName;
        int i = mVTodVehicle.numOfSeats;
        boolean z = mVTodVehicle.isAccessible;
        String str3 = mVTodVehicle.model;
        TaxiProvidersManager b = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b == null || (c = b.mo46163c(serverId)) == null) {
            image = null;
        } else {
            image = c.f39973h;
        }
        return new TodRideVehicle(str, str2, i, z, str3, image, mVTodVehicle.isAutonomous);
    }
}
