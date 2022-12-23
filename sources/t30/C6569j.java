package t30;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.moovit.commons.request.BadResponseException;
import com.moovit.image.C16028g;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.micromobility.purchase.step.confirmation.MicroMobilityConfirmationStep;
import com.moovit.micromobility.purchase.step.confirmation.MicroMobilityRideDisclaimer;
import com.moovit.micromobility.purchase.step.filter.MicroMobilityAppliedFilters;
import com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep;
import com.moovit.micromobility.purchase.step.inputs.MicroMobilityInputStep;
import com.moovit.micromobility.purchase.step.pincode.MicroMobilityPinCodeStep;
import com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStep;
import com.moovit.micromobility.ride.C4193a;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.micromobility.ride.MicroMobilityVehicleCondition;
import com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOptionSelectionStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseQrCodeStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatusInfo;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityVehicleCondition;
import com.tranzmate.moovit.protocol.micromobility.MVOption;
import com.tranzmate.moovit.protocol.micromobility.MVRideDisclaimer;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0112l;
import p054d0.C4303q;

/* renamed from: t30.j */
public final class C6569j {

    /* renamed from: t30.j$a */
    public static /* synthetic */ class C6570a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20383a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f20384b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f20385c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f20386d;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|(2:29|30)|31|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c3 */
        static {
            /*
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus[] r0 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20386d = r0
                r1 = 1
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus r2 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.Active     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f20386d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus r3 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.Reserved     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f20386d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus r4 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.Completed     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f20386d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.Cancelled     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f20386d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.Expired     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f20386d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.Paused     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = f20386d     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatus.Pending     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType[] r4 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f20385c = r4
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType.NO_ACTION     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r4 = f20385c     // Catch:{ NoSuchFieldError -> 0x006f }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType.PHOTO     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r4 = f20385c     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType.QR_CODE     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r4 = f20385c     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType r5 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType.RATING     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType[] r4 = com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f20384b = r4
                com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType r5 = com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType.Indicators     // Catch:{ NoSuchFieldError -> 0x0094 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0094 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0094 }
            L_0x0094:
                int[] r4 = f20384b     // Catch:{ NoSuchFieldError -> 0x009e }
                com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType r5 = com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType.Cards     // Catch:{ NoSuchFieldError -> 0x009e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                com.moovit.micromobility.ride.MicroMobilityRide$VehicleType[] r4 = com.moovit.micromobility.ride.MicroMobilityRide.VehicleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f20383a = r4
                com.moovit.micromobility.ride.MicroMobilityRide$VehicleType r5 = com.moovit.micromobility.ride.MicroMobilityRide.VehicleType.BIKE     // Catch:{ NoSuchFieldError -> 0x00af }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r1 = f20383a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.moovit.micromobility.ride.MicroMobilityRide$VehicleType r4 = com.moovit.micromobility.ride.MicroMobilityRide.VehicleType.SCOOTER     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = f20383a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.moovit.micromobility.ride.MicroMobilityRide$VehicleType r1 = com.moovit.micromobility.ride.MicroMobilityRide.VehicleType.MOPED     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f20383a     // Catch:{ NoSuchFieldError -> 0x00cd }
                com.moovit.micromobility.ride.MicroMobilityRide$VehicleType r1 = com.moovit.micromobility.ride.MicroMobilityRide.VehicleType.CAR     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t30.C6569j.C6570a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static MicroMobilityPurchaseStep m15500a(String str, String str2, MVMicroMobilityPurchaseStep mVMicroMobilityPurchaseStep) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        MicroMobilityFilterSelectionStep.FilterPresentationType filterPresentationType;
        int i;
        MicroMobilityVehicleCondition microMobilityVehicleCondition;
        MicroMobilityAppliedFilters microMobilityAppliedFilters;
        MVMicroMobilityPurchaseStep mVMicroMobilityPurchaseStep2 = mVMicroMobilityPurchaseStep;
        F f = mVMicroMobilityPurchaseStep2.setField_;
        F f2 = MVMicroMobilityPurchaseStep._Fields.CONFIRMATION;
        boolean z5 = false;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        MicroMobilityRideDisclaimer microMobilityRideDisclaimer = null;
        if (!z) {
            F f3 = MVMicroMobilityPurchaseStep._Fields.PIN_CODE;
            if (f == f3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                F f4 = MVMicroMobilityPurchaseStep._Fields.QR_CODE;
                if (f == f4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    F f5 = MVMicroMobilityPurchaseStep._Fields.OPTION_SELECTION;
                    if (f == f5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        F f6 = MVMicroMobilityPurchaseStep._Fields.INPUTS;
                        if (f == f6) {
                            z5 = true;
                        }
                        if (!z5) {
                            throw new BadResponseException("No result step exist");
                        } else if (f == f6) {
                            MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = (MVMicroMobilityPurchaseInputStep) mVMicroMobilityPurchaseStep2.value_;
                            return new MicroMobilityInputStep(str, str2, mVMicroMobilityPurchaseInputStep.f26625id, C16028g.m40829g(mVMicroMobilityPurchaseInputStep.logo), mVMicroMobilityPurchaseInputStep.title, mVMicroMobilityPurchaseInputStep.subtitle, mVMicroMobilityPurchaseInputStep.actionText, C13720d.m34273c(mVMicroMobilityPurchaseInputStep.inputFields, (C13722f) null, new C4303q(17)));
                        } else {
                            StringBuilder k = C13555b.m33972k("Cannot get field 'inputs' because union is currently set to ");
                            k.append(MVMicroMobilityPurchaseStep.m23025l((MVMicroMobilityPurchaseStep._Fields) mVMicroMobilityPurchaseStep2.setField_).f63355a);
                            throw new RuntimeException(k.toString());
                        }
                    } else if (f == f5) {
                        MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = (MVMicroMobilityPurchaseOptionSelectionStep) mVMicroMobilityPurchaseStep2.value_;
                        String str3 = mVMicroMobilityPurchaseOptionSelectionStep.type;
                        MVOptionSelectionPresentationType mVOptionSelectionPresentationType = mVMicroMobilityPurchaseOptionSelectionStep.presentationType;
                        int i2 = C6570a.f20384b[mVOptionSelectionPresentationType.ordinal()];
                        if (i2 == 1) {
                            filterPresentationType = MicroMobilityFilterSelectionStep.FilterPresentationType.INDICATORS;
                        } else if (i2 == 2) {
                            filterPresentationType = MicroMobilityFilterSelectionStep.FilterPresentationType.CARDS;
                        } else {
                            throw new IllegalStateException("Failed to decode filter presentation type: " + mVOptionSelectionPresentationType);
                        }
                        MicroMobilityFilterSelectionStep.FilterPresentationType filterPresentationType2 = filterPresentationType;
                        String str4 = mVMicroMobilityPurchaseOptionSelectionStep.title;
                        String str5 = mVMicroMobilityPurchaseOptionSelectionStep.instructions;
                        String str6 = mVMicroMobilityPurchaseOptionSelectionStep.buttonText;
                        if (mVMicroMobilityPurchaseOptionSelectionStep.mo28882j()) {
                            i = mVMicroMobilityPurchaseOptionSelectionStep.selectedIndex;
                        } else {
                            i = -1;
                        }
                        return new MicroMobilityFilterSelectionStep(str, str2, str4, str3, filterPresentationType2, C13720d.m34273c(mVMicroMobilityPurchaseOptionSelectionStep.options, (C13722f) null, new C0112l(13)), str5, str6, i);
                    } else {
                        StringBuilder k2 = C13555b.m33972k("Cannot get field 'optionSelection' because union is currently set to ");
                        k2.append(MVMicroMobilityPurchaseStep.m23025l((MVMicroMobilityPurchaseStep._Fields) mVMicroMobilityPurchaseStep2.setField_).f63355a);
                        throw new RuntimeException(k2.toString());
                    }
                } else if (f == f4) {
                    MVMicroMobilityPurchaseQrCodeStep mVMicroMobilityPurchaseQrCodeStep = (MVMicroMobilityPurchaseQrCodeStep) mVMicroMobilityPurchaseStep2.value_;
                    return new MicroMobilityQrCodeStep(str, str2, mVMicroMobilityPurchaseQrCodeStep.title, mVMicroMobilityPurchaseQrCodeStep.instructions, mVMicroMobilityPurchaseQrCodeStep.alternateActionText);
                } else {
                    StringBuilder k3 = C13555b.m33972k("Cannot get field 'qrCode' because union is currently set to ");
                    k3.append(MVMicroMobilityPurchaseStep.m23025l((MVMicroMobilityPurchaseStep._Fields) mVMicroMobilityPurchaseStep2.setField_).f63355a);
                    throw new RuntimeException(k3.toString());
                }
            } else if (f == f3) {
                MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = (MVMicroMobilityPurchasePinCodeStep) mVMicroMobilityPurchaseStep2.value_;
                return new MicroMobilityPinCodeStep(str, str2, mVMicroMobilityPurchasePinCodeStep.title, mVMicroMobilityPurchasePinCodeStep.instructions, mVMicroMobilityPurchasePinCodeStep.numberOfDigits, mVMicroMobilityPurchasePinCodeStep.actionText);
            } else {
                StringBuilder k4 = C13555b.m33972k("Cannot get field 'pinCode' because union is currently set to ");
                k4.append(MVMicroMobilityPurchaseStep.m23025l((MVMicroMobilityPurchaseStep._Fields) mVMicroMobilityPurchaseStep2.setField_).f63355a);
                throw new RuntimeException(k4.toString());
            }
        } else if (f == f2) {
            MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = (MVMicroMobilityPurchaseConfirmationStep) mVMicroMobilityPurchaseStep2.value_;
            String str7 = mVMicroMobilityPurchaseConfirmationStep.title;
            String str8 = mVMicroMobilityPurchaseConfirmationStep.actionText;
            String str9 = mVMicroMobilityPurchaseConfirmationStep.rideTitle;
            String str10 = mVMicroMobilityPurchaseConfirmationStep.rideSubtitle;
            String str11 = mVMicroMobilityPurchaseConfirmationStep.rideDescription;
            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = mVMicroMobilityPurchaseConfirmationStep.vehicleCondition;
            if (mVMicroMobilityVehicleCondition == null) {
                microMobilityVehicleCondition = null;
            } else {
                microMobilityVehicleCondition = new MicroMobilityVehicleCondition(C16028g.m40829g(mVMicroMobilityVehicleCondition.icon), mVMicroMobilityVehicleCondition.primaryActionText, mVMicroMobilityVehicleCondition.primaryActionUrl, mVMicroMobilityVehicleCondition.secondaryActionText, mVMicroMobilityVehicleCondition.secondaryActionUrl);
            }
            if (!C13717b.m34258e(mVMicroMobilityPurchaseConfirmationStep.appliedOptions)) {
                List<MVOption> list = mVMicroMobilityPurchaseConfirmationStep.appliedOptions;
                ArrayList arrayList = new ArrayList(list.size());
                ArrayList arrayList2 = new ArrayList(list.size());
                for (MVOption next : list) {
                    arrayList.add(next.title);
                    arrayList2.add(next.value);
                }
                microMobilityAppliedFilters = new MicroMobilityAppliedFilters(arrayList, arrayList2);
            } else {
                microMobilityAppliedFilters = null;
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28804h()) {
                MVRideDisclaimer mVRideDisclaimer = mVMicroMobilityPurchaseConfirmationStep.disclaimer;
                microMobilityRideDisclaimer = new MicroMobilityRideDisclaimer(C16028g.m40829g(mVRideDisclaimer.icon), C13749c.m34316b(mVRideDisclaimer.backgroundColor), mVRideDisclaimer.title, mVRideDisclaimer.subtitle);
            }
            return new MicroMobilityConfirmationStep(str, str2, str7, str8, str9, str10, str11, microMobilityVehicleCondition, microMobilityAppliedFilters, microMobilityRideDisclaimer, mVMicroMobilityPurchaseConfirmationStep.discountContextId, mVMicroMobilityPurchaseConfirmationStep.paymentContext);
        } else {
            StringBuilder k5 = C13555b.m33972k("Cannot get field 'confirmation' because union is currently set to ");
            k5.append(MVMicroMobilityPurchaseStep.m23025l((MVMicroMobilityPurchaseStep._Fields) mVMicroMobilityPurchaseStep2.setField_).f63355a);
            throw new RuntimeException(k5.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: java.util.ArrayList<O>} */
    /* JADX WARNING: type inference failed for: r30v0, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r30v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.micromobility.ride.MicroMobilityRide m15501b(com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide r36) {
        /*
            r0 = r36
            java.lang.String r1 = r0.serviceId
            java.lang.String r2 = r0.itemId
            int r3 = r0.rideId
            com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
            r4.<init>(r3)
            int r3 = r0.microMobilityTypeid
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r3)
            java.lang.String r6 = r0.microMobilityTypeName
            boolean r3 = r36.mo28974o()
            r7 = 0
            if (r3 == 0) goto L_0x0025
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r3 = r0.vehicleIllustrationImage
            com.moovit.image.model.Image r3 = com.moovit.image.C16028g.m40829g(r3)
            r8 = r3
            goto L_0x0026
        L_0x0025:
            r8 = r7
        L_0x0026:
            long r9 = r0.creationTime
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatusInfo r3 = r0.rideStatusInfo
            com.moovit.micromobility.ride.a r11 = m15502c(r3)
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideDetails r0 = r0.rideDetails
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r3 = r0.largeImage
            com.moovit.image.model.Image r13 = com.moovit.image.C16028g.m40829g(r3)
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r3 = r0.mapImage
            com.moovit.image.model.Image r14 = com.moovit.image.C16028g.m40829g(r3)
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r3 = r0.pickupLocation
            com.moovit.transit.LocationDescriptor r15 = c70.C13749c.m34324j(r3, r7)
            boolean r3 = r0.mo28986g()
            if (r3 == 0) goto L_0x0051
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r3 = r0.dropOffLocation
            com.moovit.transit.LocationDescriptor r3 = c70.C13749c.m34324j(r3, r7)
            r16 = r3
            goto L_0x0053
        L_0x0051:
            r16 = r7
        L_0x0053:
            boolean r3 = r0.mo28996q()
            r17 = -1
            if (r3 == 0) goto L_0x0060
            r31 = r8
            long r7 = r0.rideStartTime
            goto L_0x0064
        L_0x0060:
            r31 = r8
            r7 = r17
        L_0x0064:
            boolean r12 = r0.mo28995p()
            if (r12 == 0) goto L_0x0071
            r32 = r4
            long r3 = r0.rideEndTime
            r19 = r3
            goto L_0x0075
        L_0x0071:
            r32 = r4
            r19 = r17
        L_0x0075:
            java.lang.String r3 = r0.rideTitle
            java.lang.String r4 = r0.rideSubtitle
            boolean r12 = r0.mo28992l()
            if (r12 == 0) goto L_0x0084
            int r12 = r0.rating
            r27 = r12
            goto L_0x0087
        L_0x0084:
            r12 = -1
            r27 = -1
        L_0x0087:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityVehicleCondition r12 = r0.vehicleCondition
            if (r12 != 0) goto L_0x0092
            r34 = r9
            r33 = r11
            r28 = 0
            goto L_0x00b3
        L_0x0092:
            r33 = r11
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r11 = r12.icon
            com.moovit.image.model.Image r22 = com.moovit.image.C16028g.m40829g(r11)
            java.lang.String r11 = r12.primaryActionText
            r34 = r9
            java.lang.String r9 = r12.primaryActionUrl
            java.lang.String r10 = r12.secondaryActionText
            java.lang.String r12 = r12.secondaryActionUrl
            com.moovit.micromobility.ride.MicroMobilityVehicleCondition r28 = new com.moovit.micromobility.ride.MicroMobilityVehicleCondition
            r21 = r28
            r23 = r11
            r24 = r9
            r25 = r10
            r26 = r12
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x00b3:
            boolean r9 = r0.mo28990j()
            if (r9 == 0) goto L_0x00ca
            java.util.List<com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideMetric> r9 = r0.metrics
            com.facebook.appevents.l r10 = new com.facebook.appevents.l
            r11 = 16
            r10.<init>(r11)
            r11 = 0
            java.util.ArrayList r9 = c00.C13720d.m34273c(r9, r11, r10)
            r29 = r9
            goto L_0x00cd
        L_0x00ca:
            r11 = 0
            r29 = r11
        L_0x00cd:
            boolean r9 = r0.mo28985f()
            if (r9 == 0) goto L_0x00e3
            java.util.List<com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction> r9 = r0.actions
            lr.i r10 = new lr.i
            r12 = 18
            r10.<init>(r12)
            java.util.ArrayList r9 = c00.C13720d.m34273c(r9, r11, r10)
            r30 = r9
            goto L_0x00e5
        L_0x00e3:
            r30 = r11
        L_0x00e5:
            boolean r9 = r0.mo28994o()
            if (r9 == 0) goto L_0x00f0
            long r9 = r0.reservationStartTime
            r21 = r9
            goto L_0x00f2
        L_0x00f0:
            r21 = r17
        L_0x00f2:
            boolean r9 = r0.mo28993m()
            if (r9 == 0) goto L_0x00fd
            long r9 = r0.reservationExpirationTime
            r23 = r9
            goto L_0x00ff
        L_0x00fd:
            r23 = r17
        L_0x00ff:
            a40.a r10 = new a40.a
            r12 = r10
            r17 = r7
            r25 = r3
            r26 = r4
            r12.<init>(r13, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            com.moovit.micromobility.ride.MicroMobilityRide r11 = new com.moovit.micromobility.ride.MicroMobilityRide
            r0 = r11
            r3 = r32
            r4 = r5
            r5 = r6
            r6 = r31
            r7 = r34
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t30.C6569j.m15501b(com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide):com.moovit.micromobility.ride.MicroMobilityRide");
    }

    /* renamed from: c */
    public static C4193a m15502c(MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo) {
        MicroMobilityRide.Status status;
        boolean z = mVMicroMobilityRideStatusInfo.isCancelable;
        switch (C6570a.f20386d[mVMicroMobilityRideStatusInfo.status.ordinal()]) {
            case 1:
                status = MicroMobilityRide.Status.ACTIVE;
                break;
            case 2:
                status = MicroMobilityRide.Status.RESERVED;
                break;
            case 3:
                status = MicroMobilityRide.Status.COMPLETED;
                break;
            case 4:
                status = MicroMobilityRide.Status.CANCELLED;
                break;
            case 5:
                status = MicroMobilityRide.Status.EXPIRED;
                break;
            case 6:
                status = MicroMobilityRide.Status.PAUSED;
                break;
            case 7:
                status = MicroMobilityRide.Status.PENDING;
                break;
            default:
                throw new IllegalStateException("failed to decode micro-mobility ride status");
        }
        return new C4193a(z, status, C13749c.m34318d(mVMicroMobilityRideStatusInfo.price));
    }
}
