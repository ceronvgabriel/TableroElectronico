package com.javierviveros.tableroelectronico;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.example.javierviveros.tableroelectronico.R;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Speed.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Speed#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SpeedDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] velocids = getResources().getStringArray(R.array.speedItems);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.selectSpeed)
                .setSingleChoiceItems(velocids, MainActivity.veloc, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.veloc = i;
                        msgToast("Velocidad "+ velocids[i] +" Seleccionada");
                        dialogInterface.cancel();
                    }
                });

        return builder.create();
    }


    private void msgToast(String s){
        Toast.makeText(getActivity().getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }

}
