package Users;

import static AppData.Settings.appSettings;

public class Properties {
    public static final String email = AppData.Core.IniGet(appSettings, "USER_API", "email");
    public static final String firstName = AppData.Core.IniGet(appSettings, "USER_API", "first");
    public static final String lastName = AppData.Core.IniGet(appSettings, "USER_API", "last");
    public static final String role = AppData.Core.IniGet(appSettings, "USER_API", "role");
    public static final String scope = AppData.Core.IniGet(appSettings, "USER_API", "scope");

}
