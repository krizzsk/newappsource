package com.veriff.sdk.internal;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.util.C24453f;
import p090g1.C4732a;
import p304x.C7070l;

/* renamed from: com.veriff.sdk.internal.pp */
public class C22271pp extends RecyclerView.Adapter<C22272a> {

    /* renamed from: a */
    private final List<C24424c> f56168a;

    /* renamed from: b */
    private final List<C24424c> f56169b;

    /* renamed from: c */
    private final String f56170c;

    /* renamed from: d */
    private final C22273b f56171d;

    /* renamed from: e */
    private Drawable f56172e;

    /* renamed from: f */
    private final C22700xq f56173f;

    /* renamed from: com.veriff.sdk.internal.pp$a */
    public static class C22272a extends RecyclerView.C1119a0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final TextView f56174a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final View f56175b;

        public C22272a(View view, C22700xq xqVar) {
            super(view);
            TextView textView = (TextView) view.findViewById(R$id.country_label);
            this.f56174a = textView;
            textView.setTextColor(xqVar.mo57135v().mo57098m());
            this.f56175b = view.findViewById(R$id.country_item);
        }
    }

    /* renamed from: com.veriff.sdk.internal.pp$b */
    public interface C22273b {
    }

    public C22271pp(List<C24424c> list, String str, C22273b bVar, C22700xq xqVar) {
        ArrayList arrayList = new ArrayList();
        this.f56169b = arrayList;
        this.f56168a = list;
        arrayList.addAll(list);
        Collections.sort(arrayList);
        this.f56170c = str;
        this.f56171d = bVar;
        this.f56173f = xqVar;
    }

    /* renamed from: a */
    public C22272a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.vrff_country_item, viewGroup, false);
        this.f56172e = C4732a.getDrawable(viewGroup.getContext(), R$drawable.vrff_doc_item_selected);
        return new C22272a(inflate, this.f56173f);
    }

    public int getItemCount() {
        List<C24424c> list = this.f56169b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public void onBindViewHolder(C22272a aVar, int i) {
        aVar.f56174a.setText(this.f56169b.get(i).mo60583b());
        if (this.f56170c.equalsIgnoreCase(this.f56169b.get(i).mo60581a())) {
            m54260a(aVar);
        } else {
            aVar.f56174a.setTextColor(this.f56173f.mo57135v().mo57099n());
        }
        aVar.f56175b.setOnClickListener(new C21498c(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54261a(C22272a aVar, View view) {
        ((C7070l) this.f56171d).mo23311e(this.f56169b.get(aVar.getAdapterPosition()));
    }

    /* renamed from: a */
    private void m54260a(C22272a aVar) {
        aVar.f56174a.setTextColor(this.f56173f.mo57135v().mo57098m());
        aVar.f56175b.setBackground(this.f56172e);
    }

    /* renamed from: a */
    public void mo56257a(String str) {
        this.f56169b.clear();
        if (C24453f.m61507a(str)) {
            this.f56169b.addAll(this.f56168a);
        } else {
            for (C24424c next : this.f56168a) {
                if (next.mo60583b().toLowerCase().startsWith(str.toLowerCase())) {
                    this.f56169b.add(next);
                }
            }
        }
        Collections.sort(this.f56169b);
        notifyDataSetChanged();
    }
}
