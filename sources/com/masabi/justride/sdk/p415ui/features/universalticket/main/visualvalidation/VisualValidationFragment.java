package com.masabi.justride.sdk.p415ui.features.universalticket.main.visualvalidation;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import bf0.C21049c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.exception.MissingSDKException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.ticket.VisualValidationView;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.C14670b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import p304x.C7082o;
import p469eo.C16846b;
import p492fn.C17043c;
import p541ho.C17466c;
import p565io.C17624a;
import p583jk.C17875h;
import p605ki.C18063q;
import p611ko.C18110b;
import p612kp.C18113a;
import p701oj.C18773q;
import p871vo.C20193i;
import p891wk.C20364s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/main/visualvalidation/VisualValidationFragment;", "Lio/a;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.visualvalidation.VisualValidationFragment */
public final class VisualValidationFragment extends C17624a {

    /* renamed from: c */
    public C18773q f37275c;

    /* renamed from: d */
    public C18113a f37276d;

    /* renamed from: e */
    public final C21049c f37277e = C23812a.m58432b(new VisualValidationFragment$drawableFactory$2(this));

    /* renamed from: f */
    public C17466c f37278f;

    /* renamed from: g */
    public final C14678b f37279g = new C14678b(this);

    /* renamed from: h */
    public final C14670b f37280h = new C14670b(1000, new C14677a(this));

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.visualvalidation.VisualValidationFragment$a */
    public static final class C14677a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ VisualValidationFragment f37281b;

        public C14677a(VisualValidationFragment visualValidationFragment) {
            this.f37281b = visualValidationFragment;
        }

