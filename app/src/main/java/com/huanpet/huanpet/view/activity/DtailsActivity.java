package com.huanpet.huanpet.view.activity;



import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.huanpet.huanpet.R;
import com.huanpet.huanpet.bean.DetailsBase;
import com.huanpet.huanpet.bean.JiYnagDetailsBaseadapter;
import com.huanpet.huanpet.presenter.DatailsPresenter;
import com.huanpet.huanpet.presenter.contract.Contract;
import com.huanpet.huanpet.untils.CJSON;
import com.huanpet.huanpet.untils.CircleImageView;
import com.huanpet.huanpet.view.adapter.JiYangDetailsAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DtailsActivity extends AppCompatActivity implements Contract.DetailsView {
    @BindView(R.id.imagebigtop_details)
    ImageView imagebigtopDetails;
    @BindView(R.id.imageOver_details)
    CircleImageView imageOverDetails;
    @BindView(R.id.textName_details)
    TextView textNameDetails;
    @BindView(R.id.rating_details)
    RatingBar ratingDetails;
    @BindView(R.id.imagepinglun_details)
    ImageView imagepinglunDetails;
    @BindView(R.id.textpinlun_details)
    TextView textpinlunDetails;
    @BindView(R.id.textpinglunintent_details)
    TextView textpinglunintentDetails;
    @BindView(R.id.recytop_details)
    RecyclerView recytopDetails;
    @BindView(R.id.recybottom_details)
    RecyclerView recybottomDetails;
    @BindView(R.id.imagedizhi_details)
    ImageView imagedizhiDetails;
    @BindView(R.id.textdizhi_details)
    TextView textdizhiDetails;
    @BindView(R.id.textjieji_details)
    TextView textjiejiDetails;
    @BindView(R.id.buttonjiyang_details)
    Button buttonjiyangDetails;
    private String url = "http://123.56.150.230:8885/dog_family/users/getUsersInfos.jhtml";
    private ArrayList<JiYangDetailsAdapter> descBeans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtails);
        ButterKnife.bind(this);
        new DatailsPresenter(this).sendData(url, getCJson());

    }

    public String getCJson() {
        Map<String, Object> map = new HashMap<>();
        String userId = getIntent().getStringExtra("UserId");
        map.put("userId", userId);
        String s = CJSON.toJSONMap(map);
        return s;
    }


    @Override
    public void UpdataUi(final DetailsBase.DescBean t) {
        DtailsActivity.this.runOnUiThread(new Runnable() {

            private ArrayList<JiYnagDetailsBaseadapter> descBeans;
            private ArrayList<JiYnagDetailsBaseadapter> descBeans2;

            @Override
            public void run() {
                descBeans = new ArrayList<>();
                descBeans2 = new ArrayList<>();
                List<DetailsBase.DescBean.FosterServicesBean> fosterServices = t.getFosterServices();
                for (int i = 0; i < fosterServices.size(); i++) {
                    descBeans.add(new JiYnagDetailsBaseadapter(fosterServices.get(i).getTypeName(),fosterServices.get(i).getPetTypeImage(),"",fosterServices.get(i).getPetPrice()));
                }
                JiYangDetailsAdapter adapter1 = new JiYangDetailsAdapter(descBeans, DtailsActivity.this, 1);
                recytopDetails.setLayoutManager(new LinearLayoutManager(DtailsActivity.this,LinearLayoutManager.VERTICAL,false));
                recytopDetails.setAdapter(adapter1);

                List<DetailsBase.DescBean.FosterOtherServicesBean> forstotherServices = t.getFosterOtherServices();
                for (int i = 0; i < t.getFosterOtherServices().size(); i++) {
                    descBeans2.add(new JiYnagDetailsBaseadapter(forstotherServices.get(i).getPetTypeName(),forstotherServices.get(i).getServicePicture(),forstotherServices.get(i).getServiceName(),forstotherServices.get(i).getServicePrice()));
                }
                recybottomDetails.setLayoutManager(new LinearLayoutManager(DtailsActivity.this,LinearLayoutManager.VERTICAL,false));
                JiYangDetailsAdapter adapter2 = new JiYangDetailsAdapter(descBeans2, DtailsActivity.this, 2);
                recybottomDetails.setAdapter(adapter2);
                //用户头像
                String userImage = t.getFosterInfo().getUserImage();
                Bitmap bitmap = BitmapFactory.decodeFile(userImage);
                imageOverDetails.setImageBitmap(bitmap);
                //用户名字
                textNameDetails.setText(t.getFosterInfo().getUserName());
                //用户评价
                ratingDetails.setRating((float) t.getFosterGrade());
                ratingDetails.setStepSize((float) 0.5);
                textpinlunDetails.setText("寄养评论（"+t.getFosterCommentCount()+")");
                imagepinglunDetails.setImageResource(R.mipmap.evaluate);
                imageOverDetails.setImageResource(R.mipmap.ab);
            }
        });

    }
}
