package com.example.skylights.represent;

import com.loopj.android.http.*;

/**
 * Created by skylights on 3/12/2016.
 */

public class TwitterRestClient {
    private static final String BASE_URL = "https://api.twitter.com/1.1/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
