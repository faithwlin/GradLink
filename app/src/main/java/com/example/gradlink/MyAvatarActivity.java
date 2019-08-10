package com.example.gradlink;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;



public class MyAvatarActivity extends NavigationActivity implements View.OnClickListener {

    public ImageView FIVFaceO;
    public ImageView FIVFaceR;
    public ImageView FIVFaceS;
    public ImageView FIVFaceT;

    public ImageView MIVFaceO;
    public ImageView MIVFaceR;
    public ImageView MIVFaceS;
    public ImageView MIVFaceT;


    public ImageView FIVHair1;
    public ImageView FIVHair2;
    public ImageView FIVHair3;
    public ImageView FIVHair4;
    public ImageView FIVHair5;
    public ImageView FIVHair6;

    public ImageView MIVHair1;
    public ImageView MIVHair2;
    public ImageView MIVHair3;
    public ImageView MIVHair4;
    public ImageView MIVHair5;
    public ImageView MIVHair6;

    public ImageView FIVClothes1;
    public ImageView FIVClothes2;
    public ImageView FIVClothes3;
    public ImageView FIVClothes4;
    public ImageView FIVClothes5;

    public ImageView MIVClothes1;
    public ImageView MIVClothes2;
    public ImageView MIVClothes3;
    public ImageView MIVClothes4;
    public ImageView MIVClothes5;
    public ImageView MIVClothes6;

    public ImageView MIVBeard1;
    public ImageView MIVBeard2;
    public ImageView MIVBeard3;
    public ImageView MIVBeard4;
    public ImageView MIVBeard5;

    public ImageView MIVMoustache1;
    public ImageView MIVMoustache2;
    public ImageView MIVMoustache3;

    public ImageView UIVGlasses1;
    public ImageView UIVGlasses2;
    public ImageView UIVGlasses3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
            this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_my_avatar, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.myavatarnav);


        //MALE FEMALE BUTTONS

        ImageView imageButtonMale = findViewById(R.id.maleButton);
        ImageView imageButtonFemale = findViewById(R.id.femaleButton);

        //MALE FEMALE BUTTONS ON CLICK LISTENERS
        imageButtonMale.setOnClickListener(this);
        imageButtonFemale.setOnClickListener(this);

        //ERASE BUTTON

        ImageView imageViewErase = findViewById(R.id.eraseButton);


        //ERASE ON CLICK LISTENER
        imageViewErase.setOnClickListener(this);

        //CHEATING

        ImageView cheatBlock1 = findViewById(R.id.Block1);
        ImageView cheatBlock2 = findViewById(R.id.Block2);
        ImageView cheatBlock3 = findViewById(R.id.Block3);

        //CHEAT ON CLICK LISTENER

        cheatBlock1.setOnClickListener(this);
        cheatBlock2.setOnClickListener(this);
        cheatBlock3.setOnClickListener(this);

        //FEM FACE PREVIEW

        FIVFaceO = findViewById(R.id.f_FaceOval);
        FIVFaceR = findViewById(R.id.f_FaceRound);
        FIVFaceS = findViewById(R.id.f_FaceSquare);
        FIVFaceT = findViewById(R.id.f_FaceTriangle);

        //FEM FACE SELECTION

        ImageView FIVSelectFaceO = findViewById(R.id.FImageView1);
        ImageView FIVSelectFaceR = findViewById(R.id.FImageView2);
        ImageView FIVSelectFaceS = findViewById(R.id.FImageView3);
        ImageView FIVSelectFaceT = findViewById(R.id.FImageView4);

        //FEM FACE SELECTION ON CLICK LISTENERS

        FIVSelectFaceO.setOnClickListener(this);
        FIVSelectFaceR.setOnClickListener(this);
        FIVSelectFaceS.setOnClickListener(this);
        FIVSelectFaceT.setOnClickListener(this);

        //MALE FACE PREVIEW

        MIVFaceO = findViewById(R.id.m_FaceOval);
        MIVFaceR = findViewById(R.id.m_FaceRound);
        MIVFaceS = findViewById(R.id.m_FaceSquare);
        MIVFaceT = findViewById(R.id.m_FaceTriangle);

        //MALE FACE SELECTION

        ImageView MIVSelectFaceO = findViewById(R.id.MImageView1);
        ImageView MIVSelectFaceR = findViewById(R.id.MImageView2);
        ImageView MIVSelectFaceS = findViewById(R.id.MImageView3);
        ImageView MIVSelectFaceT = findViewById(R.id.MImageView4);

        //MALE FACE SELECTION ON CLICK LISTENERS
