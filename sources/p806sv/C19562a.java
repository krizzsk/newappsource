package p806sv;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import b00.C13556a;
import c70.C13756i;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.p421qr.QRCodeImageView;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.EventRequest;
import com.tranzmate.R;
import p054d0.C4291k0;
import p737pv.C19025o;
import p737pv.C19026p;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: sv.a */
public class C19562a extends C15676b<MoovitActivity> {

    /* renamed from: p */
    public static final String f49725p = C19562a.class.getName();

    /* renamed from: h */
    public C13556a f49726h;

    /* renamed from: i */
    public EventRequest f49727i;

    /* renamed from: j */
    public int f49728j;

    /* renamed from: k */
    public ProgressBar f49729k;

    /* renamed from: l */
    public QRCodeImageView f49730l;

    /* renamed from: m */
    public TextView f49731m;

    /* renamed from: n */
    public TextView f49732n;

    /* renamed from: o */
    public final C19563a f49733o = new C19563a();

    /* renamed from: sv.a$a */
    public class C19563a extends C20438i<C19025o, C19026p> {
        public C19563a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19025o oVar = (C19025o) cVar;
            C19026p pVar = (C19026p) gVar;
            C19562a aVar = C19562a.this;
            aVar.f49730l.setQRCode(pVar.f48391m);
            aVar.f49732n.setText(pVar.f48392n);
            Resources resources = aVar.getResources();
            int i = aVar.f49728j;
            aVar.f49731m.setText(resources.getQuantityString(R.plurals.tickets, i, new Object[]{Integer.valueOf(i)}));
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19025o oVar = (C19025o) cVar;
            C19562a aVar = C19562a.this;
            String str = C19562a.f49725p;
            aVar.mo51911S1();
            C19562a.this.dismissAllowingStateLoss();
            return false;
        }
    }

    public C19562a() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public final void mo51911S1() {
        this.f49729k.setVisibility(8);
        this.f49730l.setVisibility(0);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        Bundle K1 = mo46752K1();
        this.f49727i = (EventRequest) K1.getParcelable("eventRequest");
        this.f49728j = K1.getInt("ticketsAmount");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.event_ticket_dialog_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        this.f49729k.setVisibility(0);
        this.f49730l.setVisibility(4);
        C13556a aVar = this.f49726h;
        if (aVar != null) {
            aVar.cancel(true);
            this.f49726h = null;
        }
        C13756i a = C13756i.m34349a(getContext());
        C19025o oVar = new C19025o(a.mo40679b(), this.f49727i.f42959i);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f49726h = a.mo40684g("event_receipt", oVar, requestOptions, this.f49733o);
    }

    public final void onStop() {
        super.onStop();
        C13556a aVar = this.f49726h;
        if (aVar != null) {
            aVar.cancel(true);
            this.f49726h = null;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f49729k = (ProgressBar) view.findViewById(R.id.progress_bar);
        QRCodeImageView qRCodeImageView = (QRCodeImageView) view.findViewById(R.id.qr_view);
        this.f49730l = qRCodeImageView;
        qRCodeImageView.setListener(new C4291k0(this, 8));
        this.f49731m = (TextView) view.findViewById(R.id.tickets_amount);
        this.f49732n = (TextView) view.findViewById(R.id.phone);
    }
}
