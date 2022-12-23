package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.C14083r;
import java.util.Calendar;
import java.util.Iterator;
import p229r1.C6233c;
import p242s1.C6315a;
import p242s1.C6333d0;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13405f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f34653b;

    /* renamed from: c */
    public final boolean f34654c;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C13967a extends C6315a {
        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            gVar.f20334a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final C14002t getAdapter() {
        return (C14002t) super.getAdapter();
    }

    /* renamed from: b */
    public final View mo41523b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C14002t a = getAdapter();
        DateSelector<?> dateSelector = a.f34756c;
        C13973b bVar = a.f34758e;
        int max = Math.max(a.mo41576a(), getFirstVisiblePosition());
        int min = Math.min(a.mo41578c(), getLastVisiblePosition());
        Long b = a.getItem(max);
        Long b2 = a.getItem(min);
        Iterator it = dateSelector.mo41504a1().iterator();
        while (it.hasNext()) {
            C6233c cVar = (C6233c) it.next();
            F f = cVar.f19679a;
            if (f == null) {
                materialCalendarGridView = this;
            } else if (cVar.f19680b != null) {
                long longValue = ((Long) f).longValue();
                long longValue2 = ((Long) cVar.f19680b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (b == null || b2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > b2.longValue() || valueOf2.longValue() < b.longValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    boolean d = C14083r.m35068d(this);
                    if (longValue < b.longValue()) {
                        if (max % a.f34755b.f34658e == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            i2 = 0;
                        } else if (!d) {
                            i2 = materialCalendarGridView.mo41523b(max - 1).getRight();
                        } else {
                            i2 = materialCalendarGridView.mo41523b(max - 1).getLeft();
                        }
                        i = max;
                    } else {
                        materialCalendarGridView.f34653b.setTimeInMillis(longValue);
                        i = a.mo41576a() + (materialCalendarGridView.f34653b.get(5) - 1);
                        View b3 = materialCalendarGridView.mo41523b(i);
                        i2 = (b3.getWidth() / 2) + b3.getLeft();
                    }
                    if (longValue2 > b2.longValue()) {
                        if ((min + 1) % a.f34755b.f34658e == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i4 = getWidth();
                        } else if (!d) {
                            i4 = materialCalendarGridView.mo41523b(min).getRight();
                        } else {
                            i4 = materialCalendarGridView.mo41523b(min).getLeft();
                        }
                        i3 = min;
                    } else {
                        materialCalendarGridView.f34653b.setTimeInMillis(longValue2);
                        i3 = a.mo41576a() + (materialCalendarGridView.f34653b.get(5) - 1);
                        View b4 = materialCalendarGridView.mo41523b(i3);
                        i4 = (b4.getWidth() / 2) + b4.getLeft();
                    }
                    int itemId = (int) a.getItemId(i);
                    int i9 = max;
                    int i11 = min;
                    int itemId2 = (int) a.getItemId(i3);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b5 = materialCalendarGridView.mo41523b(numColumns);
                        int top = b5.getTop() + bVar.f34676a.f34668a.top;
                        C14002t tVar = a;
                        int bottom = b5.getBottom() - bVar.f34676a.f34668a.bottom;
                        if (!d) {
                            if (numColumns > i) {
                                i6 = 0;
                            } else {
                                i6 = i2;
                            }
                            if (i3 > numColumns2) {
                                i5 = getWidth();
                            } else {
                                i5 = i4;
                            }
                        } else {
                            if (i3 > numColumns2) {
                                i7 = 0;
                            } else {
                                i7 = i4;
                            }
                            if (numColumns > i) {
                                i8 = getWidth();
                            } else {
                                i8 = i2;
                            }
                            int i12 = i7;
                            i5 = i8;
                            i6 = i12;
                        }
                        canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, bVar.f34683h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        a = tVar;
                    }
                    materialCalendarGridView = this;
                    max = i9;
                    min = i11;
                }
            }
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter().mo41578c());
        } else if (i == 130) {
            setSelection(getAdapter().mo41576a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo41576a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo41576a());
        return true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.f34654c) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setSelection(int i) {
        if (i < getAdapter().mo41576a()) {
            super.setSelection(getAdapter().mo41576a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34653b = C13979d0.m34899i((Calendar) null);
        if (C13993o.m34910J1(getContext())) {
            setNextFocusLeftId(C13405f.cancel_button);
            setNextFocusRightId(C13405f.confirm_button);
        }
        this.f34654c = C13993o.m34911K1(C13401b.nestedScrollable, getContext());
        C6333d0.m15029q(this, new C13967a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C14002t) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C14002t.class.getCanonicalName()}));
        }
    }
}
