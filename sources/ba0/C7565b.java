package ba0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ce0.C21100e;
import com.moovit.design.view.list.ListItemView;
import java.util.List;
import java.util.Locale;
import p824tp.C19742t;
import p977zz.C20964s0;

/* renamed from: ba0.b */
public final class C7565b extends BaseAdapter {

    /* renamed from: b */
    public final LayoutInflater f23057b;

    /* renamed from: c */
    public final List<C7564a> f23058c;

    public C7565b(Context context, List<C7564a> list) {
        this.f23057b = LayoutInflater.from(context);
        C21100e.m49373x(list, "callingCodes");
        this.f23058c = list;
    }

    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final int getCount() {
        return this.f23058c.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        ListItemView listItemView;
        C7564a aVar = this.f23058c.get(i);
        if (view == null) {
            listItemView = (ListItemView) this.f23057b.inflate(C19742t.spinner_list_item_dropdown, viewGroup, false);
        } else {
            listItemView = (ListItemView) view;
        }
        Object[] objArr = {aVar.f23055d, aVar.f23054c};
        String str = C20964s0.f52718a;
        listItemView.setTitle((CharSequence) String.format((Locale) null, "%1$s (%2$s)", objArr));
        listItemView.setAccessoryText((CharSequence) aVar.f23053b);
        return listItemView;
    }

    public final Object getItem(int i) {
        return this.f23058c.get(i);
    }

    public final long getItemId(int i) {
        return (long) this.f23058c.get(i).f23052a;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        C7564a aVar = this.f23058c.get(i);
        if (view == null) {
            textView = (TextView) this.f23057b.inflate(C19742t.spinner_text_item, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        Object[] objArr = {aVar.f23054c, aVar.f23053b};
        String str = C20964s0.f52718a;
        textView.setText(String.format((Locale) null, "%1$s %2$s", objArr));
        return textView;
    }
}
