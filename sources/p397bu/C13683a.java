package p397bu;

import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import com.moovit.app.itinerary.view.leg.C15078c;
import com.moovit.app.itinerary.view.leg.C15087l;
import com.moovit.app.reports.list.ReportsListActivity;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.tranzmate.R;
import p548hv.C17502d;

/* renamed from: bu.a */
public final /* synthetic */ class C13683a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33721b;

    /* renamed from: c */
    public final /* synthetic */ Object f33722c;

    /* renamed from: d */
    public final /* synthetic */ Object f33723d;

    /* renamed from: e */
    public final /* synthetic */ Object f33724e;

    public /* synthetic */ C13683a(int i, Object obj, Object obj2, Object obj3) {
        this.f33721b = i;
        this.f33723d = obj;
        this.f33724e = obj2;
        this.f33722c = obj3;
    }

    public final void onClick(View view) {
        switch (this.f33721b) {
            case 0:
                ((C15078c) this.f33723d).mo45371D(view, (CarLeg) this.f33724e, (Leg) this.f33722c);
                return;
            case 1:
                int i = C15087l.f38717E;
                ((C15087l) this.f33723d).mo45371D(view, (WaitToMultiTransitLinesLeg) this.f33724e, (Leg) this.f33722c);
                return;
            default:
                ReportsListActivity.C15206e eVar = (ReportsListActivity.C15206e) this.f33723d;
                C17502d dVar = (C17502d) this.f33722c;
                int i2 = ReportsListActivity.C15206e.f39197y;
                eVar.getClass();
                boolean z = dVar.f45070e;
                String str = dVar.f45066a;
                PopupMenu popupMenu = new PopupMenu(ReportsListActivity.this, (Button) this.f33724e);
                popupMenu.setOnMenuItemClickListener(new ReportsListActivity.C15206e.C15207a(str));
                MenuInflater menuInflater = popupMenu.getMenuInflater();
                if (z) {
                    menuInflater.inflate(R.menu.report_owner_menu, popupMenu.getMenu());
                } else {
                    menuInflater.inflate(R.menu.report_menu, popupMenu.getMenu());
                }
                popupMenu.show();
                return;
        }
    }
}
