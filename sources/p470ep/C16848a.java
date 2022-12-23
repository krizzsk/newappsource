package p470ep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import mf0.C24362h;
import p583jk.C17884p;
import p584jl.C17885a;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p605ki.C18067u;
import p701oj.C18769m;
import p871vo.C20178e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lep/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: ep.a */
public final class C16848a extends Fragment {

    /* renamed from: e */
    public static final /* synthetic */ int f43840e = 0;

    /* renamed from: b */
    public C18769m f43841b;

    /* renamed from: c */
    public int f43842c;

    /* renamed from: d */
    public int f43843d = -16777216;

    /* renamed from: ep.a$a */
    public static final class C16849a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C16848a f43844b;

        public C16849a(C16848a aVar) {
            this.f43844b = aVar;
        }

        public final void onClick(View view) {
            C16848a aVar = this.f43844b;
            int i = C16848a.f43840e;
            Fragment parentFragment = aVar.getParentFragment();
            if (!(parentFragment instanceof C20178e)) {
                parentFragment = null;
            }
            C20178e eVar = (C20178e) parentFragment;
            if (eVar != null) {
                eVar.mo52424K1();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f43842c = arguments.getInt("KEY_ERROR_CODE", 0);
            this.f43843d = arguments.getInt("KEY_NAVIGATION_BUTTONS_TINT_COLOUR", -16777216);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_universal_ticket_error, viewGroup, false);
        int i = C18061o.bodyTextView;
        TextView textView = (TextView) inflate.findViewById(i);
        if (textView != null) {
            i = C18061o.dottedLine;
            if (((ImageView) inflate.findViewById(i)) != null) {
                i = C18061o.reloadButton;
                Button button = (Button) inflate.findViewById(i);
                if (button != null) {
                    i = C18061o.titleTextView;
                    TextView textView2 = (TextView) inflate.findViewById(i);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        this.f43841b = new C18769m(linearLayout, textView, button, textView2);
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f43841b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C18769m mVar = this.f43841b;
        C24362h.m61208c(mVar);
        TextView textView = mVar.f47769c;
        C24362h.m61210e(textView, "binding.titleTextView");
        C0801k.m2424f(textView, C18067u.JustRideSDKUniversalTitleTextAppearance);
        textView.setGravity(8388611);
        textView.setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.4f);
        C18769m mVar2 = this.f43841b;
        C24362h.m61208c(mVar2);
        TextView textView2 = mVar2.f47767a;
        C24362h.m61210e(textView2, "binding.bodyTextView");
        C17885a.m44471x0(textView2);
        C18769m mVar3 = this.f43841b;
        C24362h.m61208c(mVar3);
        TextView textView3 = mVar3.f47767a;
        C24362h.m61210e(textView3, "binding.bodyTextView");
        int i = this.f43842c;
        int i2 = 8;
        boolean z = true;
        if (i == 6) {
            str = getString(C18066t.f46228xe7ea2f5f, Integer.valueOf(i));
        } else if (i == 7) {
            str = getString(C18066t.f46226xb8826bd7, Integer.valueOf(i));
        } else if (i != 8) {
            str = getString(C18066t.com_masabi_justride_sdk_universal_ticket_error_message, Integer.valueOf(i));
        } else {
            str = getString(C18066t.f46229xb42d0e67, Integer.valueOf(i));
        }
        textView3.setText(str);
        if (this.f43842c == 9) {
            z = false;
        }
        C18769m mVar4 = this.f43841b;
        C24362h.m61208c(mVar4);
        Button button = mVar4.f47768b;
        C24362h.m61210e(button, "binding.reloadButton");
        if (z) {
            i2 = 0;
        }
        button.setVisibility(i2);
        if (z) {
            C18769m mVar5 = this.f43841b;
            C24362h.m61208c(mVar5);
            mVar5.f47768b.setTextColor(this.f43843d);
            C18769m mVar6 = this.f43841b;
            C24362h.m61208c(mVar6);
            Button button2 = mVar6.f47768b;
            C24362h.m61210e(button2, "binding.reloadButton");
            C17884p.m44362d(button2, C18060n.com_masabi_justride_sdk_icon_reload);
            C18769m mVar7 = this.f43841b;
            C24362h.m61208c(mVar7);
            mVar7.f47768b.setOnClickListener(new C16849a(this));
        }
    }
}
