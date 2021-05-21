package goldi.maurya.chintuwaliapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import goldi.maurya.chintuwaliapp.defination.User;

// Execution class for the Android App
public class MainActivity extends AppCompatActivity {
    //main() method for the Android App
    EditText nameEditText;
    EditText emailEditText;
    EditText phoneNumberEditText;
    EditText passwordEditText;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEditText = findViewById(R.id.nameEditView);
        EditText emailEditText = findViewById(R.id.emailEditView);
        EditText phoneNumberEditText =findViewById(R.id.phoneNumberEditText);
        EditText passwordEditText =findViewById(R.id.passwordEditView);


        Button registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }

              });
    }
    private void createUser() {
        User user = initializerUserDetails(nameEditText,
                emailEditText,
                phoneNumberEditText,
                passwordEditText);

        Toast.makeText(MainActivity.this,
                user.toString() + "has been created ",
                Toast.LENGTH_SHORT).show();
    }

    private User initializerUserDetails(EditText nameEditText, EditText emailEditText, EditText phoneNumberEditText, EditText passwordEditText) {
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String  phone= phoneNumberEditText.getText().toString();
        String password= passwordEditText.getText().toString();
        User user = new User(name,email,phone,password);
        return user;
    }

}
