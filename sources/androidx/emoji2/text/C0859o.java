package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24361g;

/* renamed from: androidx.emoji2.text.o */
public final class C0859o extends SpannableStringBuilder {

    /* renamed from: b */
    public final Class<?> f3546b;

    /* renamed from: c */
    public final ArrayList f3547c = new ArrayList();

    /* renamed from: androidx.emoji2.text.o$a */
    public static class C0860a implements TextWatcher, SpanWatcher {

        /* renamed from: b */
        public final Object f3548b;

        /* renamed from: c */
        public final AtomicInteger f3549c = new AtomicInteger(0);

        public C0860a(Object obj) {
            this.f3548b = obj;
        }

        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3548b).afterTextChanged(editable);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3548b).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3549c.get() <= 0 || !(obj instanceof C0851k)) {
                ((SpanWatcher) this.f3548b).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            if (this.f3549c.get() <= 0 || !(obj instanceof C0851k)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i > i2) {
                        i7 = 0;
                    } else {
                        i7 = i;
                    }
                    if (i3 > i4) {
                        i6 = i7;
                        i5 = 0;
                    } else {
                        i5 = i3;
                        i6 = i7;
                    }
                } else {
                    i6 = i;
                    i5 = i3;
                }
                ((SpanWatcher) this.f3548b).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3549c.get() <= 0 || !(obj instanceof C0851k)) {
                ((SpanWatcher) this.f3548b).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3548b).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public C0859o(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C24361g.m61185s(cls, "watcherClass cannot be null");
        this.f3546b = cls;
    }

    /* renamed from: a */
    public final void mo3642a() {
        for (int i = 0; i < this.f3547c.size(); i++) {
            ((C0860a) this.f3547c.get(i)).f3549c.incrementAndGet();
        }
    }

    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void mo3647b() {
        mo3651e();
        for (int i = 0; i < this.f3547c.size(); i++) {
            ((C0860a) this.f3547c.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: c */
    public final C0860a mo3648c(Object obj) {
        for (int i = 0; i < this.f3547c.size(); i++) {
            C0860a aVar = (C0860a) this.f3547c.get(i);
            if (aVar.f3548b == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo3649d(Object obj) {
        boolean z;
        if (obj != null) {
            if (this.f3546b == obj.getClass()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: e */
    public final void mo3651e() {
        for (int i = 0; i < this.f3547c.size(); i++) {
            ((C0860a) this.f3547c.get(i)).f3549c.decrementAndGet();
        }
    }

    public final int getSpanEnd(Object obj) {
        C0860a c;
        if (mo3649d(obj) && (c = mo3648c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        C0860a c;
        if (mo3649d(obj) && (c = mo3648c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        C0860a c;
        if (mo3649d(obj) && (c = mo3648c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        boolean z;
        if (this.f3546b == cls) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.getSpans(i, i2, cls);
        }
        C0860a[] aVarArr = (C0860a[]) super.getSpans(i, i2, C0860a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f3548b;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r0 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class<androidx.emoji2.text.C0859o.C0860a> r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x000b
            java.lang.Class<?> r0 = r1.f3546b
            if (r0 != r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            java.lang.Class<androidx.emoji2.text.o$a> r4 = androidx.emoji2.text.C0859o.C0860a.class
        L_0x000d:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0859o.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public final void removeSpan(Object obj) {
        C0860a aVar;
        if (mo3649d(obj)) {
            aVar = mo3648c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f3547c.remove(aVar);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (mo3649d(obj)) {
            C0860a aVar = new C0860a(obj);
            this.f3547c.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i, int i2) {
        return new C0859o(this.f3546b, this, i, i2);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m65742append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m65747delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m65748insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m65745append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        mo3642a();
        super.replace(i, i2, charSequence);
        mo3651e();
        return this;
    }

    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m65749insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C0859o(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C24361g.m61185s(cls, "watcherClass cannot be null");
        this.f3546b = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m65741append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m65744append(char c) throws IOException {
        super.append(c);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo3642a();
        super.replace(i, i2, charSequence, i3, i4);
        mo3651e();
        return this;
    }

    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m65743append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m65746append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) throws IOException {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
