package com.example.javierviveros.tableroelectronico;

import android.support.v4.app.DialogFragment;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Speed.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Speed#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SpeedDialog extends DialogFragment {
       /* private String[] velocids = getResources().getStringArray(R.array.speedItems);

    public DirectionDialog() {    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return radioDirectionDialog();

    }

    public AlertDialog radioDirectionDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.selectSpeed)
                .setSingleChoiceItems(velocids, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        msgToast("Velocidad "+ velocids[i] +" Seleccionada");
                    }
                });

        return builder.create();
    }

    private void msgToast(String s){
        Toast.makeText(getActivity().getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
*/
}
