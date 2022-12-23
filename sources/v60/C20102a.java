package v60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.payment.registration.steps.reconnect.ReconnectInstructions;
import k60.C17999a;
import p242s1.C6333d0;
import p583jk.C17884p;
import p739px.C19037a;
import v40.C25750e;
import v40.C25751f;

/* renamed from: v60.a */
public class C20102a extends C17999a {

    /* renamed from: r */
    public static final /* synthetic */ int f51015r = 0;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_reconnect_fragment, viewGroup, false);
        ReconnectInstructions reconnectInstructions = mo50500p2().f42765i;
        if (reconnectInstructions != null) {
            ImageView imageView = (ImageView) inflate.findViewById(C25750e.image);
            Image image = reconnectInstructions.f42872b;
            if (image == null) {
                imageView.setVisibility(8);
            } else {
                C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
            }
            TextView textView = (TextView) inflate.findViewById(C25750e.title);
            UiUtils.m40234B(textView, reconnectInstructions.f42873c);
            C6333d0.m15030r(textView, true);
            UiUtils.m40234B((TextView) inflate.findViewById(C25750e.subtitle), reconnectInstructions.f42874d);
            inflate.findViewById(C25750e.button).setOnClickListener(new C19037a(this, 14));
            return inflate;
        }
        throw new IllegalStateException("PaymentRegistrationInstructions must contain non null ReconnectInstructions");
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_reconnect";
    }
}
