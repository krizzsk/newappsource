package p923xs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.List;
import o00.C18676l;
import p297w5.C6994a;
import p946ys.C20760a;

/* renamed from: xs.g */
public final class C20573g extends C18676l<C20760a, C20574a, C12797f> {

    /* renamed from: j */
    public final C6994a f52046j = new C6994a(this, 8);

    /* renamed from: k */
    public final C20575b f52047k;

    /* renamed from: xs.g$a */
    public static class C20574a extends C18676l.C18678b<C20760a> {

        /* renamed from: d */
        public final int f52048d;

        public C20574a() {
            throw null;
        }

        public C20574a(int i, String str, List list) {
            super(str, list);
            this.f52048d = i;
        }
    }

    /* renamed from: xs.g$b */
    public interface C20575b {
    }

    public C20573g(C20575b bVar) {
        this.f52047k = bVar;
    }

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        C20574a aVar = (C20574a) mo51052n(i);
        switch (aVar.f52048d) {
            case 10:
            case 11:
                return 20;
            case 12:
                return 21;
            default:
                StringBuilder k = C13555b.m33972k("Unknown section view type: ");
                k.append(aVar.f52048d);
                throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: p */
    public final int mo23815p(int i) {
        return ((C20574a) mo51052n(i)).f52048d;
    }

    /* renamed from: r */
    public final boolean mo40091r(int i) {
        return i == 20 || i == 21;
    }

    /* renamed from: s */
    public final boolean mo23816s(int i) {
        switch (i) {
            case 10:
            case 11:
            case 12:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        C20760a aVar = (C20760a) ((C20574a) mo51052n(i)).get(i2);
        TextView textView = (TextView) ((C12797f) a0Var).itemView;
        textView.setOnClickListener(this.f52046j);
        textView.setTag(aVar);
        textView.setText(aVar.f52378b);
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        if (fVar.getItemViewType() == 11) {
            ((TextView) fVar.itemView).setText(((C20574a) mo51052n(i)).f47556c);
        }
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        View view;
        if (i == 20) {
            view = C13715c.m34239e(viewGroup, R.layout.help_center_list_item, viewGroup, false);
        } else if (i == 21) {
            view = C13715c.m34239e(viewGroup, R.layout.help_center_troubleshooting_articles_list_item, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown item view type: ", i));
        }
        return new C12797f(view);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        View view;
        switch (i) {
            case 10:
                view = new Space(viewGroup.getContext());
                break;
            case 11:
                view = C13715c.m34239e(viewGroup, R.layout.help_center_articles_regular_section_list_item, viewGroup, false);
                break;
            case 12:
                view = C13715c.m34239e(viewGroup, R.layout.help_center_articles_troubleshoot_section_list_item, viewGroup, false);
                break;
            default:
                throw new IllegalStateException(C16759e.m42349e("Unknown section view type: ", i));
        }
        return new C12797f(view);
    }
}
