package p713ov;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.ridesharing.booking.EventBookingTicket;
import com.moovit.ridesharing.model.EventBookingBucket;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.List;
import p259t5.C6593c;

/* renamed from: ov.e */
public class C18836e extends C18831a {

    /* renamed from: t */
    public static final /* synthetic */ int f47953t = 0;

    /* renamed from: o */
    public CheckBox f47954o;

    /* renamed from: p */
    public List<TextView> f47955p;

    /* renamed from: q */
    public CheckBox f47956q;

    /* renamed from: r */
    public List<TextView> f47957r;

    /* renamed from: s */
    public View f47958s;

    /* renamed from: s2 */
    public static int m45835s2(CheckBox checkBox, List<TextView> list) {
        if (!checkBox.isChecked()) {
            return 0;
        }
        for (TextView next : list) {
            if (next.isSelected()) {
                return ((Integer) next.getTag()).intValue();
            }
        }
        return 0;
    }

    /* renamed from: n2 */
    public final int mo51314n2() {
        return R.string.event_booking_option_selector_step_bucket_options_title;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.event_booking_step_bucket_options_fragment, viewGroup, false);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.arrival_direction);
        this.f47954o = checkBox;
        checkBox.setOnCheckedChangeListener(new C18834c(this));
        this.f47955p = Arrays.asList(new TextView[]{(TextView) inflate.findViewById(R.id.arrival_tickets1), (TextView) inflate.findViewById(R.id.arrival_tickets2), (TextView) inflate.findViewById(R.id.arrival_tickets3), (TextView) inflate.findViewById(R.id.arrival_tickets4)});
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.return_direction);
        this.f47956q = checkBox2;
        checkBox2.setOnCheckedChangeListener(new C18835d(this));
        this.f47957r = Arrays.asList(new TextView[]{(TextView) inflate.findViewById(R.id.return_tickets1), (TextView) inflate.findViewById(R.id.return_tickets2), (TextView) inflate.findViewById(R.id.return_tickets3), (TextView) inflate.findViewById(R.id.return_tickets4)});
        View findViewById = inflate.findViewById(R.id.save);
        this.f47958s = findViewById;
        findViewById.setOnClickListener(new C6593c(this, 24));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        EventBookingCart o2 = mo51315o2();
        CheckBox checkBox = this.f47954o;
        EventBookingBucket eventBookingBucket = o2.f39344c;
        boolean z2 = false;
        if (eventBookingBucket == null || eventBookingBucket.f42925g.contains(1)) {
            z = true;
        } else {
            z = false;
        }
        checkBox.setEnabled(z);
        CheckBox checkBox2 = this.f47956q;
        EventBookingBucket eventBookingBucket2 = o2.f39344c;
        if (eventBookingBucket2 == null || eventBookingBucket2.f42925g.contains(2)) {
            z2 = true;
        }
        checkBox2.setEnabled(z2);
        mo51321r2(this.f47954o, this.f47955p, o2.f39346e);
        mo51321r2(this.f47956q, this.f47957r, o2.f39347f);
    }

    /* renamed from: r2 */
    public final void mo51321r2(CheckBox checkBox, List<TextView> list, EventBookingTicket eventBookingTicket) {
        int i;
        boolean z;
        int i2 = eventBookingTicket.f39357b;
        if (i2 > 0) {
            i = i2 - 1;
        } else {
            i = 0;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            TextView textView = list.get(i3);
            textView.setTag(Integer.valueOf(i4));
            textView.setOnClickListener(new C18833b(this, checkBox, list, textView, 0));
            textView.setText(textView.getResources().getQuantityString(R.plurals.tickets, i4, new Object[]{Integer.valueOf(i4)}));
            if (i3 == i) {
                z = true;
            } else {
                z = false;
            }
            textView.setSelected(z);
            textView.setEnabled(checkBox.isEnabled());
            i3 = i4;
        }
    }

    /* renamed from: t2 */
    public final void mo51322t2() {
        boolean z;
        EventBookingCart o2 = mo51315o2();
        o2.f39346e.f39357b = m45835s2(this.f47954o, this.f47955p);
        o2.f39347f.f39357b = m45835s2(this.f47956q, this.f47957r);
        View view = this.f47958s;
        if (o2.f39346e.f39357b > 0 || o2.f39347f.f39357b > 0) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
    }
}
