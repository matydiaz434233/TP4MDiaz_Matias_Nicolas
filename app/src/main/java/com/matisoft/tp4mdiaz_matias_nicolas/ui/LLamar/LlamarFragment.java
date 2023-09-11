package com.matisoft.tp4mdiaz_matias_nicolas.ui.LLamar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.matisoft.tp4mdiaz_matias_nicolas.databinding.FragmentLlamarBinding;
import com.matisoft.tp4mdiaz_matias_nicolas.ui.MiFoto.HomeViewModel;

public class LlamarFragment extends Fragment {

    private FragmentLlamarBinding binding;
    private LlamarViewModel vm;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LlamarViewModel llamarViewModel =
                new ViewModelProvider(this).get(LlamarViewModel.class);

        binding = FragmentLlamarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       // final TextView textView = binding.idNumero;
        //llamarViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        binding.btLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(vm.telefono(binding.idNumero.toString()));
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