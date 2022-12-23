package com.moovit.app.general.userprofile.avatars;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.view.list.C15819a;
import com.moovit.commons.view.list.SectionedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p527gy.C17261e;
import p543hq.C17474b;
import p827ts.C19754a;
import p977zz.C20964s0;

public class AvatarsActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f38098X = 0;

    /* renamed from: U */
    public boolean f38099U;

    /* renamed from: com.moovit.app.general.userprofile.avatars.AvatarsActivity$a */
    public class C14903a extends SectionedListView.C15818a {
        public C14903a() {
        }

        /* renamed from: a */
        public final void mo45032a(C15819a aVar, int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                Avatar avatar = (Avatar) aVar.mo47315x(i).getItem(i2);
                AvatarsActivity avatarsActivity = AvatarsActivity.this;
                avatarsActivity.f38099U = true;
                avatarsActivity.mo45031y2(avatar);
                Intent intent = new Intent();
                intent.putExtra("result_avatar", avatar);
                avatarsActivity.setResult(-1, intent);
                avatarsActivity.finish();
            }
        }
    }

    /* renamed from: com.moovit.app.general.userprofile.avatars.AvatarsActivity$b */
    public class C14904b extends C15819a<Avatar, Void, C15819a.C15821b<Avatar>, Void> {
        public C14904b(AvatarsActivity avatarsActivity) {
            super(avatarsActivity, false, 0);
        }

        /* renamed from: C */
        public final int mo45033C(int i) {
            if (C20964s0.m49090h(mo47315x(i).getName())) {
                return 4;
            }
            return 1;
        }

        /* renamed from: D */
        public final void mo45034D(View view, C15819a.C15821b bVar, int i, Object obj, int i2, ViewGroup viewGroup) {
            Avatar avatar = (Avatar) obj;
            ListItemView listItemView = (ListItemView) view;
            listItemView.setIcon(avatar.f38097d);
            listItemView.setText((CharSequence) avatar.f38096c);
        }

        /* renamed from: F */
        public final void mo45035F(View view, C15819a.C15821b bVar, int i) {
            if (mo45033C(i) != 4) {
                ((ListItemView) view).setTitle(bVar.getName());
            }
        }

        /* renamed from: i */
        public final View mo45036i(int i, int i2, int i3, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            ListItemView listItemView = new ListItemView(layoutInflater.getContext(), (AttributeSet) null, R.attr.listItemMenuStyle);
            listItemView.setCheckable(true);
            listItemView.setAccessoryView((int) R.layout.list_item_accessory_radio_button);
            listItemView.setDuplicateCheckedState(true);
            return listItemView;
        }

        /* renamed from: n */
        public final View mo45037n(int i, int i2, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            if (mo45033C(i2) == 4) {
                return new View(this.f46688b);
            }
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            listItemView.setCheckable(true);
            return listItemView;
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        if (!this.f38099U) {
            mo45031y2((Avatar) null);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.avatars_activity);
        SectionedListView sectionedListView = (SectionedListView) findViewById(R.id.list_view);
        sectionedListView.setOnItemClickListener(new C14903a());
        C19754a aVar = (C19754a) mo44537r1("AVATARS");
        ArrayList arrayList = new ArrayList(2);
        if (aVar.f50235c && !C13717b.m34258e(aVar.f50234b)) {
            arrayList.add(new C15819a.C15820a(getString(R.string.avatars_editor_title), aVar.f50234b));
        }
        arrayList.add(new C15819a.C15820a(getString(R.string.avatars_title), aVar.f50233a));
        C14904b bVar = new C14904b(this);
        bVar.mo47288G(arrayList);
        sectionedListView.setSectionedAdapter(bVar);
        int[] iArr = new int[2];
        ServerId serverId = ((C17261e) getSystemService("user_profile_manager_service")).mo49805e().f44611j;
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i2 < arrayList.size()) {
                C15819a.C15821b bVar2 = (C15819a.C15821b) arrayList.get(i2);
                for (int i3 = 0; i3 < bVar2.mo45699e(); i3++) {
                    if (((Avatar) bVar2.getItem(i3)).f38095b.equals(serverId)) {
                        iArr[0] = i2;
                        iArr[1] = i3;
                        break loop0;
                    }
                }
                i2++;
            } else if (arrayList.size() == 1) {
                iArr[0] = 0;
                iArr[1] = 0;
            } else {
                iArr[0] = 1;
                iArr[1] = 0;
            }
        }
        int i4 = iArr[0];
        int i5 = iArr[1];
        C15819a adapter = sectionedListView.getAdapter();
        if (adapter != null) {
            int intValue = adapter.f41257m.get(i4).intValue() + 1 + i5;
            if (adapter.f41253i != null) {
                i = i5;
            }
            sectionedListView.setItemChecked(intValue + i, true);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("USER_ACCOUNT");
        hashSet.add("AVATARS");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45031y2(Avatar avatar) {
        boolean z;
        ServerId serverId = ((C17261e) getSystemService("user_profile_manager_service")).mo49805e().f44611j;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.AVATAR_CHANGED);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.SUCCESS;
        if (avatar == null || serverId.equals(avatar.f38095b)) {
            z = false;
        } else {
            z = true;
        }
        aVar.mo49941i(analyticsAttributeKey, z);
        mo44545v2(aVar.mo49933a());
    }
}
