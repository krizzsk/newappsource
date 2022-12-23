package zendesk.support;

import com.zendesk.logger.Logger;
import ge0.C23408a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import zendesk.core.BaseStorage;
import zendesk.core.MemoryCache;

class ZendeskRequestStorage implements RequestStorage {
    private static final SimpleDateFormat HOURS_MINUTES_FORMAT = new SimpleDateFormat(Constants.HOURS_MINUTES_FORMAT, Locale.ENGLISH);
    private static final long HOUR_IN_MILLIS = TimeUnit.HOURS.toMillis(1);
    private static final String LOG_TAG = "ZendeskRequestStorage";
    private static final String MEMORY_CACHE_MIGRATED_KEY = "zendesk_request_storage_memory_cache_migrated_flag";
    private static final String REQUESTS_DATA_KEY = "zendesk_request_storage_request_data_list";
    private static final String TIMESTAMP_KEY = "zendesk_request_storage_requests_data_cache_time";
    private final Object lock = new Object();
    private final MemoryCache memoryCache;
    private final RequestMigrator requestMigrator;
    private final BaseStorage storage;

    public ZendeskRequestStorage(BaseStorage baseStorage, RequestMigrator requestMigrator2, MemoryCache memoryCache2) {
        this.storage = baseStorage;
        this.requestMigrator = requestMigrator2;
        this.memoryCache = memoryCache2;
    }

    private void checkForAndMigrateLegacyRequestData() {
        if (!((Boolean) this.memoryCache.getOrDefault(MEMORY_CACHE_MIGRATED_KEY, Boolean.FALSE)).booleanValue()) {
            List<RequestData> legacyRequests = this.requestMigrator.getLegacyRequests();
            if (C23408a.m57530e(legacyRequests)) {
                storeRequestData(legacyRequests);
                this.requestMigrator.clearLegacyRequestStorage();
                this.memoryCache.put(MEMORY_CACHE_MIGRATED_KEY, Boolean.TRUE);
            }
        }
    }

    private static List<RequestData> updateRequests(List<RequestData> list, List<Request> list2) {
        HashMap hashMap = new HashMap(list2.size() + list.size());
        for (RequestData next : list) {
            hashMap.put(next.getId(), next);
        }
        for (Request next2 : list2) {
            if (hashMap.containsKey(next2.getId())) {
                RequestData requestData = (RequestData) hashMap.get(next2.getId());
                hashMap.put(requestData.getId(), RequestData.create(requestData.getId(), next2.getCommentCount().intValue(), requestData.getReadCommentCount()));
            } else {
                hashMap.put(next2.getId(), RequestData.create(next2));
            }
        }
        return new ArrayList(hashMap.values());
    }

    public List<RequestData> getRequestData() {
        RequestDataList requestDataList;
        checkForAndMigrateLegacyRequestData();
        synchronized (this.lock) {
            requestDataList = (RequestDataList) this.storage.get(REQUESTS_DATA_KEY, RequestDataList.class);
        }
        if (requestDataList != null) {
            return requestDataList.requestDataList;
        }
        return new ArrayList(0);
    }

    public boolean isRequestDataExpired() {
        String str;
        long j;
        boolean z;
        synchronized (this.lock) {
            str = this.storage.get(TIMESTAMP_KEY);
        }
        if (str == null) {
            j = 0;
        } else {
            j = Long.parseLong(str);
        }
        if (Math.abs(System.currentTimeMillis() - j) > HOUR_IN_MILLIS) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Logger.m57302a("Returning Read Requests from cache. Cached Read Requests will expire in %s", HOURS_MINUTES_FORMAT.format(Long.valueOf(j)));
        }
        return z;
    }

    public void markRequestAsRead(String str, int i) {
        synchronized (this.lock) {
            List<RequestData> requestData = getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData next : requestData) {
                if (str.equals(next.getId())) {
                    arrayList.add(RequestData.create(next.getId(), i, i));
                } else {
                    arrayList.add(next);
                }
            }
            storeRequestData(arrayList);
        }
    }

    public void markRequestAsUnread(String str) {
        synchronized (this.lock) {
            List<RequestData> requestData = getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData next : requestData) {
                if (str.equals(next.getId())) {
                    arrayList.add(RequestData.create(str, next.getCommentCount() + 1, next.getReadCommentCount()));
                } else {
                    arrayList.add(next);
                }
            }
            storeRequestData(arrayList);
        }
    }

    public void storeRequestData(List<RequestData> list) {
        if (list != null) {
            synchronized (this.lock) {
                this.storage.put(REQUESTS_DATA_KEY, (Object) new RequestDataList(list));
                this.storage.put(TIMESTAMP_KEY, Long.toString(System.currentTimeMillis()));
            }
        }
    }

    public void updateRequestData(List<Request> list) {
        synchronized (this.lock) {
            storeRequestData(updateRequests(getRequestData(), list));
        }
    }
}
