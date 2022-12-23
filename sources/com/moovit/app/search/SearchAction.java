package com.moovit.app.search;

import com.tranzmate.R;

public enum SearchAction {
    DEFAULT(0),
    COPY(R.drawable.ic_append_16_color_on_surface_emphasis_medium),
    SHOW_DETAILS(R.drawable.ic_schedule_16_on_surface_emphasis_medium),
    MARK_AS_FAVORITE(R.drawable.ic_star_stroke_24_on_surface_emphasis_medium);
    
    private final int drawableResId;

    private SearchAction(int i) {
        this.drawableResId = i;
    }

    public int getDrawableResId() {
        return this.drawableResId;
    }
}
