package com.matisoft.tp4mdiaz_matias_nicolas.ui.MiFoto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import com.matisoft.tp4mdiaz_matias_nicolas.R;
import com.matisoft.tp4mdiaz_matias_nicolas.databinding.FragmentHomeBinding;
import com.matisoft.tp4mdiaz_matias_nicolas.modelo.Usuario;

public class HomeFragment extends Fragment {
    //private MutableLiveData<Usuario> usuarioM;

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.tvNombre.setText("Matias");
        binding.tvTelefono.setText("2657547868");
        binding.imageView.setImageResource(R.drawable.foto);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}