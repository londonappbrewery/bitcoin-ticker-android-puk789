package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Kajo on 09/02/2018.
 */

public class TrackerDataModel {

    private String mPriceLabel;

    public static TrackerDataModel compileJson(JSONObject jsonData) {
        try {
            TrackerDataModel trackerData = new TrackerDataModel();
            trackerData.mPriceLabel = jsonData.getString("ask");
            return trackerData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPriceLabel() {
        return mPriceLabel;
    }
}
