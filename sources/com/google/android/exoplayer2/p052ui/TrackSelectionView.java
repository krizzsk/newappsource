package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: b */
    public final CheckedTextView f14429b;

    /* renamed from: c */
    public final CheckedTextView f14430c;

    /* renamed from: d */
    public final SparseArray<DefaultTrackSelector.SelectionOverride> f14431d;

    /* renamed from: e */
    public boolean f14432e;

    /* renamed from: f */
    public boolean f14433f;

    /* renamed from: g */
    public boolean f14434g;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    public class C4023a implements View.OnClickListener {
        public C4023a() {
        }

        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            boolean z = true;
            if (view == trackSelectionView.f14429b) {
                trackSelectionView.f14434g = true;
                trackSelectionView.f14431d.clear();
            } else if (view == trackSelectionView.f14430c) {
                trackSelectionView.f14434g = false;
                trackSelectionView.f14431d.clear();
            } else {
                trackSelectionView.f14434g = false;
                Object tag = view.getTag();
                tag.getClass();
                C4024b bVar = (C4024b) tag;
                DefaultTrackSelector.SelectionOverride selectionOverride = trackSelectionView.f14431d.get(0);
                throw null;
            }
            trackSelectionView.f14429b.setChecked(trackSelectionView.f14434g);
            CheckedTextView checkedTextView = trackSelectionView.f14430c;
            if (trackSelectionView.f14434g || trackSelectionView.f14431d.size() != 0) {
                z = false;
            }
            checkedTextView.setChecked(z);
            throw null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    public static final class C4024b {
        public C4024b() {
            throw null;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo16646a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 3) {
                removeViewAt(childCount);
            } else {
                this.f14429b.setEnabled(false);
                this.f14430c.setEnabled(false);
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f14434g;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f14431d.size());
        for (int i = 0; i < this.f14431d.size(); i++) {
            arrayList.add(this.f14431d.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f14432e != z) {
            this.f14432e = z;
            mo16646a();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f14433f != z) {
            this.f14433f = z;
            if (!z && this.f14431d.size() > 1) {
                for (int size = this.f14431d.size() - 1; size > 0; size--) {
                    this.f14431d.remove(size);
                }
            }
            mo16646a();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f14429b.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(C4035d0 d0Var) {
        d0Var.getClass();
        mo16646a();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f14431d = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        C4023a aVar = new C4023a();
        new C4031c(getResources());
        TrackGroupArray trackGroupArray = TrackGroupArray.f14011e;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f14429b = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C4044m.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(C4042k.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f14430c = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C4044m.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }
}
