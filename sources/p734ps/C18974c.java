package p734ps;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.general.settings.notifications.NotificationSettingsActivity;
import com.moovit.app.general.settings.notifications.UserDeliverySchedule;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import ga0.C12710j;
import ga0.C12711k;
import java.util.Arrays;
import java.util.List;
import m00.C18310d;
import p543hq.C17474b;
import p824tp.C19740r;
import p824tp.C19746x;

/* renamed from: ps.c */
public class C18974c extends C15676b<NotificationSettingsActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f48310h = 0;

    /* renamed from: ps.c$a */
    public class C18975a extends C18310d<UserDeliverySchedule, ListItemView, Void> {

        /* renamed from: i */
        public List<UserDeliverySchedule> f48311i;

        public C18975a(FragmentActivity fragmentActivity, List list) {
            super(fragmentActivity, R.layout.radio_list_item, R.layout.radio_list_item, list);
            this.f48311i = list;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            ListItemView listItemView = (ListItemView) view;
            if (listItemView == null) {
                listItemView = (ListItemView) LayoutInflater.from(this.f46688b).inflate(R.layout.radio_list_item, viewGroup, false);
            }
            listItemView.setText(this.f48311i.get(i).name);
            return listItemView;
        }
    }

    public C18974c() {
        super(NotificationSettingsActivity.class);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C12711k kVar = new C12711k(this.f40792c);
        ListView listView = kVar.f31389c;
        listView.setChoiceMode(1);
        listView.setFooterDividersEnabled(false);
        listView.addFooterView(new View(this.f40792c));
        List asList = Arrays.asList(UserDeliverySchedule.values());
        C18975a aVar = new C18975a(getActivity(), asList);
        kVar.setTitle((int) R.string.delivery_schedule);
        kVar.f31389c.setAdapter(aVar);
        kVar.f31389c.setOnItemClickListener(new C12710j(kVar, new C18972a(this, asList)));
        listView.setItemChecked(asList.indexOf((UserDeliverySchedule) getArguments().getSerializable("deliverScheduleExtra")), true);
        C12711k kVar2 = kVar;
        kVar2.mo39500a(C19740r.negative_button, -2, (CharSequence) null, C19746x.std_negative_button, new C18973b(this, 0));
        ((FrameLayout) kVar.findViewById(C19740r.content)).setMinimumHeight((int) UiUtils.m40246e(this.f40792c, 180.0f));
        return kVar;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "delivery_schedule_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }
}
