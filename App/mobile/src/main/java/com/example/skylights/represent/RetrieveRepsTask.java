package com.example.skylights.represent;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by skylights on 3/10/2016.
 */
public class RetrieveRepsTask {

//    private Exception exception;
//
//    protected void onPreExecute() {
//        progressBar.setVisibility(View.VISIBLE);
//        responseView.setText("");
//    }
//
//    protected String doInBackground(Void... urls) {
//        String email = emailText.getText().toString();
//        // Do some validation here
//
//        try {
//            URL url = new URL(API_URL + "email=" + email + "&apiKey=" + API_KEY);
//            HttpURLConnection  urlConnection = (HttpURLConnection) url.openConnection();
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//                StringBuilder stringBuilder = new StringBuilder();
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    stringBuilder.append(line).append("\n");
//                }
//                bufferedReader.close();
//                return stringBuilder.toString();
//            }
//            finally{
//                urlConnection.disconnect();
//            }
//        }
//        catch(Exception e) {
//            Log.e("ERROR", e.getMessage(), e);
//            return null;
//        }
//    }
//
//    protected void onPostExecute(String response) {
//        if(response == null) {
//            response = "THERE WAS AN ERROR";
//        }
//        progressBar.setVisibility(View.GONE);
//        Log.i("INFO", response);
//        responseView.setText(response);
//    }
//}
}