        public final void run() {
            List list;
            VisualValidationFragment visualValidationFragment = this.f37281b;
            C18113a aVar = visualValidationFragment.f37276d;
            if (aVar != null) {
                C17043c cVar = aVar.f46311c;
                if (cVar != null) {
                    list = cVar.mo49647a();
                } else {
                    list = C17875h.m44281E(-16777216, -16777216, -16777216);
                }
                Drawable[] drawableArr = new Drawable[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    drawableArr[i] = ((C18110b) visualValidationFragment.f37277e.getValue()).mo50548a(BitmapDescriptorFactory.HUE_RED, ((Number) list.get(i)).intValue());
                }
                C18773q qVar = visualValidationFragment.f37275c;
                C24362h.m61208c(qVar);
                qVar.f47779a.setCellDrawables(drawableArr);
                this.f37281b.mo44497J1();
                return;
            }
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.visualvalidation.VisualValidationFragment$b */
    public static final class C14678b<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ VisualValidationFragment f37282a;

        public C14678b(VisualValidationFragment visualValidationFragment) {
            this.f37282a = visualValidationFragment;
        }

        public final void onChanged(Object obj) {
            boolean z;
            float f;
            C20364s sVar = (C20364s) obj;
            VisualValidationFragment visualValidationFragment = this.f37282a;
            C24362h.m61210e(sVar, "it");
            C18113a aVar = visualValidationFragment.f37276d;
            if (aVar != null) {
                C17043c cVar = sVar.f51626d;
                TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
                C24362h.m61210e(ticketDisplayConfiguration, "ticketDisplayBundle.ticketDisplayConfiguration");
                String str = ticketDisplayConfiguration.f37085b;
                TicketDisplayConfiguration ticketDisplayConfiguration2 = sVar.f51631i;
                C24362h.m61210e(ticketDisplayConfiguration2, "ticketDisplayBundle.ticketDisplayConfiguration");
                String str2 = ticketDisplayConfiguration2.f37086c;
                TicketDisplayConfiguration ticketDisplayConfiguration3 = sVar.f51631i;
                C24362h.m61210e(ticketDisplayConfiguration3, "ticketDisplayBundle.ticketDisplayConfiguration");
                String str3 = ticketDisplayConfiguration3.f37087d;
                TicketDisplayConfiguration ticketDisplayConfiguration4 = sVar.f51631i;
                C24362h.m61210e(ticketDisplayConfiguration4, "ticketDisplayBundle.ticketDisplayConfiguration");
                String str4 = ticketDisplayConfiguration4.f37092i;
                C24362h.m61210e(str4, "ticketDisplayBundle.tick…onfiguration.layoutPreset");
                aVar.f46311c = cVar;
                aVar.f46312d = str4;
                z = aVar.mo50550b(str, str2, str3);
            } else {
                visualValidationFragment.f37276d = new C18113a(sVar);
                z = true;
            }
            if (z) {
                VisualValidationFragment visualValidationFragment2 = this.f37282a;
                visualValidationFragment2.mo44497J1();
                C18773q qVar = visualValidationFragment2.f37275c;
                C24362h.m61208c(qVar);
                VisualValidationView visualValidationView = qVar.f47779a;
                C18113a aVar2 = visualValidationFragment2.f37276d;
                if (aVar2 != null) {
                    String str5 = aVar2.f46312d;
                    if (str5.hashCode() == -934234158 && str5.equals("VISVAL_FIRST")) {
                        f = 30.0f;
                    } else {
                        f = 20.0f;
                    }
                    visualValidationView.setDateTimeTextSize(f);
                    C18773q qVar2 = visualValidationFragment2.f37275c;
                    C24362h.m61208c(qVar2);
                    VisualValidationView visualValidationView2 = qVar2.f47779a;
                    ObjectAnimator objectAnimator = visualValidationView2.f37202e;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                        visualValidationView2.f37202e = null;
                    }
                    visualValidationView2.f37204g = -1;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    visualValidationView2.f37201d.setLayoutParams(layoutParams);
                    visualValidationView2.post(new C7082o(visualValidationView2, 11));
                    return;
                }
                C24362h.m61217l("presenter");
                throw null;
            }
        }
    }

    /* renamed from: J1 */
    public final void mo44497J1() {
        C18773q qVar = this.f37275c;
        C24362h.m61208c(qVar);
        VisualValidationView visualValidationView = qVar.f47779a;
        C18113a aVar = this.f37276d;
        String str = null;
        if (aVar != null) {
            Date date = new Date();
            aVar.getClass();
            long time = date.getTime();
            String format = aVar.f46309a.format(Long.valueOf(time));
            SimpleDateFormat simpleDateFormat = aVar.f46310b;
            if (simpleDateFormat != null) {
                str = simpleDateFormat.format(Long.valueOf(time));
            }
            if (str != null) {
                format = C13555b.m33971j(new Object[]{format, str}, 2, "%s\n%s", "java.lang.String.format(format, *args)");
            } else {
                C24362h.m61210e(format, "line1");
            }
            visualValidationView.setDateTimeText(format);
            return;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            Object a = ((C16846b) this.f45307b.f46180j.f20215b).mo49505a(C17466c.class, (String) null);
            C24362h.m61210e(a, "serviceLocator.get(Scree…urePreventer::class.java)");
            this.f37278f = (C17466c) a;
        } catch (MissingSDKException unused) {
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_universal_ticket_visual_validation, viewGroup, false);
        if (inflate != null) {
            VisualValidationView visualValidationView = (VisualValidationView) inflate;
            this.f37275c = new C18773q(visualValidationView, visualValidationView);
            return visualValidationView;
        }
        throw new NullPointerException("rootView");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f37275c = null;
    }

    public final void onPause() {
        super.onPause();
        C18773q qVar = this.f37275c;
        C24362h.m61208c(qVar);
        VisualValidationView visualValidationView = qVar.f47779a;
        ObjectAnimator objectAnimator = visualValidationView.f37202e;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        ObjectAnimator objectAnimator2 = visualValidationView.f37203f;
        if (objectAnimator2 != null) {
            objectAnimator2.pause();
        }
        C14670b bVar = this.f37280h;
        bVar.f37238b = false;
        ((Handler) bVar.f37237a.getValue()).removeMessages(0);
    }

    public final void onResume() {
        super.onResume();
        C14670b bVar = this.f37280h;
        if (!bVar.f37238b) {
            bVar.f37238b = true;
            ((Handler) bVar.f37237a.getValue()).sendEmptyMessage(0);
        }
        C18773q qVar = this.f37275c;
        C24362h.m61208c(qVar);
        VisualValidationView visualValidationView = qVar.f47779a;
        visualValidationView.getClass();
        visualValidationView.post(new C7082o(visualValidationView, 11));
    }

    public final void onStart() {
        super.onStart();
        C17466c cVar = this.f37278f;
        if (cVar != null) {
            FragmentActivity requireActivity = requireActivity();
            C24362h.m61210e(requireActivity, "requireActivity()");
            cVar.mo49923a(requireActivity);
            Bundle arguments = getArguments();
            FragmentActivity requireActivity2 = requireActivity();
            C24362h.m61210e(requireActivity2, "requireActivity()");
            if (arguments != null) {
                String string = arguments.getString("TICKET_ID_KEY");
                if (string != null) {
                    C1019k0 b = new C1026n0(requireActivity2).mo4314b(C20193i.class, string);
                    C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                    ((C20193i) b).f51229b.observe(this, this.f37279g);
                    return;
                }
                throw new MissingArgumentException("Cannot load fragment without ticket id.");
            }
            throw new MissingArgumentException("Cannot load fragment with null bundle.");
        }
        C24362h.m61217l("screenCapturePreventer");
        throw null;
    }

    public final void onStop() {
        super.onStop();
        C17466c cVar = this.f37278f;
        if (cVar != null) {
            FragmentActivity requireActivity = requireActivity();
            C24362h.m61210e(requireActivity, "requireActivity()");
            cVar.mo49924b(requireActivity);
            return;
        }
        C24362h.m61217l("screenCapturePreventer");
        throw null;
    }
}
