package com.javierviveros.tableroelectronico;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.javierviveros.tableroelectronico.R;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Text.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Text#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TextDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View v = inflater.inflate(R.layout.dialog_text, null);

        builder.setView(v);

        Button positive_button = (Button) v.findViewById(R.id.ok_boton);
        final EditText messengr = (EditText) v.findViewById(R.id.msg_input);


        positive_button.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.msg_show.setText(messengr.getText());
                    msgToast("Mensaje Guardado");
                    dismiss();
                }
            }
        );

        return builder.create();
    }

    private void msgToast(String s){
        Toast.makeText(getActivity().getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}