//
        MIVSelectFaceO.setOnClickListener(this);
        MIVSelectFaceR.setOnClickListener(this);
        MIVSelectFaceS.setOnClickListener(this);
        MIVSelectFaceT.setOnClickListener(this);

        //DIFFERENT METHOD KMS


        //FEM HAIR PREVIEW

        FIVHair1 = findViewById(R.id.f_Hair1);
        FIVHair2 = findViewById(R.id.f_Hair2);
        FIVHair3 = findViewById(R.id.f_Hair3);
        FIVHair4 = findViewById(R.id.f_Hair4);
        FIVHair5 = findViewById(R.id.f_Hair5);
        FIVHair6 = findViewById(R.id.f_Hair6);

        //FEM HAIR SELECTION

        ImageView FIVSelectHair1 = findViewById(R.id.FHImageView1);
        ImageView FIVSelectHair2 = findViewById(R.id.FHImageView2);
        ImageView FIVSelectHair3 = findViewById(R.id.FHImageView3);
        ImageView FIVSelectHair4 = findViewById(R.id.FHImageView4);
        ImageView FIVSelectHair5 = findViewById(R.id.FHImageView5);
        ImageView FIVSelectHair6 = findViewById(R.id.FHImageView6);

        //FEM HAIR SELECTION SET ON CLICK LISTENERS

        FIVSelectHair1.setOnClickListener(this);
        FIVSelectHair2.setOnClickListener(this);
        FIVSelectHair3.setOnClickListener(this);
        FIVSelectHair4.setOnClickListener(this);
        FIVSelectHair5.setOnClickListener(this);
        FIVSelectHair6.setOnClickListener(this);

        //MALE HAIR PREVIEW

        MIVHair1 = findViewById(R.id.m_Hair1);
        MIVHair2 = findViewById(R.id.m_Hair2);
        MIVHair3 = findViewById(R.id.m_Hair3);
        MIVHair4 = findViewById(R.id.m_Hair4);
        MIVHair5 = findViewById(R.id.m_Hair5);
        MIVHair6 = findViewById(R.id.m_Hair6);

        //MALE HAIR SELECTION

        ImageView MIVSelectHair1 = findViewById(R.id.MHImageView1);
        ImageView MIVSelectHair2 = findViewById(R.id.MHImageView2);
        ImageView MIVSelectHair3 = findViewById(R.id.MHImageView3);
        ImageView MIVSelectHair4 = findViewById(R.id.MHImageView4);
        ImageView MIVSelectHair5 = findViewById(R.id.MHImageView5);
        ImageView MIVSelectHair6 = findViewById(R.id.MHImageView6);

        //MALE HAIR SELECTION ON CLICK LISTENERS

        MIVSelectHair1.setOnClickListener(this);
        MIVSelectHair2.setOnClickListener(this);
        MIVSelectHair3.setOnClickListener(this);
        MIVSelectHair4.setOnClickListener(this);
        MIVSelectHair5.setOnClickListener(this);
        MIVSelectHair6.setOnClickListener(this);

        //FEM CLOTHES PREVIEW

        FIVClothes1 = findViewById(R.id.f_ClothesBasicShirt);
        FIVClothes2 = findViewById(R.id.f_ClothesBlouse);
        FIVClothes3 = findViewById(R.id.f_ClothesRetro);
        FIVClothes4 = findViewById(R.id.f_ClothesShirt);
        FIVClothes5 = findViewById(R.id.f_ClothesSweater);

        //FEM CLOTHES SELECTION

        ImageView FIVSelectClothes1 = findViewById(R.id.FCImageView1);
        ImageView FIVSelectClothes2 = findViewById(R.id.FCImageView2);
        ImageView FIVSelectClothes3 = findViewById(R.id.FCImageView3);
        ImageView FIVSelectClothes4 = findViewById(R.id.FCImageView4);
        ImageView FIVSelectClothes5 = findViewById(R.id.FCImageView5);

        //FEM CLOTHES SELECTION ON CLICK LISTENERS

        FIVSelectClothes1.setOnClickListener(this);
        FIVSelectClothes2.setOnClickListener(this);
        FIVSelectClothes3.setOnClickListener(this);
        FIVSelectClothes4.setOnClickListener(this);
        FIVSelectClothes5.setOnClickListener(this);

        //MALE CLOTHES PREVIEW

        MIVClothes1 = findViewById(R.id.m_ClothesShirtBasic);
        MIVClothes2 = findViewById(R.id.m_ClothesShirtCasual);
        MIVClothes3 = findViewById(R.id.m_ClothesShirtFormal);
        MIVClothes4 = findViewById(R.id.m_ClothesShirtPlaid);
        MIVClothes5 = findViewById(R.id.m_Clothes_Sweater_Green);
        MIVClothes6 = findViewById(R.id.m_Clothes_Sweater_Grey);

        //MALE CLOTHES SELECTION

        ImageView MIVSelectClothes1 = findViewById(R.id.MCImageView1);
        ImageView MIVSelectClothes2 = findViewById(R.id.MCImageView2);
        ImageView MIVSelectClothes3 = findViewById(R.id.MCImageView3);
        ImageView MIVSelectClothes4 = findViewById(R.id.MCImageView4);
        ImageView MIVSelectClothes5 = findViewById(R.id.MCImageView5);
        ImageView MIVSelectClothes6 = findViewById(R.id.MCImageView6);

        //MALE CLOTHES SELECTION ON CLICK LISTENERS

        MIVSelectClothes1.setOnClickListener(this);
        MIVSelectClothes2.setOnClickListener(this);
        MIVSelectClothes3.setOnClickListener(this);
        MIVSelectClothes4.setOnClickListener(this);
        MIVSelectClothes5.setOnClickListener(this);
        MIVSelectClothes6.setOnClickListener(this);

        //FACIAL HAIR PREVIEW

        MIVBeard1 = findViewById(R.id.m_Beard1);
        MIVBeard2 = findViewById(R.id.m_Beard2);
        MIVBeard3 = findViewById(R.id.m_Beard3);
        MIVBeard4 = findViewById(R.id.m_Beard4);
        MIVBeard5 = findViewById(R.id.m_Beard5);

        MIVMoustache1 = findViewById(R.id.m_Moustache1);
        MIVMoustache2 = findViewById(R.id.m_Moustache2);
        MIVMoustache3 = findViewById(R.id.m_Moustache3);

        //FEM FACIAL HAIR SELECTION

        ImageView FIVSelectBeard1 = findViewById(R.id.FBImageView1);
        ImageView FIVSelectBeard2 = findViewById(R.id.FBImageView2);
        ImageView FIVSelectBeard3 = findViewById(R.id.FBImageView3);
        ImageView FIVSelectBeard4 = findViewById(R.id.FBImageView4);
        ImageView FIVSelectBeard5 = findViewById(R.id.FBImageView5);
        ImageView FIVSelectBeard6 = findViewById(R.id.FBImageView6);
        ImageView FIVSelectBeard7 = findViewById(R.id.FBImageView7);
        ImageView FIVSelectBeard8 = findViewById(R.id.FBImageView8);

        //FEM FACIAL HAIR SELECTION ON CLICK LISTENERS

        FIVSelectBeard1.setOnClickListener(this);
        FIVSelectBeard2.setOnClickListener(this);
        FIVSelectBeard3.setOnClickListener(this);
        FIVSelectBeard4.setOnClickListener(this);
        FIVSelectBeard5.setOnClickListener(this);
        FIVSelectBeard6.setOnClickListener(this);
        FIVSelectBeard7.setOnClickListener(this);
        FIVSelectBeard8.setOnClickListener(this);

        //MALE FACIAL HAIR SELECTION

        ImageView MIVSelectBeard1 = findViewById(R.id.MBImageView1);
        ImageView MIVSelectBeard2 = findViewById(R.id.MBImageView2);
        ImageView MIVSelectBeard3 = findViewById(R.id.MBImageView3);
        ImageView MIVSelectBeard4 = findViewById(R.id.MBImageView4);
        ImageView MIVSelectBeard5 = findViewById(R.id.MBImageView5);
        ImageView MIVSelectBeard6 = findViewById(R.id.MBImageView6);
        ImageView MIVSelectBeard7 = findViewById(R.id.MBImageView7);
        ImageView MIVSelectBeard8 = findViewById(R.id.MBImageView8);

        //MALE FACIAL HAIR SELECTION ON CLICK LISTENERS

        MIVSelectBeard1.setOnClickListener(this);
        MIVSelectBeard2.setOnClickListener(this);
        MIVSelectBeard3.setOnClickListener(this);
        MIVSelectBeard4.setOnClickListener(this);
        MIVSelectBeard5.setOnClickListener(this);
        MIVSelectBeard6.setOnClickListener(this);
        MIVSelectBeard7.setOnClickListener(this);
        MIVSelectBeard8.setOnClickListener(this);

        //GLASSES PREVIEW

        UIVGlasses1 = findViewById(R.id.u_GlassesAviator);
        UIVGlasses2 = findViewById(R.id.u_GlassesRound);
        UIVGlasses3 = findViewById(R.id.u_GlassesSquare);

        //FEM GLASSES SELECTION

        ImageView FIVSelectGlasses1 = findViewById(R.id.FGImageView1);
        ImageView FIVSelectGlasses2 = findViewById(R.id.FGImageView2);
        ImageView FIVSelectGlasses3 = findViewById(R.id.FGImageView3);

        //FEM GLASSES SELECTION ON CLICK LISTENER

        FIVSelectGlasses1.setOnClickListener(this);
        FIVSelectGlasses2.setOnClickListener(this);
        FIVSelectGlasses3.setOnClickListener(this);

        //MALE GLASSES SELECTION

        ImageView MIVSelectGlasses1 = findViewById(R.id.MGImageView1);
        ImageView MIVSelectGlasses2 = findViewById(R.id.MGImageView2);
        ImageView MIVSelectGlasses3 = findViewById(R.id.MGImageView3);

        //MALE GLASSES SELECTION SET ON CLICK LISTENERS

        MIVSelectGlasses1.setOnClickListener(this);
        MIVSelectGlasses2.setOnClickListener(this);
        MIVSelectGlasses3.setOnClickListener(this);



    }


    //SWITCH CASES
    @Override
    public void onClick(View view) {


        TabLayout tabLayout1 = findViewById(R.id.tabLayout_ID1);
        ViewPager viewPager1 = findViewById(R.id.viewPager1);
        final ViewPagerAdapter adapter1 = new ViewPagerAdapter(getSupportFragmentManager());

        TabLayout tabLayout2 = findViewById(R.id.tabLayout_ID2);
        ViewPager viewPager2 = findViewById(R.id.viewPager2);
        final ViewPagerAdapter adapter2 = new ViewPagerAdapter(getSupportFragmentManager());



        //CHANGE GENDER SWITCH CASES

        switch (view.getId()){

            //CHOOSE MALE
            case R.id.maleButton:

                if (tabLayout2.getVisibility() == View.GONE && viewPager2.getVisibility() == View.GONE) {
                    tabLayout2.setVisibility(View.GONE);
                    viewPager2.setVisibility(View.GONE);
                }


                adapter1.AddFragment(new FragmentMaleFace(), "Face");
                adapter1.AddFragment(new FragmentMaleHair(), "Hair");
                adapter1.AddFragment(new FragmentMaleClothing(), "Clothes");
                adapter1.AddFragment(new FragmentMaleBeard(),"Beard");
                adapter1.AddFragment(new FragmentMaleGlasses(), "Glasses");
                break;

            //CHOOSE FEMALE
            case R.id.femaleButton:

                if (tabLayout1.getVisibility() == View.GONE && viewPager1.getVisibility() == View.GONE) {
                    tabLayout1.setVisibility(View.GONE);
                    viewPager1.setVisibility(View.GONE);
                }

                adapter2.AddFragment(new FragmentFace(), "Face");
                adapter2.AddFragment(new FragmentHair(), "Hair");
                adapter2.AddFragment(new FragmentClothing(), "Clothes");
                adapter2.AddFragment(new FragmentBeard(), "Beard");
                adapter2.AddFragment(new FragmentGlasses(), "Glasses");

                break;

            case R.id.Block1:
                MIVHair2.setVisibility(View.VISIBLE);
                adapter1.AddFragment(new FragmentMaleFace(), "Face");
                adapter1.AddFragment(new FragmentMaleHair(), "Hair");
                adapter1.AddFragment(new FragmentMaleClothing(), "Clothes");
                adapter1.AddFragment(new FragmentMaleBeard(),"Beard");
                adapter1.AddFragment(new FragmentMaleGlasses(), "Glasses");
                break;

            case R.id.Block2:
                MIVClothes3.setVisibility(View.VISIBLE);
                adapter1.AddFragment(new FragmentMaleFace(), "Face");
                adapter1.AddFragment(new FragmentMaleHair(), "Hair");
                adapter1.AddFragment(new FragmentMaleClothing(), "Clothes");
                adapter1.AddFragment(new FragmentMaleBeard(),"Beard");
                adapter1.AddFragment(new FragmentMaleGlasses(), "Glasses");
                break;

            case R.id.Block3:
                MIVBeard4.setVisibility(View.VISIBLE);
                adapter1.AddFragment(new FragmentMaleFace(), "Face");
                adapter1.AddFragment(new FragmentMaleHair(), "Hair");
                adapter1.AddFragment(new FragmentMaleClothing(), "Clothes");
                adapter1.AddFragment(new FragmentMaleBeard(),"Beard");
                adapter1.AddFragment(new FragmentMaleGlasses(), "Glasses");
                break;

        }

        switch (view.getId()){
            case R.id.eraseButton:
                FIVFaceO.setVisibility(View.GONE);
                FIVFaceR.setVisibility(View.GONE);
                FIVFaceS.setVisibility(View.GONE);
                FIVFaceT.setVisibility(View.GONE);

                FIVHair1.setVisibility(View.GONE);
                FIVHair2.setVisibility(View.GONE);
                FIVHair3.setVisibility(View.GONE);
                FIVHair4.setVisibility(View.GONE);
                FIVHair5.setVisibility(View.GONE);
                FIVHair6.setVisibility(View.GONE);

                FIVClothes1.setVisibility(View.GONE);
                FIVClothes2.setVisibility(View.GONE);
                FIVClothes3.setVisibility(View.GONE);
                FIVClothes4.setVisibility(View.GONE);
                FIVClothes5.setVisibility(View.GONE);

                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);

                UIVGlasses1.setVisibility(View.GONE);
                UIVGlasses2.setVisibility(View.GONE);
                UIVGlasses3.setVisibility(View.GONE);

                MIVFaceO.setVisibility(View.GONE);
                MIVFaceR.setVisibility(View.GONE);
                MIVFaceS.setVisibility(View.GONE);
                MIVFaceT.setVisibility(View.GONE);

                MIVHair1.setVisibility(View.GONE);
                MIVHair2.setVisibility(View.GONE);
                MIVHair3.setVisibility(View.GONE);
                MIVHair4.setVisibility(View.GONE);
                MIVHair5.setVisibility(View.GONE);
                MIVHair6.setVisibility(View.GONE);

                MIVClothes1.setVisibility(View.GONE);
                MIVClothes2.setVisibility(View.GONE);
                MIVClothes3.setVisibility(View.GONE);
                MIVClothes4.setVisibility(View.GONE);
                MIVClothes5.setVisibility(View.GONE);
                MIVClothes6.setVisibility(View.GONE);


        }



        //FEM FACES SWITCH CASES
        switch (view.getId()) {

            //CHOOSE OVAL FACE
            case R.id.FImageView1:

                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        if (FIVFaceR.getVisibility() == View.VISIBLE || FIVFaceS.getVisibility() == View.VISIBLE || FIVFaceT.getVisibility() == View.VISIBLE){
                            FIVFaceR.setVisibility(View.GONE);
                            FIVFaceS.setVisibility(View.GONE);
                            FIVFaceT.setVisibility(View.GONE);
                        }

                        FIVFaceO.setVisibility(View.VISIBLE);
                    }
                });


                break;
        }

        switch (view.getId()) {
            //CHOOSE ROUND FACE
            case R.id.FImageView2:
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        if (FIVFaceO.getVisibility() == View.VISIBLE || FIVFaceS.getVisibility() == View.VISIBLE || FIVFaceT.getVisibility() == View.VISIBLE) {
                            FIVFaceO.setVisibility(View.GONE);
                            FIVFaceS.setVisibility(View.GONE);
                            FIVFaceT.setVisibility(View.GONE);
                        }

                        FIVFaceR.setVisibility(View.VISIBLE);
                    }
                });

                break;
        }

        switch (view.getId()) {
            //CHOOSE SQUARE FACE
            case R.id.FImageView3:
                if (FIVFaceO.getVisibility() == View.VISIBLE || FIVFaceR.getVisibility() == View.VISIBLE || FIVFaceT.getVisibility() == View.VISIBLE){
                    FIVFaceO.setVisibility(View.GONE);
                    FIVFaceR.setVisibility(View.GONE);
                    FIVFaceT.setVisibility(View.GONE);
                }

                FIVFaceS.setVisibility(View.VISIBLE);
                break;
        }

        switch (view.getId()) {
            //CHOOSE TRIANGLE FACE
            case R.id.FImageView4:
                if (FIVFaceO.getVisibility() == View.VISIBLE || FIVFaceR.getVisibility() == View.VISIBLE || FIVFaceS.getVisibility() == View.VISIBLE){
                    FIVFaceO.setVisibility(View.GONE);
                    FIVFaceR.setVisibility(View.GONE);
                    FIVFaceS.setVisibility(View.GONE);
                }

                FIVFaceT.setVisibility(View.VISIBLE);
                break;
        }


        //FEM HAIR SWITCH CASES
        switch (view.getId()){

            //CHOOSE HAIR ONE
            case R.id.FHImageView1:
                if (FIVHair2.getVisibility() == View.VISIBLE || FIVHair3.getVisibility() == View.VISIBLE || FIVHair4.getVisibility() == View.VISIBLE || FIVHair5.getVisibility() == View.VISIBLE || FIVHair6.getVisibility() == View.VISIBLE ) {
                    FIVHair2.setVisibility(View.GONE);
                    FIVHair3.setVisibility(View.GONE);
                    FIVHair4.setVisibility(View.GONE);
                    FIVHair5.setVisibility(View.GONE);
                    FIVHair6.setVisibility(View.GONE);
                }

                FIVHair1.setVisibility(View.VISIBLE);
                break;

            //CHOOSE HAIR TWO
            case R.id.FHImageView2:
                if (FIVHair1.getVisibility() == View.VISIBLE || FIVHair3.getVisibility() == View.VISIBLE || FIVHair4.getVisibility() == View.VISIBLE || FIVHair5.getVisibility() == View.VISIBLE || FIVHair6.getVisibility() == View.VISIBLE ) {
                    FIVHair1.setVisibility(View.GONE);
                    FIVHair3.setVisibility(View.GONE);
                    FIVHair4.setVisibility(View.GONE);
                    FIVHair5.setVisibility(View.GONE);
                    FIVHair6.setVisibility(View.GONE);
                }

                FIVHair2.setVisibility(View.VISIBLE);
                break;

            //CHOOSE HAIR THREE
            case R.id.FHImageView3:

                if (FIVHair1.getVisibility() == View.VISIBLE || FIVHair3.getVisibility() == View.VISIBLE || FIVHair4.getVisibility() == View.VISIBLE || FIVHair5.getVisibility() == View.VISIBLE || FIVHair6.getVisibility() == View.VISIBLE ) {
                    FIVHair1.setVisibility(View.GONE);
                    FIVHair2.setVisibility(View.GONE);
                    FIVHair4.setVisibility(View.GONE);
                    FIVHair5.setVisibility(View.GONE);
                    FIVHair6.setVisibility(View.GONE);

                }

                FIVHair3.setVisibility(View.VISIBLE);
                break;

            //CHOOSE HAIR FOUR
            case R.id.FHImageView4:

                if (FIVHair1.getVisibility() == View.VISIBLE || FIVHair2.getVisibility() == View.VISIBLE || FIVHair3.getVisibility() == View.VISIBLE || FIVHair5.getVisibility() == View.VISIBLE || FIVHair6.getVisibility() == View.VISIBLE ) {
                    FIVHair1.setVisibility(View.GONE);
                    FIVHair2.setVisibility(View.GONE);
                    FIVHair3.setVisibility(View.GONE);
                    FIVHair5.setVisibility(View.GONE);
                    FIVHair6.setVisibility(View.GONE);

                }

                FIVHair4.setVisibility(View.VISIBLE);
                break;

            //CHOOSE HAIR FIVE
            case R.id.FHImageView5:
                if (FIVHair1.getVisibility() == View.VISIBLE || FIVHair2.getVisibility() == View.VISIBLE || FIVHair3.getVisibility() == View.VISIBLE || FIVHair5.getVisibility() == View.VISIBLE || FIVHair6.getVisibility() == View.VISIBLE ) {
                    FIVHair1.setVisibility(View.GONE);
                    FIVHair2.setVisibility(View.GONE);
                    FIVHair3.setVisibility(View.GONE);
                    FIVHair4.setVisibility(View.GONE);
                    FIVHair6.setVisibility(View.GONE);

                }


                FIVHair5.setVisibility(View.VISIBLE);

                break;

            //CHOOSE HAIR SIX
            case R.id.FHImageView6:
                if (FIVHair1.getVisibility() == View.VISIBLE || FIVHair2.getVisibility() == View.VISIBLE || FIVHair3.getVisibility() == View.VISIBLE || FIVHair4.getVisibility() == View.VISIBLE || FIVHair5.getVisibility() == View.VISIBLE ) {
                    FIVHair1.setVisibility(View.GONE);
                    FIVHair2.setVisibility(View.GONE);
                    FIVHair3.setVisibility(View.GONE);
                    FIVHair4.setVisibility(View.GONE);
                    FIVHair5.setVisibility(View.GONE);
                }

                FIVHair6.setVisibility(View.VISIBLE);
                break;

        }

        //FEM CLOTHES SWITCH CASES
        switch (view.getId()){

            case R.id.FCImageView1:
                if (FIVClothes2.getVisibility() == View.VISIBLE || FIVClothes3.getVisibility() == View.VISIBLE || FIVClothes4.getVisibility() == View.VISIBLE || FIVClothes5.getVisibility() == View.VISIBLE) {
                    FIVClothes2.setVisibility(View.GONE);
                    FIVClothes3.setVisibility(View.GONE);
                    FIVClothes4.setVisibility(View.GONE);
                    FIVClothes5.setVisibility(View.GONE);
                }
                FIVClothes1.setVisibility(View.VISIBLE);
                break;

            case R.id.FCImageView2:
                if (FIVClothes1.getVisibility() == View.VISIBLE || FIVClothes2.getVisibility() == View.VISIBLE || FIVClothes4.getVisibility() == View.VISIBLE || FIVClothes5.getVisibility() == View.VISIBLE) {
                    FIVClothes1.setVisibility(View.GONE);
                    FIVClothes3.setVisibility(View.GONE);
                    FIVClothes4.setVisibility(View.GONE);
                    FIVClothes5.setVisibility(View.GONE);
                }
                FIVClothes1.setVisibility(View.GONE);
                FIVClothes2.setVisibility(View.VISIBLE);
                break;

            case R.id.FCImageView3:
                if (FIVClothes1.getVisibility() == View.VISIBLE || FIVClothes2.getVisibility() == View.VISIBLE || FIVClothes4.getVisibility() == View.VISIBLE || FIVClothes5.getVisibility() == View.VISIBLE) {
                    FIVClothes1.setVisibility(View.GONE);
                    FIVClothes2.setVisibility(View.GONE);
                    FIVClothes4.setVisibility(View.VISIBLE);
                    FIVClothes5.setVisibility(View.GONE);
                }
                FIVClothes1.setVisibility(View.GONE);
                FIVClothes2.setVisibility(View.GONE);
                FIVClothes3.setVisibility(View.VISIBLE);
                FIVClothes4.setVisibility(View.GONE);
                FIVClothes5.setVisibility(View.GONE);
                break;

            case R.id.FCImageView4:
                if (FIVClothes1.getVisibility() == View.VISIBLE || FIVClothes2.getVisibility() == View.VISIBLE || FIVClothes4.getVisibility() == View.VISIBLE || FIVClothes5.getVisibility() == View.VISIBLE) {
                    FIVClothes1.setVisibility(View.GONE);
                    FIVClothes2.setVisibility(View.GONE);
                    FIVClothes3.setVisibility(View.GONE);
                    FIVClothes5.setVisibility(View.GONE);
                }

                FIVClothes4.setVisibility(View.VISIBLE);

                break;

            case R.id.FCImageView5:
                if (FIVClothes1.getVisibility() == View.VISIBLE || FIVClothes2.getVisibility() == View.VISIBLE || FIVClothes4.getVisibility() == View.VISIBLE || FIVClothes5.getVisibility() == View.VISIBLE) {
                    FIVClothes1.setVisibility(View.GONE);
                    FIVClothes2.setVisibility(View.GONE);
                    FIVClothes3.setVisibility(View.GONE);
                    FIVClothes4.setVisibility(View.GONE);
                }

                FIVClothes5.setVisibility(View.VISIBLE);
                break;
        }

        //FEM FACIAL HAIR SWITCH CASES
        switch (view.getId()){

            case R.id.FBImageView1:
                MIVBeard1.setVisibility(View.VISIBLE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.FBImageView2:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.VISIBLE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.FBImageView3:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.VISIBLE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.FBImageView4:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.VISIBLE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.FBImageView5:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.VISIBLE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.FBImageView6:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.VISIBLE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.FBImageView7:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.VISIBLE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.FBImageView8:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.VISIBLE);
                break;

        }

        //FEM GLASSES SWITCH VIEW

        switch (view.getId()){

            case R.id.FGImageView1:
                UIVGlasses1.setVisibility(View.VISIBLE);
                UIVGlasses2.setVisibility(View.GONE);
                UIVGlasses3.setVisibility(View.GONE);
                break;

            case R.id.FGImageView2:
                UIVGlasses1.setVisibility(View.GONE);
                UIVGlasses2.setVisibility(View.VISIBLE);
                UIVGlasses3.setVisibility(View.GONE);
                break;

            case R.id.FGImageView3:
                UIVGlasses1.setVisibility(View.GONE);
                UIVGlasses2.setVisibility(View.GONE);
                UIVGlasses3.setVisibility(View.VISIBLE);
                break;
        }

        //MALE FACES SWITCH CASES

        switch (view.getId()){


            //CHOOSE OVAL FACE
            case R.id.MImageView1:
                MIVFaceO.setVisibility(View.VISIBLE);
                MIVFaceR.setVisibility(View.GONE);
                MIVFaceS.setVisibility(View.GONE);
                MIVFaceT.setVisibility(View.GONE);

                break;

            //CHOOSE ROUND FACE
            case R.id.MImageView2:
                MIVFaceO.setVisibility(View.GONE);
                MIVFaceR.setVisibility(View.VISIBLE);
                MIVFaceS.setVisibility(View.GONE);
                MIVFaceT.setVisibility(View.GONE);
                break;

            //CHOOSE SQUARE FACE
            case R.id.MImageView3:
                MIVFaceO.setVisibility(View.GONE);
                MIVFaceR.setVisibility(View.GONE);
                MIVFaceS.setVisibility(View.VISIBLE);
                MIVFaceT.setVisibility(View.GONE);
                break;

            //CHOOSE TRIANGLE FACE
            case R.id.MImageView4:
                MIVFaceO.setVisibility(View.GONE);
                MIVFaceR.setVisibility(View.GONE);
                MIVFaceS.setVisibility(View.GONE);
                MIVFaceT.setVisibility(View.VISIBLE);
                break;

            //DEFAULT IS OVAL
            default:
                MIVFaceO.setVisibility(View.VISIBLE);
                MIVFaceR.setVisibility(View.GONE);
                MIVFaceS.setVisibility(View.GONE);
                MIVFaceT.setVisibility(View.GONE);
        }

        //MALE HAIR SWITCH CASES
        switch (view.getId()){

            //CHOOSE HAIR ONE
            case R.id.MHImageView1:
                MIVHair1.setVisibility(View.VISIBLE);
                MIVHair2.setVisibility(View.GONE);
                MIVHair3.setVisibility(View.GONE);
                MIVHair4.setVisibility(View.GONE);
                MIVHair5.setVisibility(View.GONE);
                MIVHair6.setVisibility(View.GONE);
                break;

            //CHOOSE HAIR TWO
            case R.id.MHImageView2:
                MIVHair1.setVisibility(View.GONE);
                MIVHair2.setVisibility(View.VISIBLE);
                MIVHair3.setVisibility(View.GONE);
                MIVHair4.setVisibility(View.GONE);
                MIVHair5.setVisibility(View.GONE);
                MIVHair6.setVisibility(View.GONE);
                break;

            //CHOOSE HAIR THREE
            case R.id.MHImageView3:
                MIVHair1.setVisibility(View.GONE);
                MIVHair2.setVisibility(View.GONE);
                MIVHair3.setVisibility(View.VISIBLE);
                MIVHair4.setVisibility(View.GONE);
                MIVHair5.setVisibility(View.GONE);
                MIVHair6.setVisibility(View.GONE);
                break;

            //CHOOSE HAIR FOUR
            case R.id.MHImageView4:
                MIVHair1.setVisibility(View.GONE);
                MIVHair2.setVisibility(View.GONE);
                MIVHair3.setVisibility(View.GONE);
                MIVHair4.setVisibility(View.VISIBLE);
                MIVHair5.setVisibility(View.GONE);
                MIVHair6.setVisibility(View.GONE);
                break;

            //CHOOSE HAIR FIVE
            case R.id.MHImageView5:
                MIVHair1.setVisibility(View.GONE);
                MIVHair2.setVisibility(View.GONE);
                MIVHair3.setVisibility(View.GONE);
                MIVHair4.setVisibility(View.GONE);
                MIVHair5.setVisibility(View.VISIBLE);
                MIVHair6.setVisibility(View.GONE);
                break;

            //CHOOSE HAIR SIX
            case R.id.MHImageView6:
                MIVHair1.setVisibility(View.GONE);
                MIVHair2.setVisibility(View.GONE);
                MIVHair3.setVisibility(View.GONE);
                MIVHair4.setVisibility(View.GONE);
                MIVHair5.setVisibility(View.GONE);
                MIVHair6.setVisibility(View.VISIBLE);
                break;

        }

        //MALE CLOTHES SWITCH CASES
        switch (view.getId()){

            case R.id.MCImageView1:
                MIVClothes1.setVisibility(View.VISIBLE);
                MIVClothes2.setVisibility(View.GONE);
                MIVClothes3.setVisibility(View.GONE);
                MIVClothes4.setVisibility(View.GONE);
                MIVClothes5.setVisibility(View.GONE);
                MIVClothes6.setVisibility(View.GONE);
                break;

            case R.id.MCImageView2:
                MIVClothes1.setVisibility(View.GONE);
                MIVClothes2.setVisibility(View.VISIBLE);
                MIVClothes3.setVisibility(View.GONE);
                MIVClothes4.setVisibility(View.GONE);
                MIVClothes5.setVisibility(View.GONE);
                MIVClothes6.setVisibility(View.GONE);
                break;

            case R.id.MCImageView3:
                MIVClothes1.setVisibility(View.GONE);
                MIVClothes2.setVisibility(View.GONE);
                MIVClothes3.setVisibility(View.VISIBLE);
                MIVClothes4.setVisibility(View.GONE);
                MIVClothes5.setVisibility(View.GONE);
                MIVClothes6.setVisibility(View.GONE);
                break;

            case R.id.MCImageView4:
                MIVClothes1.setVisibility(View.GONE);
                MIVClothes2.setVisibility(View.GONE);
                MIVClothes3.setVisibility(View.GONE);
                MIVClothes4.setVisibility(View.VISIBLE);
                MIVClothes5.setVisibility(View.GONE);
                MIVClothes6.setVisibility(View.GONE);
                break;

            case R.id.MCImageView5:
                MIVClothes1.setVisibility(View.GONE);
                MIVClothes2.setVisibility(View.GONE);
                MIVClothes3.setVisibility(View.GONE);
                MIVClothes4.setVisibility(View.GONE);
                MIVClothes5.setVisibility(View.VISIBLE);
                MIVClothes6.setVisibility(View.GONE);
                break;

            case R.id.MCImageView6:
                MIVClothes1.setVisibility(View.GONE);
                MIVClothes2.setVisibility(View.GONE);
                MIVClothes3.setVisibility(View.GONE);
                MIVClothes4.setVisibility(View.GONE);
                MIVClothes5.setVisibility(View.GONE);
                MIVClothes6.setVisibility(View.VISIBLE);
                break;
        }

        //MALE FACIAL HAIR SWITCH CASES
        switch (view.getId()){

            case R.id.MBImageView1:
                MIVBeard1.setVisibility(View.VISIBLE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.MBImageView2:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.VISIBLE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.MBImageView3:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.VISIBLE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.MBImageView4:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.VISIBLE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.MBImageView5:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.VISIBLE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.MBImageView6:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.VISIBLE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.MBImageView7:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.VISIBLE);
                MIVMoustache3.setVisibility(View.GONE);
                break;

            case R.id.MBImageView8:
                MIVBeard1.setVisibility(View.GONE);
                MIVBeard2.setVisibility(View.GONE);
                MIVBeard3.setVisibility(View.GONE);
                MIVBeard4.setVisibility(View.GONE);
                MIVBeard5.setVisibility(View.GONE);

                MIVMoustache1.setVisibility(View.GONE);
                MIVMoustache2.setVisibility(View.GONE);
                MIVMoustache3.setVisibility(View.VISIBLE);
                break;

        }

        //MALE GLASSES SWITCH VIEW

        switch (view.getId()){

            case R.id.MGImageView1:
                UIVGlasses1.setVisibility(View.VISIBLE);
                UIVGlasses2.setVisibility(View.GONE);
                UIVGlasses3.setVisibility(View.GONE);
                break;

            case R.id.MGImageView2:
                UIVGlasses1.setVisibility(View.GONE);
                UIVGlasses2.setVisibility(View.VISIBLE);
                UIVGlasses3.setVisibility(View.GONE);
                break;

            case R.id.MGImageView3:
                UIVGlasses1.setVisibility(View.GONE);
                UIVGlasses2.setVisibility(View.GONE);
                UIVGlasses3.setVisibility(View.VISIBLE);
                break;
        }

        viewPager1.setAdapter(adapter1);
        tabLayout1.setupWithViewPager(viewPager1);

        viewPager2.setAdapter(adapter2);
        tabLayout2.setupWithViewPager(viewPager2);


    }



}

