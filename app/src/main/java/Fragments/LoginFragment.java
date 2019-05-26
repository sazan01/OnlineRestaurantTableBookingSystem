package Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.onlinerestauranttablebooking.R;

public class LoginFragment extends Fragment {
    private EditText userlogin, passwordlogin;
    private Button btnlogin;

    public LoginFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout., container, false);

        userlogin = view.findViewById(R.id.etusername);
        passwordlogin = view.findViewById(R.id.etpassword);
        btnlogin = view.findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }

            private void Login() {
            }
        });
        return view;
    }
}
