package com.moovit.gallery;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ja0.C12797f;
import java.util.ArrayList;
import p583jk.C17884p;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;

/* renamed from: com.moovit.gallery.a */
public final class C15878a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C15879a f41481g = new C15879a();

    /* renamed from: h */
    public final ArrayList<C15880b> f41482h = new ArrayList<>(0);

    /* renamed from: i */
    public final C15881c f41483i;

    /* renamed from: j */
    public final int f41484j;

    /* renamed from: com.moovit.gallery.a$a */
    public class C15879a implements View.OnClickListener {
        public C15879a() {
        }

        public final void onClick(View view) {
            C12797f fVar;
            if (C15878a.this.f41483i != null && (fVar = (C12797f) view.getTag()) != null && fVar.getAdapterPosition() != -1) {
                int id = view.getId();
                if (id == C19740r.add_image) {
                    C15878a.this.f41483i.mo47927s0();
                } else if (id == C19740r.delete_image_button) {
                    C15878a.this.f41483i.mo47926o(fVar.getAdapterPosition());
                }
            }
        }
    }

    /* renamed from: com.moovit.gallery.a$b */
    public static class C15880b {

        /* renamed from: a */
        public final int f41486a;

        /* renamed from: b */
        public final Uri f41487b;

        public C15880b(Uri uri, int i) {
            this.f41486a = i;
            this.f41487b = uri;
        }
    }

    /* renamed from: com.moovit.gallery.a$c */
    public interface C15881c {
        /* renamed from: o */
        void mo47926o(int i);

        /* renamed from: s0 */
        void mo47927s0();
    }

    public C15878a(int i, C15881c cVar) {
        this.f41484j = Math.max(i, 1);
        C21100e.m49373x(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f41483i = cVar;
    }

    public final int getItemCount() {
        return this.f41482h.size();
    }

    public final int getItemViewType(int i) {
        return this.f41482h.get(i).f41486a;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        C15880b bVar = this.f41482h.get(i);
        int i2 = bVar.f41486a;
        boolean z = true;
        if (i2 == 1) {
            View view = fVar.itemView;
            if (this.f41482h.size() - 1 >= this.f41484j) {
                z = false;
            }
            view.setEnabled(z);
            fVar.itemView.setOnClickListener(this.f41481g);
        } else if (i2 == 2) {
        } else {
            if (i2 == 3) {
                Uri uri = bVar.f41487b;
                ImageView imageView = (ImageView) fVar.mo39639f(C19740r.image);
                C17884p.m44353X(imageView.getContext()).mo10880p(uri.getPath()).mo22738w(C19739q.img_photo_96).mo10850T(imageView);
                fVar.mo39639f(C19740r.delete_image_button).setOnClickListener(this.f41481g);
                return;
            }
            StringBuilder k = C13555b.m33972k("Unknown view type: ");
            k.append(bVar.f41486a);
            throw new IllegalArgumentException(k.toString());
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            view = from.inflate(C19742t.embedded_gallery_add_image, viewGroup, false);
        } else if (i == 2) {
            view = from.inflate(C19742t.embedded_gallery_image_in_progress, viewGroup, false);
        } else if (i == 3) {
            view = from.inflate(C19742t.embedded_gallery_image, viewGroup, false);
        } else {
            throw new IllegalArgumentException(C16759e.m42349e("Unknown view type: ", i));
        }
        C12797f fVar = new C12797f(view);
        if (i == 1) {
            view.setTag(fVar);
        }
        View f = fVar.mo39639f(C19740r.delete_image_button);
        if (f != null) {
            f.setTag(fVar);
        }
        return fVar;
    }
}
