package com.tegnosis.abc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Rupal on 5/29/2015.
 */
public class Detail_Letter_Fragment extends Fragment {

    int i;
    int [] ids = new int[]{R.drawable.letter_a,R.drawable.letter_b,R.drawable.letter_c,R.drawable.letter_d,
                           R.drawable.letter_e,R.drawable.letter_f,R.drawable.letter_g,R.drawable.letter_h,
                           R.drawable.letter_i,R.drawable.letter_j,R.drawable.letter_k,R.drawable.letter_l,
                           R.drawable.letter_m,R.drawable.letter_n,R.drawable.letter_o,R.drawable.letter_p,
                           R.drawable.letter_q,R.drawable.letter_r,R.drawable.letter_s,R.drawable.letter_t,
                           R.drawable.letter_u,R.drawable.letter_v,R.drawable.letter_w,R.drawable.letter_x,
                           R.drawable.letter_y,R.drawable.letter_z};

    private ImageView detailLetterImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        i = this.getArguments().getInt("i");

        View view;
        view = inflater.inflate(R.layout.detail_letter_fragment,container,false);

        detailLetterImageView = (ImageView)view.findViewById(R.id.detail_letterImageView);
        detailLetterImageView.setImageResource(ids[i]);
        return view;
    }
}
