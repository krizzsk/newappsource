package m00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p622kz.C18162d;

/* renamed from: m00.b */
public abstract class C18307b<T, VT extends View, VH> extends BaseAdapter {

    /* renamed from: b */
    public final Context f46688b;

    /* renamed from: c */
    public final LayoutInflater f46689c;

    /* renamed from: d */
    public final int f46690d;

    /* renamed from: e */
    public final int f46691e;

    /* renamed from: f */
    public final boolean f46692f = false;

    public C18307b(Context context, int i, int i2) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f46688b = context;
        this.f46689c = LayoutInflater.from(context);
        this.f46690d = i;
        this.f46691e = i2;
    }

    /* renamed from: a */
    public VT mo47289a(int i, int i2, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    /* renamed from: b */
    public void mo47291b(int i, View view) {
        if (this.f46692f) {
            int i2 = C18162d.view_holder;
            Object tag = view.getTag(i2);
            if (tag == null) {
                tag = null;
            }
            view.setTag(i2, tag);
        }
    }

    /* renamed from: d */
    public void mo39512d(VT vt, T t, int i, ViewGroup viewGroup) {
        getItemViewType(i);
        if (this.f46692f) {
            int i2 = C18162d.view_holder;
            Object tag = vt.getTag(i2);
            if (tag == null) {
                tag = null;
            }
            vt.setTag(i2, tag);
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2 = this.f46691e;
        if (view == null) {
            view = mo47289a(i2, i, viewGroup, this.f46689c);
            mo47291b(getItemViewType(i), view);
        }
        mo39512d(view, getItem(i), i, viewGroup);
        return view;
    }

    public abstract T getItem(int i);

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = this.f46690d;
        if (view == null) {
            view = mo47289a(i2, i, viewGroup, this.f46689c);
            mo47291b(getItemViewType(i), view);
        }
        mo39512d(view, getItem(i), i, viewGroup);
        return view;
    }
}
