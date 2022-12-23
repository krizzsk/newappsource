package com.usebutton.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.functional.Pair;
import com.usebutton.sdk.internal.models.App;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.Footer;
import com.usebutton.sdk.internal.models.Header;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.util.Arrays;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.Receiver;
import com.usebutton.sdk.internal.views.InventoryGroupPager;
import com.usebutton.sdk.internal.views.OneLineInventoryView;
import com.usebutton.sdk.internal.views.SingleInventoryAdapter;
import com.usebutton.sdk.models.Inventory;
import com.usebutton.sdk.models.InventoryGroup;
import com.usebutton.sdk.models.Link;
import com.usebutton.sdk.models.ListBody;
import java.util.ArrayList;
import java.util.List;

public class GroupedInventoryCardActivity extends BaseCardActivity {
    public static final String EXTRA_BODY = "body";
    private static final String EXTRA_FOOTER = "footer";
    private static final String EXTRA_HEADER = "header";
    private PagerAdapter mAdapter;
    private ListBody mBody;
    private Footer mFooter;
    private final List<InventoryGroup> mGroups = new ArrayList();
    private Header mHeader;
    private final Receiver<Link> mOnInventorySelected = new Receiver<Link>() {
        public void receive(Link link) {
            new ActionPerformer(GroupedInventoryCardActivity.this.getApp(), GroupedInventoryCardActivity.this.getMetaInfo(), link).withEvent(Events.INVENTORY_CARD_SELECTED).withEventProperties(Events.PROPERTY_GROUP_NAME, GroupedInventoryCardActivity.this.currentGroupName()).execute(GroupedInventoryCardActivity.this);
            GroupedInventoryCardActivity.this.finish();
        }
    };
    private ViewPager.OnPageChangeListener mOnPageChange = new ViewPager.OnPageChangeListener() {
        public int mLastPosition = 0;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (this.mLastPosition != i) {
                this.mLastPosition = i;
                GroupedInventoryCardActivity.this.trackCardEvent(Events.INVENTORY_CARD_GROUP_CHANGED, new String[0]);
                GroupedInventoryCardActivity.this.getButton().getStorage().setPreferredInventoryGroup(GroupedInventoryCardActivity.this.getPromotionId(), GroupedInventoryCardActivity.this.currentGroupName());
            }
        }
    };
    private ViewPager mPager;
    private PagerTabStrip mPagerTitle;

    /* access modifiers changed from: private */
    public String currentGroupName() {
        CharSequence pageTitle = this.mAdapter.getPageTitle(this.mPager.getCurrentItem());
        if (pageTitle != null) {
            return pageTitle.toString();
        }
        return null;
    }

    private void initBody() {
        if (this.mGroups.size() == 1) {
            this.mAdapter = new SingleInventoryAdapter(this, this.mOnInventorySelected, this.mGroups.get(0));
        } else {
            this.mAdapter = new InventoryGroupPager(this, this.mGroups, this.mOnInventorySelected);
        }
        this.mPager.setAdapter(this.mAdapter);
        selectPreferredGroup(getButton().getStorage().getPreferredInventoryGroup(getPromotionId()));
        this.mPager.addOnPageChangeListener(this.mOnPageChange);
    }

    private void initFooter(Footer footer) {
        OneLineInventoryView oneLineInventoryView = (OneLineInventoryView) findViewById(C12238R.C12240id.promo_footer);
        if (footer != null) {
            oneLineInventoryView.setFooter(footer, this.mOnInventorySelected);
            showFooter(true);
            return;
        }
        showFooter(false);
    }

    private void initPager(InventoryGroup inventoryGroup) {
        if (this.mBody.shouldShowHeadings()) {
            this.mPagerTitle.setTabIndicatorColor(inventoryGroup.getNameColor());
            this.mPagerTitle.setTextColor(inventoryGroup.getNameColor());
            this.mPagerTitle.setVisibility(0);
            return;
        }
        this.mPagerTitle.setVisibility(8);
    }

    public static Intent intentForPromotion(Context context, App app, MetaInfo metaInfo, Header header, ListBody listBody, Footer footer) {
        Intent intent = new Intent(context, GroupedInventoryCardActivity.class);
        if (app != null) {
            intent.putExtra("app", app);
        }
        intent.putExtra(BaseCardActivity.EXTRA_META_INFO, metaInfo);
        intent.putExtra("header", header);
        intent.putExtra(EXTRA_BODY, listBody);
        intent.putExtra("footer", footer);
        return intent;
    }

    private void selectPreferredGroup(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (int i = 0; i < this.mAdapter.getCount(); i++) {
                if (str.equals(this.mAdapter.getPageTitle(i))) {
                    this.mPager.setCurrentItem(i, true);
                    return;
                }
            }
        }
    }

    private void showFooter(boolean z) {
        int i;
        View findViewById = findViewById(C12238R.C12240id.promo_footer);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPager.getLayoutParams();
        if (z) {
            i2 = getResources().getDimensionPixelSize(C12238R.dimen.btn_footer_height);
        }
        layoutParams.bottomMargin = i2;
        this.mPager.setLayoutParams(layoutParams);
    }

    public void bind(MetaInfo metaInfo) {
        this.mHeader = (Header) getIntent().getParcelableExtra("header");
        this.mBody = (ListBody) getIntent().getParcelableExtra(EXTRA_BODY);
        this.mFooter = (Footer) getIntent().getParcelableExtra("footer");
        this.mGroups.clear();
        this.mGroups.addAll(this.mBody.getGroups());
        this.mPager = (ViewPager) findViewById(C12238R.C12240id.promo_pager);
        this.mPagerTitle = (PagerTabStrip) findViewById(C12238R.C12240id.promo_pager_title);
        initHeader(this.mHeader);
        initBody();
        initPager(this.mGroups.get(0));
        initFooter(this.mFooter);
    }

    public List<Asset> collectAssets() {
        List<Asset> collectAssets = super.collectAssets();
        Footer footer = this.mFooter;
        if (footer != null) {
            Arrays.addIfNotNull(collectAssets, footer.getIcon());
        }
        for (InventoryGroup inventory : this.mGroups) {
            for (Inventory icon : inventory.getInventory()) {
                Arrays.addIfNotNull(collectAssets, icon.getIcon());
            }
        }
        return collectAssets;
    }

    public String getCardDismissedEvent() {
        return Events.INVENTORY_CARD_DISMISSED;
    }

    public List<Pair<String, String>> getCardSpecificEventProperties() {
        return java.util.Arrays.asList(new Pair[]{new Pair(Events.PROPERTY_GROUP_NAME, currentGroupName())});
    }

    public String getCardViewedEvent() {
        return Events.INVENTORY_CARD_VIEWED;
    }

    public int getContentLayoutId() {
        return C12238R.layout.btn_promotion_grouped_inventory;
    }

    public void onAssetsReady() {
        this.mAdapter.notifyDataSetChanged();
        initBody();
        initFooter(this.mFooter);
    }

    public void onStart() {
        if (!this.mDidTrackViewed) {
            ButtonLog.visibleFormat("Commerce Card presented: (Action ID: %s)", getPromotionId());
        }
        super.onStart();
    }

    public boolean shouldBindAndShowContent(MetaInfo metaInfo) {
        return true;
    }
}
