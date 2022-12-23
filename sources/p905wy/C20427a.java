package p905wy;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.tickets.model.WondoReward;
import com.moovit.app.wondo.tickets.model.WondoRewardDisplayInfo;
import com.moovit.app.wondo.tickets.model.WondoRewardStatus;
import com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity;
import com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.List;
import p543hq.C17474b;
import p583jk.C17884p;

/* renamed from: wy.a */
public final class C20427a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C20428a f51747g = new C20428a();

    /* renamed from: h */
    public final WondoRewardsActivity f51748h;

    /* renamed from: i */
    public final List<WondoReward> f51749i;

    /* renamed from: wy.a$a */
    public class C20428a implements View.OnClickListener {
        public C20428a() {
        }

        public final void onClick(View view) {
            WondoReward wondoReward = (WondoReward) view.getTag(R.id.view_tag_param2);
            int itemViewType = ((C12797f) view.getTag(R.id.view_tag_param1)).getItemViewType();
            if (itemViewType == 1) {
                WondoRewardsActivity wondoRewardsActivity = C20427a.this.f51748h;
                wondoRewardsActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_reward_item_clicked");
                wondoRewardsActivity.mo44545v2(aVar.mo49933a());
                Intent intent = new Intent(wondoRewardsActivity, WondoRewardDetailsActivity.class);
                C21100e.m49373x(wondoReward, "reward");
                intent.putExtra("reward", wondoReward);
                wondoRewardsActivity.startActivity(intent);
            } else if (itemViewType == 2) {
                C20427a.this.f51748h.mo46739y2("wondo_rewards_purchase_item_clicked");
            }
        }
    }

    public C20427a(WondoRewardsActivity wondoRewardsActivity, List<WondoReward> list) {
        this.f51748h = wondoRewardsActivity;
        C21100e.m49373x(list, "rewards");
        this.f51749i = list;
    }

    public final int getItemCount() {
        return this.f51749i.size() + 1;
    }

    public final int getItemViewType(int i) {
        return i == this.f51749i.size() ? 2 : 1;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        String str;
        C12797f fVar = (C12797f) a0Var;
        boolean z = true;
        if (fVar.getItemViewType() == 1) {
            WondoReward wondoReward = this.f51749i.get(i);
            WondoRewardDisplayInfo wondoRewardDisplayInfo = wondoReward.f40737d;
            View view = fVar.itemView;
            view.setTag(R.id.view_tag_param2, wondoReward);
            WondoRewardStatus wondoRewardStatus = wondoReward.f40736c;
            WondoRewardStatus wondoRewardStatus2 = WondoRewardStatus.AVAILABLE;
            int i2 = 0;
            if (wondoRewardStatus != wondoRewardStatus2) {
                z = false;
            }
            view.setClickable(z);
            ImageView imageView = (ImageView) fVar.mo39639f(R.id.reward_icon);
            C17884p.m44354Y(imageView).mo51642v(wondoRewardDisplayInfo.f40739b).mo51628o0(wondoRewardDisplayInfo.f40739b).mo10850T(imageView);
            ((TextView) fVar.mo39639f(R.id.reward_title)).setText(wondoRewardDisplayInfo.f40740c);
            UiUtils.m40234B((TextView) fVar.mo39639f(R.id.reward_subtitle), wondoRewardDisplayInfo.f40741d);
            TextView textView = (TextView) fVar.mo39639f(R.id.reward_expiration);
            if (wondoReward.f40736c == WondoRewardStatus.REDEEMED) {
                str = wondoRewardDisplayInfo.f40743f;
            } else {
                str = null;
            }
            UiUtils.m40234B(textView, str);
            TextView textView2 = (TextView) fVar.mo39639f(R.id.reward_action);
            if (wondoReward.f40736c != wondoRewardStatus2) {
                i2 = 8;
            }
            textView2.setVisibility(i2);
        }
        fVar.itemView.setOnClickListener(this.f51747g);
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 1) {
            i2 = R.layout.wondo_reward_item_view;
        } else {
            i2 = R.layout.wondo_reward_footer_item_view;
        }
        View e = C13715c.m34239e(viewGroup, i2, viewGroup, false);
        C12797f fVar = new C12797f(e);
        e.setTag(R.id.view_tag_param1, fVar);
        return fVar;
    }
}
