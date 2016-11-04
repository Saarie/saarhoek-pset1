package com.example.saar.saarhoek_pset1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onChecked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // for every image except body, hide and view
        switch (view.getId()) {
            case R.id.checkArms:
                ImageView arms = (ImageView) findViewById(R.id.imgArms);
                if (checked)
                {
                    arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBrows:
                ImageView brows = (ImageView) findViewById(R.id.imgBrows);
                if (checked)
                {
                    brows.setVisibility(View.VISIBLE);
                }
                else
                {
                    brows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEars:
                ImageView ears = (ImageView) findViewById(R.id.imgEars);
                if (checked)
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEyes:
                ImageView eyes = (ImageView) findViewById(R.id.imgEyes);
                if (checked)
                {
                    eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkHat:
                ImageView hat = (ImageView) findViewById(R.id.imgHat);
                if (checked)
                {
                    hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkGlasses:
                ImageView glasses = (ImageView) findViewById(R.id.imgGlasses);
                if (checked)
                {
                    glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkNose:
                ImageView nose = (ImageView) findViewById(R.id.imgNose);
                if (checked)
                {
                    nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkMouth:
                ImageView mouth = (ImageView) findViewById(R.id.imgMouth);
                if (checked)
                {
                    mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkStach:
                ImageView stach = (ImageView) findViewById(R.id.imgStach);
                if (checked)
                {
                    stach.setVisibility(View.VISIBLE);
                }
                else
                {
                    stach.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkShoes:
                ImageView shoes = (ImageView) findViewById(R.id.imgShoes);
                if (checked)
                {
                    shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
