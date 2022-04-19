package com.example.andinun_uts;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String mTitle[] = {"Ayo Dance", "Crossfire", "Idol Street", "Point Blank", "Rising Force"};
    String mDescription[] = {"Game Audition Ayo Dance merupakan game online yang berasal dari Korea Selatan dan dibawa sejak tahun 2007 oleh Megaxus ke Indonesia. Keberadaan game dengan tema yang masih cukup baru saat itu telah berhasil menyedot animo pencinta game tanah air.",
            "Cross-fire adalah sebuah permainan video tembak-menembak orang-pertama yang dibuat oleh perusahaan game di Korea, yaitu Neowiz dan Smilegate lalu disambungkan ke sebuah server di Indonesia sehingga bisa dimainkan di Indonesia.",
            "Idol Street adalah label rekaman dan musik proyek Jepang yang mengkhususkan diri dalam berhala. Ini diluncurkan oleh Avex pada tanggal 2 Oktober 2010 sebagai label rekaman idola berdedikasi. Artis pertama pada label baru adalah grup idola Super Girls, yang dibentuk pada Juni 2010.",
            "Point Blank adalah sebuah permainan komputer ber-genre FPS yang dimainkan secara online/offline. Permainan ini dikembangkan oleh Zepetto dari Korea Selatan dan dipublikasikan oleh Zepetto.",
            "RF online adalah permainan video daring dengan nuansa gabungan antara fantasi dan masa depan dengan tema yang menarik. Bermula di suatu galaxy bernama NOVUS pemain bisa memilih salah satu dari 3 bangsa yang ada untuk memakmurkan bangsa tersebut dan bertempur untuk menaklukan seluruh jagat."};
    int images[] = {R.drawable.ayodance, R.drawable.cf, R.drawable.ids, R.drawable.pb, R.drawable.rf};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), DescApps.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    // also put your position
                    intent.putExtra("position", ""+0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), DescApps.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), DescApps.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), DescApps.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), DescApps.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}