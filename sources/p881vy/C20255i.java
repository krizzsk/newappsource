package p881vy;

import android.net.Uri;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.model.UriImage;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps;
import com.tranzmate.moovit.protocol.wondo.MVWondoConfirmation;
import com.tranzmate.moovit.protocol.wondo.MVWondoCta;
import p977zz.C20944i0;

/* renamed from: vy.i */
public final class C20255i {

    /* renamed from: vy.i$a */
    public static /* synthetic */ class C20256a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus[] r0 = com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51362a = r0
                com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus r1 = com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus.BOUGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51362a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus r1 = com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus.USED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f51362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus r1 = com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f51362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus r1 = com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus.TEST_CODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p881vy.C20255i.C20256a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static RideSharingRegistrationSteps m47822a(MVEventRegistrationSteps mVEventRegistrationSteps) {
        if (mVEventRegistrationSteps == null) {
            return null;
        }
        if (mVEventRegistrationSteps.phoneVerification || mVEventRegistrationSteps.personalName || mVEventRegistrationSteps.personalEmail || mVEventRegistrationSteps.creditCardInformation) {
            return new RideSharingRegistrationSteps(mVEventRegistrationSteps.phoneVerification, mVEventRegistrationSteps.personalName, mVEventRegistrationSteps.personalEmail, mVEventRegistrationSteps.creditCardInformation);
        }
        return null;
    }

    /* renamed from: b */
    public static WondoFullScreenDisplayInfo m47823b(MVWondoConfirmation mVWondoConfirmation) {
        C20944i0 i0Var;
        C20944i0 i0Var2;
        try {
            UriImage c = UriImage.m40912c(mVWondoConfirmation.imageUrl, new String[0]);
            String str = mVWondoConfirmation.title;
            String str2 = mVWondoConfirmation.descriptionText;
            if (mVWondoConfirmation.mo35642f()) {
                MVWondoCta mVWondoCta = mVWondoConfirmation.cta;
                i0Var = new C20944i0(mVWondoCta.text, new AppDeepLink("com.tranzmate", Uri.parse(mVWondoCta.uri)));
            } else {
                i0Var = null;
            }
            if (mVWondoConfirmation.mo35646i()) {
                MVWondoCta mVWondoCta2 = mVWondoConfirmation.secondaryCta;
                i0Var2 = new C20944i0(mVWondoCta2.text, new AppDeepLink("com.tranzmate", Uri.parse(mVWondoCta2.uri)));
            } else {
                i0Var2 = null;
            }
            return new WondoFullScreenDisplayInfo(c, str, str2, i0Var, i0Var2);
        } catch (Exception e) {
            throw new BadResponseException("Unable to decode wondo full screen.", e);
        }
    }
}
