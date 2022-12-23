package p847uo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DateFormat;
import java.util.ArrayList;
import p583jk.C17880m;
import p605ki.C18061o;
import p605ki.C18063q;
import p611ko.C18111c;
import p635lo.C18248a;
import p682no.C18578a;
import p847uo.C19970c;

/* renamed from: uo.b */
public final class C19967b extends RecyclerView.Adapter<C19969b> {

    /* renamed from: g */
    public final C18578a f50763g;

    /* renamed from: h */
    public final C18111c f50764h;

    /* renamed from: i */
    public final DateFormat f50765i = DateFormat.getDateInstance(2);

    /* renamed from: j */
    public final DateFormat f50766j = DateFormat.getTimeInstance(2);

    /* renamed from: k */
    public final C17880m f50767k;

    /* renamed from: l */
    public final ArrayList f50768l;

    /* renamed from: uo.b$a */
    public static class C19968a {

        /* renamed from: a */
        public final C18578a f50769a;

        /* renamed from: b */
        public final C18111c f50770b;

        /* renamed from: c */
        public final C17880m f50771c;

        public C19968a(C17880m mVar, C18111c cVar, C18578a aVar) {
            this.f50769a = aVar;
            this.f50770b = cVar;
            this.f50771c = mVar;
        }
    }

    /* renamed from: uo.b$b */
    public static class C19969b extends RecyclerView.C1119a0 {

        /* renamed from: d */
        public TextView f50772d;

        /* renamed from: e */
        public TextView f50773e;

        /* renamed from: f */
        public TextView f50774f;

        public C19969b(View view) {
            super(view);
            this.f50772d = (TextView) view.findViewById(C18061o.ticket_info_item_header);
            this.f50773e = (TextView) view.findViewById(C18061o.ticket_info_item_value);
            this.f50774f = (TextView) view.findViewById(C18061o.ticket_info_item_sub_value);
        }
    }

    public C19967b(C17880m mVar, C18578a aVar, C18111c cVar) {
        this.f50763g = aVar;
        this.f50764h = cVar;
        this.f50767k = mVar;
        this.f50768l = new ArrayList();
    }

    public final int getItemCount() {
        return this.f50768l.size();
    }

    /* renamed from: j */
    public final C19970c mo52266j(Long l, String str) {
        String str2;
        DateFormat dateFormat = this.f50765i;
        String str3 = "";
        if (l != null) {
            str2 = dateFormat.format(l);
        } else {
            str2 = str3;
        }
        DateFormat dateFormat2 = this.f50766j;
        if (l != null) {
            str3 = dateFormat2.format(l);
        }
        return mo52267k(str, str2, str3);
    }

    /* renamed from: k */
    public final C19970c mo52267k(String str, String str2, String str3) {
        C19970c.C19971a aVar = new C19970c.C19971a();
        aVar.f50781a = str;
        C18578a aVar2 = this.f50763g;
        aVar.f50782b = aVar2.f47301e;
        aVar.f50783c = str2;
        aVar.f50784d = aVar2.f47303g;
        aVar.f50785e = str3;
        aVar.f50786f = aVar2.f47302f;
        return aVar.mo52268a();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C19969b bVar = (C19969b) a0Var;
        C19970c cVar = (C19970c) this.f50768l.get(i);
        C18111c cVar2 = this.f50764h;
        TextView textView = bVar.f50772d;
        C18248a aVar = cVar.f50776b;
        cVar2.getClass();
        C18111c.m44780a(textView, aVar);
        C18111c cVar3 = this.f50764h;
        TextView textView2 = bVar.f50773e;
        C18248a aVar2 = cVar.f50778d;
        cVar3.getClass();
        C18111c.m44780a(textView2, aVar2);
        C18111c cVar4 = this.f50764h;
        TextView textView3 = bVar.f50774f;
        C18248a aVar3 = cVar.f50780f;
        cVar4.getClass();
        C18111c.m44780a(textView3, aVar3);
        bVar.f50772d.setText(cVar.f50775a);
        bVar.f50773e.setText(cVar.f50777c);
        bVar.f50774f.setText(cVar.f50779e);
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C19969b(LayoutInflater.from(viewGroup.getContext()).inflate(C18063q.list_item_ticket_info, viewGroup, false));
    }
}
