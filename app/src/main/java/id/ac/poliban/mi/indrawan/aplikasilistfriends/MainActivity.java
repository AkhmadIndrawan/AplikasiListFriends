package id.ac.poliban.mi.indrawan.aplikasilistfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> friends = new ArrayList<>();
    {
        friends.add("Ahmad Irfan");
        friends.add("Akhmad Indrawan");
        friends.add("Andre Ramadhandy");
        friends.add("Andri Sudarman");
        friends.add("Diana");
        friends.add("Gina Melati Addini");
        friends.add("Iffa Nafiatunnisa");
        friends.add("Lidya Lusiana");
        friends.add("Melisa Arianie");
        friends.add("Muhammad Ade Setiawan");
        friends.add("Purnama");
        friends.add("Radhika Rahmadani");
        friends.add("Rafi'i Hidayat Nor");
        friends.add("Renaldy Kambayu");
        friends.add("Sarwan");
        friends.add("Thasya Ismayanti Novianda");
        friends.add("Yunita Rahmah");
        friends.add("Rezal Alfansyah");
        friends.add("Agustya Fazriani");
        friends.add("Ratu Hana Yunita");
        friends.add("M Rizky Maulana");
        friends.add("Radiansyah");
        friends.add("Taufan Ryanda Utama");
        friends.add("Maghfirah Maulidya");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ubah judul di Action Bar
        if (getSupportActionBar() !=null)
            setTitle("Aplikasi List Friends");

        //daftarkan view untuk dimanipulasi
        ListView listView = findViewById(R.id.list_view);

        //buat adapter
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
        R.layout.item_rows_friends, R.id.tv_item_friends, friends);

        listView.setAdapter(adapter);

        //event handling (jangan lupa aktifkan java 1.8 )
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "anda mengklik nama " +
                    friends.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}
