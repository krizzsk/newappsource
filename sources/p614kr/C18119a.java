package p614kr;

import android.view.KeyEvent;
import android.widget.TextView;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import n60.C18532c;

/* renamed from: kr.a */
public final /* synthetic */ class C18119a implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f46328b;

    /* renamed from: c */
    public final /* synthetic */ Object f46329c;

    public /* synthetic */ C18119a(Object obj, int i) {
        this.f46328b = i;
        this.f46329c = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f46328b) {
            case 0:
                CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = (CarpoolAddCreditCardActivity) this.f46329c;
                int i2 = CarpoolAddCreditCardActivity.f37786x0;
                if (i == 4) {
                    carpoolAddCreditCardActivity.mo44876z2();
                } else {
                    carpoolAddCreditCardActivity.getClass();
                }
                return false;
            default:
                C18532c cVar = (C18532c) this.f46329c;
                int i3 = C18532c.f47176y;
                if (i == 4) {
                    cVar.mo50936y2();
                } else {
                    cVar.getClass();
                }
                return false;
        }
    }
}
