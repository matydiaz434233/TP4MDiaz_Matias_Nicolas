package com.matisoft.tp4mdiaz_matias_nicolas.ui.LLamar;

import static androidx.core.content.PermissionChecker.checkSelfPermission;

import android.Manifest;
import android.content.pm.PackageManager;
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

    private static final int REQUEST_CALL_PHONE_PERMISSION = 1;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(LlamarViewModel.class);
        binding = FragmentLlamarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Antes de realizar la llamada, verifica si tienes el permiso CALL_PHONE
                if (chequeaPermiso(Manifest.permission.CALL_PHONE, REQUEST_CALL_PHONE_PERMISSION)) {
                    // Tienes permiso, puedes realizar la acción aquí
                    startActivity(vm.telefono(binding.idNumero.getText().toString()));
                }
            }
        });

        return root;
    }

    // Método para verificar si tienes permiso
    private boolean chequeaPermiso(String permission, int requestCode) {
        if (ContextCompat.checkSelfPermission(requireContext(), permission) != PackageManager.PERMISSION_GRANTED) {
            // Si el permiso no ha sido concedido, solicítalo
            ActivityCompat.requestPermissions(requireActivity(), new String[]{permission}, requestCode);
            return false;
        }
        return true;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}