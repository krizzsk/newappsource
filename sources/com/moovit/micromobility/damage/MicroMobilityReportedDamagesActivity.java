package com.moovit.micromobility.damage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.micromobility.MoovitMicroMobilityActivity;
import com.moovit.util.time.C7925b;
import com.usebutton.sdk.internal.util.DiskLruCache;
import ja0.C12790a;
import ja0.C12793c;
import ja0.C12797f;
import java.util.List;
import java.util.concurrent.ExecutorService;
import l30.C5566a0;
import l30.C5569c;
import l30.C5577i;
import l30.C5596y;
import l30.C5597z;
import o00.C18665b;
import p054d0.C4273c0;
import p613kq.C18114a;
import p613kq.C18115b;
import p783rw.C19370b;
import p977zz.C20964s0;

public class MicroMobilityReportedDamagesActivity extends MoovitMicroMobilityActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f14863l0 = 0;

    /* renamed from: U */
    public String f14864U;

    /* renamed from: X */
    public String f14865X;

    /* renamed from: Y */
    public boolean f14866Y;

    /* renamed from: Z */
    public RecyclerView f14867Z;

    /* renamed from: com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity$a */
    public static class C4146a extends C12790a<MicroMobilityDamageReport> {
        public C4146a(List<MicroMobilityDamageReport> list) {
            super(list);
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            String str;
            MicroMobilityDamageReport microMobilityDamageReport = (MicroMobilityDamageReport) mo39636j(i);
            long j = microMobilityDamageReport.f14857c;
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            if (j != -1) {
                str = C7925b.m18022j(listItemView.getContext(), j);
            } else {
                str = null;
            }
            listItemView.setTitle((CharSequence) str);
            listItemView.setSubtitle((CharSequence) microMobilityDamageReport.f14856b);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C5566a0.micro_mobility_reported_damage_list_item, viewGroup, false));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        Intent intent = getIntent();
        this.f14864U = intent.getStringExtra("serviceId");
        this.f14865X = intent.getStringExtra("itemId");
        this.f14866Y = intent.getBooleanExtra("isReportEnabled", false);
        Uri data = intent.getData();
        if (data != null && (this.f14864U == null || this.f14865X == null)) {
            this.f14864U = data.getQueryParameter("service_id");
            this.f14865X = data.getQueryParameter("item_id");
            this.f14866Y = DiskLruCache.VERSION_1.equals(data.getQueryParameter("is_report_enabled"));
        }
        if (C20964s0.m49090h(this.f14864U) || C20964s0.m49090h(this.f14865X)) {
            finish();
        }
        setContentView(C5566a0.micro_mobility_reported_damages_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(C5597z.recycler_view);
        this.f14867Z = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f14867Z.mo4593g(new C18665b(this, C5596y.divider_horizontal), -1);
        this.f14867Z.setAdapter(new C12793c());
        ImageView imageView = (ImageView) findViewById(C5597z.divider);
        Button button = (Button) findViewById(C5597z.action_button);
        int i = 8;
        button.setOnClickListener(new C19370b(this, 8));
        if (this.f14866Y) {
            i = 0;
        }
        UiUtils.m40238F(i, imageView, button);
        C5577i a = C5577i.m13786a();
        String str = this.f14864U;
        String str2 = this.f14865X;
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C5569c(a, 0)).onSuccessTask(executorService, new C4273c0(6, str, str2)).addOnSuccessListener(new C18114a(this, 9)).addOnFailureListener(new C18115b(this, 4));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            finish();
        }
    }
}
