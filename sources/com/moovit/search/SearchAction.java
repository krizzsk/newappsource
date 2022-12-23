package com.moovit.search;

import p824tp.C19739q;
import p824tp.C19746x;

public enum SearchAction {
    DEFAULT(0, 0),
    COPY(C19739q.ic_append_16_color_on_surface_emphasis_medium, C19746x.voice_over_search_copy),
    SHOW_DETAILS(C19739q.ic_schedule_16_on_surface_emphasis_medium, C19746x.action_schedule),
    MARK_AS_FAVORITE(C19739q.ic_star_stroke_24_on_surface_emphasis_medium, C19746x.voiceover_favorites_add);
    
    public final int accessibilityResId;
    public final int drawableResId;

    private SearchAction(int i, int i2) {
        this.drawableResId = i;
        this.accessibilityResId = i2;
    }
}
