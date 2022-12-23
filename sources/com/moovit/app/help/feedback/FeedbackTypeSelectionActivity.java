package com.moovit.app.help.feedback;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import c00.C13723g;
import com.moovit.app.MoovitAppActivity;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k00.C17988b;
import m00.C18306a;
import p899ws.C20406f;
import p899ws.C20407g;
import p899ws.C20408h;
import p899ws.C20409i;
import p977zz.C20975x0;

public class FeedbackTypeSelectionActivity extends MoovitAppActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f38116l0 = 0;

    /* renamed from: U */
    public ArrayList f38117U;

    /* renamed from: X */
    public CategoryType f38118X = null;

    /* renamed from: Y */
    public FeedbackType f38119Y = null;

    /* renamed from: Z */
    public ExpandableListView f38120Z;

    /* renamed from: com.moovit.app.help.feedback.FeedbackTypeSelectionActivity$a */
    public class C14908a extends C18306a<CategoryType, FeedbackType> {

        /* renamed from: c */
        public final Drawable f38121c;

        public C14908a(Context context, List<CategoryType> list) {
            super(list);
            this.f38121c = C17988b.m44611b(R.drawable.ic_check_mark_24_primary, context);
        }

        /* renamed from: a */
        public final int mo45057a(Object obj) {
            int size = ((CategoryType) obj).getFeedbackTypes().size();
            if (size == 1) {
                return 0;
            }
            return size;
        }

        /* renamed from: b */
        public final Object mo45058b(int i, Object obj) {
            return ((CategoryType) obj).getFeedbackTypes().get(i);
        }

        /* renamed from: c */
        public final View mo45059c(Object obj, View view, ViewGroup viewGroup) {
            FeedbackType feedbackType = (FeedbackType) obj;
            if (view == null) {
                view = C13715c.m34239e(viewGroup, R.layout.feedback_types_list_type_item, viewGroup, false);
            }
            ListItemView listItemView = (ListItemView) view;
            boolean e = C20975x0.m49118e(FeedbackTypeSelectionActivity.this.f38119Y, feedbackType);
            listItemView.setTitle(feedbackType.getNameResId());
            listItemView.setChecked(e);
            View accessoryView = listItemView.getAccessoryView();
            Drawable drawable = null;
            if (accessoryView instanceof ImageView) {
                ImageView imageView = (ImageView) accessoryView;
                if (e) {
                    drawable = this.f38121c;
                }
                imageView.setImageDrawable(drawable);
            } else {
                if (e) {
                    drawable = this.f38121c;
                }
                listItemView.setAccessoryDrawable(drawable);
            }
            return listItemView;
        }

        /* renamed from: d */
        public final View mo45060d(Object obj, boolean z, View view, ViewGroup viewGroup) {
            int i;
            CategoryType categoryType = (CategoryType) obj;
            if (view == null) {
                view = C13715c.m34239e(viewGroup, R.layout.feedback_types_list_category_item, viewGroup, false);
            }
            ListItemView listItemView = (ListItemView) view;
            listItemView.setTitle(categoryType.getNameResId());
            if (categoryType.getFeedbackTypes().size() == 1) {
                listItemView.setAccessoryDrawable((Drawable) null);
            } else {
                if (z) {
                    i = R.drawable.ic_arrow_up_12_on_surface_emphasis_low;
                } else {
                    i = R.drawable.ic_arrow_down_12_on_surface_emphasis_low;
                }
                listItemView.setAccessoryDrawable(i);
            }
            return listItemView;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.feedback_type_selection_activity);
        this.f38117U = C13723g.m34282c(Arrays.asList(CategoryType.values()), new C20406f(0));
        this.f38120Z = (ExpandableListView) findViewById(R.id.categories_list);
        this.f38120Z.setAdapter(new C14908a(this.f38120Z.getContext(), this.f38117U));
        this.f38120Z.setOnGroupExpandListener(new C20409i(this));
        this.f38120Z.setOnGroupClickListener(new C20407g(this));
        this.f38120Z.setOnChildClickListener(new C20408h(this));
        this.f38118X = (CategoryType) getIntent().getParcelableExtra("category_type");
        this.f38119Y = (FeedbackType) getIntent().getParcelableExtra("feedback_type");
        CategoryType categoryType = this.f38118X;
        if (categoryType != null) {
            this.f38120Z.expandGroup(this.f38117U.indexOf(categoryType));
        }
        mo45056y2();
    }

    /* renamed from: y2 */
    public final void mo45056y2() {
        CategoryType categoryType = this.f38118X;
        if (categoryType != null && this.f38119Y != null) {
            int indexOf = this.f38117U.indexOf(categoryType);
            if (this.f38120Z.isGroupExpanded(indexOf)) {
                this.f38120Z.setItemChecked(this.f38120Z.getFlatListPosition(ExpandableListView.getPackedPositionForChild(indexOf, this.f38119Y.ordinal())), true);
            }
        }
    }
}
