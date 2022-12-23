package com.veriff.sdk.internal;

import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24469n;
import p102h0.C5021e;

/* renamed from: com.veriff.sdk.internal.rl */
public class C22389rl extends RecyclerView.Adapter<C22390a> {

    /* renamed from: a */
    private final C22391b f56520a;

    /* renamed from: b */
    private final C24454g f56521b;

    /* renamed from: c */
    private final C22700xq f56522c;

    /* renamed from: d */
    private final C21789ix f56523d;

    /* renamed from: e */
    private final C21616ex f56524e;

    /* renamed from: f */
    private final List<C24454g> f56525f;

    /* renamed from: com.veriff.sdk.internal.rl$a */
    public static class C22390a extends RecyclerView.C1119a0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final TextView f56526a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ImageView f56527b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final View f56528c;

        public C22390a(View view) {
            super(view);
            this.f56526a = (TextView) view.findViewById(R$id.lang_label);
            this.f56527b = (ImageView) view.findViewById(R$id.lang_check);
            this.f56528c = view.findViewById(R$id.lang_item);
        }
    }

    /* renamed from: com.veriff.sdk.internal.rl$b */
    public interface C22391b {
    }

    public C22389rl(List<C24454g> list, C24454g gVar, C22391b bVar, C21789ix ixVar, C21616ex exVar, C22700xq xqVar) {
        this.f56525f = list;
        this.f56520a = bVar;
        this.f56521b = gVar;
        this.f56522c = xqVar;
        this.f56523d = ixVar;
        this.f56524e = exVar;
    }

    /* renamed from: a */
    public C22390a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C24469n.C24470a aVar = C24469n.f61931a;
        aVar.mo60714a(this.f56522c.mo57135v(), this.f56524e, this.f56523d);
        try {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.vrff_language_item, viewGroup, false);
            inflate.setBackgroundColor(this.f56522c.mo57135v().mo57096k());
            aVar.mo60718d();
            return new C22390a(inflate);
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    public int getItemCount() {
        return this.f56525f.size();
    }

    /* renamed from: a */
    public void onBindViewHolder(C22390a aVar, int i) {
        SpannableString spannableString = new SpannableString(this.f56525f.get(i).mo60681e());
        spannableString.setSpan(new LocaleSpan(this.f56525f.get(i).mo60675a()), 0, spannableString.length(), 18);
        aVar.f56526a.setText(spannableString);
        if (this.f56525f.get(i).equals(this.f56521b)) {
            m54629a(aVar);
        } else {
            aVar.f56526a.setTextColor(this.f56522c.mo57135v().mo57099n());
            aVar.f56527b.setBackground(this.f56522c.mo57129p());
            aVar.f56527b.setImageResource(0);
        }
        aVar.f56528c.setOnClickListener(new C21548d(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54630a(C22390a aVar, View view) {
        ((C5021e) this.f56520a).mo20739d(this.f56525f.get(aVar.getAdapterPosition()));
    }

    /* renamed from: a */
    private void m54629a(C22390a aVar) {
        aVar.f56526a.setTextColor(this.f56522c.mo57135v().mo57084b());
        aVar.f56527b.setBackground(this.f56522c.mo57130q());
        aVar.f56527b.setImageResource(R$drawable.vrff_ic_circle_white);
    }
}
