package com.matisoft.tp4mdiaz_matias_nicolas.ui.LLamar;

import static androidx.core.content.PermissionChecker.checkSelfPermission;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.matisoft.tp4mdiaz_matias_nicolas.databinding.FragmentLlamarBinding;
import com.matisoft.tp4mdiaz_matias_nicolas.ui.MiFoto.HomeViewModel;

public class LlamarFragment extends Fragment {

    private FragmentLlamarBinding binding;
    private LlamarViewModel vm;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(LlamarViewModel.class);
        binding = FragmentLlamarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numeroFinal = binding.idNumero.getText().toString();
                vm.telefono(numeroFinal);
            }
        });
        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}