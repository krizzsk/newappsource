package ga0;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import java.util.ArrayList;
import m00.C18310d;
import p543hq.C17474b;
import p644lx.C18284b;
import p783rw.C19370b;
import p824tp.C19731i;
import p824tp.C19740r;
import p824tp.C19742t;

/* renamed from: ga0.m */
public class C12713m extends C15676b<MoovitActivity> {

    /* renamed from: m */
    public static final /* synthetic */ int f31390m = 0;

    /* renamed from: h */
    public ListView f31391h;

    /* renamed from: i */
    public ArrayList<String> f31392i;

    /* renamed from: j */
    public String f31393j;

    /* renamed from: k */
    public String f31394k;

    /* renamed from: l */
    public Button f31395l;

    /* renamed from: ga0.m$a */
    public interface C12714a {
        /* renamed from: a1 */
        void mo39510a1();

        /* renamed from: d */
        void mo39511d(int i, int i2, String str);
    }

    /* renamed from: ga0.m$b */
    public class C12715b extends C18310d<String, Button, Void> {
        public C12715b(FragmentActivity fragmentActivity, ArrayList arrayList) {
            super(fragmentActivity, C19742t.string_picker_item_view);
            this.f46697g.clear();
            this.f46697g.addAll(arrayList);
            notifyDataSetChanged();
        }

        /* renamed from: d */
        public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
            Button button = (Button) view;
            button.setText((String) obj);
            button.setTypeface((Typeface) null, C12713m.this.f31391h.isItemChecked(i) ? 1 : 0);
        }
    }

    public C12713m() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C19731i.m47197a(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final void mo39508S1() {
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C12714a) {
            ((C12714a) targetFragment).mo39510a1();
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C12714a) {
            ((C12714a) activity).mo39510a1();
        }
    }

    public final boolean onBackPressed() {
        mo39508S1();
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.string_picker_fragment, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        mo39508S1();
        super.onDismiss(dialogInterface);
    }

    public final void onPause() {
        super.onPause();
        mo22564R1(new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP).mo49933a());
        FragmentActivity activity = getActivity();
        C19731i.m47197a(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        Context requireContext = requireContext();
        C19731i.m47197a(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_string_picker");
        mo22564R1(aVar.mo49933a());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null && !getFragmentManager().mo3930H().contains(targetFragment)) {
            setTargetFragment((Fragment) null, getTargetRequestCode());
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f31391h = (ListView) view.findViewById(C19740r.list);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f31392i = arguments.getStringArrayList("com.moovit.view.dialogs.StringPickerDialogFragment_strings_extra");
            this.f31394k = arguments.getString("com.moovit.view.dialogs.StringPickerDialogFragment_pick_action_title_extra");
            this.f31393j = arguments.getString("com.moovit.view.dialogs.StringPickerDialogFragment_header_title_extra");
        }
        this.f31395l = (Button) view.findViewById(C19740r.pick);
        TextView textView = (TextView) view.findViewById(C19740r.header);
        String str = this.f31393j;
        this.f31393j = str;
        if (textView != null) {
            textView.setText(str);
        }
        String str2 = this.f31394k;
        this.f31394k = str2;
        Button button = this.f31395l;
        if (button != null) {
            button.setText(str2);
        }
        ArrayList<String> arrayList = this.f31392i;
        this.f31392i = arrayList;
        ListView listView = this.f31391h;
        if (listView != null) {
            listView.setAdapter(new C12715b(getActivity(), arrayList));
            this.f31391h.setItemChecked(0, true);
        }
        this.f31391h.setOnItemClickListener(new C12712l());
        view.findViewById(C19740r.cancel).setOnClickListener(new C19370b(this, 20));
        this.f31395l.setOnClickListener(new C18284b(this, 20));
    }
}
