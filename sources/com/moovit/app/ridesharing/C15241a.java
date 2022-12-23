package com.moovit.app.ridesharing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b00.C13556a;
import c70.C13756i;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.app.ridesharing.view.EventBookingTicketView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ridesharing.model.EventRequestStatus;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import h60.C17327j1;
import java.math.BigDecimal;
import p259t5.C6592b;
import p471eq.C16850a;
import p737pv.C19018i;
import p737pv.C19019j;
import p737pv.C19020k;
import p737pv.C19021l;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: com.moovit.app.ridesharing.a */
public class C15241a extends C15676b<MoovitActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f39309p = 0;

    /* renamed from: h */
    public final C15242a f39310h = new C15242a();

    /* renamed from: i */
    public final C15243b f39311i = new C15243b();

    /* renamed from: j */
    public C13556a f39312j = null;

    /* renamed from: k */
    public C13556a f39313k = null;

    /* renamed from: l */
    public EventRequest f39314l;

    /* renamed from: m */
    public ProgressBar f39315m;

    /* renamed from: n */
    public View f39316n;

    /* renamed from: o */
    public CurrencyAmount f39317o;

    /* renamed from: com.moovit.app.ridesharing.a$a */
    public class C15242a extends C20438i<C19020k, C19021l> {
        public C15242a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19020k kVar = (C19020k) cVar;
            C15241a aVar = C15241a.this;
            aVar.f39312j = null;
            aVar.f39315m.setVisibility(8);
            aVar.f39316n.setVisibility(0);
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19020k kVar = (C19020k) cVar;
            C15241a aVar = C15241a.this;
            CurrencyAmount currencyAmount = ((C19021l) gVar).f48382m;
            int i = C15241a.f39309p;
            aVar.mo45749S1(currencyAmount);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19020k kVar = (C19020k) cVar;
            C15241a.this.dismissAllowingStateLoss();
            return false;
        }
    }

    /* renamed from: com.moovit.app.ridesharing.a$b */
    public class C15243b extends C20438i<C19018i, C19019j> {
        public C15243b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19018i iVar = (C19018i) cVar;
            C15241a aVar = C15241a.this;
            aVar.f39313k = null;
            aVar.f39315m.setVisibility(8);
            aVar.f39316n.setVisibility(0);
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19018i iVar = (C19018i) cVar;
            C15241a aVar = C15241a.this;
            int i = C15241a.f39309p;
            aVar.getClass();
            CurrencyAmount currencyAmount = ((C19019j) gVar).f48381m;
            if (currencyAmount != null) {
                aVar.mo45749S1(currencyAmount);
                return;
            }
            aVar.mo46753L1(C15245d.class, new C17327j1(aVar, 13));
            aVar.dismissAllowingStateLoss();
        }

        /* renamed from: w */
        public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
            C19018i iVar = (C19018i) cVar;
            return false;
        }
    }

    /* renamed from: com.moovit.app.ridesharing.a$c */
    public static /* synthetic */ class C15244c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39320a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.ridesharing.model.EventRequestStatus[] r0 = com.moovit.ridesharing.model.EventRequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39320a = r0
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.WAITING_FOR_PROVIDER_APPROVAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39320a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.APPROVED_BY_PROVIDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39320a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.REJECTED_BY_PROVIDER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39320a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39320a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.FULFILLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39320a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.UNFULFILLED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.C15241a.C15244c.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.ridesharing.a$d */
    public interface C15245d {
        /* renamed from: p */
        void mo45733p(EventRequest eventRequest);
    }

    public C15241a() {
        super(MoovitActivity.class);
        setStyle(0, 2131952794);
    }

    /* renamed from: S1 */
    public final void mo45749S1(CurrencyAmount currencyAmount) {
        int i;
        boolean z;
        boolean z2;
        this.f39317o = currencyAmount;
        View view = this.f39316n;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.ticket_title);
            if (this.f39314l.f42953c.f42949h == 1) {
                i = R.string.event_booking_direction_to_event;
            } else {
                i = R.string.event_booking_direction_from_event;
            }
            textView.setText(i);
            ((EventBookingTicketView) view.findViewById(R.id.ticket)).setEventRequest(this.f39314l);
            ListItemView listItemView = (ListItemView) view.findViewById(R.id.cancellation_fee);
            CurrencyAmount currencyAmount2 = this.f39317o;
            int i2 = 0;
            if (currencyAmount2 == null && this.f39314l.f42955e == EventRequestStatus.WAITING_FOR_PROVIDER_APPROVAL) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                listItemView.setVisibility(8);
            } else {
                if (currencyAmount2 == null) {
                    this.f39317o = new CurrencyAmount(this.f39314l.f42956f.f23844b, BigDecimal.ZERO);
                }
                listItemView.setVisibility(0);
                listItemView.setAccessoryText((CharSequence) this.f39317o.toString());
            }
            ListItemView listItemView2 = (ListItemView) view.findViewById(R.id.ride_refund);
            EventRequest eventRequest = this.f39314l;
            CurrencyAmount f = CurrencyAmount.m17929f(eventRequest.f42958h, eventRequest.f42956f);
            CurrencyAmount currencyAmount3 = this.f39317o;
            if (currencyAmount3 != null) {
                f = CurrencyAmount.m17930g(f, currencyAmount3);
            }
            listItemView2.setAccessoryText((CharSequence) f.toString());
            TextView textView2 = (TextView) view.findViewById(R.id.ride_refund_disclaimer);
            if (this.f39317o != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = C15244c.f39320a[this.f39314l.f42955e.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    if (z2) {
                        i2 = R.string.event_booking_purchase_confirmation_step_subtotal_disclaimer_charged_with_fee;
                    } else {
                        i2 = R.string.event_booking_purchase_confirmation_step_subtotal_disclaimer_charged;
                    }
                }
            } else if (z2) {
                i2 = R.string.event_booking_purchase_confirmation_step_subtotal_disclaimer_not_charged_with_fee;
            } else {
                i2 = R.string.event_booking_purchase_confirmation_step_subtotal_disclaimer_not_charged;
            }
            UiUtils.m40235C(textView2, i2, 8);
            view.findViewById(R.id.confirm_button).setOnClickListener(new C16850a(this, 17));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39314l = (EventRequest) mo46752K1().getParcelable("eventRequest");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.event_purchase_cancellation_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        this.f39315m.setVisibility(0);
        this.f39316n.setVisibility(4);
        C13556a aVar = this.f39312j;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39312j = null;
        }
        C13756i a = C13756i.m34349a(getContext());
        C19020k kVar = new C19020k(a.mo40679b(), this.f39314l.f42959i);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f39312j = a.mo40684g("cancellation_fee", kVar, requestOptions, this.f39310h);
    }

    public final void onStop() {
        super.onStop();
        C13556a aVar = this.f39312j;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39312j = null;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f39315m = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.f39316n = view.findViewById(R.id.main_content);
        ((Toolbar) view.findViewById(R.id.tool_bar)).setNavigationOnClickListener(new C6592b(this, 23));
    }
}
