package org.pltw.examples.collegeapp;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Nikolai/Rishabh/Aakash on 12/6/2017.
 */

public class GuardianFragment extends android.support.v4.app.Fragment{// 2.1.4 
    public TextView FirstName;
    public EditText mFirstName;
    public TextView LastName;
    public EditText mLastName;
    @Override
    
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState){//2.1.4 #23, #24
        View rootView = layoutInflater.inflate(R.layout.fragment_family_member, viewGroup, false);//2.1.4 #25
        // 2.1.5 #7 
        final Guardian name = new Guardian();// 2.1.5 Step 9

        //2.1.5 #11
        FirstName = rootView.findViewById(R.id.FirstName);
        FirstName.setText(name.getFirstName());
        LastName = rootView.findViewById(R.id.LastName);
        LastName.setText(name.getLastName());
        mFirstName = rootView.findViewById(R.id.EditFirstName);
        mLastName = rootView.findViewById(R.id.EditLastName);

        //2.1.5 #14
        TextView OccupationText = rootView.findViewById(R.id.occupationText);
        OccupationText.setText(name.getOccupation());

        //2.1.5 #17
        Button mSubmitButton = rootView.findViewById(R.id.mSubmitButton);//
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            
            public void onClick(View view) {//For buttons and clicks
                name.setFirstName(mFirstName.getText().toString());
                name.setLastName(mLastName.getText().toString());
                FirstName.setText((mFirstName.getText()));
                LastName.setText(mLastName.getText());

            }
        });

        return rootView;  //2.1.4 Step 26
    }

}
