package p799so;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.jobs.ticket.get.TicketSummaryBuilderException;
import java.util.ArrayList;
import p054d0.C4273c0;
import p364al.C13487h;
import p565io.C17625b;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18067u;
import p658mo.C18411e;
import p799so.C19499c;
import p821tm.C19714r;
import p891wk.C20362q;

/* renamed from: so.a */
public class C19496a extends C17625b<C19496a, C19499c> {

    /* renamed from: f */
    public static final /* synthetic */ int f49593f = 0;

    /* renamed from: e */
    public String f49594e;

    public C19496a() {
        super(C19499c.C19500a.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        if (getArguments() != null) {
            this.f49594e = getArguments().getString("KEY_TICKET_ID");
            return;
        }
        throw new JustRideSdkException("Cannot load ActivationDisclaimer screen with null arguments.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C18063q.fragment_ticket_actions, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C18061o.ticket_actions_list);
        C19499c cVar = (C19499c) mo50082H1();
        String str = this.f49594e;
        cVar.getClass();
        try {
            C18411e eVar = (C18411e) cVar.f49599b.f47829b;
            C13487h<C20362q> a = cVar.f49600c.mo44363a(str);
            if (!a.mo40399a()) {
                cVar.f49601d.getClass();
                C19714r.m47180a((C20362q) a.f33365a);
            }
            eVar.getClass();
            throw null;
        } catch (TicketSummaryBuilderException unused) {
            ArrayList arrayList = new ArrayList();
            recyclerView.setAdapter(new C19497b(arrayList, new C4273c0(1, this, arrayList)));
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            return inflate;
        }
    }

    public final void onStart() {
        super.onStart();
        getDialog().setCanceledOnTouchOutside(true);
        if (getDialog().getWindow() != null) {
            getDialog().getWindow().setLayout(-1, -2);
            getDialog().getWindow().addFlags(2);
            getDialog().getWindow().setDimAmount(0.6f);
            getDialog().getWindow().setGravity(80);
            getDialog().getWindow().setLayout(-1, -2);
            getDialog().getWindow().setWindowAnimations(C18067u.DialogAnimationSlideInAndOutFromBottom);
        }
    }
}
