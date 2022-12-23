package p547hu;

import a00.C13382a;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.List;
import p977zz.C20964s0;

/* renamed from: hu.c */
public final class C17494c extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final Time f45035g;

    /* renamed from: h */
    public final List<C17493b> f45036h;

    public C17494c(Time time, List<C17493b> list) {
        this.f45035g = time;
        C21100e.m49373x(list, "times");
        this.f45036h = list;
    }

    /* renamed from: j */
    public static void m43610j(TextView textView, Time time, int i) {
        if (time == null) {
            textView.setVisibility(4);
            return;
        }
        textView.setText(C7925b.m18024l(textView.getContext(), time.mo24631g()));
        textView.setVisibility(0);
        if (i < 0) {
            C20964s0.m49107y(textView, R.attr.textAppearanceBody, R.attr.colorOnSurfaceEmphasisMedium);
        } else if (i == 0) {
            C20964s0.m49107y(textView, R.attr.textAppearanceBodyStrong, R.attr.colorOnSurface);
        } else {
            C20964s0.m49107y(textView, R.attr.textAppearanceBody, R.attr.colorOnSurface);
        }
    }

    public final int getItemCount() {
        return this.f45036h.size();
    }

    public final int getItemViewType(int i) {
        if (this.f45036h.get(i).f45034f == null) {
            return R.layout.line_schedule_single_time_entry;
        }
        return R.layout.line_schedule_multiple_times_entry;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        C17493b bVar = this.f45036h.get(i);
        if (bVar.f45034f == null) {
            int b = bVar.f45033e.compareTo(this.f45035g);
            TextView textView = (TextView) fVar.mo39639f(R.id.time);
            m43610j(textView, bVar.f45033e, b);
            TextView textView2 = (TextView) fVar.mo39639f(R.id.destination);
            String str = bVar.f45030b.f23689e;
            if (C20964s0.m49090h(str)) {
                textView2.setVisibility(4);
            } else {
                textView2.setText(str);
                textView2.setVisibility(0);
                if (b < 0) {
                    C20964s0.m49107y(textView2, R.attr.textAppearanceCaption, R.attr.colorOnSurfaceEmphasisLow);
                } else if (b == 0) {
                    C20964s0.m49107y(textView2, R.attr.textAppearanceCaptionStrong, R.attr.colorOnSurfaceEmphasisMedium);
                } else {
                    C20964s0.m49107y(textView2, R.attr.textAppearanceCaption, R.attr.colorOnSurfaceEmphasisMedium);
                }
            }
            C13382a.m33674j(fVar.itemView, textView.getText(), textView2.getText());
            return;
        }
        int b2 = bVar.f45033e.compareTo(this.f45035g);
        m43610j((TextView) fVar.mo39639f(R.id.departure_time), bVar.f45033e, b2);
        m43610j((TextView) fVar.mo39639f(R.id.arrival_time), bVar.f45034f, b2);
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, i, viewGroup, false));
    }
}
