package comshaoqingliu.httpsgithub.Instagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import comshaoqingliu.httpsgithub.helloworld.R;

public class ProfileActivity extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        gridView = findViewById(R.id.profile_gridView);
        gridView.setAdapter(new ProfileGridViewAdapter(ProfileActivity.this, UploadedImage));
    }

    public static String[] UploadedImage = {
            "https://cdn.shopify.com/s/files/1/0787/5255/products/bando-il-all_around_giant_circle_towel-watermelon-02.jpg?v=1520470527",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRG1C3EZxYiCPNKf7mi3lXE33eFF71v-SKTvxyuKwFRrwlm_T7o",
            "https://www.houseofparty.com.au/wp-content/uploads/2016/06/balloon-large-foil-watermelon.jpg",
            "https://leoandbella.com.au/wp-content/uploads/2017/11/wally-the-watermelon.jpg",
            "https://img.purch.com/w/660/aHR0cDovL3d3dy5zcGFjZS5jb20vaW1hZ2VzL2kvMDAwLzAwNS82NDQvb3JpZ2luYWwvbW9vbi13YXRjaGluZy1uaWdodC0xMDA5MTYtMDIuanBn",
            "https://leoandbella.com.au/wp-content/uploads/2017/11/wally-the-watermelon.jpg",
            "https://leoandbella.com.au/wp-content/uploads/2017/11/wally-the-watermelon.jpg",
            "https://leoandbella.com.au/wp-content/uploads/2017/11/wally-the-watermelon.jpg",
            "https://leoandbella.com.au/wp-content/uploads/2017/11/wally-the-watermelon.jpg",
            "https://leoandbella.com.au/wp-content/uploads/2017/11/wally-the-watermelon.jpg",

    };

}
