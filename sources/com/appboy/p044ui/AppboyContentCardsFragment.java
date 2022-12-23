package com.appboy.p044ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1185g0;
import androidx.recyclerview.widget.C1227p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.contentcards.AppboyCardAdapter;
import com.appboy.p044ui.contentcards.AppboyEmptyContentCardsAdapter;
import com.appboy.p044ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.appboy.p044ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.appboy.p044ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.appboy.p044ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.appboy.p044ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.appboy.p044ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import com.appboy.support.AppboyLogger;
import com.braze.Braze;
import java.util.ArrayList;
import java.util.List;
import p054d0.C4278e0;
import p204p2.C6033b;
import p242s1.C6354e;
import p244s3.C6436k;
import p316y.C7218m;

/* renamed from: com.appboy.ui.AppboyContentCardsFragment */
public class AppboyContentCardsFragment extends Fragment implements SwipeRefreshLayout.C1274f {
    /* access modifiers changed from: private */
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyContentCardsFragment.class);
    public AppboyCardAdapter mCardAdapter;
    public SwipeRefreshLayout mContentCardsSwipeLayout;
    public IEventSubscriber<ContentCardsUpdatedEvent> mContentCardsUpdatedSubscriber;
    public IContentCardsUpdateHandler mCustomContentCardUpdateHandler;
    public IContentCardsViewBindingHandler mCustomContentCardsViewBindingHandler;
    public final IContentCardsUpdateHandler mDefaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    public final IContentCardsViewBindingHandler mDefaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();
    public AppboyEmptyContentCardsAdapter mDefaultEmptyContentCardsAdapter;
    public Runnable mDefaultNetworkUnavailableRunnable;
    /* access modifiers changed from: private */
    public final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    public RecyclerView mRecyclerView;

    /* renamed from: com.appboy.ui.AppboyContentCardsFragment$ContentCardsUpdateRunnable */
    public class ContentCardsUpdateRunnable implements Runnable {
        private final ContentCardsUpdatedEvent mEvent;

        public ContentCardsUpdateRunnable(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
            this.mEvent = contentCardsUpdatedEvent;
        }

        public void run() {
            String access$100 = AppboyContentCardsFragment.TAG;
            StringBuilder k = C13555b.m33972k("Updating Content Cards views in response to ContentCardsUpdatedEvent: ");
            k.append(this.mEvent);
            AppboyLogger.m5457v(access$100, k.toString());
            List<Card> handleCardUpdate = AppboyContentCardsFragment.this.getContentCardUpdateHandler().handleCardUpdate(this.mEvent);
            AppboyContentCardsFragment.this.mCardAdapter.replaceCards(handleCardUpdate);
            AppboyContentCardsFragment.this.mMainThreadLooper.removeCallbacks(AppboyContentCardsFragment.this.getNetworkUnavailableRunnable());
            if (this.mEvent.isFromOfflineStorage() && this.mEvent.isTimestampOlderThan(60)) {
                AppboyLogger.m5453i(AppboyContentCardsFragment.TAG, "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
                Braze.getInstance(AppboyContentCardsFragment.this.getContext()).requestContentCardsRefresh(false);
                if (handleCardUpdate.isEmpty()) {
                    AppboyContentCardsFragment.this.mContentCardsSwipeLayout.setRefreshing(true);
                    AppboyLogger.m5448d(AppboyContentCardsFragment.TAG, "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.");
                    AppboyContentCardsFragment.this.mMainThreadLooper.postDelayed(AppboyContentCardsFragment.this.getNetworkUnavailableRunnable(), InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
                    return;
                }
            }
            if (!handleCardUpdate.isEmpty()) {
                AppboyContentCardsFragment appboyContentCardsFragment = AppboyContentCardsFragment.this;
                appboyContentCardsFragment.swapRecyclerViewAdapter(appboyContentCardsFragment.mCardAdapter);
            } else {
                AppboyContentCardsFragment appboyContentCardsFragment2 = AppboyContentCardsFragment.this;
                appboyContentCardsFragment2.swapRecyclerViewAdapter(appboyContentCardsFragment2.getEmptyCardsAdapter());
            }
            AppboyContentCardsFragment.this.mContentCardsSwipeLayout.setRefreshing(false);
        }
    }

    /* renamed from: com.appboy.ui.AppboyContentCardsFragment$NetworkUnavailableRunnable */
    public class NetworkUnavailableRunnable implements Runnable {
        private final Context mApplicationContext;

        public void run() {
            AppboyLogger.m5457v(AppboyContentCardsFragment.TAG, "Displaying network unavailable toast.");
            Context context = this.mApplicationContext;
            Toast.makeText(context, context.getString(R$string.com_appboy_feed_connection_error_title), 1).show();
            AppboyContentCardsFragment appboyContentCardsFragment = AppboyContentCardsFragment.this;
            appboyContentCardsFragment.swapRecyclerViewAdapter(appboyContentCardsFragment.getEmptyCardsAdapter());
            AppboyContentCardsFragment.this.mContentCardsSwipeLayout.setRefreshing(false);
        }

        private NetworkUnavailableRunnable(Context context) {
            this.mApplicationContext = context;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onRefresh$0() {
        this.mContentCardsSwipeLayout.setRefreshing(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$1(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        this.mMainThreadLooper.post(getContentCardUpdateRunnable(contentCardsUpdatedEvent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewStateRestored$2(Bundle bundle) {
        ArrayList<String> stringArrayList;
        Parcelable parcelable = bundle.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY");
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
            if (!(parcelable == null || layoutManager == null)) {
                layoutManager.onRestoreInstanceState(parcelable);
            }
        }
        if (this.mCardAdapter != null && (stringArrayList = bundle.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")) != null) {
            this.mCardAdapter.setImpressedCardIds(stringArrayList);
        }
    }

    public void attachSwipeHelperCallback() {
        C1227p pVar = new C1227p(new SimpleItemTouchHelperCallback(this.mCardAdapter));
        RecyclerView recyclerView = this.mRecyclerView;
        RecyclerView recyclerView2 = pVar.f4642s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo4568Z(pVar);
                RecyclerView recyclerView3 = pVar.f4642s;
                C1227p.C1229b bVar = pVar.f4622A;
                recyclerView3.f4279r.remove(bVar);
                if (recyclerView3.f4281s == bVar) {
                    recyclerView3.f4281s = null;
                }
                ArrayList arrayList = pVar.f4642s.f4227D;
                if (arrayList != null) {
                    arrayList.remove(pVar);
                }
                for (int size = pVar.f4640q.size() - 1; size >= 0; size--) {
                    C1227p.C1235f fVar = (C1227p.C1235f) pVar.f4640q.get(0);
                    fVar.f4663g.cancel();
                    pVar.f4637n.clearView(pVar.f4642s, fVar.f4661e);
                }
                pVar.f4640q.clear();
                pVar.f4647x = null;
                VelocityTracker velocityTracker = pVar.f4644u;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    pVar.f4644u = null;
                }
                C1227p.C1234e eVar = pVar.f4649z;
                if (eVar != null) {
                    eVar.f4655b = false;
                    pVar.f4649z = null;
                }
                if (pVar.f4648y != null) {
                    pVar.f4648y = null;
                }
            }
            pVar.f4642s = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                pVar.f4630g = resources.getDimension(C6033b.item_touch_helper_swipe_escape_velocity);
                pVar.f4631h = resources.getDimension(C6033b.item_touch_helper_swipe_escape_max_velocity);
                pVar.f4641r = ViewConfiguration.get(pVar.f4642s.getContext()).getScaledTouchSlop();
                pVar.f4642s.mo4593g(pVar, -1);
                pVar.f4642s.f4279r.add(pVar.f4622A);
                RecyclerView recyclerView4 = pVar.f4642s;
                if (recyclerView4.f4227D == null) {
                    recyclerView4.f4227D = new ArrayList();
                }
                recyclerView4.f4227D.add(pVar);
                pVar.f4649z = new C1227p.C1234e();
                pVar.f4648y = new C6354e(pVar.f4642s.getContext(), pVar.f4649z);
            }
        }
    }

    public IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.mCustomContentCardUpdateHandler;
        return iContentCardsUpdateHandler != null ? iContentCardsUpdateHandler : this.mDefaultContentCardUpdateHandler;
    }

    public Runnable getContentCardUpdateRunnable(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        return new ContentCardsUpdateRunnable(contentCardsUpdatedEvent);
    }

    public IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.mCustomContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler != null ? iContentCardsViewBindingHandler : this.mDefaultContentCardsViewBindingHandler;
    }

    public RecyclerView.Adapter<?> getEmptyCardsAdapter() {
        return this.mDefaultEmptyContentCardsAdapter;
    }

    public Runnable getNetworkUnavailableRunnable() {
        return this.mDefaultNetworkUnavailableRunnable;
    }

    public void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        AppboyCardAdapter appboyCardAdapter = new AppboyCardAdapter(getContext(), linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.mCardAdapter = appboyCardAdapter;
        this.mRecyclerView.setAdapter(appboyCardAdapter);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        attachSwipeHelperCallback();
        RecyclerView.C1128j itemAnimator = this.mRecyclerView.getItemAnimator();
        if (itemAnimator instanceof C1185g0) {
            ((C1185g0) itemAnimator).f4498g = false;
        }
        this.mRecyclerView.mo4593g(new ContentCardsDividerItemDecoration(getContext()), -1);
        this.mDefaultEmptyContentCardsAdapter = new AppboyEmptyContentCardsAdapter();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mDefaultNetworkUnavailableRunnable = new NetworkUnavailableRunnable(getContext());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_appboy_content_cards, viewGroup, false);
        this.mRecyclerView = (RecyclerView) inflate.findViewById(R$id.com_appboy_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.appboy_content_cards_swipe_container);
        this.mContentCardsSwipeLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.mContentCardsSwipeLayout.setColorSchemeResources(R$color.com_appboy_content_cards_swipe_refresh_color_1, R$color.com_appboy_content_cards_swipe_refresh_color_2, R$color.com_appboy_content_cards_swipe_refresh_color_3, R$color.com_appboy_content_cards_swipe_refresh_color_4);
        return inflate;
    }

    public void onPause() {
        super.onPause();
        Braze.getInstance(getContext()).removeSingleSubscription(this.mContentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        this.mMainThreadLooper.removeCallbacks(this.mDefaultNetworkUnavailableRunnable);
        this.mCardAdapter.markOnScreenCardsAsRead();
    }

    public void onRefresh() {
        Braze.getInstance(getContext()).requestContentCardsRefresh(false);
        this.mMainThreadLooper.postDelayed(new C4278e0(this, 4), 2500);
    }

    public void onResume() {
        super.onResume();
        Braze.getInstance(getContext()).removeSingleSubscription(this.mContentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.mContentCardsUpdatedSubscriber == null) {
            this.mContentCardsUpdatedSubscriber = new C6436k(this, 2);
        }
        Braze.getInstance(getContext()).subscribeToContentCardsUpdates(this.mContentCardsUpdatedSubscriber);
        Braze.getInstance(getContext()).requestContentCardsRefresh(true);
        Braze.getInstance(getContext()).logContentCardsDisplayed();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.mRecyclerView;
        if (!(recyclerView == null || recyclerView.getLayoutManager() == null)) {
            bundle.putParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", this.mRecyclerView.getLayoutManager().onSaveInstanceState());
        }
        AppboyCardAdapter appboyCardAdapter = this.mCardAdapter;
        if (appboyCardAdapter != null) {
            bundle.putStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", (ArrayList) appboyCardAdapter.getImpressedCardIds());
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.mCustomContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            bundle.putParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.mCustomContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            bundle.putParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsUpdateHandler);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            IContentCardsUpdateHandler iContentCardsUpdateHandler = (IContentCardsUpdateHandler) bundle.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY");
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            IContentCardsViewBindingHandler iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) bundle.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY");
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            this.mMainThreadLooper.post(new C7218m(2, this, bundle));
        }
        initializeRecyclerView();
    }

    public void setContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.mCustomContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.mCustomContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public void swapRecyclerViewAdapter(RecyclerView.Adapter<?> adapter) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.getAdapter() != adapter) {
            this.mRecyclerView.setAdapter(adapter);
        }
    }
}
