package com.moovit.app.actions;

import com.moovit.MoovitActivity;
import p613kq.C18116c;
import p637lq.C18250a;
import p637lq.C18252c;
import p637lq.C18253d;
import p660mq.C18417a;
import p660mq.C18418b;
import p660mq.C18420d;
import p660mq.C18423f;
import p684nq.C18580a;
import p684nq.C18581b;
import p684nq.C18585f;
import p708oq.C18815a;
import p708oq.C18818c;
import p708oq.C18819d;
import p708oq.C18822f;
import p708oq.C18823g;
import p732pq.C18941b;
import p732pq.C18942c;
import p732pq.C18943d;
import p732pq.C18944e;
import p732pq.C18946g;
import p732pq.C18958r;
import p753qq.C19152a;
import p753qq.C19153b;
import p753qq.C19154c;
import p753qq.C19156e;
import p753qq.C19157f;
import p753qq.C19159h;
import p753qq.C19160i;
import p777rq.C19311a;
import p777rq.C19312b;
import p777rq.C19313c;
import p801sq.C19512a;
import p801sq.C19513b;
import p801sq.C19514c;
import p801sq.C19515d;
import p801sq.C19516e;
import p801sq.C19517f;
import p801sq.C19518g;

public enum QuickAction {
    STOP_REPORT(r1, C19160i.class),
    STOP_FAVORITE(r1, C18253d.class),
    STOP_TICKETING(r1, C19518g.class),
    STOP_MOT(r1, C18585f.class),
    STOP_NOTIFY_DRIVER(r1, C18958r.class),
    STOP_LIVE_LOCATION(r1, C18423f.class),
    LINE_NAVIGATE(r4, C18819d.class),
    LINE_REPORT(r4, C19156e.class),
    LINE_FAVORITE(r4, C18250a.class),
    LINE_TICKETING(r4, C19515d.class),
    LINE_MOT(r4, C18581b.class),
    LINE_NOTIFY_DRIVER(r4, C18943d.class),
    LINE_LIVE_LOCATION(r4, C18418b.class),
    LINE_TRIP_NAVIGATE(r3, C18822f.class),
    LINE_TRIP_REPORT(r3, C19159h.class),
    LINE_TRIP_FAVORITE(r3, C18252c.class),
    LINE_TRIP_TICKETING(r3, C19517f.class),
    LINE_TRIP_MOT(r3, C18581b.class),
    LINE_TRIP_NOTIFY_DRIVER(r3, C18946g.class),
    LINE_TRIP_LIVE_LOCATION(r3, C18420d.class),
    LINE_LIVE_DIRECTIONS_STOP(r5, C18823g.class),
    LINE_LIVE_DIRECTIONS_REPORT(r5, C19157f.class),
    LINE_LIVE_DIRECTIONS_TICKETING(r5, C19516e.class),
    LINE_LIVE_DIRECTIONS_MOT(r5, C18581b.class),
    LINE_LIVE_DIRECTIONS_NOTIFY_DRIVER(r5, C18944e.class),
    ITINERARY_NAVIGATE(r2, C18815a.class),
    ITINERARY_REPORT(r2, C19154c.class),
    ITINERARY_SHARE(r2, C19313c.class),
    ITINERARY_TICKETING(r2, C19514c.class),
    ITINERARY_MOT(r2, C18580a.class),
    ITINERARY_NOTIFY_DRIVER(r2, C18942c.class),
    ITINERARY_LIVE_LOCATION(r2, C18417a.class),
    ITINERARY_PREVIEW_NAVIGATE(r0, C18818c.class),
    ITINERARY_PREVIEW_REPORT(r0, C19153b.class),
    ITINERARY_PREVIEW_SHARE(r0, C19312b.class),
    ITINERARY_PREVIEW_TICKETING(r0, C19513b.class),
    ITINERARY_PREVIEW_MOT(r0, C18580a.class),
    ITINERARY_LIVE_DIRECTIONS_STOP(r5, C18823g.class),
    ITINERARY_LIVE_DIRECTIONS_REPORT(r5, C19152a.class),
    ITINERARY_LIVE_DIRECTIONS_SHARE(r5, C19311a.class),
    ITINERARY_LIVE_DIRECTIONS_TICKETING(r5, C19512a.class),
    ITINERARY_LIVE_DIRECTIONS_MOT(r5, C18580a.class),
    ITINERARY_LIVE_DIRECTIONS_NOTIFY_DRIVER(r5, C18941b.class);
    
    public final Class<? extends C18116c<?>> fragment;
    public final Class<? extends MoovitActivity> host;

    private QuickAction(Class<? extends MoovitActivity> cls, Class<? extends C18116c<?>> cls2) {
        this.host = cls;
        this.fragment = cls2;
    }
}
