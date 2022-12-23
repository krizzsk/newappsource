package com.moovit.ticketing.purchase.error;

import android.content.Context;
import android.content.Intent;
import c00.C13723g;
import com.moovit.MoovitActivity;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.request.UserRequestError;
import e20.C16775g;
import java.util.Arrays;
import p732pq.C18947h;
import p824tp.C19739q;

public enum TicketingErrorAction {
    NO_ACTION(r1, 0),
    PAYMENT_ACCOUNT_DISCONNECTED(r1, 0),
    SERVER_TIMEOUT(r1, 0),
    TRANSACTION_RESTART(r1, 0);
    
    public final int negativeButtonId;
    public final int positiveButtonId;

    /* renamed from: com.moovit.ticketing.purchase.error.TicketingErrorAction$a */
    public static /* synthetic */ class C7657a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23281a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.ticketing.purchase.error.TicketingErrorAction[] r0 = com.moovit.ticketing.purchase.error.TicketingErrorAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23281a = r0
                com.moovit.ticketing.purchase.error.TicketingErrorAction r1 = com.moovit.ticketing.purchase.error.TicketingErrorAction.PAYMENT_ACCOUNT_DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23281a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.purchase.error.TicketingErrorAction r1 = com.moovit.ticketing.purchase.error.TicketingErrorAction.SERVER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23281a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.purchase.error.TicketingErrorAction r1 = com.moovit.ticketing.purchase.error.TicketingErrorAction.TRANSACTION_RESTART     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23281a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.purchase.error.TicketingErrorAction r1 = com.moovit.ticketing.purchase.error.TicketingErrorAction.NO_ACTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.purchase.error.TicketingErrorAction.C7657a.<clinit>():void");
        }
    }

    private TicketingErrorAction(int i, int i2) {
        this.positiveButtonId = i;
        this.negativeButtonId = i2;
    }

    public static AlertDialogFragment createErrorDialog(Context context, UserRequestError userRequestError) {
        TicketingErrorAction fromErrorCode = fromErrorCode(userRequestError.mo49160b());
        return new AlertDialogFragment.C15856a(context).mo47682k(fromErrorCode.name()).mo47676e(C19739q.img_empty_warning, false).mo47684m(userRequestError.mo49162d()).mo47679h(userRequestError.mo49161c()).mo47681j(fromErrorCode.positiveButtonId).mo47680i(fromErrorCode.negativeButtonId).mo47673b();
    }

    private static TicketingErrorAction fromErrorCode(int i) {
        if (i == 40138) {
            return PAYMENT_ACCOUNT_DISCONNECTED;
        }
        if (i == 40141) {
            return SERVER_TIMEOUT;
        }
        switch (i) {
            case 60000:
            case 60001:
            case 60002:
            case 60003:
                return TRANSACTION_RESTART;
            default:
                return NO_ACTION;
        }
    }

    public static boolean onErrorDialogButtonClicked(MoovitActivity moovitActivity, String str, int i) {
        return ((TicketingErrorAction) C13723g.m34286g(Arrays.asList(values()), new C16775g(str, 1))) != null;
    }

    public static boolean onErrorDialogDismissed(MoovitActivity moovitActivity, String str) {
        TicketingErrorAction ticketingErrorAction = (TicketingErrorAction) C13723g.m34286g(Arrays.asList(values()), new C18947h(str, 5));
        if (ticketingErrorAction == null) {
            return false;
        }
        int i = C7657a.f23281a[ticketingErrorAction.ordinal()];
        if (i == 1) {
            moovitActivity.finish();
        } else if (i == 2 || i == 3) {
            Intent w1 = moovitActivity.mo44546w1();
            moovitActivity.finish();
            moovitActivity.startActivity(w1);
            moovitActivity.overridePendingTransition(0, 0);
        }
        return true;
    }
}
