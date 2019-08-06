package com.example.gradlink;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PuzzlePlannerActivity extends AppCompatActivity implements View.OnDragListener, View.OnLongClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    private TextView textView15;
    private TextView textView16;
    private TextView textView17;
    private TextView textView18;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private TextView textView23;
    private TextView textView24;
    private TextView textView25;
    private TextView textView26;
    private TextView textView27;
    private TextView textView28;
    private TextView textView29;
    private static final String TEXT_VIEW_TAG = "DRAG TEXT";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        implementEvents();
    }

    //Find all views and set Tag to all draggable views
    private void findViews() {
        textView1 = (TextView) findViewById(R.id.acct1501);
        textView1.setTag(TEXT_VIEW_TAG);
        textView2 = (TextView) findViewById(R.id.mgmt1001);
        textView2.setTag(TEXT_VIEW_TAG);
        textView3 = (TextView) findViewById(R.id.infs1602);
        textView3.setTag(TEXT_VIEW_TAG);
        textView4 = (TextView) findViewById(R.id.infs1603);
        textView4.setTag(TEXT_VIEW_TAG);
        textView5 = (TextView) findViewById(R.id.infs1609);
        textView5.setTag(TEXT_VIEW_TAG);
        textView6 = (TextView) findViewById(R.id.econ1203);
        textView6.setTag(TEXT_VIEW_TAG);
        textView7 = (TextView) findViewById(R.id.math1041);
        textView7.setTag(TEXT_VIEW_TAG);
        textView8 = (TextView) findViewById(R.id.acct1511);
        textView8.setTag(TEXT_VIEW_TAG);
        textView9 = (TextView) findViewById(R.id.econ1101);
        textView9.setTag(TEXT_VIEW_TAG);
        textView10 = (TextView) findViewById(R.id.infs2603);
        textView10.setTag(TEXT_VIEW_TAG);
        textView11 = (TextView) findViewById(R.id.infs2605);
        textView11.setTag(TEXT_VIEW_TAG);
        textView12 = (TextView) findViewById(R.id.infs2608);
        textView12.setTag(TEXT_VIEW_TAG);
        textView13 = (TextView) findViewById(R.id.infs2621);
        textView13.setTag(TEXT_VIEW_TAG);
        textView14 = (TextView) findViewById(R.id.infs3603);
        textView14.setTag(TEXT_VIEW_TAG);
        textView15 = (TextView) findViewById(R.id.infs3604);
        textView15.setTag(TEXT_VIEW_TAG);
        textView16 = (TextView) findViewById(R.id.infs3605);
        textView16.setTag(TEXT_VIEW_TAG);
        textView17 = (TextView) findViewById(R.id.infs3617);
        textView17.setTag(TEXT_VIEW_TAG);
        textView18 = (TextView) findViewById(R.id.infs3634);
        textView18.setTag(TEXT_VIEW_TAG);
        textView19 = (TextView) findViewById(R.id.infs2631);
        textView19.setTag(TEXT_VIEW_TAG);
        textView20 = (TextView) findViewById(R.id.infs3020);
        textView20.setTag(TEXT_VIEW_TAG);
        textView21 = (TextView) findViewById(R.id.infs3632);
        textView21.setTag(TEXT_VIEW_TAG);
        textView22 = (TextView) findViewById(R.id.infs3830);
        textView22.setTag(TEXT_VIEW_TAG);
        textView23 = (TextView) findViewById(R.id.infs3873);
        textView23.setTag(TEXT_VIEW_TAG);
        textView24 = (TextView) findViewById(R.id.f_elec_1);
        textView24.setTag(TEXT_VIEW_TAG);
        textView25 = (TextView) findViewById(R.id.f_elec_2);
        textView25.setTag(TEXT_VIEW_TAG);
        textView26 = (TextView) findViewById(R.id.f_elec_3);
        textView26.setTag(TEXT_VIEW_TAG);
        textView27 = (TextView) findViewById(R.id.f_elec_4);
        textView27.setTag(TEXT_VIEW_TAG);
        textView28 = (TextView) findViewById(R.id.gen1);
        textView28.setTag(TEXT_VIEW_TAG);
        textView29 = (TextView) findViewById(R.id.gen2);
        textView29.setTag(TEXT_VIEW_TAG);







    }


    //Implement long click and drag listener
    private void implementEvents() {
        //add or remove any view that you don't want to be dragged
        textView1.setOnLongClickListener(this);
        textView2.setOnLongClickListener(this);
        textView3.setOnLongClickListener(this);
        textView4.setOnLongClickListener(this);
        textView5.setOnLongClickListener(this);
        textView6.setOnLongClickListener(this);
        textView7.setOnLongClickListener(this);
        textView8.setOnLongClickListener(this);
        textView9.setOnLongClickListener(this);
        textView10.setOnLongClickListener(this);
        textView11.setOnLongClickListener(this);
        textView12.setOnLongClickListener(this);
        textView13.setOnLongClickListener(this);
        textView14.setOnLongClickListener(this);
        textView15.setOnLongClickListener(this);
        textView16.setOnLongClickListener(this);
        textView17.setOnLongClickListener(this);
        textView18.setOnLongClickListener(this);
        textView19.setOnLongClickListener(this);
        textView20.setOnLongClickListener(this);
        textView21.setOnLongClickListener(this);
        textView22.setOnLongClickListener(this);
        textView23.setOnLongClickListener(this);
        textView24.setOnLongClickListener(this);
        textView25.setOnLongClickListener(this);
        textView26.setOnLongClickListener(this);
        textView27.setOnLongClickListener(this);
        textView28.setOnLongClickListener(this);
        textView29.setOnLongClickListener(this);




        //add or remove any layout view that you don't want to accept dragged view
        findViewById(R.id.left_layout).setOnDragListener(this);
        findViewById(R.id.col1_1).setOnDragListener(this);
        findViewById(R.id.col1_2).setOnDragListener(this);
        findViewById(R.id.col1_3).setOnDragListener(this);
        findViewById(R.id.col1_4).setOnDragListener(this);
        findViewById(R.id.col1_5).setOnDragListener(this);
        findViewById(R.id.col1_6).setOnDragListener(this);
        findViewById(R.id.col1_7).setOnDragListener(this);
        findViewById(R.id.col2_1).setOnDragListener(this);
        findViewById(R.id.col2_2).setOnDragListener(this);
        findViewById(R.id.col2_3).setOnDragListener(this);
        findViewById(R.id.col2_4).setOnDragListener(this);
        findViewById(R.id.col2_5).setOnDragListener(this);
        findViewById(R.id.col2_6).setOnDragListener(this);
        findViewById(R.id.col2_7).setOnDragListener(this);
        findViewById(R.id.col3_1).setOnDragListener(this);
        findViewById(R.id.col3_2).setOnDragListener(this);
        findViewById(R.id.col3_3).setOnDragListener(this);
        findViewById(R.id.col3_4).setOnDragListener(this);
        findViewById(R.id.col3_5).setOnDragListener(this);
        findViewById(R.id.col3_6).setOnDragListener(this);
        findViewById(R.id.col3_7).setOnDragListener(this);






    }

    @Override
    public boolean onLongClick(View view) {
        // Create a new ClipData.
        // This is done in two steps to provide clarity. The convenience method
        // ClipData.newPlainText() can create a plain text ClipData in one step.

        // Create a new ClipData.Item from the ImageView object's tag
        ClipData.Item item = new ClipData.Item((CharSequence) view.getTag());

        // Create a new ClipData using the tag as a label, the plain text MIME type, and
        // the already-created item. This will create a new ClipDescription object within the
        // ClipData, and set its MIME type entry to "text/plain"
        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

        ClipData data = new ClipData(view.getTag().toString(), mimeTypes, item);

        // Instantiates the drag shadow builder.
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);

        // Starts the drag
        view.startDrag(data//data to be dragged
                , shadowBuilder //drag shadow
                , view//local data about the drag and drop operation
                , 0//no needed flags
        );

        //Set view visibility to INVISIBLE as we are going to drag the view
        view.setVisibility(View.INVISIBLE);
        return true;
    }

    // This is the method that the system calls when it dispatches a drag event to the
    // listener.
    @Override
    public boolean onDrag(View view, DragEvent event) {
        // Defines a variable to store the action type for the incoming event
        int action = event.getAction();
        // Handles each of the expected events
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                // Determines if this View can accept the dragged data
                // if you want to apply color when drag started to your view you can uncomment below lines
                // to give any color tint to the View to indicate that it can accept
                // data.
                //  view.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);//set background color to your view
                // Invalidate the view to force a redraw in the new tint
                //  view.invalidate();
                // returns true to indicate that the View can accept the dragged data.
                return event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN);

            // Returns false. During the current drag and drop operation, this View will
            // not receive events again until ACTION_DRAG_ENDED is sent.

            case DragEvent.ACTION_DRAG_ENTERED:
                // Applies a YELLOW or any color tint to the View, when the dragged view entered into drag acceptable view
                // Return true; the return value is ignored.

                view.getBackground().setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_IN);

                // Invalidate the view to force a redraw in the new tint
                view.invalidate();

                return true;
            case DragEvent.ACTION_DRAG_LOCATION:
                // Ignore the event
                return true;
            case DragEvent.ACTION_DRAG_EXITED:
                // Re-sets the color tint to blue, if you had set the BLUE color or any color in ACTION_DRAG_STARTED. Returns true; the return value is ignored.

                //  view.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);

                //If u had not provided any color in ACTION_DRAG_STARTED then clear color filter.
                view.getBackground().clearColorFilter();
                // Invalidate the view to force a redraw in the new tint
                view.invalidate();

                return true;
            case DragEvent.ACTION_DROP:
                // Gets the item containing the dragged data
                ClipData.Item item = event.getClipData().getItemAt(0);

                // Gets the text data from the item.
                String dragData = item.getText().toString();

                // Displays a message containing the dragged data.
                Toast.makeText(this, "Dragged data is " + dragData, Toast.LENGTH_SHORT).show();

                // Turns off any color tints
                view.getBackground().clearColorFilter();

                // Invalidates the view to force a redraw
                view.invalidate();

                View v = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) v.getParent();
                owner.removeView(v);//remove the dragged view
                LinearLayout container = (LinearLayout) view;//caste the view into LinearLayout as our drag acceptable layout is LinearLayout
                container.addView(v);//Add the dragged view
                v.setVisibility(View.VISIBLE);//finally set Visibility to VISIBLE








                // Returns true. DragEvent.getResult() will return true.
                return true;
            case DragEvent.ACTION_DRAG_ENDED:
                // Turns off any color tinting
                view.getBackground().clearColorFilter();

                // Invalidates the view to force a redraw
                view.invalidate();

                // Does a getResult(), and displays what happened.
                if (event.getResult())
                    Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();

                else
                    Toast.makeText(this, "The drop didn't work.", Toast.LENGTH_SHORT).show();


                // returns true; the value is ignored.
                return true;

            // An unknown action type was received.
            default:
                Log.e("DragDrop Example", "Unknown action type received by OnDragListener.");
                break;
        }
        return false;
    }





}


