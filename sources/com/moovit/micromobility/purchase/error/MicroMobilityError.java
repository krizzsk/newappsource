package com.moovit.micromobility.purchase.error;

import android.content.Context;
import c00.C13723g;
import com.moovit.MoovitActivity;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.request.UserRequestError;
import java.util.Arrays;
import l30.C5570c0;
import l30.C5596y;
import p572iw.C17661d;
import p857uy.C20047a;

public enum MicroMobilityError {
    GENERAL_USER_ERROR(0, r4, 0),
    WUNDER_ERROR(0, r4, 0),
    UNRECOVERABLE_ERROR(0, r4, 0),
    NO_BIKES_IN_STATION_ERROR(0, r4, 0),
    DOUBLE_ACTIVE_RIDES_ERROR(0, r4, 0),
    PENDING_VERIFICATION_ERROR(C5596y.img_spot_pending, C5570c0.got_it, 0);
    
    public final int imageId;
    public final int negativeButtonId;
    public final int positiveButtonId;

    /* renamed from: com.moovit.micromobility.purchase.error.MicroMobilityError$a */
    public static /* synthetic */ class C4155a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14913a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.micromobility.purchase.error.MicroMobilityError[] r0 = com.moovit.micromobility.purchase.error.MicroMobilityError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14913a = r0
                com.moovit.micromobility.purchase.error.MicroMobilityError r1 = com.moovit.micromobility.purchase.error.MicroMobilityError.WUNDER_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14913a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.purchase.error.MicroMobilityError r1 = com.moovit.micromobility.purchase.error.MicroMobilityError.UNRECOVERABLE_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14913a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.purchase.error.MicroMobilityError r1 = com.moovit.micromobility.purchase.error.MicroMobilityError.NO_BIKES_IN_STATION_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14913a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.micromobility.purchase.error.MicroMobilityError r1 = com.moovit.micromobility.purchase.error.MicroMobilityError.DOUBLE_ACTIVE_RIDES_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14913a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.micromobility.purchase.error.MicroMobilityError r1 = com.moovit.micromobility.purchase.error.MicroMobilityError.PENDING_VERIFICATION_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.micromobility.purchase.error.MicroMobilityError.C4155a.<clinit>():void");
        }
    }

    private MicroMobilityError(int i, int i2, int i3) {
        this.imageId = i;
        this.positiveButtonId = i2;
        this.negativeButtonId = i3;
    }

    public static AlertDialogFragment createErrorDialog(Context context, UserRequestError userRequestError) {
        MicroMobilityError fromErrorCode = fromErrorCode(userRequestError.mo49160b());
        return new AlertDialogFragment.C15856a(context).mo47682k(fromErrorCode.name()).mo47676e(fromErrorCode.imageId, false).mo47684m(userRequestError.mo49162d()).mo47679h(userRequestError.mo49161c()).mo47681j(fromErrorCode.positiveButtonId).mo47680i(fromErrorCode.negativeButtonId).mo47673b();
    }

    private static MicroMobilityError fromErrorCode(int i) {
        switch (i) {
            case 50007:
                return WUNDER_ERROR;
            case 50008:
                return DOUBLE_ACTIVE_RIDES_ERROR;
            case 50009:
                return NO_BIKES_IN_STATION_ERROR;
            case 50010:
                return UNRECOVERABLE_ERROR;
            case 50011:
                return PENDING_VERIFICATION_ERROR;
            default:
                return GENERAL_USER_ERROR;
        }
    }

    public static boolean onErrorDialogButtonClicked(MoovitActivity moovitActivity, String str, int i) {
        return ((MicroMobilityError) C13723g.m34286g(Arrays.asList(values()), new C20047a(str, 1))) != null;
    }

    public static boolean onErrorDialogDismissed(MoovitActivity moovitActivity, String str) {
        MicroMobilityError microMobilityError = (MicroMobilityError) C13723g.m34286g(Arrays.asList(values()), new C17661d(str, 1));
        if (microMobilityError == null) {
            return false;
        }
        int i = C4155a.f14913a[microMobilityError.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            moovitActivity.finish();
        }
        return true;
    }
}
