package test.parkv001;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Vector;

public class Locations extends ActionBarActivity {

    String[] LocNames = {"UC Merced"};
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        printButtons();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void getlot(View v, String Name) {
        Intent bleh = new Intent(this, MainActivity.class);
        bleh.putExtra("Loc", Name);
        startActivity(bleh);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public boolean printButtons(/*You can put whatever input you want here, but run 'printButtons' in the onCreate function of the activity*/) {
        //This code can be used for any dynamic amount of any kind of UI elements
        //This tells us what part of the page we want to work with
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.mainContent);
//This creates at least one button so the other ones can go under it.
        Button planButton = new Button(getApplicationContext());

        //Some attributes of the button that you can change up. The important one is the setId line 3 lines down. If your app has an API level above 16, use View.generateViewID() instead of just generateViewID()
        planButton.setTextSize(14);
        planButton.setText(LocNames[0]);
        planButton.setId(View.generateViewId()); //This gives the button an unused ID so we can work with it and assign functions to it.
        planButton.setOnClickListener(new View.OnClickListener() { //It's here that you'd type in what you want this button to do; right now, it will just display a message.
            @Override
            public void onClick(View view) {
                getlot(view, LocNames[0]);
            }
        });

//This creates a spot for the button on the page
        RelativeLayout.LayoutParams meh = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);


        meh.addRule(RelativeLayout.CENTER_HORIZONTAL); //Puts it in middle of screen horizontally


        //Use array of ids that get assigned via planButton.setID()s
        meh.addRule(RelativeLayout.BELOW, R.id.button); //Puts it underneath the default button. THE SECOND ARGUMENT ASSUMES A BUTTON ALREADY EXISTS IN THE XML FILE. You can actually put it underneath any UI element (like the title of the page/activity), but I put it under a grey button just for testing

        planButton.setLayoutParams(meh); //This assigns everything we just said as attributes to the button
        layout.addView(planButton); //This actually adds it to the page/activity

        //Try to create a series of buttons from here.
        Vector<Button> heynow = new Vector<Button>(0, 1);
        heynow.add(planButton);
        for (int hey = 1; hey < 1; hey++) {

            planButton = new Button(getApplicationContext());

            planButton.setTextSize(14);
            planButton.setText(LocNames[hey]); //This tells us what each button was
            planButton.setId(View.generateViewId());
            //Use onClickListener to take user to page with schedule displayed
            final int finalHey = hey;
            planButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getlot(view, LocNames[finalHey]);
                }
            });

            meh = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);//This asks for new room to make a button so it doesn't override anything


            meh.addRule(RelativeLayout.CENTER_HORIZONTAL);
            //Use array of ids that get assigned via planButton.setID()s
            meh.addRule(RelativeLayout.BELOW, heynow.get(hey).getId()); //Puts it underneath the previously created button.

            planButton.setLayoutParams(meh);
            layout.addView(planButton);
            heynow.add(planButton);
        }
//Based automatic garbage collection (we don't have to delete anything like the vector)
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Locations Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://test.parkv001/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }


    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction2 = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Locations Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://test.parkv001/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction2);
        client.disconnect();
    }
}
