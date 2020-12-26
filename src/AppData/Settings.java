package AppData;


public class Settings {

    // Common
    public static final String appSettings = "c:\\temp\\install-automation.ini";
    public static final String workPath = AppData.Core.IniGet(appSettings, "COMMON", "WORK_CFG");
    public static final String viewCfg = AppData.Core.IniGet(appSettings, "COMMON", "VIEW_CFG");
    public static final String viewSpcCfg = AppData.Core.IniGet(appSettings, "COMMON", "VIEW_CFG-SPECIAL");
    public static final String procCfg = AppData.Core.IniGet(appSettings, "COMMON", "PROC_CFG");
    public static final String vsaCfg = AppData.Core.IniGet(appSettings, "COMMON", "VSA_CFG");
    public static final String dirApp = AppData.Core.IniGet(appSettings, "COMMON", "DIR_APPLICATION");
    public static final String dirCust = AppData.Core.IniGet(appSettings, "COMMON", "DIR_CUSTOMERS");
    public static final String dirImports = AppData.Core.IniGet(appSettings, "COMMON", "DIR_IMPORTS");
    public static final String dirTools = AppData.Core.IniGet(appSettings, "COMMON", "DIR_TOOLS");
    public static final String dirDownloads = AppData.Core.IniGet(appSettings, "COMMON", "DIR_DOWNLOADS");
    public static final String envLogs = AppData.Core.IniGet(appSettings, "COMMON", "ENV_LOGS");
    public static final String patchTarget = AppData.Core.IniGet(appSettings, "COMMON", "PPOLTARGET");
    public static final String customFieldMap = AppData.Core.IniGet(appSettings, "COMMON", "CFIELDMAP");

    // Kaseya files
    public static final String svrRoot = AppData.Core.IniGet(
            appSettings, "KASEYA_FILES", "server_root");
    public static final String appRoot = AppData.Core.IniGet(
            appSettings, "KASEYA_FILES", "application_root");
    public static final String dirMsp = AppData.Core.IniGet(
            appSettings, "KASEYA_FILES", "dir_msp");
    public static final String mspbFolder = AppData.Core.IniGet(
            appSettings, "KASEYA_FILES", "mspb_folder");
    public static final String custFolder = AppData.Core.IniGet(
            appSettings, "KASEYA_FILES", "cust_folder");

}
