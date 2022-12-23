package zendesk.core;

import fe0.C23342b;
import ge0.C23408a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ZendeskUserProvider implements UserProvider {
    private final UserService userService;

    static {
        new C23342b.C23344b<UserResponse, User>() {
            public /* bridge */ /* synthetic */ Object extract(Object obj) {
                extract((UserResponse) obj);
                return null;
            }

            public User extract(UserResponse userResponse) {
                userResponse.getUser();
                return null;
            }
        };
        new C23342b.C23344b<UserFieldResponse, List<Object>>() {
            public List<Object> extract(UserFieldResponse userFieldResponse) {
                return userFieldResponse.getUserFields();
            }
        };
        new C23342b.C23344b<UserResponse, Map<String, String>>() {
            public Map<String, String> extract(UserResponse userResponse) {
                if (userResponse != null) {
                    userResponse.getUser();
                }
                return C23408a.m57527b(new HashMap());
            }
        };
        new C23342b.C23344b<UserResponse, List<String>>() {
            public List<String> extract(UserResponse userResponse) {
                if (userResponse != null) {
                    userResponse.getUser();
                }
                return C23408a.m57526a(new ArrayList());
            }
        };
    }

    public ZendeskUserProvider(UserService userService2) {
        this.userService = userService2;
    }
}
