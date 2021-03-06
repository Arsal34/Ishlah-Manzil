package com.example.islahmanzilagain;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import API.IslahManzil;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FurnitureTransfer#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FurnitureTransfer extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public MainCat myContext;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FurnitureTransfer() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FurnitureTransfer.
     */
    // TODO: Rename and change types and number of parameters
    public static FurnitureTransfer newInstance(String param1, String param2) {
        FurnitureTransfer fragment = new FurnitureTransfer();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_furniture_transfer, container, false);
        Button butt = (Button)  root.findViewById(R.id.next);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Spinner sp = (Spinner) root.findViewById(R.id.area10);
                Spinner sp2 = (Spinner) root.findViewById(R.id.service10);
                String newData = "FURNITURE TRANSFER!@#" + sp.getSelectedItem().toString()+"!@#"+sp2.getSelectedItem().toString()+"^";
                IslahManzil.getIslah().M[IslahManzil.screennum - 1].setSting(IslahManzil.getIslah().M[IslahManzil.screennum - 1].getSting() + newData);

                Map mp = new Map();
                mp.myContext = myContext;
                myContext.getSupportFragmentManager().beginTransaction().replace(R.id.fml, mp).commit();
            }
        });
        return root;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}