package com.masabi.justride.sdk.p415ui.features.universalticket.main.actions;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.base.views.MaxHeightFrameLayout;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.FrostedScrollView;
import com.usebutton.sdk.internal.events.Events;
import java.util.ArrayList;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import mf0.C24362h;
import p389bl.C13641g;
import p518gp.C17212a;
import p583jk.C17884p;
import p605ki.C18047b;
import p605ki.C18059m;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18062p;
import p605ki.C18063q;
import p605ki.C18066t;
import p605ki.C18067u;
import p658mo.C18412f;
import p658mo.C18413g;
import p701oj.C18758b;
import p752qn.C19150h;
import p798sn.C19493a;
import p871vo.C20193i;
import p891wk.C20364s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/main/actions/ActionsDialogFragment;", "Landroidx/fragment/app/l;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.actions.ActionsDialogFragment */
public final class ActionsDialogFragment extends C0942l {

    /* renamed from: b */
    public C18758b f37269b;

    /* renamed from: c */
    public String f37270c;

    /* renamed from: d */
    public boolean f37271d;

    /* renamed from: e */
    public final C21049c f37272e = C23812a.m58432b(new ActionsDialogFragment$innerLinearLayout$2(this));

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.actions.ActionsDialogFragment$a */
    public static final class C14675a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ ActionsDialogFragment f37273a;

        public C14675a(ActionsDialogFragment actionsDialogFragment) {
            this.f37273a = actionsDialogFragment;
        }

        public final void onChanged(Object obj) {
            ArrayList<C18412f> arrayList;
            C20364s sVar = (C20364s) obj;
            C18047b.C18048a aVar = C18047b.f46173p;
            String str = this.f37273a.f37270c;
            List list = null;
            if (str != null) {
                aVar.getClass();
                C18047b a = C18047b.C18048a.m44717a(str);
                ActionsDialogFragment actionsDialogFragment = this.f37273a;
                C24362h.m61210e(sVar, "it");
                C19150h hVar = sVar.f51623a;
                C24362h.m61210e(hVar, "it.ticketDetails");
                C19493a g = C13641g.m34119g(hVar);
                C18413g gVar = (C18413g) a.f46184n.f47831d;
                TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
                C24362h.m61210e(ticketDisplayConfiguration, "it.ticketDisplayConfiguration");
                ((LinearLayout) actionsDialogFragment.f37272e.getValue()).removeAllViews();
                if (gVar != null) {
                    list = gVar.mo50865a();
                }
                if (list != null) {
                    arrayList = C23825c.m58500L0(list);
                } else {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(new C18412f(C18060n.com_masabi_justride_sdk_icon_close_small, actionsDialogFragment.getString(C18066t.com_masabi_justride_sdk_ticket_info_close_button)));
                for (C18412f fVar : arrayList) {
                    Button button = new Button(actionsDialogFragment.getContext());
                    int i = C18067u.JustRideSDKUniversalNavigationButton;
                    if (Build.VERSION.SDK_INT >= 23) {
                        button.setTextAppearance(i);
                    } else {
                        button.setTextAppearance(button.getContext(), i);
                    }
                    button.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    int dimension = (int) actionsDialogFragment.getResources().getDimension(C18059m.f46197xc46d261f);
                    button.setPadding(0, dimension, 0, dimension);
                    button.setTextAlignment(2);
                    button.setCompoundDrawablePadding((int) actionsDialogFragment.getResources().getDimension(C18059m.com_masabi_justride_sdk_universal_ticket_button_drawable_padding));
                    button.setAllCaps(false);
                    button.setEllipsize(TextUtils.TruncateAt.END);
                    button.setSingleLine(true);
                    button.setTextColor(ticketDisplayConfiguration.f37096m);
                    button.setBackgroundColor(0);
                    C24362h.m61210e(fVar, Events.PROPERTY_ACTION);
                    C17884p.m44362d(button, fVar.f46961a);
                    button.setText(fVar.f46962b);
                    button.setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.4f);
                    button.setOnClickListener(new C17212a(fVar, actionsDialogFragment, g));
                    ((LinearLayout) actionsDialogFragment.f37272e.getValue()).addView(button);
                }
                return;
            }
            C24362h.m61217l("sdkIdentifier");
            throw null;
        }
    }

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.actions.ActionsDialogFragment$b */
    public static final class C14676b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ActionsDialogFragment f37274b;

        public C14676b(ActionsDialogFragment actionsDialogFragment) {
            this.f37274b = actionsDialogFragment;
        }

        public final void run() {
            this.f37274b.f37271d = true;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("SDK_IDENTIFIER");
            if (string != null) {
                this.f37270c = string;
                return;
            }
            throw new JustRideSdkException("Cannot load actions fragment without SDK identifier.");
        }
        throw new JustRideSdkException("Cannot load actions fragment with null arguments.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_actions, viewGroup, false);
        int i = C18061o.frostedScrollView;
        FrostedScrollView frostedScrollView = (FrostedScrollView) inflate.findViewById(i);
        if (frostedScrollView != null) {
            MaxHeightFrameLayout maxHeightFrameLayout = (MaxHeightFrameLayout) inflate;
            this.f37269b = new C18758b(maxHeightFrameLayout, frostedScrollView);
            return maxHeightFrameLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f37269b = null;
    }

    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.addFlags(2);
            window.setDimAmount(0.6f);
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setWindowAnimations(C18067u.DialogAnimationSlideInAndOutFromBottom);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        FragmentActivity requireActivity = requireActivity();
        C24362h.m61210e(requireActivity, "requireActivity()");
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                C1019k0 b = new C1026n0(requireActivity).mo4314b(C20193i.class, string);
                C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                ((C20193i) b).f51229b.observe(getViewLifecycleOwner(), new C14675a(this));
                C18758b bVar = this.f37269b;
                C24362h.m61208c(bVar);
                bVar.f47727a.setMaxHeight$Android_release((int) (((double) C13641g.m34124l(this).heightPixels) * 0.87d));
                C18758b bVar2 = this.f37269b;
                C24362h.m61208c(bVar2);
                bVar2.f47728b.mo44452a((LinearLayout) this.f37272e.getValue());
                view.postDelayed(new C14676b(this), (long) getResources().getInteger(C18062p.com_masabi_justride_sdk_ui_default_animation_duration));
                return;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }
}
