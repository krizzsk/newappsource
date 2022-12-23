package p942yo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import mf0.C24362h;
import p605ki.C18061o;
import p605ki.C18063q;
import p701oj.C18760d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lyo/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: yo.a */
public final class C20747a extends Fragment {

    /* renamed from: b */
    public C18760d f52350b;

    /* renamed from: c */
    public Date f52351c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f52351c = new Date(arguments.getLong("ACTIVATION_END_TIMESTAMP"));
            return;
        }
        throw new JustRideSdkException("Cannot load fragment with null bundle.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_activation_end, viewGroup, false);
        int i = C18061o.activationEndDateTextView;
        TextView textView = (TextView) inflate.findViewById(i);
        if (textView != null) {
            i = C18061o.activationEndTitleTextView;
            if (((TextView) inflate.findViewById(i)) != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.f52350b = new C18760d(linearLayout, textView);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f52350b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(2, 3);
        C18760d dVar = this.f52350b;
        C24362h.m61208c(dVar);
        TextView textView = dVar.f47736a;
        C24362h.m61210e(textView, "binding.activationEndDateTextView");
        Date date = this.f52351c;
        if (date != null) {
            textView.setText(dateTimeInstance.format(date));
        } else {
            C24362h.m61217l("activationEnd");
            throw null;
        }
    }
}
