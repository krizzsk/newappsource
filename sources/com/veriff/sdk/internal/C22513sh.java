package com.veriff.sdk.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.veriff.sdk.internal.widgets.ProgressItem;
import com.veriff.sdk.views.upload.C23032e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/ui/UploadDecisionRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/veriff/sdk/views/upload/ui/UploadDecisionRecyclerAdapter$UploadDecisionViewHolder;", "", "getItemCount", "holder", "position", "Lbf0/d;", "onBindViewHolder", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "branding", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "", "Lcom/veriff/sdk/views/upload/UploadDecision;", "decisionItems", "Ljava/util/List;", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/Strings;", "<init>", "(Lmobi/lab/veriff/util/resourcesHelper/Branding;Lcom/veriff/sdk/Strings;Ljava/util/List;)V", "UploadDecisionViewHolder", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sh */
public final class C22513sh extends RecyclerView.Adapter<C22514a> {

    /* renamed from: a */
    private final C22696xo f56812a;

    /* renamed from: b */
    private final C21616ex f56813b;

    /* renamed from: c */
    private final List<C23032e> f56814c;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/ui/UploadDecisionRecyclerAdapter$UploadDecisionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lcom/veriff/sdk/views/upload/UploadDecision;", "item", "Lbf0/d;", "bind", "Lcom/veriff/sdk/internal/widgets/ProgressItem;", "view", "Lcom/veriff/sdk/internal/widgets/ProgressItem;", "<init>", "(Lcom/veriff/sdk/internal/widgets/ProgressItem;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sh$a */
    public static final class C22514a extends RecyclerView.C1119a0 {

        /* renamed from: a */
        private final ProgressItem f56815a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22514a(ProgressItem progressItem) {
            super(progressItem);
            C24362h.m61211f(progressItem, Promotion.ACTION_VIEW);
            this.f56815a = progressItem;
        }

        /* renamed from: a */
        public final void mo56643a(C23032e eVar) {
            C24362h.m61211f(eVar, "item");
            this.f56815a.setText(eVar.mo57974a());
            this.f56815a.setProgress(C22515si.m54846b(eVar.mo57975b()));
        }
    }

    public C22513sh(C22696xo xoVar, C21616ex exVar, List<C23032e> list) {
        C24362h.m61211f(xoVar, "branding");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(list, "decisionItems");
        this.f56812a = xoVar;
        this.f56813b = exVar;
        this.f56814c = list;
    }

    /* renamed from: a */
    public C22514a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C24362h.m61211f(viewGroup, "parent");
        C24469n.C24470a aVar = C24469n.f61931a;
        C24469n nVar = new C24469n(this.f56812a, this.f56813b, (C21789ix) null);
        C24469n.C24470a aVar2 = C24469n.f61931a;
        aVar2.mo60715a(nVar);
        try {
            Context context = viewGroup.getContext();
            C24362h.m61210e(context, "parent.context");
            C22514a aVar3 = new C22514a(new ProgressItem(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
            aVar2.mo60718d();
            return aVar3;
        } catch (Throwable th) {
            C24469n.f61931a.mo60718d();
            throw th;
        }
    }

    public int getItemCount() {
        return this.f56814c.size();
    }

    /* renamed from: a */
    public void onBindViewHolder(C22514a aVar, int i) {
        C24362h.m61211f(aVar, "holder");
        aVar.mo56643a(this.f56814c.get(i));
    }
}
