package com.example.navapp;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        Button btn=getView().findViewById(R.id.button);
        EditText editText=getView().findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*
So here we are going to make use of the controllers.
So now controller is an object that manages that app navigation within a nav host.
Enough controller orchestrate that swapping of destination content in the Navajos as the users move
throughout your app.
 */
                Navigation.findNavController(view).navigate(MainFragmentDirections.mainToSecond().setUserName(editText.getText().toString()));
                /*
                So guys, I want from you to understand, whenever you make the argument here, we can use the set method
directly in the argument of the second fragment by getting its set username.
So you get the getters and setters auto generated by using the arguments here.
So guys, I hope you understand this.
                 */
            }
        });
    }

}