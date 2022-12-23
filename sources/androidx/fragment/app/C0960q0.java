package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: androidx.fragment.app.q0 */
public class C0960q0 extends Fragment {
    public ListAdapter mAdapter;
    public View mEmptyView;
    private final Handler mHandler = new Handler();
    public ListView mList;
    public View mListContainer;
    public boolean mListShown;
    private final AdapterView.OnItemClickListener mOnClickListener = new C0962b();
    public View mProgressContainer;
    private final Runnable mRequestFocus = new C0961a();
    public TextView mStandardEmptyView;

    /* renamed from: androidx.fragment.app.q0$a */
    public class C0961a implements Runnable {
        public C0961a() {
        }

        public final void run() {
            ListView listView = C0960q0.this.mList;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.q0$b */
    public class C0962b implements AdapterView.OnItemClickListener {
        public C0962b() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0960q0.this.onListItemClick((ListView) adapterView, view, i, j);
        }
    }

    private void ensureList() {
        if (this.mList == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.mList = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.mStandardEmptyView = textView;
                    if (textView == null) {
                        this.mEmptyView = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.mProgressContainer = view.findViewById(16711682);
                    this.mListContainer = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.mList = listView;
                        View view2 = this.mEmptyView;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.mListShown = true;
                this.mList.setOnItemClickListener(this.mOnClickListener);
                ListAdapter listAdapter = this.mAdapter;
                if (listAdapter != null) {
                    this.mAdapter = null;
                    setListAdapter(listAdapter);
                } else if (this.mProgressContainer != null) {
                    setListShown(false, false);
                }
                this.mHandler.post(this.mRequestFocus);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    private void setListShown(boolean z, boolean z2) {
        ensureList();
        View view = this.mProgressContainer;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.mListShown != z) {
            this.mListShown = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.mListContainer.clearAnimation();
                }
                this.mProgressContainer.setVisibility(8);
                this.mListContainer.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.mListContainer.clearAnimation();
            }
            this.mProgressContainer.setVisibility(0);
            this.mListContainer.setVisibility(8);
        }
    }

    public ListView getListView() {
        ensureList();
        return this.mList;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mList = null;
        this.mListShown = false;
        this.mListContainer = null;
        this.mProgressContainer = null;
        this.mEmptyView = null;
        this.mStandardEmptyView = null;
        super.onDestroyView();
    }

    public void onListItemClick(ListView listView, View view, int i, long j) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ensureList();
    }

    public void setListAdapter(ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        if (this.mAdapter != null) {
            z = true;
        } else {
            z = false;
        }
        this.mAdapter = listAdapter;
        ListView listView = this.mList;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.mListShown && !z) {
                if (requireView().getWindowToken() != null) {
                    z2 = true;
                }
                setListShown(true, z2);
            }
        }
    }
}
