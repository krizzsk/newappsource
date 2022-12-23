package p547hu;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.commons.utils.UiUtils;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.MinutesSpanFormatter;
import com.moovit.util.time.TimeFrequency;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p977zz.C20950l0;

/* renamed from: hu.a */
public final class C17492a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final List<TimeFrequency> f45028g;

    /* renamed from: h */
    public final MinutesSpanFormatter f45029h = C7925b.f23935b;

    public C17492a(List<TimeFrequency> list) {
        C21100e.m49373x(list, "frequencies");
        this.f45028g = list;
    }

    public final int getItemCount() {
        return this.f45028g.size();
    }

    public final int getItemViewType(int i) {
        return R.layout.line_schedule_frequency_window_entry;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        String str;
        C12797f fVar = (C12797f) a0Var;
        TimeFrequency timeFrequency = this.f45028g.get(i);
        C20950l0<Long> l0Var = timeFrequency.f23915b;
        TextView textView = (TextView) fVar.mo39639f(R.id.frequency_window);
        Context e = fVar.mo39638e();
        long longValue = ((Long) l0Var.f52695a).longValue();
        long longValue2 = ((Long) l0Var.f52696b).longValue();
        if (C7925b.m18027o(longValue, longValue2)) {
            str = C7925b.m18018f(e, longValue, false) + " " + 8211 + " " + C7925b.m18024l(e, longValue2);
        } else {
            str = C7925b.m18018f(e, longValue, false) + " " + 8211 + " " + C7925b.m18018f(e, longValue2, false);
        }
        textView.setText(str);
        C20950l0<Integer> l0Var2 = timeFrequency.f23916c;
        MinutesSpanFormatter minutesSpanFormatter = this.f45029h;
        Context e2 = fVar.mo39638e();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Collections.emptyList();
        ((TextView) fVar.mo39639f(R.id.frequency_interval)).setText(fVar.mo39638e().getString(R.string.line_schedule_every_min_range, new Object[]{minutesSpanFormatter.mo24604d(e2, l0Var2, timeUnit)}));
        if (i == 0) {
            UiUtils.m40266y(textView, UiUtils.Edge.TOP, (int) UiUtils.m40246e(fVar.mo39638e(), 16.0f));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, i, viewGroup, false));
    }
}
