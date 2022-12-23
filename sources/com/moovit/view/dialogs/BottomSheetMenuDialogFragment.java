package com.moovit.view.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.C15780a;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import o00.C18665b;
import p783rw.C19370b;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;

public class BottomSheetMenuDialogFragment extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f24110i = 0;

    /* renamed from: h */
    public final C19370b f24111h = new C19370b(this, 19);

    /* renamed from: com.moovit.view.dialogs.BottomSheetMenuDialogFragment$a */
    public interface C7965a {
        /* renamed from: l0 */
        void mo24850l0(MenuItem menuItem);
    }

    /* renamed from: com.moovit.view.dialogs.BottomSheetMenuDialogFragment$b */
    public static class C7966b extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<MenuItem> f24115g;

        /* renamed from: h */
        public final View.OnClickListener f24116h;

        public C7966b(C19370b bVar, List list) {
            C21100e.m49373x(list, "menuItems");
            this.f24115g = list;
            C21100e.m49373x(bVar, "clickListener");
            this.f24116h = bVar;
        }

        public final int getItemCount() {
            return this.f24115g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            MenuItem menuItem = this.f24115g.get(i);
            TextView textView = (TextView) ((C12797f) a0Var).itemView;
            textView.setTag(menuItem);
            textView.setOnClickListener(this.f24116h);
            textView.setText(menuItem.f24114d);
            C15780a.m40272e(textView, menuItem.f24113c);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C19742t.bottom_sheet_menu_list_item, viewGroup, false));
        }
    }

    public BottomSheetMenuDialogFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public static BottomSheetMenuDialogFragment m18151S1(List<MenuItem> list) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("menuItems", C13717b.m34264k(list));
        BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment = new BottomSheetMenuDialogFragment();
        bottomSheetMenuDialogFragment.setArguments(bundle);
        return bottomSheetMenuDialogFragment;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.bottom_sheet_menu_dialog_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List parcelableArrayList = mo46752K1().getParcelableArrayList("menuItems");
        if (parcelableArrayList == null) {
            parcelableArrayList = Collections.emptyList();
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C19740r.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.mo4593g(new C18665b(requireContext(), C19739q.divider_horizontal), -1);
        recyclerView.setAdapter(new C7966b(this.f24111h, parcelableArrayList));
    }

    public static class MenuItem implements Parcelable {
        public static final Parcelable.Creator<MenuItem> CREATOR = new C7964a();

        /* renamed from: b */
        public final String f24112b;

        /* renamed from: c */
        public final int f24113c;

        /* renamed from: d */
        public final int f24114d;

        /* renamed from: com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem$a */
        public class C7964a implements Parcelable.Creator<MenuItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new MenuItem(parcel);
            }

            public final Object[] newArray(int i) {
                return new MenuItem[i];
            }
        }

        public MenuItem(String str, int i, int i2) {
            this.f24112b = str;
            this.f24113c = i;
            this.f24114d = i2;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f24112b);
            parcel.writeInt(this.f24113c);
            parcel.writeInt(this.f24114d);
        }

        public MenuItem(Parcel parcel) {
            String readString = parcel.readString();
            C21100e.m49373x(readString, "id");
            this.f24112b = readString;
            this.f24113c = parcel.readInt();
            this.f24114d = parcel.readInt();
        }
    }
}
