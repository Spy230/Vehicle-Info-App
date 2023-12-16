package com.msaggik.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.msaggik.myapplication.entity.*;

public class MainActivity extends AppCompatActivity {

    private EditText maxSpeedInput, heightInput, capacityInput , carTypeInput;
    private Button button;
    private TextView infoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        infoApp = findViewById(R.id.infoApp);
        carTypeInput = findViewById(R.id.carType);
        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String carType = carTypeInput.getText().toString();

            cars car;
            switch (carType) {
                case "легковой":
                    car = new PassengerCar();
                    break;
                case "грузовой":
                    car = new Truck();
                    break;
                case "микроавтобус":
                    car = new MicroBus();
                    break;
                default:
                    infoApp.setText("Неизвестный тип автомобиля");
                    return;
            }

            // Displaying information in infoApp TextView
            infoApp.setText("Максимальная скорость: " + car.getMaxSpeed() +
                    ", Вместимость: " + car.getCapacity() +
                    ", Вес: " + car.getWeight());
        }
    };
}
