package android;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Map;

public class CampaignParameter extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equalsIgnoreCase("getUtmInfo")) {

            getCampaignParameterInfo(cordova, callbackContext);
            return true;
        } else if (action.equalsIgnoreCase("clearUtmInfo")) {

            clearCampaignParameterInfo(cordova, callbackContext);
        }

        return false;
    }

  private static void getCampaignParameterInfo(CordovaInterface cordova, CallbackContext callbackContext)  {
    try {
      
        PlayStoreInstallReferrer playStoreInstallreferrer = new PlayStoreInstallReferrer();
            playStoreInstallreferrer.start(cordova.getActivity(), new InstallReferrerListener() {
                @Override
                public void onHandlerReferrer(Map<String, String> properties) {

                    callbackContext.success(new JSONObject(properties));
                }
            });
    } catch (Exception e)
    {
        callbackContext.error(e.getMessage());
    }

}

    private static void clearCampaignParameterInfo(CordovaInterface cordova, CallbackContext callbackContext) {
        try {
            callbackContext.success();
        } catch (Exception e) {
            callbackContext.error(e.getMessage());
        }

    }

}