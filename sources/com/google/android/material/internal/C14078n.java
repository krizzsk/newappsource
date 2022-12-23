package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: com.google.android.material.internal.n */
public final class C14078n {

    /* renamed from: a */
    public static final C14079a f35107a = new C14079a();

    /* renamed from: com.google.android.material.internal.n$a */
    public class C14079a implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }

    /* renamed from: a */
    public static ArrayList m35062a(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
