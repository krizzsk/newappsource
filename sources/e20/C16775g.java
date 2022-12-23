package e20;

import c00.C13722f;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import com.moovit.view.address.AddressInputView;

/* renamed from: e20.g */
public final /* synthetic */ class C16775g implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f43675b;

    /* renamed from: c */
    public final /* synthetic */ String f43676c;

    public /* synthetic */ C16775g(String str, int i) {
        this.f43675b = i;
        this.f43676c = str;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f43675b) {
            case 0:
                return ((String) obj).startsWith(this.f43676c);
            case 1:
                return ((TicketingErrorAction) obj).name().equals(this.f43676c);
            default:
                String str = this.f43676c;
                int i = AddressInputView.f24023t;
                return ((AddressInputView.C7938e) obj).f24041b.equals(str);
        }
    }
}
