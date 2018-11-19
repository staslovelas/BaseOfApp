package com.apps.marsellus.baseofapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

public class AppDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        String id = getArguments().getString("id");
        String txt = getArguments().getString("txt");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(id)
                .setMessage(txt)
                .setNegativeButton("Ok", null);
        return builder.create();
    }
}
