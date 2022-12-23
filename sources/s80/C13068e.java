package s80;

import c00.C13721e;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.view.address.AddressInputView;
import java.io.Serializable;
import java.util.Map;
import p798sn.C19493a;

/* renamed from: s80.e */
public final /* synthetic */ class C13068e implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f32325b;

    /* renamed from: c */
    public final /* synthetic */ Serializable f32326c;

    /* renamed from: d */
    public final /* synthetic */ Object f32327d;

    public /* synthetic */ C13068e(Serializable serializable, Object obj, int i) {
        this.f32325b = i;
        this.f32326c = serializable;
        this.f32327d = obj;
    }

    public final Object convert(Object obj) {
        switch (this.f32325b) {
            case 0:
                return new TicketId(C13065d.f32318d, (String) this.f32326c, ((C19493a) obj).f49561f, (Map) this.f32327d);
            default:
                Integer num = (Integer) obj;
                int i = AddressInputView.f24023t;
                return new AddressInputView.C7938e(((String[]) this.f32326c)[num.intValue()], ((String[]) this.f32327d)[num.intValue()]);
        }
    }
}
