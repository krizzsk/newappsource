package p923xs;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.app.help.helpcenter.model.HelpCenterSimpleSection;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.List;
import p259t5.C6593c;

/* renamed from: xs.j */
public final class C20579j extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C6593c f52059g = new C6593c(this, 11);

    /* renamed from: h */
    public final List<HelpCenterSimpleSection> f52060h;

    /* renamed from: i */
    public final C20580a f52061i;

    /* renamed from: xs.j$a */
    public interface C20580a {
    }

    public C20579j(List list, C20582l lVar) {
        C21100e.m49373x(list, "sections");
        this.f52060h = list;
        this.f52061i = lVar;
    }

    public final int getItemCount() {
        return this.f52060h.size() + 1;
    }

    public final int getItemViewType(int i) {
        return i == 0 ? R.layout.help_center_list_item_header : R.layout.help_center_list_item;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        if (fVar.getItemViewType() != R.layout.help_center_list_item_header) {
            TextView textView = (TextView) fVar.itemView;
            textView.setOnClickListener(this.f52059g);
            textView.setText(this.f52060h.get(i - 1).f38125c);
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, i, viewGroup, false));
        fVar.itemView.setTag(fVar);
        return fVar;
    }
}
