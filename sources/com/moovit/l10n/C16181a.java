package com.moovit.l10n;

import android.content.Context;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.image.model.Image;
import g20.C17138a;
import g20.C17141c;
import g20.C17142d;
import g20.C17145e;
import g20.C17161i;
import p977zz.C20964s0;

/* renamed from: com.moovit.l10n.a */
public final class C16181a<O> extends C17161i<C16184c, O> {

    /* renamed from: e */
    public static final C16185d f42174e = new C16185d();

    /* renamed from: a */
    public final C17142d<? super O, ? extends Image> f42175a;

    /* renamed from: b */
    public final C17142d<? super O, ? extends CharSequence> f42176b;

    /* renamed from: c */
    public final C17142d<? super O, ? extends CharSequence> f42177c;

    /* renamed from: d */
    public final C17142d<? super O, ? extends CharSequence> f42178d;

    /* renamed from: com.moovit.l10n.a$a */
    public static abstract class C16182a<V> implements C16184c {

        /* renamed from: b */
        public V f42179b;

        /* renamed from: a */
        public final void mo45931a(CharSequence charSequence) {
            mo44804g(this.f42179b, charSequence);
        }

        /* renamed from: b */
        public final void mo45932b(CharSequence charSequence) {
            mo44805h(this.f42179b, charSequence);
        }

        /* renamed from: c */
        public final void mo45933c(Image image) {
            mo44803f(image, this.f42179b);
        }

        /* renamed from: d */
        public final void mo45934d(CharSequence charSequence) {
            mo44802e(this.f42179b, charSequence);
        }

        /* renamed from: e */
        public abstract void mo44802e(V v, CharSequence charSequence);

        /* renamed from: f */
        public abstract void mo44803f(Image image, Object obj);

        /* renamed from: g */
        public abstract void mo44804g(V v, CharSequence charSequence);

        /* renamed from: h */
        public abstract void mo44805h(V v, CharSequence charSequence);
    }

    /* renamed from: com.moovit.l10n.a$b */
    public static class C16183b implements C16184c {

        /* renamed from: b */
        public Image f42180b = null;

        /* renamed from: c */
        public CharSequence f42181c = null;

        /* renamed from: d */
        public CharSequence f42182d = null;

        /* renamed from: e */
        public CharSequence f42183e = null;

        /* renamed from: a */
        public final void mo45931a(CharSequence charSequence) {
            this.f42182d = charSequence;
        }

        /* renamed from: b */
        public final void mo45932b(CharSequence charSequence) {
            this.f42181c = charSequence;
        }

        /* renamed from: c */
        public final void mo45933c(Image image) {
            this.f42180b = image;
        }

        /* renamed from: d */
        public final void mo45934d(CharSequence charSequence) {
            this.f42183e = charSequence;
        }
    }

    /* renamed from: com.moovit.l10n.a$c */
    public interface C16184c {
        /* renamed from: a */
        void mo45931a(CharSequence charSequence);

        /* renamed from: b */
        void mo45932b(CharSequence charSequence);

        /* renamed from: c */
        void mo45933c(Image image);

        /* renamed from: d */
        void mo45934d(CharSequence charSequence);
    }

    /* renamed from: com.moovit.l10n.a$d */
    public static class C16185d extends C16182a<AbstractListItemView<?, ?, ?>> {
        /* renamed from: e */
        public final void mo44802e(Object obj, CharSequence charSequence) {
            ((AbstractListItemView) obj).setContentDescription(charSequence);
        }

        /* renamed from: f */
        public final void mo44803f(Image image, Object obj) {
            ((AbstractListItemView) obj).setIcon(image);
        }

        /* renamed from: g */
        public final void mo44804g(Object obj, CharSequence charSequence) {
            ((AbstractListItemView) obj).setSubtitle(charSequence);
        }

        /* renamed from: h */
        public final void mo44805h(Object obj, CharSequence charSequence) {
            ((AbstractListItemView) obj).setTitle(charSequence);
        }
    }

    public C16181a(C17145e eVar, C17145e eVar2, C17141c cVar, C17138a aVar) {
        this.f42175a = eVar;
        this.f42176b = eVar2;
        this.f42177c = cVar;
        this.f42178d = aVar;
    }

    /* renamed from: b */
    public static <O> void m41233b(C17161i<C16184c, O> iVar, AbstractListItemView<?, ?, ?> abstractListItemView, O o) {
        Context context = abstractListItemView.getContext();
        C16185d dVar = f42174e;
        dVar.f42179b = abstractListItemView;
        try {
            iVar.mo48496a(context, dVar, o);
        } finally {
            dVar.f42179b = null;
        }
    }

    /* renamed from: a */
    public final void mo48496a(Context context, Object obj, Object obj2) {
        C16184c cVar = (C16184c) obj;
        cVar.mo45933c((Image) this.f42175a.mo49725a(context, obj2));
        CharSequence charSequence = (CharSequence) this.f42176b.mo49725a(context, obj2);
        CharSequence charSequence2 = null;
        if (C20964s0.m49090h(charSequence)) {
            charSequence = null;
        }
        cVar.mo45932b(charSequence);
        CharSequence charSequence3 = (CharSequence) this.f42177c.mo49725a(context, obj2);
        if (!C20964s0.m49090h(charSequence3)) {
            charSequence2 = charSequence3;
        }
        cVar.mo45931a(charSequence2);
        CharSequence charSequence4 = (CharSequence) this.f42178d.mo49725a(context, obj2);
        if (!C20964s0.m49090h(charSequence4)) {
            cVar.mo45934d(charSequence4);
        }
    }
}
