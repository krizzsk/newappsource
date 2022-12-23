package p392bp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import kotlin.Metadata;
import mf0.C24362h;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p701oj.C18765i;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lbp/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: bp.a */
public final class C13651a extends Fragment {

    /* renamed from: b */
    public C18765i f33686b;

    /* renamed from: c */
    public String f33687c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                this.f33687c = string;
                return;
            }
            throw new JustRideSdkException("Cannot load fragment without ticket id.");
        }
        throw new JustRideSdkException("Cannot load fragment with null bundle.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_ticket_id, viewGroup, false);
        int i = C18061o.ticketIdTextView;
        TextView textView = (TextView) inflate.findViewById(i);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            this.f33686b = new C18765i(linearLayout, textView);
            return linearLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f33686b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C18765i iVar = this.f33686b;
        C24362h.m61208c(iVar);
        LinearLayout linearLayout = iVar.f47746a;
        C24362h.m61210e(linearLayout, "binding.root");
        int i = C18066t.f46205xa07381be;
        Object[] objArr = new Object[1];
        String str = this.f33687c;
        if (str != null) {
            objArr[0] = str;
            linearLayout.setContentDescription(getString(i, objArr));
            C18765i iVar2 = this.f33686b;
            C24362h.m61208c(iVar2);
            TextView textView = iVar2.f47747b;
            C24362h.m61210e(textView, "binding.ticketIdTextView");
            String str2 = this.f33687c;
            if (str2 != null) {
                textView.setText(str2);
            } else {
                C24362h.m61217l("ticketId");
                throw null;
            }
        } else {
            C24362h.m61217l("ticketId");
            throw null;
        }
    }
}
