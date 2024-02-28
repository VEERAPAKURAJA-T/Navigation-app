package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        SecondFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public Void onFragmentInteraction(Uri uri) {
        return null;
    }
}
/*
In larger project you can have multiple navigation graphs.
In this small project, the destination fragments within the navigation graph supposed to appear in
the content area here.
I'm in the content area here with and the main activity.
Therefore, we need to declare a navigation fragment or navigation host fragment within the main activity.
 */
    /*
We have created the navigation graph.
        The second step is creating the nav host.
        What is nav host?
        And it's an empty container that displays the destinations from your navigation graph.
        Then navigation component contains a default nav host implementation nav host fragment that displays
        the fragment destination how to add it.
        Since our host our main activity, our starting activity is the main activity.

     */
/*
What does this nav host do?
NAV host fragment provides a container where the navigation can occur and will also be responsible for
moving fragments in and out as the user like a switch and a user navigate between them.
 */
/*
Every navigation graph must have a start destination.
The start destination is the screen that is displayed for the user when the app is launched.
Okay.
So I will use the main frame
 */